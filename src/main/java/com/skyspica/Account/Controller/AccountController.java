package com.skyspica.Account.Controller;

import java.util.List;

import com.skyspica.Account.Service.AccountService;
import com.skyspica.Account.Vo.AccountVo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;




/**
 * Created by xiaolei on 17/8/8.
 */
@RestController
@RequestMapping("/av")
public class AccountController {
        private static final Logger logger = LoggerFactory.getLogger(AccountController.class);
        @Autowired
        private AccountService accountService;

        @RequestMapping("/list")
        public List<AccountVo> getAccount(){
            logger.info("从数据库读取Account集合");
            return accountService.getList();
        }
}
