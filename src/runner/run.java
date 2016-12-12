package runner;

import java.rmi.RemoteException;
import java.util.ArrayList;

import PO.hotelAccountPO;
import PO.hotelDataPO;
import PO.hotelPromotionPO;
import PO.userAccountPO;
import PO.userDataPO;
import RMICLIENT.RMIClient;
import UI.LoginFrame;
import PO.networkManageAccountPO;
public class run {
	
	public run(){
		new RMIClient();
		initGui();
		
	}
	
	public void initGui(){
		new LoginFrame();
	}
	
	public void test(){
		hotelAccountPO account = new hotelAccountPO();
		userAccountPO userAccount = new userAccountPO();
		hotelDataPO data = new hotelDataPO();
		userDataPO userData = new userDataPO();
		hotelPromotionPO testPro = new hotelPromotionPO();
		networkManageAccountPO testNet=new networkManageAccountPO();
		testPro.setSerial("2");
		testPro.setIsFullCut(false);
		testPro.setMoneyCut(0);
		testPro.setIsDiscount(true);
		testPro.setDiscount(7);
		testPro.setPrmotionDescription("打7折，美滋滋");
		testNet.setNetworkManageID("Shabi");
		testNet.setNetworkManagePassword("325的ShaBi");
		account.setHotelID("ShaBi");
		account.setHotelPassword("325的ShaBi");
		ArrayList<hotelPromotionPO> result= new ArrayList<hotelPromotionPO>();
		try {
			if(!RMIClient.getAccountService().hotelLogin(account)){
				 System.out.println("a");
			 }
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}
	
	public static void main(String [] args){
		run cr = new run();
		//cr.test();
		
		
	}
	
	
	
}
