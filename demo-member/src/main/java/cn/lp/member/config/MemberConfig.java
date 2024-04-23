package cn.lp.member.config;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.context.annotation.Configuration;

@RefreshScope
@Configuration
@Data
public class MemberConfig {
    @Value("${server.port}")
    private Integer port;

    @Value("${lp.name}")
    private String name;
}
