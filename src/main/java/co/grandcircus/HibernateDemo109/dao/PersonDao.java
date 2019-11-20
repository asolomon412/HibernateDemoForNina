//package co.grandcircus.HibernateDemo109.dao;
//
//import java.util.List;
//
//import javax.persistence.EntityManager;
//import javax.persistence.PersistenceContext;
//import javax.transaction.Transactional;
//
//import org.springframework.stereotype.Repository;
//
//import co.grandcircus.HibernateDemo109.model.Person;
//
//@Repository
//@Transactional // DAOs for Hibernate must be transactional in order to use
//public class PersonDao {
//
//	/*
//	 * We are using the persistence context to autowire the entity mgr.
//	 * 
//	 * entities are stored in this persistence context
//	 */
//	@PersistenceContext
//	EntityManager eManager;
//
//	/*
//	 * The select clause is optional in HQL. If omitted it's basically like a select
//	 * * from person
//	 * 
//	 * HQL queries use the java class and property names not the sql table names
//	 * (the case should match the identifier names for the class and variables)
//	 * 
//	 * When using a query specify the of results: Person.class
//	 */
//	public List<Person> findAll() {
//		return eManager.createQuery("FROM Person", Person.class).getResultList();
//	}
//
//	// this will be used to add or update, the merge is smart enough
//	// to determine when to add (based on a missing id) or update (if the
//	// primary key (id) is included with the person)
//	public Person addOrUpdate(Person p) {
//		return eManager.merge(p);
//	}
//
//	public Person findById(Integer pk) {
//		return eManager.find(Person.class, pk);
//	}
//	
//	public void deleteById(Integer pk) {
//		eManager.remove(findById(pk));
//	}
//
//}






