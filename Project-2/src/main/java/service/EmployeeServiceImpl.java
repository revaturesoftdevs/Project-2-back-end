package service;

import java.sql.SQLException;
import java.util.List;

import dao.EmployeeDao;
import dao.EmployeeDaoImpl;
import exception.SystemException;
import model.EmployeePojo;
import model.ReimbursementPojo;

public class EmployeeServiceImpl implements EmployeeService{
	
	EmployeeDao employeeDao;
	
	
	public EmployeeServiceImpl() {
		
		employeeDao = new EmployeeDaoImpl();
	}
	
	public EmployeeDao getEmployeeDao() {
		return employeeDao;
	}
	
	public void setEmployeeDao(EmployeeDao employeeDao) {
		this.employeeDao = employeeDao;
	}
	
	
	@Override
	public EmployeePojo login(EmployeePojo employeePojo)throws SystemException{
		
		// login validation goes here!
		return employeeDao.login(employeePojo);

	}

	@Override
	public List<ReimbursementPojo> viewPendingReimbursements(int empId){

		return employeeDao.viewPendingReimbursements(empId);
	}

	@Override
	public List<ReimbursementPojo> viewResolvedReimbursements(int empId){

		return employeeDao.viewResolvedReimbursements(empId);
	}

	@Override
	public EmployeePojo viewEmployeeProfile(int empId){

		return employeeDao.viewEmployeeProfile(empId);
	}

	@Override
	public EmployeePojo modifyEmployee(int empId, EmployeePojo employeePojo){
		return employeeDao.modifyEmployee(empId, employeePojo);
	}

	@Override
	public boolean addReimbursment(ReimbursementPojo reimburse) {
		return employeeDao.addReimbursment(reimburse);
	}
}
