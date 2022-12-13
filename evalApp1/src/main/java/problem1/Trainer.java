package problem1;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "TRAINER")
public class Trainer {

	@Id
	@Column(name = "TID")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int trainer_id;
	
	@Column(name = "TNAME")
	private String trainer_name;
	private int year_of_experience;
	private String email;
	
	@ManyToOne(cascade = CascadeType.ALL)
	private Set<Gym> gym;
	
	public Set<Gym> getGym() {
		return gym;
	}
	public void setGym(Set<Gym> gym) {
		this.gym = gym;
	}
	
	public int getTrainer_id() {
		return trainer_id;
	}
	public void setTrainer_id(int trainer_id) {
		this.trainer_id = trainer_id;
	}
	public String getTrainer_name() {
		return trainer_name;
	}
	public void setTrainer_name(String trainer_name) {
		this.trainer_name = trainer_name;
	}
	public int getYear_of_experience() {
		return year_of_experience;
	}
	public void setYear_of_experience(int year_of_experience) {
		this.year_of_experience = year_of_experience;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	public Trainer() {
		super();
	}
	public Trainer(int trainer_id, String trainer_name, int year_of_experience, String email) {
		super();
		this.trainer_id = trainer_id;
		this.trainer_name = trainer_name;
		this.year_of_experience = year_of_experience;
		this.email = email;
	}
}
