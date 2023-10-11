package in.bharati.springbootcrudapi.Springbootcrudapi.service;

import java.util.List;

import in.bharati.springbootcrudapi.Springbootcrudapi.model.Employee;

public interface EmployeeService {
	List<Employee> get();
	Employee get(int id);
	void save(Employee emp);
	void delete(int id);
	
}
