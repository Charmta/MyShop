package com.hugong.MyShop.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.hugong.MyShop.pojo.User;
import com.hugong.MyShop.dao.UserMapper;
import com.hugong.MyShop.service.UserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author Cy
 * @since 2025-04-16
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {

    @Autowired
    private UserMapper userMapper;
    //根据用户名，密码和角色主键 查询指定的用户信息
    public User login(User user){
        QueryWrapper<User> queryWrapper=new QueryWrapper<>();
        queryWrapper.eq("name",user.getName());
        queryWrapper.eq("password",user.getPassword());
        queryWrapper.eq("role_id",user.getRoleId());

        //执行查询
        User user2 =userMapper.selectOne(queryWrapper);

        return user2;
    }
}
