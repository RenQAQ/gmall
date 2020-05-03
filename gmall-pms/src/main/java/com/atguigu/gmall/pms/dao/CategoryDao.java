package com.atguigu.gmall.pms.dao;

import com.atguigu.gmall.pms.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 * 
 * @author ryx
 * @email 596938857@qq.com
 * @date 2020-05-02 20:00:30
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {
	
}
