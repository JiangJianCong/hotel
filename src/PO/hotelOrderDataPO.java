package PO;

import java.io.Serializable;
/*********************************
 *
 * @author 蒋健聪 151250070
 * @Description hotel数据的PO类
 * @implements Serializable
 *  
 *********************************/
	
public class hotelOrderDataPO implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -8305144572818261830L;
	
	
	/***********************************
	 * @Dsecription 设置用户名字和得到用户名字
	 * @param userName 用户名字
	 **********************************/
	public void setUserName(String userName){
		this.userName = userName;
	}
	public String getUserName(){
		return this.userName;
	}
	
	/***********************************
	 * @Dsecription 设置用户电话和得到用户电话
	 * @param userTel 用户电话
	 **********************************/
	public void setUserTel(String userTel){
		this.userTel = userTel;
	}
	public String getUserTel(){
		return this.userTel;
	}
	
	/***********************************
	 * @Dsecription 设置房间类型和得到房间类型
	 * @param roomType 房间类型
	 **********************************/
	public void setRoomType(String roomType){
		this.roomType = roomType;
	}
	public String getRoomType(){
		return this.roomType;
	}
	
	/***********************************
	 * @Dsecription 设置入住时间和得到入住时间
	 * @param checkInTimes 入住时间
	 **********************************/
	public void setCheckInTimes(String checkInTimes){
		this.checkInTimes = checkInTimes;
	}
	public String getCheckInTimes(){
		return this.checkInTimes;
	}
	
	/***********************************
	 * @Dsecription 设置退房时间和得到退房时间
	 * @param checkOutTime 退房时间
	 **********************************/
	public void setCheckOutTime(String checkOutTime){
		this.checkOutTime = checkOutTime;
	}
	public String getCheckOutTime(){
		return this.checkOutTime;
	}
	
	/***********************************
	 * @Dsecription 设置是否完成入住和得到是否完成入住
	 * @param fiinishCheckIn 是或者否
	 **********************************/
	public void setFinishCheckIn(String finishCheckIn){
		this.finishCheckIn = finishCheckIn;
	}
	public String getFinishCheckIn(){
		return this.finishCheckIn;
	}
	

	
	private String userName;
	private String userTel;
	private String roomType;
	private String checkInTimes;
	private String checkOutTime;
	private String finishCheckIn;
	
	
	
}
