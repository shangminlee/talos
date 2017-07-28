package cn.luntaibang.talos.admin.controller;

import cn.luntaibang.talos.common.head.Result;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * <p>管理服务控制层</p>
 * @author arrows
 */
@Controller
@RequestMapping("/api/v1/admin")
public class AdminController {

    //日志
    private final Logger logger = LoggerFactory.getLogger(AdminController.class);

    public Result addUser(){
        return Result.createBySuccess();
    }

    public Result addRole(){
        return Result.createBySuccess();
    }

    public Result addPrivilege(){
        return Result.createBySuccess();
    }

    public Result login(){
        return Result.createBySuccess();
    }
}
