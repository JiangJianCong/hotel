package PO;

import java.io.Serializable;

/*******************************************
 * 
 * @author ������ 151250070
 * @Description �Ƶ��Żݲ��Ե�PO��
 * @implements Serializable
 * 
 ******************************************/


public class hotelPromotionPO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -3009437407497740036L;
	
	private String serial;
	private boolean isFullCut;
	private boolean isDiscount;
	private int moneyCut = 100;
	private double discount = 10;
	private String promotionDescription;
	
	public hotelPromotionPO(){
		
	}
	
	/************************************************
	 * @Dsecription �����Ż����߱�źͷ����Ż����߱��
	 * @param des �Ƿ�Ϊ�����Ż�
	 ************************************************/
	public void setSerial(String serial){
		this.serial = serial;
	}
	
	public String getSerial(){
		return this.serial;
	}
	
	/************************************************
	 * @Dsecription �����Ż����������ͷ����Ż���������
	 * @param des �Ƿ�Ϊ�����Ż�
	 ************************************************/
	public void setPrmotionDescription(String des){
		this.promotionDescription = des;
	}
	
	public String getPromotionDescription(){
		return this.promotionDescription;
	}
	
	/************************************************
	 * @Dsecription �����Ƿ������Żݺ͵õ��Ƿ������Ż�
	 * @param isFullCut �Ƿ�Ϊ�����Ż�
	 ************************************************/
	
	public void setIsFullCut(boolean isFullCut){
		this.isFullCut = isFullCut;
	}
	
	public boolean getIsFullCut(){
		return this.isFullCut;
	}
	
	
	/***************************************************
	 * @Dsecription �����Ƿ�Ϊ�����Żݺ͵õ��Ƿ�Ϊ�����Ż�
	 * @param isDiscount �Ƿ�Ϊ�����Ż�
	 ***************************************************/
	public void setIsDiscount(boolean isDiscount){
		this.isDiscount = isDiscount;
	}
	
	public boolean getIsDiscount(){
		return this.isDiscount;
	}
	/***************************************************
	 * @Dsecription ������100����Ǯ���͵õ���100����Ǯ��
	 * @param moneyCut ��100����Ǯ��
	 ***************************************************/
	public void setMoneyCut(int moneyCut){
		this.moneyCut = moneyCut;
	}
	
	public int getMoneyCut(){
		return this.moneyCut;
	}
	
	/***************************************************
	 * @Dsecription �����ۿۺ͵õ��ۿ�
	 * @param discount �ۿ�
	 ***************************************************/
	
	public void setDiscount(double discount){
		this.discount = discount;
	}
	
	public double getdiscount(){
		return this.discount;
	}
	
	
}
