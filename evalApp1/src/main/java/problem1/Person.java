package problem1;

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
@Table(name = "PERSON")
public class Person {
	@Id
	@Column(name = "PID")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int person_id;
	
	@Column(name = "PNAME")
	private String name;
	private String email; 
	private String mobile;
	
	@ManyToMany(mappedBy = "persons", cascade = CascadeType.ALL)
	private Set<Gym> gym;
	
	public Set<Gym> getGym() {
		return gym;
	}
	public void setGym(Set<Gym> gym) {
		this.gym = gym;
	}
	public int getPerson_id() {
		return person_id;
	}
	public void setPerson_id(int person_id) {
		this.person_id = person_id;
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
	public Person() {
		super();
	}
	public Person(int person_id, String name, String email, String mobile) {
		super();
		this.person_id = person_id;
		this.name = name;
		this.email = email;
		this.mobile = mobile;
	}
	@Override
	public String toString() {
		return "Person [person_id=" + person_id + ", name=" + name + ", email=" + email + ", mobile=" + mobile + "]";
	}
	
	
}
