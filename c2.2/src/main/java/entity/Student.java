package entity;

public class Student {

	private int rollNo;
	private String name;
	private String email; 
	private String mobile;
    private Course courseId;//(Foreign key)
    
	public int getRollNo() {
		return rollNo;
	}
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	
	public Course getCourseId() {
		return courseId;
	}
	public void setCourseId(Course courseId) {
		this.courseId = courseId;
	}
	
	public Student() {}
	public Student(int rollNo, String name, String email, String mobile, Course courseId) {
		super();
		this.rollNo = rollNo;
		this.name = name;
		this.email = email;
		this.mobile = mobile;
		this.courseId = courseId;
	}
	
	@Override
	public String toString() {
		return "Student [rollNo=" + rollNo + ", name=" + name + ", email=" + email + ", mobile=" + mobile
				+ ", courseId=" + courseId + "]";
	}
    
}
