package org.cwsya.tlbook.service.admin;

import org.cwsya.tlbook.domain.DO.AdminDO;

/**
 * @author cws
 */
public interface UserService {
    /**
     * 根据账号密码查询用户
     * @param adminDO 前台传入的账号密码
     * @return 查出的用户数据
     */
    AdminDO selectAdmin(AdminDO adminDO);

    /**
     * 判断是否登录
     * @return 登录状态
     */
    boolean isLogin();
}
