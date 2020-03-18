package com.example.springbootmybatisdemo.mapper;

import com.example.springbootmybatisdemo.model.UserStarWallEntity;
import com.example.springbootmybatisdemo.model.UserStarWallEntityExample;
import org.apache.ibatis.annotations.Param;

public interface UserStarWallEntityMapper {
    int deleteByPrimaryKey(Long id);

    int insert(UserStarWallEntity record);

    int insertSelective(UserStarWallEntity record);

    UserStarWallEntity selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") UserStarWallEntity record, @Param("example") UserStarWallEntityExample example);

    int updateByExample(@Param("record") UserStarWallEntity record, @Param("example") UserStarWallEntityExample example);

    int updateByPrimaryKeySelective(UserStarWallEntity record);

    int updateByPrimaryKey(UserStarWallEntity record);
}