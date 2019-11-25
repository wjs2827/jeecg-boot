/**
 * 〈一句话功能简述〉<br>
 * 〈用户逻辑层〉
 *
 * @author jinshan.wang_tic
 * @create 2019/11/25
 * @since 1.0.0
 */
package com.fowl.managerimpl.usermanagerimpl;

import com.fowl.manager.usermanager.UserManager;
import com.fowl.mapper.UserMapper;
import com.fowl.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
@Service
public class UserManagerImpl implements UserManager {

    @Autowired
    private UserMapper userMapper;

    @Override
    public List<User> queryUserList() {
        return userMapper.queryUserList();
    }
}
