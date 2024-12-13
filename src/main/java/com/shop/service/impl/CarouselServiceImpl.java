package com.shop.service.impl;

import com.shop.mapper.CarouselMapper;
import com.shop.pojo.Carousel;
import com.shop.service.CarouselService;
import com.shop.util.ResultJSON;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @Author: Insight
 * @Description: TODO
 * @Date: 2024/12/11 19:32
 * @Version: 1.0
 */
@Service
public class CarouselServiceImpl implements CarouselService {
    @Resource
    private CarouselMapper carouselMapper;
    @Override
    public ResultJSON<Carousel> findCarousel() {
        return ResultJSON.success(carouselMapper.selectList(null));
    }
}
