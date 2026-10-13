package cn.js.ccit.simpleioc.entity;
import lombok.Data;

@Data
public class Supplier implements Role {
    private String scode;
    private String spassword;
    private String sname;

    @Override
    public String getRole() {
        return "商家";
    }
}