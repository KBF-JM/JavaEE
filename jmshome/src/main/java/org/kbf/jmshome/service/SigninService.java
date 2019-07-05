package org.kbf.jmshome.Service;

import org.kbf.jmshome.model.Signcontinue;
import org.kbf.jmshome.model.SigncontinueExample;
import org.kbf.jmshome.model.Signin;
import org.kbf.jmshome.model.SigninExample;
import org.kbf.jmshome.dao.SigncontinueMapper;
import org.kbf.jmshome.dao.SigninMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

@Service
public class SigninService {
    @Autowired
    SigninMapper signinMapper;

    @Autowired
    SigncontinueMapper signcontinueMapper;

    public int getSigninCountNum(String userId){
        SigncontinueExample signcontinueExample=new SigncontinueExample();
        signcontinueExample.createCriteria().andUseridEqualTo(userId);
        Signcontinue signcontinueList=signcontinueMapper.selectByExample(signcontinueExample).stream().findFirst().orElse(null);
        int countDay=1;
        if(signcontinueList!=null)
            countDay=signcontinueList.getContinueday();
        return countDay;
    }

    public void toSignin(String userId){
        Signin signin=new Signin();
        String signId=userId;
        signId+=(int) ((Math.random() * 9 + 1) * 100000);
        signin.setId(signId);
        signin.setTime(new Date(System.currentTimeMillis()));
        signin.setUserid(userId);
        signinMapper.insert(signin);
        SigninExample signinExample=new SigninExample();
        signinExample.setOrderByClause("time desc");
        signinExample.createCriteria().andUseridEqualTo(userId);
        List<Signin> signinList=signinMapper.selectByExample(signinExample);
        if(signinList.size()<2){
            String id=userId;
            id+=(int) ((Math.random() * 9 + 1) * 100000);
            Signcontinue signcontinue=new Signcontinue();
            signcontinue.setContinueday(1);
            signcontinue.setId(id);
            signcontinue.setUserid(userId);
            signcontinueMapper.insert(signcontinue);
        }
        else {
            Signin signin1=signinList.get(0);
            Signin signin2=signinList.get(1);
            DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
            int day=getDay(df.format(signin1.getTime()),df.format(signin2.getTime()));
            SigncontinueExample signcontinueExample=new SigncontinueExample();
            signcontinueExample.createCriteria().andUseridEqualTo(userId);
            Signcontinue signcontinue=signcontinueMapper.selectByExample(signcontinueExample).stream().findFirst().orElse(null);
            if(day>1){
                signcontinue.setContinueday(1);
            }else {
                signcontinue.setContinueday(signcontinue.getContinueday()+1);
            }
            signcontinueMapper.updateByExample(signcontinue,signcontinueExample);
        }
    }

    public int isSignin(String userId){
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(new Date());
        calendar.add(Calendar.DAY_OF_MONTH, -1);
        calendar.setTime(calendar.getTime());
        calendar.set(Calendar.HOUR_OF_DAY, 23);
        calendar.set(Calendar.MINUTE,59);
        calendar.set(Calendar.SECOND,59);
        calendar.set(Calendar.MILLISECOND,99);
        SigninExample signinExample=new SigninExample();
        signinExample.createCriteria().andUseridEqualTo(userId).andTimeGreaterThanOrEqualTo(calendar.getTime());
        signinExample.setDistinct(true);
        List<Signin> result=signinMapper.selectByExample(signinExample);
        if(result.isEmpty()==true)
            return 0;
        return 1;
    }

    public int getDay(String today,String lastDay){
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
        Date fDate= null;
        Date oDate= null;
        try {
            fDate = sdf.parse(today);
            oDate = sdf.parse(lastDay);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        Calendar aCalendar = Calendar.getInstance();
        aCalendar.setTime(fDate);
        int day1 = aCalendar.get(Calendar.DAY_OF_YEAR);
        aCalendar.setTime(oDate);
        int day2 = aCalendar.get(Calendar.DAY_OF_YEAR);
        return day1-day2;
    }
}
