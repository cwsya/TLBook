package org.cwsya.tlbook.domain.DO;


import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableLogic;
import com.baomidou.mybatisplus.annotation.TableName;

import java.util.Date;

@TableName("book")
public class BookDO {
    private String bookId;
    private String bookName;
    private String bookDescribe;
    private String bookCover;
    private Integer bookClass;
    @TableLogic
    private Integer isDeleted;
    @TableField(fill = FieldFill.INSERT)
    private Date bookTime;
    private Integer bookDownloadTimes;

    @Override
    public String toString() {
        return "BookDO{" +
                "bookId='" + bookId + '\'' +
                ", bookName='" + bookName + '\'' +
                ", bookDescribe='" + bookDescribe + '\'' +
                ", bookCover='" + bookCover + '\'' +
                ", bookClass=" + bookClass +
                ", isDeleted=" + isDeleted +
                ", bookTime=" + bookTime +
                ", bookDownloadTimes=" + bookDownloadTimes +
                '}';
    }

    public BookDO() {
    }

    public String getBookId() {
        return bookId;
    }

    public void setBookId(String bookId) {
        this.bookId = bookId;
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

    public int getIsDeleted() {
        return isDeleted;
    }

    public void setIsDeleted(int isDeleted) {
        this.isDeleted = isDeleted;
    }

    public Date getBookTime() {
        return bookTime;
    }

    public void setBookTime(Date bookTime) {
        this.bookTime = bookTime;
    }

    public int getBookDownloadTimes() {
        return bookDownloadTimes;
    }

    public void setBookDownloadTimes(int bookDownloadTimes) {
        this.bookDownloadTimes = bookDownloadTimes;
    }

    public BookDO(String bookId, String bookName, String bookDescribe, String bookCover, int bookClass, int isDeleted, Date bookTime, int bookDownloadTimes) {
        this.bookId = bookId;
        this.bookName = bookName;
        this.bookDescribe = bookDescribe;
        this.bookCover = bookCover;
        this.bookClass = bookClass;
        this.isDeleted = isDeleted;
        this.bookTime = bookTime;
        this.bookDownloadTimes = bookDownloadTimes;
    }
}
