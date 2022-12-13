package manytomany;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "STUDENT")
public class Student {

	@Id
	@Column(name = "SID")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int sid;
	
	@Column(name = "SNAME")
	private String sname;
	
	@ManyToMany(mappedBy = "students", cascade = CascadeType.ALL)
	private Set<Course> courses;

	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}

	public String getSname() {
		return sname;
	}
	public void setSname(String string) {
		this.sname = string;
	}

	public Set<Course> getCourses() {
		return courses;
	}
	public void setCourses(Set<Course> courses) {
		this.courses = courses;
	}
}
