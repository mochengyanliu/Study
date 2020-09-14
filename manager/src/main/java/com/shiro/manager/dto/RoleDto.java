package com.shiro.manager.dto;

import com.shiro.manager.entity.AuthEntity;

import java.util.List;

public class RoleDto {
    private Integer id;

    private String roleName;

    private List<AuthEntity> authEntities;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName == null ? null : roleName.trim();
    }

    public List<AuthEntity> getAuthEntities() {
        return authEntities;
    }

    public void setAuthEntities(List<AuthEntity> authEntities) {
        this.authEntities = authEntities;
    }
}
