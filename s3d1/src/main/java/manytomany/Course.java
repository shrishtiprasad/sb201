package manytomany;

import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "COURSE")
public class Course {

	@Id
	@Column(name = "CID")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int cid;
	
	@Column(name = "CNAME")
	private String cname;
	
	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(name = "STUDENTCOURSE", joinColumns = {@JoinColumn(name = "CID")}, inverseJoinColumns = {@JoinColumn(name = "SID")})
	private Set<Student> students;

	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}

	public String getCname() {
		return cname;
	}
	public void setCname(String string) {
		this.cname = string;
	}

	public Set<Student> getStudents() {
		return students;
	}
	public void setStudents(Set<Student> students) {
		this.students = students;
	}
}
