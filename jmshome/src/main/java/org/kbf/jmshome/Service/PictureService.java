package org.kbf.jmshome.Service;

import net.sf.json.JSONArray;
import org.kbf.jmshome.dao.PictureMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PictureService {
    @Autowired
    private PictureMapper pictureMapper;

    public String GetHotPicture(){
        List<String> list=pictureMapper.selectByClause("downloadtimes",6);
        return JSONArray.fromObject(list).toString();
    }
}
