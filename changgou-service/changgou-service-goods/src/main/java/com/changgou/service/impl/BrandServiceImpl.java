package com.changgou.service.impl;

import com.changgou.dao.BrandMapper;
import com.changgou.goods.pojo.Brand;
import com.changgou.service.BrandService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.entity.Example;

import java.util.List;
@Service
public class BrandServiceImpl implements BrandService {

    @Autowired
    private BrandMapper brandMapper;

    /**
     * 查询所有
     * @return
     */
    @Override
    public List<Brand> findAll() {
        return brandMapper.selectAll();
    }

    /**
     * 根据商品主键查询商品信息
     * @param id 商品id
     * @return
     */
    @Override
    public Brand findById(Integer id) {
        return brandMapper.selectByPrimaryKey(id);
    }

    /**
     * 条件查询
     * @param brand
     * @return
     */
    @Override
    public List<Brand> findList(Brand brand) {
        Example example = new Example(Brand.class);
        //TODO
        return null;
    }

    /**
     * 添加商品
     * @param brand
     */
    @Override
    public void add(Brand brand) {
        //insert与insertSelective的区别在于后者可忽略空值
        brandMapper.insertSelective(brand);
    }

    /**
     * 通过id修改品牌信息
     * @param brand
     */
    @Override
    public void update(Brand brand) {
        brandMapper.updateByPrimaryKeySelective(brand);
    }

    @Override
    public void delete(Integer id) {
        brandMapper.deleteByPrimaryKey(id);
    }
}
