package problem1Dao;

import java.util.List;

import problem1.Gym;
import problem1.Person;
import problem1.Trainer;
import problem1Exception.GymException;
import problem1Exception.TrainerException;

public interface FitnessDao {

	public void addGym(Gym gym);
	public void registerPerson(Person person, Gym gym_id)throws GymException;
	public void registerTrainer(Trainer trainer);
	public void assignTrainerWithGym(int trainer_id, int gym_id) throws TrainerException, GymException;
	public List<Person> getAllthePersonByGymName(String gym_name)throws GymException;
}
