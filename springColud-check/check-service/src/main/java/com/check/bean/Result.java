package com.check.bean;

import java.io.Serializable;
import java.util.List;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Result implements Serializable {
	private static final long serialVersionUID = 7340876558863323436L;

	/**
	 * 请求响应状态,参考字典ResultStatus
	 */
	private Integer status;
	/**
	 * 消息提示
	 */
	private String message;
	/**
	 * 返回结果
	 */

	private Data data;

	@Setter
	@Getter
	public static class Data {
		private Integer total;
		private List<String> list;
	}

}
