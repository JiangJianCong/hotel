package VO;

import java.io.Serializable;

/*******************************************
 * 
 * @author 蒋健聪 151250070
 * @Description 酒店账号的VO类
 * @implements Serializable
 *
 *******************************************/

public class hotelDataVO implements Serializable{
	public hotelDataVO(){
		
	}
	public hotelDataVO(String HotelName,String HotelIntroduction,String HotelTel){ //注册酒店的时候
		this.HotelName = HotelName;
		this.HotelIntroduction = HotelIntroduction;
		this.HotelTel = HotelTel;
	}
	/**HotelName的get和set方法**/
	public void setHotelName(String name){
		this.HotelName = name;
	}
	
	public String getHotelName(){
		return this.HotelName;
	}
	
	/**introduction的get和set方法**/
	public void setHotelIntroduction(String introduction){
		this.HotelIntroduction = introduction;
	}
	
	public String getHotelIntroduction(){
		return this.HotelIntroduction;
	}
	
	/**hotel电话的get和set方法**/
	
	public void  setHotelTel(String tel){
		this.HotelTel = tel;
	}
	
	public String getHotelTel(){
		return this.HotelTel;
	}
	
	
	/**得到评论列表**/
	

	
	/***********************************
	 * @Dsecription 设置酒店ID和得到酒店ID
	 * @param ID 酒店名字
	 **********************************/
	
	public void setHotelID(String ID){
		this.HotelID = ID;
	}
	
	public String getHotelID(){
		return this.HotelID;
	}
	
	
	
	private String HotelID;
	private String HotelName;
	private String HotelIntroduction;
	private String HotelTel;

}
