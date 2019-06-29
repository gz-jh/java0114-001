package com.offcn.springbootdemo.po;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.*;

import java.io.Serializable;
import java.util.Date;

@Data//get set tostring
@AllArgsConstructor//有参构造
@NoArgsConstructor
public class cart implements Serializable {
    private Integer id;
    private String name;
	//this is edit**************************************
    private Float price;
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
    private Date createdate;
	
    public void add(){
        System.out.println("hello");
    }
}
 
