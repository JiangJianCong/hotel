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
 * @Description 实现VO到PO的转化
 *
 **********************************/


public class VOtoPO {

	/**********************************
	 * public hotelAccountPO ToHotelAccountPO(hotelAccountVO account)
	 * @Description 将hotelAccountPO改为hotelAccountVO的方法
	 * @param account hotelAccountPO实例
	 * @return hotelAccountPO 转化后的hotelAccountVO
	 **********************************/
	
	public hotelAccountPO ToHotelAccountPO(hotelAccountVO account){
		hotelAccountPO a = new hotelAccountPO();
		a.setHotelID(account.getHotelID());
		a.setHotelPassword(account.getHotelPassword());
		return a;
	}
	
	/**********************************
	 * public hotelCommentsPO ToHotelCommentsPO(hotelCommentsVO comments)
	 * @Description 将hotelCommentsVO改为hotelCommentsPO的方法
	 * @param comments hotelCommentsVO实例
	 * @return hotelCommentsVO 转化后的hotelCommentsPO
	 **********************************/
	public hotelCommentsPO ToHotelCommentsPO(hotelCommentsVO comments){
		
		
		return null;
	}
	
	/**********************************
	 * public hotelDataVO TOhotelDataVO(hotelDataPO hoteldata)
	 * @Description 将hotelDataPO改为hotelDataVO的方法
	 * @param hoteldata TOhotelDataPO实例
	 * @return hotelDataPO 转化后的hotelDataVO
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
	 * @Description 将hotelOrderDataVO改为hotelOrderDataPO的方法
	 * @param hoteLOrderData hotelOrderDataVO实例
	 * @return hotelOrderDataVO 转化后的hotelOrderDataPO
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
	 * @Description 将userAccountVO改为userAccountPO的方法
	 * @param account userAccountVO实例
	 * @return userAccountVO 转化后的userAccountPO
	 **********************************/
	public userAccountPO TouserAccountPO(userAccountVO account){
		userAccountPO u = new userAccountPO();
		u.setUserID(account.getUserID());
		u.setUserPassword(account.getUserPassword());		
		return u;
	}
	
	/**********************************
	 * public userDataPO TouserDataPO(userDataVO userdata)
	 * @Description 将userDataVO改为userDataPO的方法
	 * @param userdata userDataVO实例
	 * @return userDataVO 转化后的userDataVPO
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
	 * @Description 将userOrderDataVO改为userOrderDataPO的方法
	 * @param userOrderData userOrderDataVO实例
	 * @return userOrderDataVO 转化后的userOrderDataPO
	 **********************************/
	public userOrderDataVO ToUserOrderDataVO(userOrderDataPO userOrderData){
		
		
		return null;
	}
	
	
	/**********************************
	 * public networkManageAccountPO ToNetworkManageAccountPO(networkManageAccountVO networkManageAccount)
	 * @Description 将networkManageAccountVO改为networkManageAccountPO的方法
	 * @param networkManageAccount networkManageAccountVO实例
	 * @return networkManageAccountVO 转化后的networkManageAccountPO
	 **********************************/
	public networkManageAccountPO ToNetworkManageAccountPO(networkManageAccountVO networkManageAccount){
		networkManageAccountPO result=new networkManageAccountPO();
		result.setNetworkManageID(networkManageAccount.getNetworkManageID());
		result.setNetworkManagePassword(networkManageAccount.getNetworkManagePassword());
		
		return result;
	}
	
	
	
	
}
