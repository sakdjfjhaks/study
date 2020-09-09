package com.study.practice.springboot.entityclass.addtest;

import com.study.practice.base.utils.SnowFlakeId;
import com.study.practice.springboot.entityclass.citycoordinate.CityCoordinate;
import com.study.practice.springboot.entityclass.citycoordinate.CityCoordinateService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

/**
 * (AddTest)表服务实现类
 *
 * @author wangkun
 * @date 2020-09-07
 */
@Service
public class AddTestService {

    @Resource
    private AddTestDao dao;
    @Resource
    private CityCoordinateService cityCoordinateService;

    /**
     * 查询多条数据
     *
     * @param addTest 查询参数
     * @return 对象列表
     */
    public List<AddTest> pages(AddTest addTest) {
        return this.dao.pages(addTest);
    }

    /**
     * 查询所有数据
     *
     * @return 对象列表
     */
    public List<AddTest> getAll() {
        return this.dao.getAll();
    }

    /**
     * 新增数据
     *
     * @param addTest 实例对象
     * @return 实例对象
     */
    public AddTest add(AddTest addTest) {
        addTest.setAddTestId(SnowFlakeId.generateID());
        addTest.setCreateTime(Calendar.getInstance().getTime());
        this.dao.add(addTest);
        return this.getById(addTest.getAddTestId());
    }

    /**
     * 批量新增数据
     * * @return 实例对象
     */
    @Transactional
    public void addListmethod(CityCoordinate cityCoordinate,int num) {
        List<AddTest> addTestList = new ArrayList<>();
        for (int i = 0; i < num; i++) {
            BigDecimal bigDecimalLat = cityCoordinate.getCityLat().add(new BigDecimal(0.0001 * i));
            BigDecimal bigDecimalLon = cityCoordinate.getCityLon().add(new BigDecimal(0.0001 * i));
            AddTest addTest = new AddTest();

            addTest.setAddTestId(SnowFlakeId.generateID());
            addTest.setAddTestName(cityCoordinate.getCityName() + i);
            addTest.setAddTestLat(bigDecimalLat);
            addTest.setAddTestLon(bigDecimalLon);
            addTest.setCreateTime(Calendar.getInstance().getTime());

            addTestList.add(addTest);
        }
        for (int i = 0; i < num; i++) {

            BigDecimal bigDecimalLat = cityCoordinate.getCityLat().subtract(new BigDecimal(0.0001 * i));
            BigDecimal bigDecimalLon = cityCoordinate.getCityLon().subtract(new BigDecimal(0.0001 * i));
            AddTest addTest = new AddTest();

            addTest.setAddTestId(SnowFlakeId.generateID());
            addTest.setAddTestName(cityCoordinate.getCityName() + i);
            addTest.setAddTestLat(bigDecimalLat);
            addTest.setAddTestLon(bigDecimalLon);
            addTest.setCreateTime(Calendar.getInstance().getTime());

            addTestList.add(addTest);
        }
        this.dao.addList(addTestList);
    }

    /**
     * 执行批量新增数据具体方法
     */
    public void addList() {
        List<CityCoordinate> cityCoordinateList = cityCoordinateService.getAll();
        int num=500;
        for (CityCoordinate cityCoordinate : cityCoordinateList) {
            this.addListmethod(cityCoordinate,num);
        }
    }

    /**
     * 批量新增数据执行方法
     * * @return 实例对象
     */
    @Transactional
    public void addListDisorderMethod(List<CityCoordinate> cityCoordinateList,int i) {
        int length = cityCoordinateList.size();
        int j = 1;
        int k = 1;
        List<AddTest> addTestList = new ArrayList<>();
        for (CityCoordinate cityCoordinate : cityCoordinateList) {
            BigDecimal bigDecimalLat = cityCoordinate.getCityLat().add(new BigDecimal(0.0001 * i));
            BigDecimal bigDecimalLon = cityCoordinate.getCityLon().add(new BigDecimal(0.0001 * i));
            AddTest addTest = new AddTest();

            addTest.setAddTestId(SnowFlakeId.generateID());
            addTest.setAddTestName(cityCoordinate.getCityName() + i);
            addTest.setAddTestLat(bigDecimalLat);
            addTest.setAddTestLon(bigDecimalLon);
            addTest.setCreateTime(Calendar.getInstance().getTime());

            addTestList.add(addTest);
            if (j % 1000 == 0 || j == length) {
                this.dao.addList(addTestList);
                addTestList.clear();
            }
            j++;

        }
        for (CityCoordinate cityCoordinate : cityCoordinateList) {
            BigDecimal bigDecimalLat1 = cityCoordinate.getCityLat().subtract(new BigDecimal(0.0001 * i));
            BigDecimal bigDecimalLon1 = cityCoordinate.getCityLon().subtract(new BigDecimal(0.0001 * i));
            AddTest addTest = new AddTest();

            addTest.setAddTestId(SnowFlakeId.generateID());
            addTest.setAddTestName(cityCoordinate.getCityName() + i);
            addTest.setAddTestLat(bigDecimalLat1);
            addTest.setAddTestLon(bigDecimalLon1);
            addTest.setCreateTime(Calendar.getInstance().getTime());
            addTestList.add(addTest);
            if (k % 1000 == 0 || k == length) {
                this.dao.addList(addTestList);
                addTestList.clear();
            }
            k++;
        }
    }

    /**
     * 批量新增数据具体方法
     * * @return 实例对象
     */
    public void addListDisorder() {
        List<CityCoordinate> cityCoordinateList = cityCoordinateService.getAll();
        int num=5000;
        for (int i = 0; i < num; i++) {
            this.addListDisorderMethod(cityCoordinateList,i);
        }
    }

    /**
     * 通过ID查询单条数据
     *
     * @param addTestId 主键
     * @return 实例对象
     */
    public AddTest getById(Long addTestId) {
        return this.dao.getById(addTestId);
    }


    /**
     * 修改数据
     *
     * @param addTest 实例对象
     * @return 实例对象
     */
    public AddTest update(AddTest addTest) {
        this.dao.update(addTest);
        return this.getById(addTest.getAddTestId());
    }

    /**
     * 通过主键删除数据
     *
     * @param addTestId 主键
     * @return 是否成功
     */
    public boolean deleteById(Long addTestId) {
        return this.dao.deleteById(addTestId) > 0;
    }

}