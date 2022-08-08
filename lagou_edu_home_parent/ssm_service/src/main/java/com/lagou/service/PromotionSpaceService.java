package com.lagou.service;

import com.lagou.domain.PromotionSpace;
import org.springframework.stereotype.Service;

public interface PromotionSpaceService {
    PromotionSpace findPromotionSpaceById(int id);
}
