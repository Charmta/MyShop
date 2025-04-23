package com.hugong.MyShop.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.hugong.MyShop.dao.OrderDetailMapper;
import com.hugong.MyShop.pojo.OrderDetail;
import com.hugong.MyShop.service.OrderDetailService;
import org.springframework.stereotype.Service;

@Service
public class OrderDetailServiceImpl extends ServiceImpl<OrderDetailMapper, OrderDetail> implements OrderDetailService {
}
