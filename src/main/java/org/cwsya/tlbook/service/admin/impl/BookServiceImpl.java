package org.cwsya.tlbook.service.admin.impl;

import org.cwsya.tlbook.domain.DO.BookDO;
import org.cwsya.tlbook.domain.VO.BookVO;
import org.cwsya.tlbook.mapper.BookMapper;
import org.cwsya.tlbook.service.admin.BookService;
import org.cwsya.tlbook.util.CosUtil;
import org.cwsya.tlbook.util.FileUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.Objects;
import java.util.UUID;

/**
 * @author cws
 */
@Service
public class BookServiceImpl implements BookService {

    @Autowired
    private CosUtil cosUtil;

    @Autowired
    private FileUtil fileUtil;

    @Autowired
    private BookMapper bookMapper;

    @Override
    public boolean addBook(BookVO bookVO, MultipartFile book) throws IOException {
        String id=String.valueOf(UUID.randomUUID());
        cosUtil.upload(id+"."+fileUtil.getFileExtension(Objects.requireNonNull(book.getOriginalFilename())),book.getInputStream());
        bookMapper.insert(new BookDO(id ,bookVO.getBookName(),bookVO.getBookDescribe(),bookVO.getBookCover(),bookVO.getBookClass(),0,null,0));
        return true;
    }
}
