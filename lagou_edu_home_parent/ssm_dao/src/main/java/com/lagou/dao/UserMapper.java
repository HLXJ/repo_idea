package com.lagou.dao;

import com.lagou.domain.*;

import java.util.List;

public interface UserMapper {
    /*
        查询所有用户
    */
    public List<User> findAllUserByPage(UserVo userVo);

    /*
        用户登陆
    */
    public User login(User user);

    /*
        根据id查询用户当前角色
    */
    public List<Role> findUserRelationRoleById(int id);
    /**
     * 根据角色id,查询角色拥有的顶级菜单信息
     * */
    public List<Menu> findParentMenuByRoleId(List<Integer> ids);
    /**
     * 根据PID 查询子菜单信息
     * */
    public List<Menu> findSubMenuByPid(int pid);
    /**
     * 获取用户拥有的资源权限信息
     * */
    public List<Resource> findResourceByRoleId(List<Integer> ids);
}
