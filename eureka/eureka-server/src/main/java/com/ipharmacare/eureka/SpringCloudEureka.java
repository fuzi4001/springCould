package com.ipharmacare.eureka;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * 
 * ClassName:SpringCloudEureka
 *
 * @author songjy
 * @version 1.0
 * @since v1.0
 * @Date 2018年8月28日 下午3:07:40
 */

@Slf4j
@SpringBootApplication
@EnableEurekaServer
@EnableAutoConfiguration(exclude = { DataSourceAutoConfiguration.class })
public class SpringCloudEureka {

	public static void main(String[] args) {
		SpringApplication.run(SpringCloudEureka.class, args);
		log.error("service start");
	}

}
