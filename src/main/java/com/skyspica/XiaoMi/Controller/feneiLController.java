package com.skyspica.XiaoMi.Controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.skyspica.XiaoMi.Service.*;
import com.skyspica.XiaoMi.Vo.FenLeiVo;
import com.skyspica.XiaoMi.Vo.FenLeiOtherVo;

import java.util.List;

/**
 * Created by xiaolei on 17/9/7.
 */
@RestController
@RequestMapping("/xiaomi")
public class feneiLController {
    private static final Logger logger = LoggerFactory.getLogger(feneiLController.class);
    @Autowired
    private fenLeiService fenLeiService;

    @RequestMapping("/fenlei")
    public List<FenLeiVo> getFenleiList(){
        logger.info("从数据库读取Slide集合");
        return fenLeiService.getFenLeiList();
    }
    @RequestMapping("/fenleiother")
    public List<FenLeiOtherVo> getFenLeiOtherList(){
        logger.info("从数据库读取Slide集合");
        return fenLeiService.getFenLeiOtherList();
    }
}
