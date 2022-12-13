package entity;

import javax.persistence.Entity;

@Entity
public class PartTimeInstructor extends Instructor {

	private int noOfSession;
	private int costPerSession;
	private String mobileNumber;
	
	public int getNoOfSession() {
		return noOfSession;
	}
	public void setNoOfSession(int noOfSession) {
		this.noOfSession = noOfSession;
	}
	
	public int getCostPerSession() {
		return costPerSession;
	}
	public void setCostPerSession(int costPerSession) {
		this.costPerSession = costPerSession;
	}
	
	public String getMobileNumber() {
		return mobileNumber;
	}
	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	
	public PartTimeInstructor() {}
	public PartTimeInstructor(int noOfSession, int costPerSession, String mobileNumber) {
		super();
		this.noOfSession = noOfSession;
		this.costPerSession = costPerSession;
		this.mobileNumber = mobileNumber;
	}
	
	@Override
	public String toString() {
		return "PartTimeInstructor [noOfSession=" + noOfSession + ", costPerSession=" + costPerSession
				+ ", mobileNumber=" + mobileNumber + "]";
	}
}
