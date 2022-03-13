package org.cwsya.tlbook.controller.admin;

import cn.dev33.satoken.stp.SaTokenInfo;
import cn.dev33.satoken.stp.StpUtil;
import org.cwsya.tlbook.domain.DO.AdminDO;
import org.cwsya.tlbook.domain.Result;
import org.cwsya.tlbook.domain.config.ResultCodeEnum;
import org.cwsya.tlbook.exception.userErrorException;
import org.cwsya.tlbook.service.admin.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.*;
import java.util.HashMap;
import java.util.Map;

/**
 * @author cws
 */
@RestController
@RequestMapping("/admin")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/login")
    public Result<?> login(String userName,String passWord) throws userErrorException {
        AdminDO adminDO = new AdminDO(null,userName,passWord,null);
        System.out.println(adminDO);
        if (StringUtils.isEmpty(adminDO.getUserName()) || StringUtils.isEmpty(adminDO.getPassWord())) {
            throw new userErrorException("用户名密码错误");
        }
        SaTokenInfo token;
        AdminDO readminDO = userService.selectAdmin(adminDO);
        HashMap<String, String> resultMap;
        if (readminDO == null) {
            throw new userErrorException("用户名密码错误");
        } else {
            StpUtil.login(readminDO.getId());
            token = StpUtil.getTokenInfo();
            resultMap = new HashMap<>(2);
            resultMap.put(token.getTokenName(), token.getTokenValue());
        }
        return new Result<Map<String, String>>(ResultCodeEnum.SUCCESS.getResultCode(), ResultCodeEnum.SUCCESS.getMessage(), resultMap);
    }

    @PostMapping("/isLogin")
    public Result<?> isLogin(){
        return new Result<>(ResultCodeEnum.SUCCESS.getResultCode(),ResultCodeEnum.SUCCESS.getMessage(),userService.isLogin());
    }
}
