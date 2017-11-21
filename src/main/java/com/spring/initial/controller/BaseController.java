package com.spring.initial.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.spring.initial.interfaces.service.IProductServ;
import com.spring.initial.model.Product;

@Controller
public class BaseController {
	private static int counter = 0;
	private static final String VIEW_HOME = "home";
	private final static Logger logger = LoggerFactory.getLogger(BaseController.class);
	
	@Autowired
	private IProductServ productServ;
	
	@RequestMapping(value = "/home.act", method = RequestMethod.GET)
	public String welcome() {
		List<Product> productList = productServ.getListAll();
		return VIEW_HOME;
	}
}
