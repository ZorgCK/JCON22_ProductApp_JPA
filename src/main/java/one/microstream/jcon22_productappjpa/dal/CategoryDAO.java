
package one.microstream.jcon22_productappjpa.dal;

import com.rapidclipse.framework.server.jpa.dal.JpaDataAccessObject;
import one.microstream.jcon22_productappjpa.domain.Category;


/**
 * Home object for domain model class Category.
 * 
 * @see Category
 */
public class CategoryDAO extends JpaDataAccessObject.Default<Category, Integer>
{
	public final static CategoryDAO INSTANCE = new CategoryDAO();
	
	public CategoryDAO()
	{
		super(Category.class);
	}
}
