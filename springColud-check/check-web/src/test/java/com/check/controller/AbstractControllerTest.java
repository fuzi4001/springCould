/**
 * AbstractControllerTest.java
 * com.ipharmacare.check.controller
 * Function： TODO 
 *
 *   version    date      author
 * ──────────────────────────────────
 *   	1.0	 2018年8月27日    songjy
 *
 * Copyright (c) 2018, TNT All Rights Reserved.
*/

package com.check.controller;

import static org.springframework.test.web.servlet.setup.MockMvcBuilders.webAppContextSetup;

import org.junit.Before;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.web.context.WebApplicationContext;

import com.check.CheckApplication;

/**
 * ClassName:AbstractControllerTest
 *
 * @author songjy
 * @version 1.0
 * @since v1.0
 * @Date 2018年8月27日 下午5:51:23
 */

@RunWith(SpringRunner.class)
@SpringBootTest(classes = { CheckApplication.class })
public abstract class AbstractControllerTest {

	@Autowired
	protected WebApplicationContext wac;

	protected MockMvc mockMvc;

	@Before
	public void before() {
		mockMvc = webAppContextSetup(wac).build();
	}

}