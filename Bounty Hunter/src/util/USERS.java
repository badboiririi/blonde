package util;

public class USERS {							//�û���Ϣ��
	private String idString;					//�û�id
	private String passwordString;				//�û�����
	private byte idTypeString;					//�û����ͣ��ж�����ͨ�û�����ϵͳ����Ա,0����ͨ�û���1�ǹ���Ա�û�
	private String stateString;					//�û�״̬����b����ʾ���û��ѱ����ڣ��޷���¼����w����ʾ���û�״̬����������������¼
	public USERS(){
		
	}
	public USERS(String id, String password)
	{
		this.idString = id;
		this.passwordString = password;
	}
	public String getId() {
		return idString;
	}
	public void setId(String id) {
		this.idString = id;
	}
	public String getPassword() {
		return passwordString;
	}
	public void setPassword(String password) {
		this.passwordString = password;
	}
	public byte getIdType() {
		return idTypeString;
	}
	public void setIdType(byte idType) {
		this.idTypeString = idType;
	}
	public String getStateString() {
		return stateString;
	}
	public void setStateString(String stateString) {
		this.stateString = stateString;
	}

	
}
