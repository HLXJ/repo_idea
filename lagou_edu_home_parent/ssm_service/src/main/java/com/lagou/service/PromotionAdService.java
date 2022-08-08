package com.lagou.service;

import com.github.pagehelper.PageInfo;
import com.lagou.domain.PromotionAdVO;

public interface PromotionAdService {

    /*
        分页获取所有的广告列表
    */
    public PageInfo findAllAdByPage(PromotionAdVO adVo);
}
