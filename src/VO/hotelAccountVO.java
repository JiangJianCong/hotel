package VO;

import java.io.Serializable;

/*******************************************
 * 
 * @author ������ 151250070
 * @Description �Ƶ��˺ŵ�VO��
 * @implements Serializable
 *
 *******************************************/
public class hotelAccountVO implements Serializable{
	
	public hotelAccountVO(){
		
	}
	
	
	public hotelAccountVO(String hotelName,String password){
		this.hotelName = hotelName;
		this.password = password;
	}
	public void setHotelID(String ID){
		this.hotelName = ID;
	}
	
	public String getHotelID (){
		return this.hotelName;
	}
	
	public void setHotelPassword(String password){
		this.password = password;
	}
	
	public String getHotelPassword(){
		return this.password;
	}

	private String hotelName;
	private String password;
}
