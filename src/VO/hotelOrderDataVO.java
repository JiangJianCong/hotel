package VO;

import java.io.Serializable;

/*******************************************
 * 
 * @author ΩØΩ°¥œ 151250070
 * @Description æ∆µÍ’À∫≈µƒVO¿‡
 * @implements Serializable
 *
 *******************************************/
public class hotelOrderDataVO implements Serializable{
	
	
	
	
	public void setUserName(String name){
		this.userName = name;
	}
	public String getUserName(){
		return this.userName;
	}
	
	
	public void setUserTel(String UserTel){
		this.userTel = UserTel;
	}
	public String getUserTel(){
		return this.userTel;
	}
	
	
	public void setroomType(String roomType){
		this.roomType =roomType ;
	}
	
	public String getRoomType(){
		return this.roomType;
	}
	
	
	public void setcheckInTimes(String checkInTimes){
		this.checkInTimes =checkInTimes ;
	}
	
	public String getCheckInTimes(){
		return this.checkInTimes;
	}
	
	
	public void setcheckOutTime(String checkOutTime){
		this.checkOutTime = checkOutTime;
	}
	
	public String getCheckOutTime(){
		return this.checkOutTime;
	}
	
	
	public void setfinishCheckIn(String finishCheckIn){
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
