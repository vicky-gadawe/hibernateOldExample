package in.vkg.entity;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class MainApp {
	public static void main(String[] args) {
		EntityTransaction tx = null;
		try {
			// 1. (Loads Driver,url,user,and password)
			EntityManagerFactory emf = Persistence.createEntityManagerFactory("studentDb");
			System.out.println(emf.getClass().getName());

			// 2. (perform Operations like insert, update,delete...)
			EntityManager em = emf.createEntityManager();
			System.out.println(em.getClass().getName());// cheack class

			// 3. create Transaction
			tx = em.getTransaction();
			System.out.println(tx.getClass().getName());
			// 4. Start Transaction
			tx.begin();

			// 5. Perform operation
			// save data into DB
			Student student = new Student();
			student.setStudId(101);
			student.setStudName("Vicky");
			student.setStudAge(25);

			em.persist(student); // SQL: INSERT INTO ...

			// 6. commit
			tx.commit();
			// 7. close
			emf.close();
		} catch (Exception e) {
			// rollback if any problem
			tx.rollback();

			e.printStackTrace();
		}
	}
}
