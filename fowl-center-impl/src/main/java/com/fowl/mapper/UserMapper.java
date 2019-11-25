/**
 * 〈一句话功能简述〉<br>
 * 〈用户〉
 *
 * @author jinshan.wang_tic
 * @create 2019/11/25
 * @since 1.0.0
 */
package com.fowl.mapper;

import com.fowl.model.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserMapper {

    /**
     * 查询用户列表
     * @return
     */
    List<User> queryUserList();
}
