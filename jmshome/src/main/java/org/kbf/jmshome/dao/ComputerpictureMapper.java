package org.kbf.jmshome.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.kbf.jmshome.model.Computerpicture;
import org.kbf.jmshome.model.ComputerpictureExample;

public interface ComputerpictureMapper {
    int countByExample(ComputerpictureExample example);

    int deleteByExample(ComputerpictureExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Computerpicture record);

    int insertSelective(Computerpicture record);

    List<Computerpicture> selectByExample(ComputerpictureExample example);

    Computerpicture selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Computerpicture record, @Param("example") ComputerpictureExample example);

    int updateByExample(@Param("record") Computerpicture record, @Param("example") ComputerpictureExample example);

    int updateByPrimaryKeySelective(Computerpicture record);

    int updateByPrimaryKey(Computerpicture record);
}