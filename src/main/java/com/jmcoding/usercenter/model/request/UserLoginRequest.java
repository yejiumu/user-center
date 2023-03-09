package com.jmcoding.usercenter.model.request;

import lombok.Data;

import java.io.Serializable;

/**
 * @author xiaoke
 */
@Data
public class UserLoginRequest implements Serializable {

    private static final long serialVersionUID = 325053199263253932L;

    private String userAccount;

    private String userPassword;

}
