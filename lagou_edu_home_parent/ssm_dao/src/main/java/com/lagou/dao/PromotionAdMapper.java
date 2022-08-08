package com.lagou.dao;

import com.lagou.domain.PromotionAd;

import java.util.List;

public interface PromotionAdMapper {
    /*
        分页获取所有的广告列表
    */
    public List<PromotionAd> findAllAdByPage();
}
