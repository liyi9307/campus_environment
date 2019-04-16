package com.ncepu.campus_environment;

import com.ncepu.campus_environment.dao.CampusAirTHDao;
import com.ncepu.campus_environment.entity.CampusAirTH;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CampusEnvironmentApplicationTests {

    @Autowired
    private CampusAirTHDao campusAirTHDao;
    @Test
    public void contextLoads() {
        /*CampusAirTH campusAirTH = campusAirTHDao.selectById(5);
        System.out.println(campusAirTH);*/

        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date date = new Date();
        //Timestamp timestamp = new Timestamp(date.getTime());
        Map<String, Object> map = new HashMap<>();
        map.put("node", "10001");
        map.put("airTem", "23");
        map.put("airHum", "20");
        map.put("receiveTime", simpleDateFormat.format(date));
        campusAirTHDao.insertData(map);
    }

}
