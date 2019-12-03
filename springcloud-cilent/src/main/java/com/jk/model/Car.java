package com.jk.model;

import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.util.Date;

/**
 * @ClassName Car
 * @Deacription TODO
 * @Author liushuxin
 * @Date 2019/12/2 15:58
 * @Version 1.0
 **/
@Data
public class Car implements Serializable {
    private static final long serialVersionUID = 9028365224050782059L;
    private Integer id;
    private String name;
    private Double price;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date createDate;
}
