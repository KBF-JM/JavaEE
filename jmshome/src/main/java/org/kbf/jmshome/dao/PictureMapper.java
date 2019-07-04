package org.kbf.jmshome.dao;

import org.apache.ibatis.annotations.Param;
import org.kbf.jmshome.model.Picture;
import org.kbf.jmshome.model.PictureExample;

import java.util.List;

public interface PictureMapper {
    int countByExample(PictureExample example);

    int deleteByExample(PictureExample example);

    int deleteByPrimaryKey(String id);

    int insert(Picture record);

    int insertSelective(Picture record);

    List<Picture> selectByExample(PictureExample example);

    Picture selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") Picture record, @Param("example") PictureExample example);

    int updateByExample(@Param("record") Picture record, @Param("example") PictureExample example);

    int updateByPrimaryKeySelective(Picture record);

    int updateByPrimaryKey(Picture record);

    List<String> selectByClause(@Param("clause")String clause,@Param("num")int num);
}