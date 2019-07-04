package org.kbf.jmshome.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.kbf.jmshome.model.Signcontinue;
import org.kbf.jmshome.model.SigncontinueExample;

public interface SigncontinueMapper {
    int countByExample(SigncontinueExample example);

    int deleteByExample(SigncontinueExample example);

    int deleteByPrimaryKey(String id);

    int insert(Signcontinue record);

    int insertSelective(Signcontinue record);

    List<Signcontinue> selectByExample(SigncontinueExample example);

    Signcontinue selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") Signcontinue record, @Param("example") SigncontinueExample example);

    int updateByExample(@Param("record") Signcontinue record, @Param("example") SigncontinueExample example);

    int updateByPrimaryKeySelective(Signcontinue record);

    int updateByPrimaryKey(Signcontinue record);
}