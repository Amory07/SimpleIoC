package cn.js.ccit.simpleioc;

import cn.js.ccit.simpleioc.configer.SimpleConfiger;
import cn.js.ccit.simpleioc.controller.LogController;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SimpleIoCTest {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SimpleConfiger.class);
        LogController logController = context.getBean(LogController.class);
        logController.init();
        context.close();
    }
}
