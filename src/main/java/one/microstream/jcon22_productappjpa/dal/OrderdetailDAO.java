
package one.microstream.jcon22_productappjpa.dal;

import com.rapidclipse.framework.server.jpa.dal.JpaDataAccessObject;
import one.microstream.jcon22_productappjpa.domain.Orderdetail;
import one.microstream.jcon22_productappjpa.domain.OrderdetailId;


/**
 * Home object for domain model class Orderdetail.
 * 
 * @see Orderdetail
 */
public class OrderdetailDAO extends JpaDataAccessObject.Default<Orderdetail, OrderdetailId>
{
	public final static OrderdetailDAO INSTANCE = new OrderdetailDAO();
	
	public OrderdetailDAO()
	{
		super(Orderdetail.class);
	}
}
