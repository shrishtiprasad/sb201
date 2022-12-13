package entity;

public class PhoneNumber {

	private int phoneId;
	private String phoneNumber;
    private String phoneType; //(Home/Landline/office) [It should be persisted as enum]
	private int userId; //(Foreign Key)
	
	public int getPhoneId() {
		return phoneId;
	}
	public void setPhoneId(int phoneId) {
		this.phoneId = phoneId;
	}
	
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	
	public String getPhoneType() {
		return phoneType;
	}
	public void setPhoneType(String phoneType) {
		this.phoneType = phoneType;
	}
	
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	
	public PhoneNumber() {}
	public PhoneNumber(int phoneId, String phoneNumber, String phoneType, int userId) {
		super();
		this.phoneId = phoneId;
		this.phoneNumber = phoneNumber;
		this.phoneType = phoneType;
		this.userId = userId;
	}
	public PhoneNumber(String phoneNumber, String phoneType, int userId) {
		super();
		this.phoneNumber = phoneNumber;
		this.phoneType = phoneType;
		this.userId = userId;
	}
	
	@Override
	public String toString() {
		return "PhoneNumber [phoneId=" + phoneId + ", phoneNumber=" + phoneNumber + ", phoneType=" + phoneType
				+ ", userId=" + userId + "]";
	}
}
