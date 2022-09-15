
package one.microstream.jcon22_productappjpa.dal;

import com.rapidclipse.framework.server.jpa.dal.JpaDataAccessObject;
import one.microstream.jcon22_productappjpa.domain.Order;


/**
 * Home object for domain model class Order.
 * 
 * @see Order
 */
public class OrderDAO extends JpaDataAccessObject.Default<Order, Integer>
{
	public final static OrderDAO INSTANCE = new OrderDAO();
	
	public OrderDAO()
	{
		super(Order.class);
	}
}
