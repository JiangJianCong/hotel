package PO;

import java.io.Serializable;

/*********************************
*
* @author ������ 151250070
* @Description user���ݵ�PO��
* @implements Serializable
*  
*********************************/


public class userDataPO implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 7607656028579187134L;
	
	private String userID;
	private String userName;
	private String UserTel;
	private int UserCredit;
	private String userSex;
	
	
	/*******************************
	 * @Description userDataPO��Ĭ�Ϲ��췽��
	 *******************************/
	public userDataPO(){
		
	}
	
	/***********************************
	 * @Dsecription �����û�ID�͵õ��û�ID
	 * @param ID �û�ID
	 **********************************/
	public void setUserID(String ID){
		this.userID = ID;
	}
	public String getUserID(){
		return this.userID;
	}
	
	/***********************************
	 * @Dsecription �����û����ֺ͵õ��û�����
	 * @param name �û�����
	 **********************************/
	public void setUserName(String name){
		this.userName = name;
	}
	public String getUserName(){
		return this.userName;
	}
	
	/***********************************
	 * @Dsecription �����û��绰�͵õ��û��绰
	 * @param tel �û��绰
	 **********************************/
	public void setUserTel(String tel){
		this.UserTel = tel;
	}
	public String getUserTel(){
		return this.UserTel;
	}
	
	/***********************************
	 * @Dsecription �����û�����ֵ�͵õ��û�����ֵ
	 * @param credit �û�����ֵ
	 **********************************/
	public void setUserCredit(int credit){
		this.UserCredit = credit;
	}
	
	public int getUserCredit(){
		return this.UserCredit;
	}
	
	/***********************************
	 * @Dsecription �����û��Ա�͵õ��û��Ա�
	 * @param sex �û��Ա�
	 **********************************/
	public void setUserSex(String sex){
		this.userSex = sex;
	}
	
	public String getUserSex(){
		return this.userSex;
	}
	
	
}
