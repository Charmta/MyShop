package com.hugong.MyShop.service.impl;

import com.hugong.MyShop.pojo.Order;
import com.hugong.MyShop.dao.OrderMapper;
import com.hugong.MyShop.service.OrderService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
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
public class OrderServiceImpl extends ServiceImpl<OrderMapper, Order> implements OrderService {

}
