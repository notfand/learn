package com.niefan.knife4j.service;

import com.niefan.knife4j.model.Brand;

import java.util.List;

/**
 * 商品品牌 Service
 * @author Niefan
 * @date 2021/11/5
 */
public interface BrandService {
	/**
	 * 获取所有商品品牌信息
	 * @return List<Brand> 所有商品品牌信息
	 */
	List<Brand> list();

	/**
	 * 分页获取商品品牌信息
	 * @param pageNum 页码
	 * @param pageSize 每页数量
	 * @return 分页商品品牌信息
	 */
	List<Brand> listPage(Integer pageNum, Integer pageSize);
}
