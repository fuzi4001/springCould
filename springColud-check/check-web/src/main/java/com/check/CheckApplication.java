/**
 * CheckApplication.java
 * com.ipharmacare.check
 * Function： TODO 
 *
 *   version    date      author
 * ──────────────────────────────────
 *   	1.0	 2018年8月27日    songjy
 *
 * Copyright (c) 2018, TNT All Rights Reserved.
*/

package com.check;

import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * ClassName:CheckApplication
 *
 * @author songjy
 * @version 1.0
 * @since v1.0
 * @Date 2018年8月27日 下午5:08:18
 */

@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients
public class CheckApplication {

	public static void main(String[] args) {
		new SpringApplicationBuilder(CheckApplication.class).web(WebApplicationType.SERVLET).run(args);
		System.out.println("start");
	}
	
}
