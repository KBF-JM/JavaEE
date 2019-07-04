package org.kbf.jmshome.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.kbf.jmshome.model.Uploadrecord;
import org.kbf.jmshome.model.UploadrecordExample;

public interface UploadrecordMapper {
    int countByExample(UploadrecordExample example);

    int deleteByExample(UploadrecordExample example);

    int insert(Uploadrecord record);

    int insertSelective(Uploadrecord record);

    List<Uploadrecord> selectByExample(UploadrecordExample example);

    int updateByExampleSelective(@Param("record") Uploadrecord record, @Param("example") UploadrecordExample example);

    int updateByExample(@Param("record") Uploadrecord record, @Param("example") UploadrecordExample example);
}