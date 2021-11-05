package com.niefan.knife4j.mapper;

import com.niefan.knife4j.model.Brand;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * 商品品牌 Mapper
 * @author Niefan
 * @date 2021/11/5
 */
@Mapper
public interface BrandMapper {

	/**
	 * 查询所有
	 * @return List<Brand>
	 */
	List<Brand> selectList();
}
