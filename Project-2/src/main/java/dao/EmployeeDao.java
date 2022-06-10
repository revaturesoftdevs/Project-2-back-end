package dao;

import java.sql.SQLException;
import java.util.List;

import exception.SystemException;
import model.ReimbursementPojo;
import model.EmployeePojo;


public interface EmployeeDao {
	
	
	EmployeePojo login (EmployeePojo employeePojo)throws SystemException;
	
	List<ReimbursementPojo> viewPendingReimbursements (int empId);
	
	List<ReimbursementPojo> viewResolvedReimbursements (int empId);
	
	EmployeePojo viewEmployeeProfile (int empId);
	
	EmployeePojo modifyEmployee (int empId,EmployeePojo employeePojo);
	
	boolean addReimbursment(ReimbursementPojo reimburse);
}
