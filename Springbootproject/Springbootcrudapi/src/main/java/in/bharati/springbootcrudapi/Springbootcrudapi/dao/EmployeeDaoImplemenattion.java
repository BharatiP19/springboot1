package in.bharati.springbootcrudapi.Springbootcrudapi.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.websocket.Session;
//import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import in.bharati.springbootcrudapi.Springbootcrudapi.model.Employee;


@Repository
public class EmployeeDaoImplemenattion implements EmployeeDao {

	
	@Autowired
	private EntityManager entityManager;
	
	public List<Employee> get() {
		Session session = entityManager.unwrap(Session.class);
		@SuppressWarnings("unchecked")
		Query<Employee> query = (Query<Employee>) ((EntityManager) session).createQuery("from Employee");
		List<Employee> list = query.getResultList();
		return list;
		
	}

	
	
	
	
	public Employee get(int id) {
	    Session currentSession = entityManager.unwrap(Session.class);
	    Employee employeeObj = ((EntityManager) currentSession).find(Employee.class, id);
	    return employeeObj;
	}


	@Override
	public void save(Employee emp) {
	
		Session currentSession = entityManager.unwrap(Session.class);
		((EmployeeDaoImplemenattion) currentSession).save(emp);
		 
	}

	@Override
	public void delete(int id) {
		
		Session currentSession = entityManager.unwrap(Session.class);
		Employee employeeObj = ((EntityManager) currentSession).find(Employee.class, id);
		((EntityManager) currentSession).remove(employeeObj);
		
	}

	
	}


