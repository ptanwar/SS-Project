package hibernate_mysql_conn;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;
public class Main {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		UserInfo user = new UserInfo();
		user.setUser_id("root");
		user.setPassword(null);
		user.setAddress("7505,abonado road,Tampa");
        user.setEmpId(0001);
        user.setFirstName("Prachi");
        user.setGender('F');
        user.setLastName("Tanwar");
        user.setMailId("ptanwar@asu.edu");
        user.setPhoneNo(392302403);
        user.setUserStatus("Active");
        user.setUserType('E');     
		user.setSsn(12364);
		user.setDob(null);
		SessionFactory sessionFactory = new AnnotationConfiguration().configure().buildSessionFactory();
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		session.save(user);		
		session.getTransaction().commit();
		session.close();
		sessionFactory.close();
	}
}
