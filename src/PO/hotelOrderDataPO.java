package PO;

import java.io.Serializable;
/*********************************
 *
 * @author ������ 151250070
 * @Description hotel���ݵ�PO��
 * @implements Serializable
 *  
 *********************************/
	
public class hotelOrderDataPO implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -8305144572818261830L;
	
	
	/***********************************
	 * @Dsecription �����û����ֺ͵õ��û�����
	 * @param userName �û�����
	 **********************************/
	public void setUserName(String userName){
		this.userName = userName;
	}
	public String getUserName(){
		return this.userName;
	}
	
	/***********************************
	 * @Dsecription �����û��绰�͵õ��û��绰
	 * @param userTel �û��绰
	 **********************************/
	public void setUserTel(String userTel){
		this.userTel = userTel;
	}
	public String getUserTel(){
		return this.userTel;
	}
	
	/***********************************
	 * @Dsecription ���÷������ͺ͵õ���������
	 * @param roomType ��������
	 **********************************/
	public void setRoomType(String roomType){
		this.roomType = roomType;
	}
	public String getRoomType(){
		return this.roomType;
	}
	
	/***********************************
	 * @Dsecription ������סʱ��͵õ���סʱ��
	 * @param checkInTimes ��סʱ��
	 **********************************/
	public void setCheckInTimes(String checkInTimes){
		this.checkInTimes = checkInTimes;
	}
	public String getCheckInTimes(){
		return this.checkInTimes;
	}
	
	/***********************************
	 * @Dsecription �����˷�ʱ��͵õ��˷�ʱ��
	 * @param checkOutTime �˷�ʱ��
	 **********************************/
	public void setCheckOutTime(String checkOutTime){
		this.checkOutTime = checkOutTime;
	}
	public String getCheckOutTime(){
		return this.checkOutTime;
	}
	
	/***********************************
	 * @Dsecription �����Ƿ������ס�͵õ��Ƿ������ס
	 * @param fiinishCheckIn �ǻ��߷�
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
