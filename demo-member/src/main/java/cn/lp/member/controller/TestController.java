package cn.lp.member.controller;

import cn.lp.member.config.MemberConfig;
import cn.lp.member.service.MemberService;
import cn.lp.member.utils.MyBlockHander;
import cn.lp.member.utils.MyFallBackHandler;
import com.alibaba.csp.sentinel.annotation.SentinelResource;
import org.apache.dubbo.config.annotation.DubboService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author lp
 */
@RestController

public class TestController {
    @Autowired
    private MemberConfig memberConfig;
    @Autowired
    private MemberService memberService;

    @GetMapping("/getUser")
    @SentinelResource(value = "getUser",blockHandler = "blockHandler",fallback = "fallbackHandler")
    public String getUser() {
        return "端口号:" + memberService.getUser();
    }
    public static String blockHandler() {
        return "该接口已经被限流啦!";
    }
    public static String fallbackHandler(Throwable e) {
        return "对不起，访问出问题了，请再刷新试试!";
    }
}
