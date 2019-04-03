package com.wwt;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author : wangwentao
 * @Description: TODO
 * @date Date : 2019年04月03日 17:43
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {

    private String name;
    private Integer age;
    private Double salary;

}
