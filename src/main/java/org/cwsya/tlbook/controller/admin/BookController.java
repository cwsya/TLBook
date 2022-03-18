package org.cwsya.tlbook.controller.admin;

import org.cwsya.tlbook.domain.Result;
import org.cwsya.tlbook.domain.VO.BookVO;
import org.cwsya.tlbook.domain.config.ResultCodeEnum;
import org.cwsya.tlbook.exception.RequestParametersException;
import org.cwsya.tlbook.service.admin.BookService;
import org.cwsya.tlbook.util.CosUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

/**
 * @author cws
 */
@RestController
@RequestMapping("/admin")
public class BookController {

    @Autowired
    private CosUtil cosUtil;

    @Autowired
    private BookService bookService;

    @PostMapping("/addBook")
    public Result<?> addBook(BookVO bookVO, MultipartFile book) throws RequestParametersException, IOException {
        if(book==null||book.isEmpty() || StringUtils.isEmpty(bookVO.getBookName())){
            throw new RequestParametersException("参数异常");
        }
        bookService.addBook(bookVO,book);
        ResultCodeEnum codeEnum = ResultCodeEnum.SUCCESS;
        return new Result<>(codeEnum.getResultCode(),codeEnum.getMessage(),codeEnum.getMessage());
    }
}
