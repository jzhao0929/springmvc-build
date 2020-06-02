package com.aostar.pojo;

import org.apache.ibatis.type.Alias;

import java.util.Date;

/**
 * @Description 书籍实体类
 * @Author jzhao
 * @Date 2020-6-1 18:41
 **/
@Alias("bookPojo")
public class BookPojo {

    private String id;
    private String bookName;
    private int bookCount;
    private String detail;
    private Date createTime;
    private String createUser;
    private Date updateTime;
    private String updateUser;

    public BookPojo() {
    }

    public BookPojo(String id, String bookName, int bookCount, String detail, Date createTime, String createUser, Date updateTime, String updateUser) {
        this.id = id;
        this.bookName = bookName;
        this.bookCount = bookCount;
        this.detail = detail;
        this.createTime = createTime;
        this.createUser = createUser;
        this.updateTime = updateTime;
        this.updateUser = updateUser;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public int getBookCount() {
        return bookCount;
    }

    public void setBookCount(int bookCount) {
        this.bookCount = bookCount;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getCreateUser() {
        return createUser;
    }

    public void setCreateUser(String createUser) {
        this.createUser = createUser;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public String getUpdateUser() {
        return updateUser;
    }

    public void setUpdateUser(String updateUser) {
        this.updateUser = updateUser;
    }

    @Override
    public String toString() {
        return "BookPojo{" +
                "id='" + id + '\'' +
                ", bookName='" + bookName + '\'' +
                ", bookCount=" + bookCount +
                ", detail='" + detail + '\'' +
                ", createTime=" + createTime +
                ", createUser='" + createUser + '\'' +
                ", updateTime=" + updateTime +
                ", updateUser='" + updateUser + '\'' +
                '}';
    }
}
