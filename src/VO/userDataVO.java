package VO;

import java.io.Serializable;

/*******************************************
 * 
 * @author ������ 151250070
 * @Description �Ƶ��˺ŵ�VO��
 * @implements Serializable
 *
 *******************************************/



public class userDataVO implements Serializable{
	public userDataVO(){
		
	}
	public userDataVO(String userName,String userTel,int userCredit,String userSex){ //ע���û���ʱ��
		this.userName = userName;
		this.UserTel= userTel;
		this.UserCredit = userCredit;
		this.userSex = userSex;
	}
	
	public void setUserID(String ID){
		this.userID = ID;
	}
	public String getUserID(){
		return this.userID;
	}
	
	
	public void setUserName(String name){
		this.userName = name;
	}
	public String getUserName(){
		return this.userName;
	}
	
	public void setUserTel(String tel){
		this.UserTel = tel;
	}
	public String getUserTel(){
		return this.UserTel;
	}
	
	
	public int getUserCredit(){
		return this.UserCredit;
	}
	
	public void setUserCredit(int credit){
		this.UserCredit = credit;
	}
	
	
	public void setUserSex(String sex){
		this.userSex = sex;
	}
	public String gerUserSex(){
		return this.userSex;
	}
	
	private String userID;
	private String userName;
	private String UserTel;
	private int UserCredit;
	private String userSex;
	
}
