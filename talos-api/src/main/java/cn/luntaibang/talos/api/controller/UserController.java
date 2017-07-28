package cn.luntaibang.talos.api.controller;

import cn.luntaibang.talos.api.vo.UserVo;
import cn.luntaibang.talos.common.head.Result;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;


@Api(description = "用户模块接口")
@Controller
@RequestMapping("/api/v1/user")
public class UserController {

    //日志
    private final Logger logger = LoggerFactory.getLogger(UserController.class);

    @ApiOperation(value = "注册用户",notes = "")
    @ResponseBody
    @RequestMapping(value = "/register",method = RequestMethod.POST)
    public Result<UserVo> register(@ApiParam(value = "手机号") @RequestParam("mobile")String mobile,
                                   @ApiParam(value = "密码") @RequestParam("password")String password,
                                   @ApiParam(value = "验证码") @RequestParam("verifyCode")String verifyCode){
        logger.info("register mobile:{},password:{},verifyCode:{}",mobile,password,verifyCode);
        UserVo userVo = new UserVo(123,"13521336846");
        return Result.createBySuccess(userVo);
    }
}
