package cn.lp.nacostest.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author lp
 */
@RestController
public class TestController {
    @Value("${server.port}")
    private String serverPort;

    @RequestMapping("/getUser")
    public String getUser(Integer userId) {
        return "端口号:" + serverPort;
    }

}
