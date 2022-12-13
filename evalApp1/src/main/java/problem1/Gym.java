package problem1;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "GYM")
public class Gym {
	
	@Id
	@Column(name = "GID")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int gym_id; 
	
	@Column(name = "GNAME")
	private String gym_name;
	private int monthly_fee;
	
	@ManyToMany(mappedBy = "gyms", cascade = CascadeType.ALL)
	private Set<Person> person;
	
	@ManyToOne(cascade = CascadeType.ALL)
	private Set<Trainer> trainer;
	
	public Set<Person> getPerson() {
		return person;
	}
	public void setPerson(Set<Person> person) {
		this.person = person;
	}
	public int getGym_id() {
		return gym_id;
	}
	public void setGym_id(int gym_id) {
		this.gym_id = gym_id;
	}
	public String getGym_name() {
		return gym_name;
	}
	public void setGym_name(String gym_name) {
		this.gym_name = gym_name;
	}
	public int getMonthly_fee() {
		return monthly_fee;
	}
	public void setMonthly_fee(int monthly_fee) {
		this.monthly_fee = monthly_fee;
	}
	
	public Gym() {
		super();
	}
	public Gym(int gym_id, String gym_name, int monthly_fee) {
		super();
		this.gym_id = gym_id;
		this.gym_name = gym_name;
		this.monthly_fee = monthly_fee;
	}
	@Override
	public String toString() {
		return "Gym [gym_id=" + gym_id + ", gym_name=" + gym_name + ", monthly_fee=" + monthly_fee + "]";
	}
}
