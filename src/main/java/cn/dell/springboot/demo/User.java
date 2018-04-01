package cn.dell.springboot.demo;

import jdk.nashorn.internal.objects.annotations.Getter;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@EntityScan
public class User {
    private Long userId = 1L;
    private String userName = "userName";
    private String name = "name";

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
