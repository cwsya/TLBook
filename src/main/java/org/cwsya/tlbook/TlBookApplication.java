package org.cwsya.tlbook;

import cn.dev33.satoken.SaManager;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author cws
 */

@SpringBootApplication
@MapperScan("org.cwsya.tlbook.mapper")
public class TlBookApplication {

    public static void main(String[] args) {
        SpringApplication.run(TlBookApplication.class, args);
        System.out.println("启动成功：Sa-Token配置如下：" + SaManager.getConfig());
    }

}
