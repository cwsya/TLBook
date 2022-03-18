package org.cwsya.tlbook;

import org.cwsya.tlbook.domain.DO.BookDO;
import org.cwsya.tlbook.mapper.AdminMapper;
import org.cwsya.tlbook.mapper.BookMapper;
import org.cwsya.tlbook.util.CosUtil;
import org.cwsya.tlbook.util.FileUtil;
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
        cosUtil.upload("1123.js",new File("C:\\Users\\cws\\Desktop\\1.md"));
    }

    @Autowired
    private FileUtil fileUtil;

    @Test
    void felie(){
        System.out.println(fileUtil.getFileExtension(new File("C:\\Users\\cws\\Desktop\\1234.js").getName()));
    }

    @Autowired
    private BookMapper bookMapper;
    @Test
    void in(){
        bookMapper.insert(new BookDO("321fgdfgdfds","a","b","c",1,0,null,10));
    }

}
