package org.cwsya.tlbook.domain.DO;


import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableLogic;
import com.baomidou.mybatisplus.annotation.TableName;

@TableName("admin")
public class AdminDO {
    @TableId(type = IdType.AUTO)
    private Integer id;
    private String userName;
    private String passWord;
    @TableLogic
    private Integer isDeleted;

    @Override
    public String toString() {
        return "AdminDO{" +
                "id=" + id +
                ", userName='" + userName + '\'' +
                ", passWord='" + passWord + '\'' +
                ", isDeleted=" + isDeleted +
                '}';
    }

    public AdminDO() {
    }

    public AdminDO(Integer id, String userName, String passWord, Integer isDeleted) {
        this.id = id;
        this.userName = userName;
        this.passWord = passWord;
        this.isDeleted = isDeleted;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    public Integer getIsDeleted() {
        return isDeleted;
    }

    public void setIsDeleted(Integer isDeleted) {
        this.isDeleted = isDeleted;
    }
}
