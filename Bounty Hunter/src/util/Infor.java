package util;

public class Infor {
	private String titleString;				//����
	private int costInt;					//Ӷ��
	private String placeStirng;				//Ŀ�ĵأ�������
	private String placeGetString;			//ȡ��ص�
	private String timeString;				//ʱ��
	private String phoneString;				//��ϵ��ʽ
	private String otherString;				//����˵��
	private byte stateByte;					//��ȡ״̬,�ж��Ƿ��������ڽ�ȡ�����ѽ�ȡ����ֹ���ֶ����ͬʱ��ȡͬһ��������������
	public Infor(){
		
	}
	public Infor(String title,int cost,String place,String placeGet,String time,String phone,String other){
		this.titleString = title;
		this.costInt = cost;
		this.placeStirng = place;
		this.timeString = time;
		this.placeGetString = placeGet;
		this.phoneString = phone;
		this.otherString = other;
		this.stateByte = 1;
	}//���췽��������ֱ�Ӹ�ֵ

	public String getTitleString() {
		return titleString;
	}
	public void setTitleString(String titleString) {
		this.titleString = titleString;
	}
	public int getCostInt() {
		return costInt;
	}
	public void setCostString(int costInt) {
		this.costInt = costInt;
	}
	public String getPlaceStirng() {
		return placeStirng;
	}
	public void setPlaceStirng(String placeStirng) {
		this.placeStirng = placeStirng;
	}
	public String getTimeString() {
		return timeString;
	}
	public void setTimeString(String timeString) {
		this.timeString = timeString;
	}
	public String getPhoneString() {
		return phoneString;
	}
	public void setPhoneString(String phoneString) {
		this.phoneString = phoneString;
	}
	public String getOtherString() {
		return otherString;
	}
	public void setOtherString(String otherString) {
		this.otherString = otherString;
	}
	public String getPlaceGetString() {
		return placeGetString;
	}
	public void setPlaceGetString(String placeGetString) {
		this.placeGetString = placeGetString;
	}
	public byte getStateByte() {
		return stateByte;
	}
	public void setStateByte(byte stateByte) {
		this.stateByte = stateByte;
	}
}
