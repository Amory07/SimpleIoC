package cn.js.ccit.simpleioc.entity;

public class User implements Role {
    private String ucode;
    private String upassword;
    private String uname;

    @Override
    public String getRole() {
        return "顾客";
    }
}
