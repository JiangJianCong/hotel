package service;


import java.rmi.Remote;
import java.rmi.RemoteException;

import PO.hotelAccountPO;
import PO.hotelDataPO;
import PO.networkManageAccountPO;
import PO.userAccountPO;
import PO.userDataPO;

/**************************************************************
 * accountService
 * @author ������ 151250070 
 * @Description �ͻ���ʵ���˺�ע���¼���ܵĽӿ�
 *************************************************************/


public interface accountService extends Remote{
	/*====================================================
			������hotel�˺ŵ���ع��ܵĽӿ�
	====================================================*/
	public boolean hotelLogin(hotelAccountPO account) throws RemoteException;

	public boolean hotelSignUp(hotelAccountPO account,hotelDataPO data) throws RemoteException;
	
	public boolean hotelLogout(String hotelID) throws RemoteException;
	
	public boolean checkHotelIdExist(String ID) throws RemoteException;
	
	public boolean checkHotelNameExist(String hotelName) throws RemoteException;
	
	/*====================================================
			������user�˺ŵ�������ܵĽӿ�
	====================================================*/
	
	
	public boolean userLogin(userAccountPO account) throws RemoteException;
	
	public boolean userSignUp(userAccountPO account,userDataPO data) throws RemoteException;
	
	public boolean checkUserIdExist(String ID) throws RemoteException;

	/*====================================================
	                      ������networkManage�˺ŵ�������ܵĽӿ�
    ====================================================*/
	
	public boolean networkManageLogin(networkManageAccountPO account) throws RemoteException;
	
	
}
