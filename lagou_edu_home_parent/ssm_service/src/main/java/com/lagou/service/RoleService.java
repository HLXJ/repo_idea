package com.lagou.service;

import com.lagou.domain.Role;
import com.lagou.domain.RoleMenuVo;

import java.util.List;

public interface RoleService {
    public List<Role> findAllRole(Role role);

    /**
     * 根据ID查询角色关联菜单
     * */
    List<Integer> findMenuByRoleId(Integer roleId);

    void RoleContextMenu(RoleMenuVo roleMenuVo);
}
