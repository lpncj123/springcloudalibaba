package cn.lp.order.demoorder.config;

import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Configuration;

/**
 * @program: ipayhiwork
 * @description: Feign配置
 * @author: JianJun.Qu
 * @create: 2020-03-26 10:14
 **/
@Configuration
@EnableFeignClients({"cn.lp.member.service"})
public class FeignConfig {

}
