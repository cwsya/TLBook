package org.cwsya.tlbook.controller;

import com.baomidou.mybatisplus.core.conditions.AbstractWrapper;
import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import org.cwsya.tlbook.domain.DO.BookAndClassDO;
import org.cwsya.tlbook.domain.DO.BookDO;
import org.cwsya.tlbook.domain.Result;
import org.cwsya.tlbook.domain.config.ResultCodeEnum;
import org.cwsya.tlbook.mapper.BookAndClassMapper;
import org.cwsya.tlbook.mapper.BookClassMapper;
import org.cwsya.tlbook.mapper.BookMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author cws
 */
@RestController
public class BooksController {

    @Autowired
    private BookAndClassMapper bookAndClassMapper;

    @PostMapping("/queryBookList/{page}/{number}")
    public Result<?> queryBookList(@PathVariable(name = "page") int page, @PathVariable(name = "number") int number , String bookName){
        Page<BookAndClassDO> page1 = new Page<>();
        page1.setSize(number);
        page1.setCurrent(page);
        LambdaQueryWrapper<BookAndClassDO> wrapper = new LambdaQueryWrapper<>();
        if (StringUtils.isEmpty(bookName)){
            bookAndClassMapper.quBook(page1,wrapper );
        }else {
            wrapper.like(BookAndClassDO::getBookName,bookName);
            bookAndClassMapper.quBook(page1,wrapper);
        }
        ResultCodeEnum codeEnum = ResultCodeEnum.SUCCESS;
        return new Result<>(codeEnum.getResultCode(), codeEnum.getMessage(), page1.getRecords());
    }

    @Autowired
    private BookClassMapper bookClassMapper;

    @PostMapping("/queryBookClass")
    public Result<?> queryBookClass(){
        ResultCodeEnum codeEnum = ResultCodeEnum.SUCCESS;
        return new Result<>(codeEnum.getResultCode(),codeEnum.getMessage(),bookClassMapper.selectList(null));
    }
}
