package io.adam.controller;

import io.adam.bean.Users;
import io.adam.constants.HttpCode;
import io.adam.resp.Result;
import io.adam.service.UsersService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Objects;

/**
 * @author : 成行(lishijie-me)
 * @version : v1.0
 * @createTime : 2024/2/19 18:16
 * @description : 登录用户
 */
@RequestMapping("/users")
@Controller
public class UsersController {

    @Autowired
    private UsersService usersService;
    @RequestMapping("/login")
    public String index(){
        return "users/login";
    }

    @RequestMapping("/doLogin")
    public String doLogin(Users users){
        Result<Users> result = null;
        if(StringUtils.isBlank(users.getUserName()) &&
                StringUtils.isBlank(users.getPhoneNumber()) &&
                StringUtils.isBlank(users.getEmail())
        ){
            // 用户名、电话、邮箱不能全为空
            return "login";
//            result = new Result<>(HttpCode.FAILURE, "用户名、电话、邮箱不能全为空", null);
        }

        if(StringUtils.isBlank(users.getPassword())){
            // 密码不能为空
//            result = new Result<>(HttpCode.FAILURE, "密码不能为空", null);
            return "login";
        }
        Users login = usersService.login(users);
        if(Objects.isNull(login)){
//            result = new Result<>(HttpCode.FAILURE, "用户信息不匹配，请重试或修改密码(注意上生产不能这么写)", null);
            return "login";
        }else if(!login.getPassword().equals(users.getPassword())){
//            result = new Result<>(HttpCode.FAILURE, "密码不匹配，请重试或修改密码(注意上生产不能这么写)", null);
            return "login";
        }else {
//            result = new Result<>(HttpCode.SUCCESS, "执行成功，登录成功", login);
            return "redirect:/order/selectOrderAll";
        }

    }

//    @RequestMapping("/login")
//    @ResponseBody
//    public Result<Users> login(@RequestBody Users users){
//        Result<Users> result = null;
//        if(StringUtils.isBlank(users.getUserName()) ||
//                StringUtils.isBlank(users.getPhoneNumber()) ||
//                StringUtils.isBlank(users.getEmail())
//        ){
//            // 用户名、电话、邮箱不能全为空
//            result = new Result<>(HttpCode.FAILURE, "用户名、电话、邮箱不能全为空", null);
//        }
//
//        if(StringUtils.isBlank(users.getPassword())){
//            // 密码不能为空
//            result = new Result<>(HttpCode.FAILURE, "密码不能为空", null);
//        }
//        Users login = usersService.login(users);
//        if(Objects.isNull(login)){
//            result = new Result<>(HttpCode.FAILURE, "用户信息不匹配，请重试或修改密码(注意上生产不能这么写)", null);
//        }else if(!login.getPassword().equals(users.getPassword())){
//            result = new Result<>(HttpCode.FAILURE, "密码不匹配，请重试或修改密码(注意上生产不能这么写)", null);
//        }else {
//            result = new Result<>(HttpCode.SUCCESS, "执行成功，登录成功", login);
//        }
//
//        return result;
//    }
}
