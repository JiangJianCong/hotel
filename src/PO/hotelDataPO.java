package PO;

import java.io.Serializable;

/*********************************
 * 
 * @author ������ 151250070
 * @Description hotel���ݵ�PO��
 * @implements Serializable
 * 
 *********************************/
public class hotelDataPO implements Serializable{
	
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1462400553979411384L;
	
	private String HotelID;
	private String HotelName;
	private String HotelIntroduction;
	private String HotelTel;
	
	/****************************
	 * @Description Ĭ�Ϲ��캯��
	 * **************************/
	
	public hotelDataPO(){
		
	}
	
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
	
	
	/***********************************
	 * @Dsecription ���þƵ����ֺ͵õ��Ƶ�����
	 * @param name �Ƶ�����
	 **********************************/
	
	public void setHotelName(String name){
		this.HotelName = name;
	}
	
	public String getHotelName(){
		return this.HotelName;
	}
	

	/***********************************
	 * @Dsecription ���þƵ���ܺ͵õ��Ƶ����
	 * @param introduction �Ƶ����
	 **********************************/
	public void setHotelIntroduction(String introduction){
		this.HotelIntroduction = introduction;
	}
	
	public String getHotelIntroduction(){
		return this.HotelIntroduction;
	}
	
	/***********************************
	 * @Dsecription ���þƵ�绰�͵õ��Ƶ�绰
	 * @param tel �Ƶ�绰
	 **********************************/
	public void  setHotelTel(String tel){
		this.HotelTel = tel;
	}
	
	public String getHotelTel(){
		return this.HotelTel;
	}
	
	
	
	
}

