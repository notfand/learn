package com.niefan.mapstruct.dto;

import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;
import java.time.LocalTime;

/**
 * 会员DTO
 * @author Niefan
 * @date 2021/11/4
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class MemberDTO implements Serializable {
	private static final long serialVersionUID = 6926565396677408502L;

	/**
	 * 会员id
	 */
	private Long id;
	/**
	 * 会员名
	 */
	private String username;
	/**
	 * 密码
	 */
	private String password;
	/**
	 * 昵称
	 */
	private String nickname;
	/**
	 * 生日
	 */
	private String birthday;
	/**
	 * 手机
	 */
	private String phoneNumber;
	/**
	 * icon
	 */
	private String icon;
	/**
	 * 性别
	 */
	private Integer gender;
}
