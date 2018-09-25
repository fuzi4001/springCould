/**
 * IFeignHospitalDbInfo.java
 * com.ipharmacare.check.feign
 * Function： TODO 
 *
 *   version    date      author
 * ──────────────────────────────────
 *   	1.0	 2018年8月27日    songjy
 *
 * Copyright (c) 2018, TNT All Rights Reserved.
*/

package com.check.feign;

import com.check.feign.Imlp.FeignHospitalDbInfoFallback;
import com.check.common.Constant;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.check.bean.Result;

/**
 * ClassName:IFeignHospitalDbInfo
 *
 * @author
 * @version 1.0
 * @since v1.0
 * @Date 2018年8月27日 下午4:21:34
 */

@FeignClient(value = Constant.MICROSERVICE_UNIFIED_INTERFACRE, fallback = FeignHospitalDbInfoFallback.class)
public interface IFeignHospitalDbInfo {

	/**
	 * 分页查询
	 * 
	 * @method queryList
	 * @param pageNumber
	 * @param pageSize
	 * @return
	 * @since v1.0
	 */
	@RequestMapping(value = "/db/infoList", method = RequestMethod.GET)
	Result queryList(@RequestParam(value = "pageNum") Integer pageNumber,
			@RequestParam(value = "pageSize") Integer pageSize);
}