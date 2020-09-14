package com.shiro.manager.service;

import com.shiro.manager.dto.UserDto;

public interface LoginService {

    UserDto findByAccount(String account);
}
