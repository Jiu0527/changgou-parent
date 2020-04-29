package com.changgou.service;


import com.changgou.goods.pojo.Brand;
import com.github.pagehelper.PageInfo;

import java.util.List;

public interface BrandService {
    /**
     * 查询所有
     * @return
     */
     List<Brand> findAll();

    /**
     * 根据id查询品牌
     * @param id 商品id
     * @return
     */
     Brand findById(Integer id);

    /**
     * 通过条件模糊查询
     * @param brand
     * @return
     */
     List<Brand> findList(Brand brand);

    /**
     *  分页查询
     * @param page 页数
     * @param size 显示条数
     * @return
     */
     PageInfo<Brand> findPage(Integer page, Integer size);

    /**
     * 条件分页查询
     * @param brand 封装的条件信息
     * @param page  页数
     * @param size  显示条数
     * @return
     */
    PageInfo<Brand> findPage(Brand brand,Integer page, Integer size);
    /**
     *增加品牌
     */
    void add(Brand brand);

    /**
     * 根据id修改品牌信息
     * @param brand
     */
    void update(Brand brand);

    /**
     * 通过id删除品牌
     * @param id
     */
    void delete(Integer id);
}
