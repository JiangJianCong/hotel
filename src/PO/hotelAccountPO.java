package PO;

import java.io.Serializable;


/*********************************
 * 
 * @author ������ 151250070
 * @Description ע���¼�õ�hotel���˺ŵ�PO��
 * @implements Serializable
 * 
 *********************************/

public class hotelAccountPO implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -1153159451086616047L;
	/*****************************
	 *@Description Ĭ�Ϲ��캯�� 
	 ***************************/
	public hotelAccountPO(){
		
	}
	
	/***********************************
	 * @Dsecription ���þƵ�ID�͵õ��Ƶ�ID
	 * @param ID �Ƶ�ID
	 **********************************/
	public void setHotelID(String ID){
		this.hotelName = ID;
	}
	public String getHotelID (){
		return this.hotelName;
	}
	
	/***********************************
	 * @Dsecription ���þƵ�����͵õ��Ƶ�����
	 * @param password �Ƶ�����
	 **********************************/
	public void setHotelPassword(String password){
		this.password = password;
	}
	public String getHotelPassword(){
		return this.password;
	}
	
	
	

	private String hotelName;
	private String password;
}
