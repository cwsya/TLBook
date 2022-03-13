package org.cwsya.tlbook.controller.admin;

import org.apache.ibatis.executor.ExecutorException;
import org.cwsya.tlbook.domain.DO.AdminDO;
import org.cwsya.tlbook.domain.Result;
import org.cwsya.tlbook.domain.config.ResultCodeEnum;
import org.cwsya.tlbook.exception.userErrorException;
import org.cwsya.tlbook.service.admin.UserService;
import org.cwsya.tlbook.util.JwtUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/admin")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("login")
    public Result login(String userName,String passWord) throws userErrorException {
        String jwtToken;
        AdminDO adminDO = userService.selectAdmin(new AdminDO(null, userName, passWord, null));
        if(adminDO==null){
            throw new userErrorException("用户名密码错误");
        }else{

            jwtToken = JwtUtil.getJwtToken(String.valueOf(adminDO.getId()), userName);
        }
        Result<String> result = new Result<>(ResultCodeEnum.SUCCESS.getResultCode(), ResultCodeEnum.SUCCESS.getMessage());
        result.setData(jwtToken);
        return result;
    }
}
