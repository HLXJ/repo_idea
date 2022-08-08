package com.lagou.dao;

import com.lagou.domain.PromotionSpace;

public interface PromotionSpaceMapper {
    /**
     * 根据id 查询广告位信息
     * */
    PromotionSpace findPromotionSpaceById(int id);
}
