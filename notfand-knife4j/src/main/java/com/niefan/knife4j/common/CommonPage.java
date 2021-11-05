package com.niefan.knife4j.common;

import com.github.pagehelper.PageInfo;

import java.util.List;

/**
 * 分页数据封装类
 * @author Niefan
 * @date 2021/11/5
 */
public class CommonPage<T> {
	/**
	 * 页码
	 */
	private Integer pageNum;
	/**
	 * 每页数量
	 */
	private Integer pageSize;
	/**
	 * 总页码
	 */
	private Integer totalPage;
	/**
	 * 总记录
	 */
	private Long total;
	/**
	 * 记录
	 */
	private List<T> list;

	/**
	 * 将PageHelper分页后的list转为分页信息
	 * @param list List<T>
	 */
	public static <T> CommonPage<T> restPage(List<T> list) {
		CommonPage<T> result = new CommonPage<>();
		PageInfo<T> pageInfo = new PageInfo<>();
		result.setPageNum(pageInfo.getPageNum());
		result.setPageSize(pageInfo.getPageSize());
		result.setTotalPage(pageInfo.getPages());
		result.setTotal(pageInfo.getTotal());
		result.setList(pageInfo.getList());
		return result;
	}

	public Integer getPageNum() {
		return pageNum;
	}

	public void setPageNum(Integer pageNum) {
		this.pageNum = pageNum;
	}

	public Integer getPageSize() {
		return pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}

	public Integer getTotalPage() {
		return totalPage;
	}

	public void setTotalPage(Integer totalPage) {
		this.totalPage = totalPage;
	}

	public Long getTotal() {
		return total;
	}

	public void setTotal(Long total) {
		this.total = total;
	}

	public List<T> getList() {
		return list;
	}

	public void setList(List<T> list) {
		this.list = list;
	}
}
