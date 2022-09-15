
package one.microstream.jcon22_productappjpa.dal;

import com.rapidclipse.framework.server.jpa.dal.JpaDataAccessObject;
import one.microstream.jcon22_productappjpa.domain.Employee;


/**
 * Home object for domain model class Employee.
 * 
 * @see Employee
 */
public class EmployeeDAO extends JpaDataAccessObject.Default<Employee, Integer>
{
	public final static EmployeeDAO INSTANCE = new EmployeeDAO();
	
	public EmployeeDAO()
	{
		super(Employee.class);
	}
}
