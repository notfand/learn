package com.niefan.mapstruct.po;

import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;
import java.time.LocalTime;

/**
 * 会员对象
 * @author Niefan
 * @date 2021/11/4
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class Member implements Serializable {
	private static final long serialVersionUID = -9145157522463964097L;
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
	private LocalTime birthday;
	/**
	 * 手机
	 */
	private String phone;
	/**
	 * icon
	 */
	private String icon;
	/**
	 * 性别
	 */
	private Integer gender;
}
