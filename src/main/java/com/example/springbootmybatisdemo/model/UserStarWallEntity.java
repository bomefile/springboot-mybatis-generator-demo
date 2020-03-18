package com.example.springbootmybatisdemo.model;

import java.util.Date;

public class UserStarWallEntity {
    private Long id;

    private Integer userId;

    private Byte userType;

    private Byte starWallStatus;

    private Integer currentMagicValue;

    private Integer starId;

    private Byte starType;

    private Date createTime;

    private Date updateTime;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Byte getUserType() {
        return userType;
    }

    public void setUserType(Byte userType) {
        this.userType = userType;
    }

    public Byte getStarWallStatus() {
        return starWallStatus;
    }

    public void setStarWallStatus(Byte starWallStatus) {
        this.starWallStatus = starWallStatus;
    }

    public Integer getCurrentMagicValue() {
        return currentMagicValue;
    }

    public void setCurrentMagicValue(Integer currentMagicValue) {
        this.currentMagicValue = currentMagicValue;
    }

    public Integer getStarId() {
        return starId;
    }

    public void setStarId(Integer starId) {
        this.starId = starId;
    }

    public Byte getStarType() {
        return starType;
    }

    public void setStarType(Byte starType) {
        this.starType = starType;
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
}