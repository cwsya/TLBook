package org.cwsya.tlbook;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import org.cwsya.tlbook.domain.DO.BookAndClassDO;
import org.cwsya.tlbook.domain.DO.BookDO;
import org.cwsya.tlbook.mapper.AdminMapper;
import org.cwsya.tlbook.mapper.BookAndClassMapper;
import org.cwsya.tlbook.mapper.BookMapper;
import org.cwsya.tlbook.util.CosUtil;
import org.cwsya.tlbook.util.FileUtil;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.io.File;
import java.util.List;

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
//        bookMapper.insert(new BookDO("321fgdfgdfds","a","b","c",1,0,null,10));
    }

    @Autowired
    private BookAndClassMapper bookAndClassMapper;
    @Test
    void csad(){
        Page<BookAndClassDO> page = new Page<>();
        page.setSize(2);
        page.setCurrent(1);
        LambdaQueryWrapper<BookAndClassDO> bookAndClassDOLambdaQueryWrapper = new LambdaQueryWrapper<>();
        bookAndClassDOLambdaQueryWrapper.like(BookAndClassDO::getBookName,"2");
        IPage<BookAndClassDO> bookAndClassDOIPage = bookAndClassMapper.quBook(page,bookAndClassDOLambdaQueryWrapper);
        System.out.println(page.getRecords());
    }

    @Autowired
    private BookMapper bookMapper123;


    @Test
    void dasdasfdsafwsdafdsafawe(){
        System.out.println(bookMapper123.selectList(null));
    }

}
