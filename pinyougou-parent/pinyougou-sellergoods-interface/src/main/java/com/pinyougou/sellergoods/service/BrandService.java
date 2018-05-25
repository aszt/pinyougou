package com.pinyougou.sellergoods.service;

import java.util.List;

import com.pinyougou.pojo.TbBrand;

import entity.PageResult;

/**
 * 品牌接口
 * 
 * @author tong
 *
 */
public interface BrandService {

	public List<TbBrand> findAll();

	/**
	 * 品牌分页
	 * @param pageNum 当前页
	 * @param pageSize 每页记录数
	 * @return
	 */
	public PageResult findPage(int pageNum, int pageSize);
	
	/**
	 * 增加
	 * @param brand
	 */
	public void add(TbBrand brand);

	/**
	 * 根据ID查询实体
	 * @param id
	 * @return
	 */
	public TbBrand findOne(Long id);
	
	/**
	 * 修改
	 * @param brand
	 */
	public void update(TbBrand brand);
	
	/**
	 * 删除
	 */
	public void delete(Long[] ids);
	
	public PageResult findPage(TbBrand brand, int pageNum, int pageSize);
	
}
