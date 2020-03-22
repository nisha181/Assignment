package com.cognizant.dao;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class StudentDaoImplTest {
	ApplicationContext ctx=new AnnotationConfigApplicationContext(com.cognizant.config.ServiceConfig.class);
	StudentDaoImpl st=(StudentDaoImpl) ctx.getBean("dao");
	
    
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	System.out.println("Before Class");

	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	System.out.println("After Class");
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

		@Test
	public void testinsert() {
		assertEquals(1,st.insert());	
	}
	@Test
	public void testGetAll(){
		assertEquals(6,st.getAll().size());
	}
	
	
}
