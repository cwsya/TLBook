package org.cwsya.tlbook.domain.DO;


import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

/**
 * @author cws
 */
@TableName("book_class")
public class BookClassDO {
    @TableId(type = IdType.AUTO)
    private Integer classId;
    private String className;

    @Override
    public String toString() {
        return "bookClassDO{" +
                "classId=" + classId +
                ", className='" + className + '\'' +
                '}';
    }

    public BookClassDO() {
    }

    public BookClassDO(Integer classId, String className) {
        this.classId = classId;
        this.className = className;
    }

    public Integer getClassId() {
        return classId;
    }

    public void setClassId(Integer classId) {
        this.classId = classId;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }
}
