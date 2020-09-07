package com.study.practice.springboot.entityclass.ask;

import com.study.practice.base.paramter.constant.ContentConstant;
import com.study.practice.base.utils.SnowFlakeId;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

/**
 * 提问(Ask)表服务实现类
 *
 * @author zhangkui
 * @date 2020-04-26
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
    public void addNumAsk(Integer num) {
        if (num <= 0) {
            return;
        }
        Ask ask = new Ask();
        for (int i = 0; i < num; i++) {
            ask.setAskContent("第一时间," + i + ",问答测试");
            this.add(ask);
        }
    }

    public void addAskList() {
        for (int i = 0; i < 200; i++) {
            List<Ask> askList = new ArrayList<Ask>();
            for (int j = 0; j < 5000; j++) {
                Ask ask = new Ask();
                ask.setAskId(SnowFlakeId.generateID());

                ask.setAskContent("第一时间," + i + ",问答测试");

                ask.setCreateTime(Calendar.getInstance().getTime());
                ask.setAnswerNum(0);
                ask.setLikeNum(0);
                ask.setVisitNum(0);
                ask.setDeleteState(2);

                askList.add(ask);
            }
            this.dao.addAskList(askList);
        }
    }

    public void addNumAskContent(Integer num) {
        if (num <= 0) {
            return;
        }
        Integer length = ContentConstant.CONTENT_CONSTANT.length;
        Ask ask = new Ask();
        for (int i = 0; i < num; i++) {
            for (String content : ContentConstant.CONTENT_CONSTANT) {
                ask.setAskContent(i + content);
                this.add(ask);
            }

        }
    }

    public Ask add(Ask ask) {
        ask.setAskId(SnowFlakeId.generateID());
        ask.setCreateTime(Calendar.getInstance().getTime());
        ask.setAnswerNum(0);
        ask.setLikeNum(0);
        ask.setVisitNum(0);
        ask.setDeleteState(2);
        this.dao.add(ask);
        return ask;
    }
}