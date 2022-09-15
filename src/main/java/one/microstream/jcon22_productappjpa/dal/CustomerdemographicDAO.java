
package one.microstream.jcon22_productappjpa.dal;

import com.rapidclipse.framework.server.jpa.dal.JpaDataAccessObject;
import one.microstream.jcon22_productappjpa.domain.Customerdemographic;


/**
 * Home object for domain model class Customerdemographic.
 * 
 * @see Customerdemographic
 */
public class CustomerdemographicDAO extends JpaDataAccessObject.Default<Customerdemographic, String>
{
	public final static CustomerdemographicDAO INSTANCE = new CustomerdemographicDAO();
	
	public CustomerdemographicDAO()
	{
		super(Customerdemographic.class);
	}
}
