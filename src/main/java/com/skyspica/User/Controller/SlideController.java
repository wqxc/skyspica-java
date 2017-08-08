package com.skyspica.User.Controller;

import com.skyspica.User.Service.SlideService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.skyspica.User.Vo.*;
import java.util.List;

/**
 * Created by xiaolei on 17/7/28.
 */
@RestController
@RequestMapping("/get")
public class SlideController {
    private static final Logger logger = LoggerFactory.getLogger(SlideController.class);
    @Autowired
    private SlideService slideService;

    @RequestMapping("/slide")
    public List<SlideVo> getSlideList(){
        logger.info("从数据库读取Slide集合");
        return slideService.getSlide();
    }
}