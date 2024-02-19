package io.adam.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * @author : 成行(lishijie-me)
 * @version : v1.0
 * @createTime : 2024/2/18 18:16
 * @description : 用户信息实体类
 */
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Data
public class Users {
    private Long id;
    private Long userId;
    private String userName;
    private String password;
    private String phoneNumber;
    private String email;
    private String address;

    public Users(String userName, String password, String phoneNumber, String email) {
        this.userName = userName;
        this.password = password;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }

    public Users(String userName, String password) {
        this.userName = userName;
        this.password = password;
    }

    public Users(String password) {
        this.password = password;
    }

    public Users(String userName, String phoneNumber, String email) {
        this.userName = userName;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }
}
