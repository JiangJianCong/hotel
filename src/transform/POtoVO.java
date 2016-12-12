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
 * @Description ʵ��PO��VO��ת��
 *
 **********************************/


public class POtoVO {
	
	/**********************************
	 * public hotelAccountVO ToHotelAccountVO(hotelAccountPO account)
	 * @Description ��hotelAccountPO��ΪhotelAccountVO�ķ���
	 * @param account hotelAccountPOʵ��
	 * @return hotelAccountPO ת�����hotelAccountVO
	 **********************************/
	
	public hotelAccountVO ToHotelAccountVO(hotelAccountPO account){
		hotelAccountVO a = new hotelAccountVO();
		a.setHotelID(account.getHotelID());
		a.setHotelPassword(account.getHotelPassword());
		return a;
	}
	
	/**********************************
	 * public hotelCommentsVO ToHotelCommentsVO(hotelCommentsPO comments)
	 * @Description ��hotelCommentsPO��ΪhotelCommentsVO�ķ���
	 * @param comments hotelCommentsPOʵ��
	 * @return hotelCommentsPO ת�����hotelCommentsVO
	 **********************************/
	public hotelCommentsVO ToHotelCommentsVO(hotelCommentsPO comments){
		
		
		return null;
	}
	
	/**********************************
	 * public hotelDataVO TOhotelDataVO(hotelDataPO hoteldata)
	 * @Description ��hotelDataPO��ΪhotelDataVO�ķ���
	 * @param hoteldata TOhotelDataPOʵ��
	 * @return hotelDataPO ת�����hotelDataVO
	 **********************************/
	public hotelDataVO TOhotelDataVO(hotelDataPO hoteldata){
		hotelDataVO data = new hotelDataVO(); 
		data.setHotelID(hoteldata.getHotelID());
		data.setHotelIntroduction(hoteldata.getHotelIntroduction());
		data.setHotelName(hoteldata.getHotelName());
		data.setHotelTel(hoteldata.getHotelTel());
		
		return data;
	}
	
	/**********************************
	 * hotelOrderDataVO TohotelOrderDataVO(hotelOrderDataPO hoteLOrderData)
	 * @Description ��hotelOrderDataPO��ΪhotelOrderDataVO�ķ���
	 * @param hoteLOrderData hotelOrderDataPOʵ��
	 * @return hotelOrderDataPO ת�����hotelOrderDataVO
	 **********************************/
	public hotelOrderDataVO TohotelOrderDataVO(hotelOrderDataPO hoteLOrderData){
		hotelOrderDataVO result = new hotelOrderDataVO();
		result.setUserName(hoteLOrderData.getUserName());
		result.setUserTel(hoteLOrderData.getUserTel());
		result.setroomType(hoteLOrderData.getRoomType());
		result.setcheckInTimes(hoteLOrderData.getCheckInTimes());
		result.setcheckOutTime(hoteLOrderData.getCheckOutTime());
		result.setfinishCheckIn(hoteLOrderData.getFinishCheckIn());
		return result;
	}
	
	/**********************************
	 * public userAccountVO TouserAccountVO(userAccountPO account)
	 * @Description ��userAccountPO��ΪuserAccountVO�ķ���
	 * @param account userAccountPOʵ��
	 * @return userAccountPO ת�����userAccountVO
	 **********************************/
	public userAccountVO TouserAccountVO(userAccountPO account){
		userAccountVO u = new userAccountVO();
		u.setUserID(account.getUserID());
		u.setUserPassword(account.getUserPassword());
		return u;
	}
	
	/**********************************
	 * public userDataVO TouserDataVO(userDataPO userdata)
	 * @Description ��userDataPO��ΪuserDataVO�ķ���
	 * @param userdata userDataPOʵ��
	 * @return userDataPO ת�����userDataVO
	 **********************************/
	public userDataVO TouserDataVO(userDataPO userdata){
		userDataVO result = new userDataVO();
		result.setUserID(userdata.getUserID());
		result.setUserName(userdata.getUserName());
		result.setUserTel(userdata.getUserTel());
		result.setUserCredit(userdata.getUserCredit());
		result.setUserSex(userdata.getUserSex());
		return result;
	}
	
	/**********************************
	 * public userOrderDataVO ToUserOrderDataVO(userOrderDataPO userOrderData)
	 * @Description ��userOrderDataPO��ΪuserOrderDataVO�ķ���
	 * @param userOrderData userOrderDataPOʵ��
	 * @return userOrderDataPO ת�����userOrderDataVO
	 **********************************/
	public userOrderDataVO ToUserOrderDataVO(userOrderDataPO userOrderData){
		
		
		return null;
	}
	
	
	/**********************************
	 * public networkManageAccountVO ToNetworkManageAccountVO(networkManageAccountPO networkManageAccount)
	 * @Description ��networkManageAccountPO��ΪnetworkManageAccountVO�ķ���
	 * @param networkManageAccount networkManageAccountPOʵ��
	 * @return networkManageAccountPO ת�����networkManageAccountVO
	 **********************************/
	public networkManageAccountVO ToNetworkManageAccountVO(networkManageAccountPO networkManageAccount){
		networkManageAccountVO result=new networkManageAccountVO();
		result.setNetworkManageID(networkManageAccount.getNetworkManageID());
		result.setNetworkManagePassword(networkManageAccount.getNetworkManagePassword());
		
		return result;
	}
	
	
	
	
}
