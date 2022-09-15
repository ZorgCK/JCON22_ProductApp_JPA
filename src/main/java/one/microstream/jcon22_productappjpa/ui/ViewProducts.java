
package one.microstream.jcon22_productappjpa.ui;

import java.util.Arrays;
import java.util.Optional;

import com.rapidclipse.framework.server.data.format.NumberFormatBuilder;
import com.rapidclipse.framework.server.data.renderer.RenderedComponent;
import com.rapidclipse.framework.server.resources.CaptionUtils;
import com.rapidclipse.framework.server.ui.filter.FilterComponent;
import com.rapidclipse.framework.server.ui.filter.GridFilterSubjectFactory;
import com.vaadin.flow.component.grid.ColumnTextAlign;
import com.vaadin.flow.component.grid.Grid;
import com.vaadin.flow.component.grid.GridVariant;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.data.provider.DataProvider;
import com.vaadin.flow.data.renderer.NumberRenderer;
import com.vaadin.flow.router.Route;

import one.microstream.jcon22_productappjpa.HasTitle;
import one.microstream.jcon22_productappjpa.dal.ProductDAO;
import one.microstream.jcon22_productappjpa.domain.Category;
import one.microstream.jcon22_productappjpa.domain.Product;
import one.microstream.jcon22_productappjpa.ui.gencols.GenColProductFunctions;


@Route(value = "", layout = MainLayout.class)
public class ViewProducts extends VerticalLayout implements HasTitle
{
	public ViewProducts()
	{
		super();
		this.initUI();
	}
	
	@Override
	public String getTitle()
	{
		return "Products";
	}
	
	public void refreshGrid()
	{
		this.grid.setItems(new ProductDAO().findAll());
		this.filterComponent.connectWith(this.grid);
	}

	/* WARNING: Do NOT edit!<br>The content of this method is always regenerated by the UI designer. */
	// <generated-code name="initUI">
	private void initUI()
	{
		this.filterComponent = new FilterComponent();
		this.grid            = new Grid<>(Product.class, false);
		
		this.grid.addThemeVariants(GridVariant.LUMO_ROW_STRIPES);
		this.grid.addColumn(Product::getProductid).setKey("productid")
			.setHeader(CaptionUtils.resolveCaption(Product.class, "productid")).setSortable(true).setAutoWidth(true)
			.setFlexGrow(0);
		this.grid.addColumn(Product::getProductname).setKey("productname")
			.setHeader(CaptionUtils.resolveCaption(Product.class, "productname")).setSortable(true);
		this.grid
			.addColumn(
				v -> Optional.ofNullable(v).map(Product::getCategory).map(Category::getCategoryname).orElse(null))
			.setKey("category.categoryname")
			.setHeader(CaptionUtils.resolveCaption(Product.class, "category.categoryname"))
			.setSortable(true);
		this.grid.addColumn(new NumberRenderer<>(Product::getUnitprice, NumberFormatBuilder.Currency().build(), ""))
			.setKey("unitprice").setHeader(CaptionUtils.resolveCaption(Product.class, "unitprice")).setSortable(true)
			.setAutoWidth(true).setFlexGrow(0).setTextAlign(ColumnTextAlign.END);
		this.grid.addColumn(new NumberRenderer<>(Product::getUnitsinstock, NumberFormatBuilder.Integer().build(), ""))
			.setKey("unitsinstock").setHeader(CaptionUtils.resolveCaption(Product.class, "unitsinstock"))
			.setSortable(true)
			.setAutoWidth(true).setFlexGrow(0).setTextAlign(ColumnTextAlign.END);
		this.grid.addColumn(RenderedComponent.Renderer(GenColProductFunctions::new)).setKey("renderer").setHeader("...")
			.setSortable(false).setAutoWidth(true).setFlexGrow(0).setTextAlign(ColumnTextAlign.CENTER);
		this.grid.setDataProvider(DataProvider.ofCollection(ProductDAO.INSTANCE.findAll()));
		this.grid.setSelectionMode(Grid.SelectionMode.SINGLE);
		
		this.filterComponent.connectWith(this.grid.getDataProvider());
		this.filterComponent.setFilterSubject(GridFilterSubjectFactory.CreateFilterSubject(this.grid,
			Arrays.asList("category.categoryname", "productname"),
			Arrays.asList("category", "productname", "unitprice")));
		
		this.filterComponent.setWidthFull();
		this.filterComponent.setHeight(null);
		this.grid.setSizeFull();
		this.add(this.filterComponent, this.grid);
		this.setFlexGrow(1.0, this.grid);
		this.setSizeFull();
	} // </generated-code>

	// <generated-code name="variables">
	private Grid<Product>   grid;
	private FilterComponent filterComponent;
	// </generated-code>
	
}