package org.cwsya.tlbook.domain.VO;

/**
 * @author cws
 */
public class BookVO {
    /**
     * 书籍名称
     */
    private String bookName;
    /**
     * 书籍描述
     */
    private String bookDescribe;
    /**
     * 书籍封面
     */
    private String bookCover;
    /**
     * 书籍分类
     */
    private Integer bookClass;

    public BookVO() {
    }

    @Override
    public String toString() {
        return "BookVO{" +
                "bookName='" + bookName + '\'' +
                ", bookDescribe='" + bookDescribe + '\'' +
                ", bookCover='" + bookCover + '\'' +
                ", bookClass=" + bookClass +
                '}';
    }

    public BookVO(String bookName, String bookDescribe, String bookCover, int bookClass) {
        this.bookName = bookName;
        this.bookDescribe = bookDescribe;
        this.bookCover = bookCover;
        this.bookClass = bookClass;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getBookDescribe() {
        return bookDescribe;
    }

    public void setBookDescribe(String bookDescribe) {
        this.bookDescribe = bookDescribe;
    }

    public String getBookCover() {
        return bookCover;
    }

    public void setBookCover(String bookCover) {
        this.bookCover = bookCover;
    }

    public int getBookClass() {
        return bookClass;
    }

    public void setBookClass(int bookClass) {
        this.bookClass = bookClass;
    }
}
