
package one.microstream.jcon22_productappjpa.dal;

import com.rapidclipse.framework.server.jpa.dal.JpaDataAccessObject;
import one.microstream.jcon22_productappjpa.domain.Shipper;


/**
 * Home object for domain model class Shipper.
 * 
 * @see Shipper
 */
public class ShipperDAO extends JpaDataAccessObject.Default<Shipper, Integer>
{
	public final static ShipperDAO INSTANCE = new ShipperDAO();
	
	public ShipperDAO()
	{
		super(Shipper.class);
	}
}
