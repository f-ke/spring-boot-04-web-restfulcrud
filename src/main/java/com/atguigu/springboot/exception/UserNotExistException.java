package com.atguigu.springboot.exception;

public class UserNotExistException  extends  RuntimeException{
    public UserNotExistException() {
        super("user not exist");
    }
}
