package com.cfz521.pojo;

import lombok.Data;

import java.io.Serializable;

/**
 * payment
 * @author 
 */
@Data
public class Payment implements Serializable {
    /**
     * ID
     */
    private Long id;

    /**
     * 流水号
     */
    private String serial;

    private static final long serialVersionUID = 1L;
}