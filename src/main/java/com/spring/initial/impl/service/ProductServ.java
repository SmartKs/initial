package com.spring.initial.impl.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.initial.interfaces.dao.IProductDao;
import com.spring.initial.interfaces.service.IProductServ;
import com.spring.initial.model.Product;

@Service
public class ProductServ implements IProductServ {
	@Autowired
	private IProductDao productDao;
	
	@Transactional
	public List<Product> getListAll() {
		return productDao.getListAll();
	}

}
