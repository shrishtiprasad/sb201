package second;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Account {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int accountNo;
	private String accountholderName;
	private String address;
	private String email;
	private int balance;
	private String mobile;
	
	public int getAccountNo() {
		return accountNo;
	}
	public void setAccountNo(int accountNo) {
		this.accountNo = accountNo;
	}
	
	public String getAccountholderName() {
		return accountholderName;
	}
	public void setAccountholderName(String accountholderName) {
		this.accountholderName = accountholderName;
	}
	
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	
	public Account() {}
	public Account(int accountNo, String accountholderName, String address, String email, int balance, String mobile) {
		super();
		this.accountNo = accountNo;
		this.accountholderName = accountholderName;
		this.address = address;
		this.email = email;
		this.balance = balance;
		this.mobile = mobile;
	}
	
	@Override
	public String toString() {
		return "Account [accountNo=" + accountNo + ", accountholderName=" + accountholderName + ", address=" + address
				+ ", email=" + email + ", balance=" + balance + ", mobile=" + mobile + "]";
	}
}
