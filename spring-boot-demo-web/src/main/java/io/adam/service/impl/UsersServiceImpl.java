package io.adam.service.impl;

import io.adam.bean.Users;
import io.adam.mapper.UsersMapper;
import io.adam.service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author : 成行(lishijie-me)
 * @version : v1.0
 * @createTime : 2024/2/19 8:23
 * @description : 用户服务业务实现
 */
@Service
public class UsersServiceImpl implements UsersService {

    @Autowired
    UsersMapper usersMapper;

    public Users login(Users users){
        return usersMapper.login(users);
    }
}
