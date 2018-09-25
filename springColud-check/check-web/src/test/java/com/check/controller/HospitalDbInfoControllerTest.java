/**
 * HospitalDbInfoControllerTest.java
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

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import java.io.IOException;

import org.junit.Test;
import org.springframework.http.MediaType;

import lombok.extern.slf4j.Slf4j;

/**
 * ClassName:HospitalDbInfoControllerTest
 *
 * @author   songjy
 * @version  1.0
 * @since    v1.0
 * @Date	 2018年8月27日	下午5:50:26
 */
@Slf4j
public class HospitalDbInfoControllerTest extends AbstractControllerTest{

	@Test
	public void queryListTest() {
		try{
			mockMvc.perform(get("/db/list")
					.contentType(MediaType.APPLICATION_FORM_URLENCODED)
					.param("pageNum", "1"))
			.andDo(print())
			.andExpect(status().isOk());
		} catch (IOException e) {
			log.error(e.getMessage(), e);
		} catch (Exception e) {
			log.error(e.getMessage(), e);
		}
	}
	
}