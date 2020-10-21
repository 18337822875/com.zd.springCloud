package com.zd.springCloud.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @description:
 * @author: zd
 * @time: 2020/10/14 22:07
 */


@Data
@AllArgsConstructor
@NoArgsConstructor
public class Payment implements Serializable {

//    id
    private long id;
//    支付订单号
    private  String serial;
}
