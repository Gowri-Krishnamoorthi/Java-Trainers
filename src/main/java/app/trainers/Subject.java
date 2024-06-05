package app.trainers;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
@Entity
public class Subject {
	@Id
   int subId;
   String subName;
   @ManyToMany
   List<Trainer> trainers;
public Subject() {
	super();
	// TODO Auto-generated constructor stub
}
public Subject(int subId, String subName, List<Trainer> trainers) {
	super();
	this.subId = subId;
	this.subName = subName;
	this.trainers = trainers;
}
public int getSubId() {
	return subId;
}
public void setSubId(int subId) {
	this.subId = subId;
}
public String getSubName() {
	return subName;
}
public void setSubName(String subName) {
	this.subName = subName;
}
public List<Trainer> getTrainers() {
	return trainers;
}
public void setTrainers(List<Trainer> trainers) {
	this.trainers = trainers;
}
   
   
}
