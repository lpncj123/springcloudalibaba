//package cn.lp.order.demoorder.feign;
//
//import cn.lp.member.service.MemberService;
//import org.springframework.cloud.openfeign.FeignClient;
//import org.springframework.stereotype.Component;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RequestParam;
//
//@FeignClient(name = "demo-member")
//@Component
//public interface MemberServiceFeign{
//    /**
//     * 提供会员接口
//     *
//     * @param userId
//     * @return
//     */
//    @GetMapping("/getUser")
//    String getUser(@RequestParam("userId") Long userId);
//}
