package com.niefan.knife4j.controller;

import com.niefan.knife4j.common.CommonPage;
import com.niefan.knife4j.common.Result;
import com.niefan.knife4j.model.Brand;
import com.niefan.knife4j.service.BrandService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * 商品品牌 Controller
 * @author Niefan
 * @date 2021/11/5
 */
@Api(value = "BrandController", tags = "商品品牌管理")
@RestController
@RequestMapping("/brand")
public class BrandController {

	@Resource
	private BrandService brandService;

	@ApiOperation(value = "list", notes = "获取所有的商品品牌信息")
	@GetMapping("/list")
	public Result<List<Brand>> list() {
		List<Brand> brandList = brandService.list();
		return Result.success(brandList);
	}

	public Result<CommonPage<List<Brand>>> listPage(@RequestParam(value = "pageNum", defaultValue = "1") Integer pageNum,
													@RequestParam(value = "pageSize", defaultValue = "10") Integer pageSize) {
		List<Brand> brandList = brandService.listPage(pageNum, pageSize);
		return Result.success(CommonPage.restPage(null));
	}
}
