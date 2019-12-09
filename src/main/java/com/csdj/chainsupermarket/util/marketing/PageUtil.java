package com.csdj.chainsupermarket.util.marketing;

import org.springframework.stereotype.Component;

import java.util.List;

/**
 * 分页的工具类，封装了分页所需要的数据
 * 当前页码，每页大小，总记录数，总页数，当前页数据
 * @author Administrator
 *
 * @param <T>
 * T表示是一个泛型类。
 */
@Component
public class PageUtil<T> {
	/**
	 * 当前页码
	 */
	private int pageIndex;
	/**
	 * 每页大小
	 */
	private int pageSize;
	/**
	 * 总记录数
	 */
	private int rowCount;
	/**
	 * 总页数，总页数是通过总记录数与每页大小运算得出
	 */
	private int pageNumber;
	/**
	 * 当前页的数据
	 */
	public List<T> list;
	public int getPageIndex() {
		return pageIndex;
	}
	public void setPageIndex(int pageIndex) {
		this.pageIndex = pageIndex;
	}
	public int getPageSize() {
		return pageSize;
	}
	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}
	public int getRowCount() {
		return rowCount;
	}
	public void setRowCount(int rowCount) {
		this.rowCount = rowCount;
	}
	public int getPageNumber() {
		return pageNumber;
	}
	public void setPageNumber(int pageNumber) {
		this.pageNumber = pageNumber;
	}
	public List<T> getList() {
		return list;
	}
	public void setList(List<T> list) {
		this.list = list;
	}
	
}
