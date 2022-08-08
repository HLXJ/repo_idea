package com.lagou.controller;


import com.github.pagehelper.PageInfo;
import com.lagou.domain.PromotionAdVO;
import com.lagou.domain.ResponseResult;
import com.lagou.service.PromotionAdService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/PromotionAd")
public class PromotionAdController {

    @Autowired
    private PromotionAdService adService;

    /*
        分页查询所有广告信息
    */
    @RequestMapping("/findAllPromotionAdByPage")
    public ResponseResult findAllAdByPage(PromotionAdVO adVo) {
        PageInfo allAdByPage = adService.findAllAdByPage(adVo);
        ResponseResult responseResult = new ResponseResult(true, 200, "响应成功", allAdByPage);
        return responseResult;
    }

}
