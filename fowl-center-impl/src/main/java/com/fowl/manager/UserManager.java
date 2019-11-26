/**
 * 〈一句话功能简述〉<br>
 * 〈用户管理〉
 *
 * @author jinshan.wang_tic
 * @create 2019/11/25
 * @since 1.0.0
 */
package com.fowl.manager;

import com.fowl.model.User;

import java.util.List;

public interface UserManager {

    /**
     * 查询用户列表
     * @return
     */
    List<User> queryUserList();
}
