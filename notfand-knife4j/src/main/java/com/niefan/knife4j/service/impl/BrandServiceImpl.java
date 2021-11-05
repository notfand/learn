package com.niefan.knife4j.service.impl;

import com.niefan.knife4j.mapper.BrandMapper;
import com.niefan.knife4j.model.Brand;
import com.niefan.knife4j.service.BrandService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * 商品品牌 ServiceImpl
 * @author Niefan
 * @date 2021/11/5
 */
@Slf4j
@Service
public class BrandServiceImpl implements BrandService {

	@Resource
	private BrandMapper brandMapper;

	@Override
	public List<Brand> list() {
		return brandMapper.selectList();
	}

	@Override
	public List<Brand> listPage(Integer pageNum, Integer pageSize) {
		return null;
	}
}
