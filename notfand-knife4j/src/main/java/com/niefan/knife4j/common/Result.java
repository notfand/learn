package com.niefan.knife4j.common;

/**
 * 结果返回
 * @author Niefan
 * @date 2021/11/5
 */
public class Result<T> {
	/**
	 * 状态码
	 */
	private int code;
	/**
	 * 消息
	 */
	private String message;
	/**
	 * 数据
	 */
	private T data;

	public Result() {}

	public Result(int code, String message, T data) {
		this.code = code;
		this.message = message;
		this.data = data;
	}

	/**
	 * 成功返回结果
	 * @param data 获取的数据
	 */
	public static <T> Result<T> success(T data) {
		return new Result<T>(ResultCode.SUCCESS.getCode(), ResultCode.SUCCESS.getMessage(), data);
	}

	/**
	 * 成功返回结果
	 * @param data 获取的数据
	 * @param message 提示消息
	 */
	public static <T> Result<T> success(T data, String message) {
		return new Result<T>(ResultCode.SUCCESS.getCode(), message, data);
	}

	/**
	 * 失败返回结果
	 * @param errorCode 错误码
	 */
	public static <T> Result<T> failed(ErrorCode errorCode) {
		return new Result<T>(errorCode.getCode(), errorCode.getMessage(), null);
	}

	/**
	 * 失败返回结果
	 * @param message 提示信息
	 */
	public static <T> Result<T> failed(String message) {
		return new Result<T>(ResultCode.FAILED.getCode(), message, null);
	}

	/**
	 * 失败返回结果
	 */
	public static <T> Result<T> failed() {
		return failed(ResultCode.FAILED);
	}

	/**
	 * 参数验证失败返回结果
	 */
	public static <T> Result<T> validateFailed() {
		return failed(ResultCode.VALIDATE_FAILED);
	}

	/**
	 * 参数验证失败返回结果
	 * @param message 提示信息
	 */
	public static <T> Result<T> validateFailed(String message) {
		return new Result<T>(ResultCode.VALIDATE_FAILED.getCode(), message, null);
	}

	/**
	 * 未登录返回结果
	 */
	public static <T> Result<T> unauthorized(T data) {
		return new Result<T>(ResultCode.UNAUTHORIZED.getCode(), ResultCode.UNAUTHORIZED.getMessage(), data);
	}

	/**
	 * 未授权返回结果
	 */
	public static <T> Result<T> forbidden(T data) {
		return new Result<T>(ResultCode.FORBIDDEN.getCode(), ResultCode.FORBIDDEN.getMessage(), data);
	}

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}
}
