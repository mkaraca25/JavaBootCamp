package nLayeredDemo;

import nLayeredDemo.business.abstracts.ProductService;
import nLayeredDemo.business.concretes.ProductManager;
import nLayeredDemo.core.JLoggerManagerAdaptor;
import nLayeredDemo.dataAccess.abstracts.ProductDao;
import nLayeredDemo.dataAccess.concretes.AbcProductDao;
import nLayeredDemo.dataAccess.concretes.HibernateProductDao;
import nLayeredDemo.entities.concretes.Product;

public class Main {

	 

	public static void main(String[] args) {
		//todo: spring Ioc ile çozulecek.
		ProductService productService=new ProductManager(new AbcProductDao()
				,new JLoggerManagerAdaptor());
		
		Product product = new Product(1,2,"elma",12,50);
		productService.add(product);
	}

}
