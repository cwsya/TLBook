package org.cwsya.tlbook.domain.DO;

import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableLogic;
import com.baomidou.mybatisplus.annotation.TableName;

import java.util.Date;

@TableName("book")
public class BookAndClassDO {
    private String bookId;
    private String bookName;
    private String bookDescribe;
    private String bookCover;
    private String bookClass;
    @TableLogic
    private Integer isDeleted;
    @TableField(fill = FieldFill.INSERT)
    private Date bookTime;
    private Integer bookDownloadTimes;
    private String className;

    @Override
    public String toString() {
        return "BookAndClassDO{" +
                "bookId='" + bookId + '\'' +
                ", bookName='" + bookName + '\'' +
                ", bookDescribe='" + bookDescribe + '\'' +
                ", bookCover='" + bookCover + '\'' +
                ", bookClass='" + bookClass + '\'' +
                ", isDeleted=" + isDeleted +
                ", bookTime=" + bookTime +
                ", bookDownloadTimes=" + bookDownloadTimes +
                ", className='" + className + '\'' +
                '}';
    }

    public BookAndClassDO() {
    }

    public BookAndClassDO(String bookId, String bookName, String bookDescribe, String bookCover, String bookClass, Integer isDeleted, Date bookTime, Integer bookDownloadTimes, String className) {
        this.bookId = bookId;
        this.bookName = bookName;
        this.bookDescribe = bookDescribe;
        this.bookCover = bookCover;
        this.bookClass = bookClass;
        this.isDeleted = isDeleted;
        this.bookTime = bookTime;
        this.bookDownloadTimes = bookDownloadTimes;
        this.className = className;
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

    public String getBookClass() {
        return bookClass;
    }

    public void setBookClass(String bookClass) {
        this.bookClass = bookClass;
    }

    public Integer getIsDeleted() {
        return isDeleted;
    }

    public void setIsDeleted(Integer isDeleted) {
        this.isDeleted = isDeleted;
    }

    public Date getBookTime() {
        return bookTime;
    }

    public void setBookTime(Date bookTime) {
        this.bookTime = bookTime;
    }

    public Integer getBookDownloadTimes() {
        return bookDownloadTimes;
    }

    public void setBookDownloadTimes(Integer bookDownloadTimes) {
        this.bookDownloadTimes = bookDownloadTimes;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }
}
