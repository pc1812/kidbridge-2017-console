package net.$51zhiyuan.development.kidbridge.ui.model;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 * Created by hkhl.cn on 2017/8/1.
 */
public class UserBookRepeat implements Serializable {



    private Integer id;
    private Integer like;
    private UserBook userBook;
    private List segment;
    private List<UserBookRepeatComment> userBookRepeatCommentList;
    private List<UserBookRepeatLike> userBookRepeatLikeList;
    private Boolean delFlag;
    private Date createTime;
    private Date updateTime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public UserBook getUserBook() {
        return userBook;
    }

    public void setUserBook(UserBook userBook) {
        this.userBook = userBook;
    }

    public List getSegment() {
        return segment;
    }

    public void setSegment(List segment) {
        this.segment = segment;
    }

    public List<UserBookRepeatComment> getUserBookRepeatCommentList() {
        return userBookRepeatCommentList;
    }

    public void setUserBookRepeatCommentList(List<UserBookRepeatComment> userBookRepeatCommentList) {
        this.userBookRepeatCommentList = userBookRepeatCommentList;
    }

    public List<UserBookRepeatLike> getUserBookRepeatLikeList() {
        return userBookRepeatLikeList;
    }

    public void setUserBookRepeatLikeList(List<UserBookRepeatLike> userBookRepeatLikeList) {
        this.userBookRepeatLikeList = userBookRepeatLikeList;
    }

    public Boolean getDelFlag() {
        return delFlag;
    }

    public void setDelFlag(Boolean delFlag) {
        this.delFlag = delFlag;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public Integer getLike() {
        return like;
    }

    public void setLike(Integer like) {
        this.like = like;
    }

    @Override
    public String toString() {
        return "UserBookRepeat{" +
                "id=" + id +
                ", userBook=" + userBook +
                ", segment=" + segment +
                ", userBookRepeatCommentList=" + userBookRepeatCommentList +
                ", userBookRepeatLikeList=" + userBookRepeatLikeList +
                ", delFlag=" + delFlag +
                ", createTime=" + createTime +
                ", updateTime=" + updateTime +
                '}';
    }
}
