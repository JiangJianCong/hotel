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
 * @author 蒋健聪 151250070
 * @Description 实现PO到VO的转化
 *
 **********************************/


public class POtoVO {
	
	/**********************************
	 * public hotelAccountVO ToHotelAccountVO(hotelAccountPO account)
	 * @Description 将hotelAccountPO改为hotelAccountVO的方法
	 * @param account hotelAccountPO实例
	 * @return hotelAccountPO 转化后的hotelAccountVO
	 **********************************/
	
	public hotelAccountVO ToHotelAccountVO(hotelAccountPO account){
		hotelAccountVO a = new hotelAccountVO();
		a.setHotelID(account.getHotelID());
		a.setHotelPassword(account.getHotelPassword());
		return a;
	}
	
	/**********************************
	 * public hotelCommentsVO ToHotelCommentsVO(hotelCommentsPO comments)
	 * @Description 将hotelCommentsPO改为hotelCommentsVO的方法
	 * @param comments hotelCommentsPO实例
	 * @return hotelCommentsPO 转化后的hotelCommentsVO
	 **********************************/
	public hotelCommentsVO ToHotelCommentsVO(hotelCommentsPO comments){
		
		
		return null;
	}
	
	/**********************************
	 * public hotelDataVO TOhotelDataVO(hotelDataPO hoteldata)
	 * @Description 将hotelDataPO改为hotelDataVO的方法
	 * @param hoteldata TOhotelDataPO实例
	 * @return hotelDataPO 转化后的hotelDataVO
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
	 * @Description 将hotelOrderDataPO改为hotelOrderDataVO的方法
	 * @param hoteLOrderData hotelOrderDataPO实例
	 * @return hotelOrderDataPO 转化后的hotelOrderDataVO
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
	 * @Description 将userAccountPO改为userAccountVO的方法
	 * @param account userAccountPO实例
	 * @return userAccountPO 转化后的userAccountVO
	 **********************************/
	public userAccountVO TouserAccountVO(userAccountPO account){
		userAccountVO u = new userAccountVO();
		u.setUserID(account.getUserID());
		u.setUserPassword(account.getUserPassword());
		return u;
	}
	
	/**********************************
	 * public userDataVO TouserDataVO(userDataPO userdata)
	 * @Description 将userDataPO改为userDataVO的方法
	 * @param userdata userDataPO实例
	 * @return userDataPO 转化后的userDataVO
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
	 * @Description 将userOrderDataPO改为userOrderDataVO的方法
	 * @param userOrderData userOrderDataPO实例
	 * @return userOrderDataPO 转化后的userOrderDataVO
	 **********************************/
	public userOrderDataVO ToUserOrderDataVO(userOrderDataPO userOrderData){
		
		
		return null;
	}
	
	
	/**********************************
	 * public networkManageAccountVO ToNetworkManageAccountVO(networkManageAccountPO networkManageAccount)
	 * @Description 将networkManageAccountPO改为networkManageAccountVO的方法
	 * @param networkManageAccount networkManageAccountPO实例
	 * @return networkManageAccountPO 转化后的networkManageAccountVO
	 **********************************/
	public networkManageAccountVO ToNetworkManageAccountVO(networkManageAccountPO networkManageAccount){
		networkManageAccountVO result=new networkManageAccountVO();
		result.setNetworkManageID(networkManageAccount.getNetworkManageID());
		result.setNetworkManagePassword(networkManageAccount.getNetworkManagePassword());
		
		return result;
	}
	
	
	
	
}
