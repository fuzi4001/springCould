/**
 * HospitalDbInfoController.java
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

import java.util.List;

import com.check.bean.Result;
import com.check.feign.IFeignHospitalDbInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * ClassName:HospitalDbInfoController
 *
 * @author songjy
 * @version 1.0
 * @since v1.0
 * @Date 2018年8月27日 下午4:48:59
 */

@RestController
@RequestMapping(value = "/db")
public class HospitalDbInfoController {

	@Autowired
	private IFeignHospitalDbInfo feignHospitalDbInfo;

	@GetMapping(value = "/list")
	public List<String> queryList(@RequestParam(value = "pageNum", defaultValue = "1") Integer pageNumber,
			@RequestParam(value = "pageSize", defaultValue = "2147483647") Integer pageSize) {

		Result result = feignHospitalDbInfo.queryList(pageNumber, pageSize);

		if (null == result || null == result.getData()) {
			return null;
		}

		return result.getData().getList();
	}

}