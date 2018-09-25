/**
 * FeignHospitalDbInfoFallback.java
 * com.ipharmacare.check.feign
 * Function： TODO 
 *
 *   version    date      author
 * ──────────────────────────────────
 *   	1.0	 2018年8月28日    songjy
 *
 * Copyright (c) 2018, TNT All Rights Reserved.
*/

package com.check.feign.Imlp;

import com.check.bean.Result;
import com.check.feign.IFeignHospitalDbInfo;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;

/**
 * ClassName:FeignHospitalDbInfoFallback
 *
 * 断路器
 *
 * @author songjy
 * @version 1.0
 * @since v1.0
 * @Date 2018年8月28日 下午2:02:31
 */
@Component
@Slf4j
public class FeignHospitalDbInfoFallback implements IFeignHospitalDbInfo {

	@Override
	public Result queryList(Integer pageNumber, Integer pageSize) {
		log.error("调用 queryList 服务 失败");
		return null;

	}

}
