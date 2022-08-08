package com.lagou.dao;

import com.lagou.domain.Role;
import com.lagou.domain.Role_menu_relation;

import java.util.List;

public interface RoleMapper {
    /*
        查询角色列表(条件)
    */
    public List<Role> findAllRole(Role role);


    /*
        根据角色ID查询菜单信息
    */
    List<Integer> findMenuByRoleId(Integer roleId);


    void deleteRoleContextMenu(Integer rid);

    /*
        角色菜单关联
    */
    void RoleContextMenu(Role_menu_relation role_menu_relation);
}
