package com.cognizant.service;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.cognizant.config.ServiceConfig;
import com.cognizant.dao.StudentDaoImpl;

public class Main {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		ApplicationContext ctx = new AnnotationConfigApplicationContext(ServiceConfig.class);

		StudentDaoImpl st = (StudentDaoImpl) ctx.getBean("dao");

		System.out.println(st.insert());
		System.out.println(st.getAll());
		

	}

}
