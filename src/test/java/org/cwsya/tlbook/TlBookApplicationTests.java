package org.cwsya.tlbook;

import org.cwsya.tlbook.mapper.AdminMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class TlBookApplicationTests {
    @Autowired
    private AdminMapper adminMapper;

    @Test
    void contextLoads() {
        System.out.println(adminMapper.selectList(null));
    }

}
