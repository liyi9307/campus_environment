package com.ncepu.campus_environment.service;

import com.ncepu.campus_environment.dao.CampusNodesDao;
import com.ncepu.campus_environment.dao.CampusSoilDao;
import com.ncepu.campus_environment.entity.CampusNodes;
import com.ncepu.campus_environment.entity.CampusSoil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Map;

@Service
public class CampusSoilService {
    @Autowired
    private CampusSoilDao campusSoilDao;
    @Autowired
    private CampusNodesDao campusNodesDao;
    public CampusSoil selectById(int id){
        return campusSoilDao.selectById(id);
    }

    public List<CampusSoil> selectByNode(String node, int limit){
        return campusSoilDao.selectByNode(node, limit);
    }

    public String insertData(Map<String, Object> map){
        if (map.get("node") == null || map.get("node").equals("") ||
                map.get("soilHum") == null || map.get("soilHum").equals("") ||
                map.get("soilTem") == null || map.get("soilTem").equals("") ||
                map.get("soilPH") == null || map.get("soilPH").equals("")){
            return "Data of node(number), soilHum, soilTem, soilPH are needed.";
        }
        /* 插入数据校验的程序，参考CampusAirTHService*/



        /* 结束*/
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        map.put("receiveTime", format.format(new Date()));
        CampusNodes campusNodes = campusNodesDao.selectByNode(map.get("node").toString());
        if (campusNodes != null && !campusNodes.getNumber().equals("")){
            campusSoilDao.insertData(map);
            return "successful";
        }
        return "error node message!";

    }

    public void deleteByNode(String node){
        campusSoilDao.deleteByNode(node);
    }
}
