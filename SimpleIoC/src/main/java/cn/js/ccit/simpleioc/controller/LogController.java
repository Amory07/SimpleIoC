package cn.js.ccit.simpleioc.controller;
import cn.js.ccit.simpleioc.entity.Role;

public class LogController {
    private Role role;
    public void setRole(Role role) {
        this.role = role;
    }
    public void init() {
        System.out.println("当前登录用户身份："+role.getRole());
    }
}
