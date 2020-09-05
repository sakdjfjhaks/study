package com.study.practice.springboot.entityclass.ask;

import com.study.practice.base.utils.SnowFlakeId;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Calendar;

/**
* 提问(Ask)表服务实现类
*
* @author zhangkui
* @date  2020-04-26
*/
@Service
public class AskService {

    @Resource
    private AskDao dao;

    /**
     * 增加多条数据
     *
     * @return 对象列表
     */
    public void addNumAsk(){
        Ask ask = new Ask();
        for(int i=0;i<200;i++){
            ask.setAskContent("2020,08,06,"+i+",问答测试");
            this.add(ask);
        }
    }

    public Ask add(Ask ask){
        ask .setAskId(SnowFlakeId.generateID());
        ask .setCreateTime(Calendar.getInstance().getTime());
        ask.setAnswerNum(0);
        ask.setLikeNum(0);
        ask.setVisitNum(0);
        ask.setDeleteState(2);
        this.dao.add(ask);
        return  ask;
    }
}