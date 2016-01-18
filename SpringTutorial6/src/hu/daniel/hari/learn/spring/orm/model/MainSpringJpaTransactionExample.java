package hu.daniel.hari.learn.spring.orm.model;

import java.util.Arrays;
import java.util.List;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.dao.DataAccessException;

import hu.daniel.hari.learn.spring.orm.dao.ProductService;

public class MainSpringJpaTransactionExample {

	public static void main(String[] args) {

		// Create Spring application context
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("classpath:/spring.xml");

		// Get service from context. (service's dependency (ProductDAO) is
		// autowired in ProductService)
		ProductService productService = ctx.getBean(ProductService.class);

		// Do some data operation

		productService.add(new Product(1, "Bulb"));
		productService.add(new Product(2, "Dijone mustard"));

		System.out.println("listAll: " + productService.listAll());

		// Test transaction rollback (duplicated key)
		List<Product> asList = Arrays.asList(new Product(3, "Book"), new Product(4, "Soap"),
				new Product(1, "Computer"));
		try {
			productService.addAll(asList);
		} catch (Exception ex) {
			ex.printStackTrace();
		}

		// Test element list after rollback
		System.out.println("!!!!!!!!!!!!!!! listAll: " + productService.listAll());

		ctx.close();

	}
}