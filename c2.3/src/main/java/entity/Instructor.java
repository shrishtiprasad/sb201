package entity;

abstract class Instructor {

	private int instructorId;
	private String instructorName;
	
	public int getInstructorId() {
		return instructorId;
	}
	public void setInstructorId(int instructorId) {
		this.instructorId = instructorId;
	}
	public String getInstructorName() {
		return instructorName;
	}
	public void setInstructorName(String instructorName) {
		this.instructorName = instructorName;
	}
	public Instructor(int instructorId, String instructorName) {
		super();
		this.instructorId = instructorId;
		this.instructorName = instructorName;
	}
	@Override
	public String toString() {
		return "Instructor [instructorId=" + instructorId + ", instructorName=" + instructorName + "]";
	}
	
	
}
