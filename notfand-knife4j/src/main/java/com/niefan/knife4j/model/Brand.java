package com.niefan.knife4j.model;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;

/**
 * 商品品牌实体
 * @author Niefan
 * @date 2021/11/5
 */
@Data
public class Brand implements Serializable {
	private static final long serialVersionUID = 1221450534388645047L;
	/**
	 * 品牌id
	 */
	private Long id;
	/**
	 * 品牌名
	 */
	private String name;
	/**
	 * 首字母
	 */
	@ApiModelProperty(value = "首字母")
	private String firstLetter;
	/**
	 * 排序
	 */
	private Integer sort;
	/**
	 * 是否为品牌制造商: 0->不是;1->是
	 */
	@ApiModelProperty(value = "是否为品牌制造商：0->不是；1->是")
	private Integer factoryStatus;
	/**
	 * 显示状态
	 */
	private Integer showStatus;
	/**
	 * 产品数量
	 */
	@ApiModelProperty(value = "产品数量")
	private Integer productCount;
	/**
	 * 产品评论数量
	 */
	@ApiModelProperty(value = "产品评论数量")
	private Integer productCommentCount;
	/**
	 * 品牌logo
	 */
	@ApiModelProperty(value = "品牌logo")
	private String logo;
	/**
	 * 专区大图
	 */
	@ApiModelProperty(value = "专区大图")
	private String bigPic;
	/**
	 * 品牌故事
	 */
	@ApiModelProperty(value = "品牌故事")
	private String brandStory;
}
