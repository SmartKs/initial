package com.spring.initial.impl.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.spring.initial.interfaces.dao.IProductDao;
import com.spring.initial.model.Product;

@Repository
public class ProductDao implements IProductDao{

	@Autowired
	private SessionFactory sessionFactory;
	
	public List<Product> getListAll() {
		Session session = sessionFactory.openSession();
		Query<Product> query = session.createQuery("from Product");
		return query.getResultList();
	}

}
