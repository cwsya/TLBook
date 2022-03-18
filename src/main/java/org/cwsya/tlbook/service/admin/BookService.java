package org.cwsya.tlbook.service.admin;

import org.cwsya.tlbook.domain.VO.BookVO;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

/**
 * @author cws
 */
public interface BookService {
    /**
     * 添加书籍
     * @param bookVO 书籍信息
     * @param book 书籍文件
     * @return 成功
     * @throws IOException io异常
     */
    boolean addBook(BookVO bookVO, MultipartFile book) throws IOException;
}
