package com.niefan.knife4j.common;

/**
 * 错误码
 * @author Niefan
 * @date 2021/11/5
 */
public interface ErrorCode {
	/**
	 * 错误码
	 * @return code
	 */
	int getCode();

	/**
	 * 错误信息
	 * @return message
	 */
	String getMessage();
}
