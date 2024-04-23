package cn.lp.order.demoorder.controller;

import cn.lp.member.service.MemberService;
import cn.lp.order.demoorder.config.LoadBalancer;
//import cn.lp.order.demoorder.feign.MemberServiceFeign;
import com.alibaba.csp.sentinel.annotation.SentinelResource;
import com.alibaba.csp.sentinel.slots.block.BlockException;
import org.apache.dubbo.config.annotation.DubboReference;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;


@RestController
public class XiaoFeiTest {
    @Autowired
    private RestTemplate restTemplate;
    @Autowired
    private DiscoveryClient discoveryClient;
    @Autowired
    private LoadBalancer loadBalancer;
    @Autowired
    private MemberService memberService;



    @SentinelResource(value = "orderToMember", blockHandler = "handleException")
    @RequestMapping("/orderToMember")
    public String orderToMember() {
//        //根据服务名 从注册中心上获取该注册服务列表地址
//        List<ServiceInstance> serviceInstanceList  = discoveryClient.getInstances("demo-member");
//        //采用自己的负载均衡的算法
//        ServiceInstance serviceInstance = loadBalancer.getSingleAddres(serviceInstanceList);
//        URI rpcMemberUrl = serviceInstance.getUri();
//        // 使用本地rest形式实现rpc调用
//        String result = restTemplate.getForObject(rpcMemberUrl + "/getUser", String.class);
        String user = memberService.getUser();
        return "订单调用会员获取结果:" + user;
    }
    public String handleException(long s, BlockException ex) {
        ex.printStackTrace();
        return "该接口已经被限流啦!";
    }

}
