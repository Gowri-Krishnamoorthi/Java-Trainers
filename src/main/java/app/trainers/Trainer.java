package app.trainers;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Trainer {
	 @Id
     int trainerId;
     String trainerName;
     @ManyToMany
     List<Subject> subjects;
	public Trainer() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Trainer(int trainerId, String trainerName, List<Subject> subjects) {
		super();
		this.trainerId = trainerId;
		this.trainerName = trainerName;
		this.subjects = subjects;
	}
	public int getTrainerId() {
		return trainerId;
	}
	public void setTrainerId(int trainerId) {
		this.trainerId = trainerId;
	}
	public String getTrainerName() {
		return trainerName;
	}
	public void setTrainerName(String trainerName) {
		this.trainerName = trainerName;
	}
	public List<Subject> getSubjects() {
		return subjects;
	}
	public void setSubjects(List<Subject> subjects) {
		this.subjects = subjects;
	}
     
}
