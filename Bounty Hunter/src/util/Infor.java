package util;

public class Infor {
	private String titleString;				//标题
	private int costInt;					//佣金
	private String placeStirng;				//目的地（送往）
	private String placeGetString;			//取物地点
	private String timeString;				//时间
	private String phoneString;				//联系方式
	private String otherString;				//补充说明
	private byte stateByte;					//接取状态,判断是否有人正在接取或者已接取，防止出现多个人同时接取同一个任务的情况出现
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
	}//构造方法，方便直接赋值

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
