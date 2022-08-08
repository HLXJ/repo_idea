package com.lagou.service;

import com.github.pagehelper.PageInfo;
import com.lagou.domain.ResponseResult;
import com.lagou.domain.User;
import com.lagou.domain.UserVo;

public interface UserService {
    /*
        查询所有用户
    */
    public PageInfo findAllUserByPage(UserVo userVo);

    /*
        用户登录
    */
    public User login(User user) throws Exception;

    /*
     * 获取用户权限
     * */
    public ResponseResult getUserPermissions(Integer id);
}
