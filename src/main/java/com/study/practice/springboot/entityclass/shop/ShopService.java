package com.study.practice.springboot.entityclass.shop;



import com.study.practice.base.utils.SnowFlakeId;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.Calendar;

/**
*
*
* @author wangkun
* @date  2019/05/15
*/
@Service
public class ShopService  {
    @Resource
    private ShopDao dao;





    /**
    * 添加
    * @param shop
    * @return
    */
    public Shop add(Shop shop)  {
        shop.setShopId(SnowFlakeId.generateID());
        shop.setCreateTime(Calendar.getInstance().getTime());
        dao.add(shop);
        return shop;
    }

}
