package in.bharati.springbootcrudapi.Springbootcrudapi.dao;

import java.util.List;

import in.bharati.springbootcrudapi.Springbootcrudapi.model.Employee;

public interface EmployeeDao {
	
	List<Employee> get();
	Employee get(int id);
	void save(Employee emp);
	void delete(int id);
	
	

}
