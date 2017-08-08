package com.skyspica.User.Controller;

import com.skyspica.Account.Service.AccountService;
import com.skyspica.Account.Vo.AccountVo;
import com.skyspica.User.Service.SlideService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.PostMapping;

import com.skyspica.User.Vo.*;

import java.sql.Array;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by xiaolei on 17/7/28.
 */
//@RestController
//@RequestMapping(path = "get")
//public class SlideController {
//
//    final ArrayList list=new ArrayList(3);
//    @GetMapping(path="slide")
//    public ArrayList getSlideVo(){
//
//        final SlideVo slideVo=new SlideVo();
//        slideVo.setUrl("./../assets/images/x1.jpg");
//        slideVo.setTitle("First slide label");
//        slideVo.setDes("Nulla vitae elit libero, a pharetra augue mollis interdum.");
//
//        final SlideVo slideVo1=new SlideVo();
//        slideVo1.setUrl("../../assets/images/x2.jpg");
//        slideVo1.setTitle("Second slide label");
//        slideVo1.setDes("This is home for you,for me,for all of us");
//
//        final SlideVo slideVo2=new SlideVo();
//        slideVo2.setUrl("../../assets/images/x3.jpg");
//        slideVo2.setTitle("Third slide label");
//        slideVo2.setDes("Beautiful and kuxuan");
//
//        list.add(slideVo);
//        list.add(slideVo1);
//        list.add(slideVo2);
//        System.out.print(list);
//
//        return  list;
//    }
//
//}
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