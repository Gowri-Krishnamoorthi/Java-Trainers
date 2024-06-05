package app.trainers;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

class App 
{
    public static void main( String[] args )
    {
    	Trainer tr1=new Trainer();
    	Trainer tr2=new Trainer();
    	Trainer tr3=new Trainer();
    	
    	List<Trainer>javaList=new ArrayList<Trainer>();
    	javaList.add(tr1);
    	javaList.add(tr3);
    	
    	List<Trainer>pythonList=new ArrayList<Trainer>();
    	pythonList.add(tr1);
    	pythonList.add(tr2);

    	List<Trainer>aptiList=new ArrayList<Trainer>();
    	aptiList.add(tr2);
    	aptiList.add(tr3);
    	
    	Subject sub1=new Subject(111,"java",javaList);
    	Subject sub2=new Subject(222,"python",pythonList);
    	Subject sub3=new Subject(333,"aptitude",aptiList);

    	List<Subject> ayushList=new ArrayList<Subject>();
    	ayushList.add(sub1);
    	ayushList.add(sub2);

    	List<Subject> kushalList=new ArrayList<Subject>();
    	kushalList.add(sub2);
    	kushalList.add(sub3);
    	
    	List<Subject> shivaList=new ArrayList<Subject>();
    	shivaList.add(sub1);
    	shivaList.add(sub3);
    	
    	tr1.setTrainerId(1);
    	tr1.setTrainerName("ayush");
    	tr1.setSubjects(ayushList);
    	
    	tr2.setTrainerId(2);
    	tr2.setTrainerName("kushal");
    	tr2.setSubjects(kushalList);
    	
    	tr3.setTrainerId(3);
    	tr3.setTrainerName("shiva");
    	tr3.setSubjects(shivaList);
    	
    
    	Configuration cfg=new Configuration().configure();
    	SessionFactory sf=cfg.buildSessionFactory();
    	Session s=sf.openSession();
    	Transaction tx=s.beginTransaction();
    	
    	s.save(sub1);
    	s.save(sub2);
    	s.save(sub3);
    	s.save(tr1);
    	s.save(tr2);
    	s.save(tr3);
    	
    	tx.commit();
    }
}
