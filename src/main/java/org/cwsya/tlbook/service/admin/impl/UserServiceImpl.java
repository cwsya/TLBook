package org.cwsya.tlbook.service.admin.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import org.cwsya.tlbook.domain.DO.AdminDO;
import org.cwsya.tlbook.mapper.AdminMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements org.cwsya.tlbook.service.admin.UserService {

    @Autowired
    private AdminMapper adminMapper;

    @Override
    public AdminDO selectAdmin(AdminDO adminDO){
        LambdaQueryWrapper<AdminDO> queryWrapper = new LambdaQueryWrapper<>();
        queryWrapper.eq(AdminDO::getUserName,adminDO.getUserName());
        queryWrapper.eq(AdminDO::getPassWord,adminDO.getPassWord());
        return adminMapper.selectOne(queryWrapper);
    }
}
