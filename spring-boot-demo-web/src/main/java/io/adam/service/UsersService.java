package io.adam.service;

import io.adam.bean.Users;

/**
 * @author : 成行(lishijie-me)
 * @version : v1.0
 * @createTime : 2024/2/19 8:22
 * @description : 用户服务
 */
public interface UsersService {
    Users login(Users users);
}
