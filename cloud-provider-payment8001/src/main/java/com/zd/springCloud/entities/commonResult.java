package com.zd.springCloud.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @description:
 * @author: zd
 * @time: 2020/10/14 22:09
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
public class commonResult<T> {

    private Integer code;
    private String message;
    private T data;

    public commonResult(Integer code,String message){
        this(code,message,null);
    }

    public commonResult(Integer code, String message, T o) {
    }
}
