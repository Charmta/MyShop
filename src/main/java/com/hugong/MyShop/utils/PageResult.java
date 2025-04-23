package com.hugong.MyShop.utils;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

@Data
public class PageResult<T> implements Serializable {
    private Integer code;
    private String msg;
    private Integer count;
    private List<T> date;
}
