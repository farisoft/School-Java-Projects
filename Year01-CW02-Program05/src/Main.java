
public class Main 
{	
	//	--------	Main Call method		---------
	public static void main(String[] args)
	{		
		String fileName = "Catalog";
		
		//	Read in characters from File to String in this format >> Product Code, Product Desc, Product Price, Product Bundle
		Retriever.preFileRead(fileName);
		Retriever.readInProducts(100);
		Retriever.ProductSorter();
		Retriever.CatalogWriter(fileName);
		Retriever.FileReader(fileName);
	}
}
