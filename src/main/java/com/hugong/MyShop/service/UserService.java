package com.hugong.MyShop.service;

import com.hugong.MyShop.pojo.User;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author Cy
 * @since 2025-04-16
 */
public interface UserService extends IService<User> {

    //根据用户名，密码和角色主键 查询指定的用户信息
    public User login(User user);
}
