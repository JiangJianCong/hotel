package VO;

import java.io.Serializable;

/*******************************************
 * 
 * @author ������ 151250070
 * @Description ע���¼�õ�hotel���˺ŵ�PO��
 * @implements Serializable
 * 
 ******************************************/


public class userAccountVO implements Serializable{
	
	public userAccountVO(){
		
	} 
	
	public userAccountVO(String userID,String password){
		this.userID = userID;
		this.password = password;
	}
	
	
	/***********************************
	 * @Dsecription �����û�ID�͵õ��û�ID
	 * @param ID �Ƶ�ID
	 **********************************/
	public void setUserID(String ID){
		this.userID = ID;
	}
	public String getUserID (){
		return this.userID;
	}
	
	/***********************************
	 * @Dsecription �����û�����͵õ��û�����
	 * @param password �Ƶ�����
	 **********************************/
	public void setUserPassword(String password){
		this.password = password;
	}
	public String getUserPassword(){
		return this.password;
	}
	
	
	

	private String userID;
	private String password;
	
}
