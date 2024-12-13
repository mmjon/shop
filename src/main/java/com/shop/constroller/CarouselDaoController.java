package com.shop.constroller;

import com.shop.service.CarouselService;
import com.shop.util.ResultJSON;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @Author: Insight
 * @Description: TODO
 * @Date: 2024/12/11 19:32
 * @Version: 1.0
 */
@RestController
@CrossOrigin
@RequestMapping("/carousel")
public class CarouselDaoController {
    @Resource
    private CarouselService carouselService;
    @RequestMapping("/findCarousel")
    public ResultJSON findCarousel(){
        return carouselService.findCarousel();
    }
}
