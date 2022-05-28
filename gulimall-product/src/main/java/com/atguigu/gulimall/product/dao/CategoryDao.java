package com.atguigu.gulimall.product.dao;

import com.atguigu.gulimall.product.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 * 
 * @author chenshun
 * @email xiongyuanadd@163.com
 * @date 2022-05-14 13:45:44
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {
	
}
