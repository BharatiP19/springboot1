package in.bharati.springbootcrudapi.Springbootcrudapi.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import in.bharati.springbootcrudapi.Springbootcrudapi.dao.EmployeeDao;
import in.bharati.springbootcrudapi.Springbootcrudapi.model.Employee;
@Service
public class EmployeeServiceImplementation implements EmployeeService{
	
	@Autowired
	private EmployeeDao employeeDao;
	
	
	
@Transactional
	public List<Employee> get() {
		return employeeDao.get();
	}
@Transactional
	public Employee get(int id) {
		
	return employeeDao.get(id);
	}
@Transactional
	public void save(Employee emp) {
	employeeDao.save(emp);
		
	}
@Transactional
	
	public void delete(int id) {
	employeeDao.delete(id);
		
	}

}
