package Com.controller;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

import Com.to.Player;

public class hiberneateMain {
	public static void main(String[] args) {
//		try {
		
		Configuration configuration= new Configuration().configure();
		configuration.addAnnotatedClass(Com.to.Player.class);
		
	StandardServiceRegistryBuilder builder  =  new StandardServiceRegistryBuilder().applySettings(configuration.getProperties());
	SessionFactory factory = configuration.buildSessionFactory(builder.build());
	
	Session session = factory.openSession();
	Transaction transaction = session.beginTransaction();
	
	Player p1=new Player(10,"Keshav","MyTeam", 30);
	session.save(p1);
	transaction.commit();
	session.close();
		
		
//		}catch(Exception e) {
//			e.getMessage();
//			
//		}
	
	}

}
