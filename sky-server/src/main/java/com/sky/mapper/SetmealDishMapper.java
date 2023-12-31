package com.sky.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface SetmealDishMapper {


    /**
     * 根据菜品id查询对应套餐id
     * @param ids
     * @return
     */
    //select setmeal_id from setmeal_dish where dish_id in (1,2,3...)
    List<Long> getSetmealIdsByDishIds(List<Long> ids);
}
