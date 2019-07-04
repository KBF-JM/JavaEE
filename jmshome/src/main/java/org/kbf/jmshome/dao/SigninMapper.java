package org.kbf.jmshome.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.kbf.jmshome.model.Signin;
import org.kbf.jmshome.model.SigninExample;

public interface SigninMapper {
    int countByExample(SigninExample example);

    int deleteByExample(SigninExample example);

    int deleteByPrimaryKey(String id);

    int insert(Signin record);

    int insertSelective(Signin record);

    List<Signin> selectByExample(SigninExample example);

    Signin selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") Signin record, @Param("example") SigninExample example);

    int updateByExample(@Param("record") Signin record, @Param("example") SigninExample example);

    int updateByPrimaryKeySelective(Signin record);

    int updateByPrimaryKey(Signin record);
}