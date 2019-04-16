package com.ncepu.campus_environment.service;

import com.ncepu.campus_environment.dao.CampusAirTHDao;
import com.ncepu.campus_environment.dao.CampusNodesDao;
import com.ncepu.campus_environment.entity.CampusAirTH;
import com.ncepu.campus_environment.entity.CampusNodes;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Map;

@Service
public class CampusAirTHService {
    private static final int MAX_AIR_TEM = 50;
    private static final int MIN_AIR_TEM = -30;
    private static final int MAX_AIR_HUM = 100;
    private static final int MIN_AIR_HUM = 0;
    //private static final int MAX_LIMIT = 100;
    //private static final int MIN_LIMIT = 1;
    //private static final int DEFAULT_LIMIT = 10;

    @Autowired
    private CampusAirTHDao campusAirTHDao;
    @Autowired
    private CampusNodesDao campusNodesDao;

    public CampusAirTH selectById(int id){
        return campusAirTHDao.selectById(id);
    }
    public List<CampusAirTH> selectByNode(String node, int limit){
        //limit = limit == 0 || limit > MAX_LIMIT || limit < MIN_LIMIT ? DEFAULT_LIMIT : limit;
        return campusAirTHDao.selectByNode(node, limit);
    }
    public String insertData(Map<String,Object> map){
        if (map.get("node") == null || map.get("node").equals("") ||
                map.get("airTem") == null || map.get("airTem").equals("") ||
                map.get("airHum") == null || map.get("airHum").equals("")){
            return "Data of node(number), airTem(-30 ~ 50), airHum(0~100) are needed.";
        }
        int airTem = Integer.parseInt(map.get("airTem").toString());
        int airHum = Integer.parseInt(map.get("airHum").toString());
        if ( airTem > MAX_AIR_TEM || airTem < MIN_AIR_TEM ||
                airHum > MAX_AIR_HUM || airHum < MIN_AIR_HUM){
            return "error data!";
        }
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        map.put("receiveTime", format.format(new Date()));
        CampusNodes campusNodes = campusNodesDao.selectByNode(map.get("node").toString());
        if (campusNodes != null && !campusNodes.getNumber().equals("")){
            campusAirTHDao.insertData(map);
            return "successful";
        }
        return "error node message!";
    }
    public void deleteByNode(String node){
        campusAirTHDao.deleteByNode(node);
    }

}
