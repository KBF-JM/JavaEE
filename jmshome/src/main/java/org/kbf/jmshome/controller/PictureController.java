package org.kbf.jmshome.controller;

import org.kbf.jmshome.Service.PictureService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("picture")
public class PictureController {
    @Autowired
    private PictureService pictureService;
    @RequestMapping("hotPicture")
    @ResponseBody
    public String GetHotPiture(){
        String result=pictureService.GetHotPicture();
        return result;
    }
}
