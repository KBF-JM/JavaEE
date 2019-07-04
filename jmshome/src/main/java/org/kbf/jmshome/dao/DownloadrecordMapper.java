package org.kbf.jmshome.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.kbf.jmshome.model.Downloadrecord;
import org.kbf.jmshome.model.DownloadrecordExample;

public interface DownloadrecordMapper {
    int countByExample(DownloadrecordExample example);

    int deleteByExample(DownloadrecordExample example);

    int deleteByPrimaryKey(String id);

    int insert(Downloadrecord record);

    int insertSelective(Downloadrecord record);

    List<Downloadrecord> selectByExample(DownloadrecordExample example);

    Downloadrecord selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") Downloadrecord record, @Param("example") DownloadrecordExample example);

    int updateByExample(@Param("record") Downloadrecord record, @Param("example") DownloadrecordExample example);

    int updateByPrimaryKeySelective(Downloadrecord record);

    int updateByPrimaryKey(Downloadrecord record);
}