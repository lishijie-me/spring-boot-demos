package io.adam.mapper;

import io.adam.bean.Users;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author : 成行(lishijie-me)
 * @version : v1.0
 * @createTime : 2024/2/18 19:56
 * @description : 用户mapper接口
 */
@Mapper
public interface UsersMapper {
    Users login(Users users);

}
