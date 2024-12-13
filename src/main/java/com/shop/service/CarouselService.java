package com.shop.service;

import com.shop.pojo.Carousel;
import com.shop.util.ResultJSON;

public interface CarouselService {
    public ResultJSON<Carousel> findCarousel();
}
