package cn.lp.member.service.impl;

import cn.lp.member.config.MemberConfig;
import cn.lp.member.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author lp
 */
@Service
public class MemberServiceImpl implements MemberService {
    @Autowired
    private MemberConfig memberConfig;

    @Override

    public String getUser() {
//        try {
//            Thread.sleep(300);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }

        return "我是会员服务端口号为:" + memberConfig.getPort()+memberConfig.getName();
    }

}
