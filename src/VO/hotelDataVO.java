package VO;

import java.io.Serializable;

/*******************************************
 * 
 * @author ������ 151250070
 * @Description �Ƶ��˺ŵ�VO��
 * @implements Serializable
 *
 *******************************************/

public class hotelDataVO implements Serializable{
	public hotelDataVO(){
		
	}
	public hotelDataVO(String HotelName,String HotelIntroduction,String HotelTel){ //ע��Ƶ��ʱ��
		this.HotelName = HotelName;
		this.HotelIntroduction = HotelIntroduction;
		this.HotelTel = HotelTel;
	}
	/**HotelName��get��set����**/
	public void setHotelName(String name){
		this.HotelName = name;
	}
	
	public String getHotelName(){
		return this.HotelName;
	}
	
	/**introduction��get��set����**/
	public void setHotelIntroduction(String introduction){
		this.HotelIntroduction = introduction;
	}
	
	public String getHotelIntroduction(){
		return this.HotelIntroduction;
	}
	
	/**hotel�绰��get��set����**/
	
	public void  setHotelTel(String tel){
		this.HotelTel = tel;
	}
	
	public String getHotelTel(){
		return this.HotelTel;
	}
	
	
	/**�õ������б�**/
	

	
	/***********************************
	 * @Dsecription ���þƵ�ID�͵õ��Ƶ�ID
	 * @param ID �Ƶ�����
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
