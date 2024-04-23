package cn.lp.member.service;

import org.apache.dubbo.config.annotation.DubboService;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
/**
 * @author lp
 */
@FeignClient(name = "demo-member")
@DubboService
public interface MemberService {
    /**
     * 提供会员接口
     *
     * @param
     * @return
     */
    @GetMapping("/getUser")
    String getUser();

}
