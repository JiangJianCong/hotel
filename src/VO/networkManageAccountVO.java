package VO;
import java.io.Serializable;

/*********************************
 * 
 * @author ���� 151250068
 * @Description networkManage�˺�ע���¼�õ�PO��
 * @implements Serializable
 * 
 *********************************/
public class networkManageAccountVO implements Serializable{
    
	public  networkManageAccountVO(){
		
	}
	
	public networkManageAccountVO(String networkManageID,String networkManagePassword){
		this.networkManageID = networkManageID;
		this.networkManagePassword = networkManagePassword;
	}
	/***********************************
	 * @Dsecription ������վ����ID�͵õ���վ����ID
	 * @param ID ��վ����ID
	 **********************************/
	
	public void setNetworkManageID(String ID){
		this.networkManageID=ID;
	}
	public String getNetworkManageID(){
		return this.networkManageID;
	}
	
	/***********************************
	 * @Dsecription ���������������͵õ������������
	 * @param password �����������
	 **********************************/
	public void setNetworkManagePassword(String password){
		this.networkManagePassword=password;
	}
	
	public String getNetworkManagePassword(){
		return this.networkManagePassword;
	}
	
	
	private String networkManageID;
	private String networkManagePassword;
}
