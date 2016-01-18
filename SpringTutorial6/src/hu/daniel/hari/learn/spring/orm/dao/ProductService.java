package hu.daniel.hari.learn.spring.orm.dao;

import hu.daniel.hari.learn.spring.orm.dao.ProductDao;
import hu.daniel.hari.learn.spring.orm.model.Product;

import java.util.Collection;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Component
public class ProductService {

	@Autowired
	private ProductDao productDao;

	@Transactional
	public void add(Product product) {
		productDao.persist(product);
	}

	@Transactional(propagation = Propagation.REQUIRED)
	public void addAll(Collection<Product> products) {
		int i = 0;
		for (Product product : products) {
			i++;
			productDao.persist(product);
//			if (i == 1) {
//				throw new NumberFormatException("exception is throwinnn .... ");
//			}
		}
	}

	@Transactional(readOnly = true)
	public List<Product> listAll() {
		return productDao.findAll();

	}

}