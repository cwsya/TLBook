package org.cwsya.tlbook;

import org.cwsya.tlbook.mapper.AdminMapper;
import org.cwsya.tlbook.util.CosUtil;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.io.File;

@SpringBootTest
class TlBookApplicationTests {
    @Autowired
    private AdminMapper adminMapper;

    @Autowired
    private CosUtil cosUtil;

    @Test
    void cos(){
        cosUtil.upload("123.js",new File("C:\\Users\\cws\\Desktop\\1234.js"));
    }

}
