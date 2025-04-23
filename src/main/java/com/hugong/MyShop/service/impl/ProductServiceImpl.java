package com.hugong.MyShop.service.impl;

import com.hugong.MyShop.pojo.Product;
import com.hugong.MyShop.dao.ProductMapper;
import com.hugong.MyShop.service.ProductService;
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
public class ProductServiceImpl extends ServiceImpl<ProductMapper, Product> implements ProductService {

}
