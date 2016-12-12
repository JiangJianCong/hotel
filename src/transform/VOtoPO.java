package transform;

import PO.hotelAccountPO;
import PO.hotelCommentsPO;
import PO.hotelDataPO;
import PO.hotelOrderDataPO;
import PO.networkManageAccountPO;
import PO.userAccountPO;
import PO.userDataPO;
import PO.userOrderDataPO;
import VO.hotelAccountVO;
import VO.hotelCommentsVO;
import VO.hotelDataVO;
import VO.hotelOrderDataVO;
import VO.networkManageAccountVO;
import VO.userAccountVO;
import VO.userDataVO;
import VO.userOrderDataVO;

/**********************************
 * 
 * @author ������ 151250070
 * @Description ʵ��VO��PO��ת��
 *
 **********************************/


public class VOtoPO {

	/**********************************
	 * public hotelAccountPO ToHotelAccountPO(hotelAccountVO account)
	 * @Description ��hotelAccountPO��ΪhotelAccountVO�ķ���
	 * @param account hotelAccountPOʵ��
	 * @return hotelAccountPO ת�����hotelAccountVO
	 **********************************/
	
	public hotelAccountPO ToHotelAccountPO(hotelAccountVO account){
		hotelAccountPO a = new hotelAccountPO();
		a.setHotelID(account.getHotelID());
		a.setHotelPassword(account.getHotelPassword());
		return a;
	}
	
	/**********************************
	 * public hotelCommentsPO ToHotelCommentsPO(hotelCommentsVO comments)
	 * @Description ��hotelCommentsVO��ΪhotelCommentsPO�ķ���
	 * @param comments hotelCommentsVOʵ��
	 * @return hotelCommentsVO ת�����hotelCommentsPO
	 **********************************/
	public hotelCommentsPO ToHotelCommentsPO(hotelCommentsVO comments){
		
		
		return null;
	}
	
	/**********************************
	 * public hotelDataVO TOhotelDataVO(hotelDataPO hoteldata)
	 * @Description ��hotelDataPO��ΪhotelDataVO�ķ���
	 * @param hoteldata TOhotelDataPOʵ��
	 * @return hotelDataPO ת�����hotelDataVO
	 **********************************/
	public hotelDataPO TOhotelDataPO(hotelDataVO hoteldata){
		hotelDataPO data = new hotelDataPO(); 
		data.setHotelIntroduction(hoteldata.getHotelIntroduction());
		data.setHotelName(hoteldata.getHotelName());
		data.setHotelTel(hoteldata.getHotelTel());
		data.setHotelID(hoteldata.getHotelID());
		return data;
	}
	
	/**********************************
	 * hotelOrderDataPO TohotelOrderDataPO(hotelOrderDataVO hoteLOrderData)
	 * @Description ��hotelOrderDataVO��ΪhotelOrderDataPO�ķ���
	 * @param hoteLOrderData hotelOrderDataVOʵ��
	 * @return hotelOrderDataVO ת�����hotelOrderDataPO
	 **********************************/
	public hotelOrderDataPO TohotelOrderDataPO(hotelOrderDataVO hoteLOrderData){
		hotelOrderDataPO result = new hotelOrderDataPO();
		result.setUserName(hoteLOrderData.getUserName());
		result.setUserTel(hoteLOrderData.getUserTel());
		result.setRoomType(hoteLOrderData.getRoomType());
		result.setCheckInTimes(hoteLOrderData.getCheckInTimes());
		result.setCheckOutTime(hoteLOrderData.getCheckOutTime());
		result.setFinishCheckIn(hoteLOrderData.getFinishCheckIn());
		return result;
	}
	
	/**********************************
	 * public userAccountPO TouserAccountPO(userAccountVO account)
	 * @Description ��userAccountVO��ΪuserAccountPO�ķ���
	 * @param account userAccountVOʵ��
	 * @return userAccountVO ת�����userAccountPO
	 **********************************/
	public userAccountPO TouserAccountPO(userAccountVO account){
		userAccountPO u = new userAccountPO();
		u.setUserID(account.getUserID());
		u.setUserPassword(account.getUserPassword());		
		return u;
	}
	
	/**********************************
	 * public userDataPO TouserDataPO(userDataVO userdata)
	 * @Description ��userDataVO��ΪuserDataPO�ķ���
	 * @param userdata userDataVOʵ��
	 * @return userDataVO ת�����userDataVPO
	 **********************************/
	public userDataPO TouserDataPO(userDataVO userdata){
		userDataPO data = new userDataPO();
		data.setUserID(userdata.getUserID());
		data.setUserName(userdata.getUserName());
		data.setUserTel(userdata.getUserTel());
		data.setUserCredit(userdata.getUserCredit());
		data.setUserSex(userdata.gerUserSex());
		return data;
	}
	/**********************************
	 * public userOrderDataPO ToUserOrderDataPO(userOrderDataVO userOrderData)
	 * @Description ��userOrderDataVO��ΪuserOrderDataPO�ķ���
	 * @param userOrderData userOrderDataVOʵ��
	 * @return userOrderDataVO ת�����userOrderDataPO
	 **********************************/
	public userOrderDataVO ToUserOrderDataVO(userOrderDataPO userOrderData){
		
		
		return null;
	}
	
	
	/**********************************
	 * public networkManageAccountPO ToNetworkManageAccountPO(networkManageAccountVO networkManageAccount)
	 * @Description ��networkManageAccountVO��ΪnetworkManageAccountPO�ķ���
	 * @param networkManageAccount networkManageAccountVOʵ��
	 * @return networkManageAccountVO ת�����networkManageAccountPO
	 **********************************/
	public networkManageAccountPO ToNetworkManageAccountPO(networkManageAccountVO networkManageAccount){
		networkManageAccountPO result=new networkManageAccountPO();
		result.setNetworkManageID(networkManageAccount.getNetworkManageID());
		result.setNetworkManagePassword(networkManageAccount.getNetworkManagePassword());
		
		return result;
	}
	
	
	
	
}
