package org.kbf.jmshome.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.kbf.jmshome.model.Story;
import org.kbf.jmshome.model.StoryExample;

public interface StoryMapper {
    int countByExample(StoryExample example);

    int deleteByExample(StoryExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Story record);

    int insertSelective(Story record);

    List<Story> selectByExampleWithBLOBs(StoryExample example);

    List<Story> selectByExample(StoryExample example);

    Story selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Story record, @Param("example") StoryExample example);

    int updateByExampleWithBLOBs(@Param("record") Story record, @Param("example") StoryExample example);

    int updateByExample(@Param("record") Story record, @Param("example") StoryExample example);

    int updateByPrimaryKeySelective(Story record);

    int updateByPrimaryKeyWithBLOBs(Story record);

    int updateByPrimaryKey(Story record);
}