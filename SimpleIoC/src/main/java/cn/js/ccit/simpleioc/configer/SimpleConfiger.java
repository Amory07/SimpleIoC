package cn.js.ccit.simpleioc.configer;

import cn.js.ccit.simpleioc.controller.LogController;
import cn.js.ccit.simpleioc.entity.Supplier;
import cn.js.ccit.simpleioc.entity.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SimpleConfiger {
    @Bean
    public Supplier getSupplier() {
        return new Supplier();
    }
    @Bean
    public User getUser() {
        return new User();
    }
    @Bean
    public LogController getLogController() {
        LogController logController = new LogController();
//        logController.setRole(getSupplier());
        logController.setRole(getUser());
        return logController;
    }
}
