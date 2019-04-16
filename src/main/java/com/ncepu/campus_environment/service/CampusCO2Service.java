package com.ncepu.campus_environment.service;

import com.ncepu.campus_environment.dao.CampusCO2Dao;
import com.ncepu.campus_environment.dao.CampusNodesDao;
import com.ncepu.campus_environment.entity.CampusCO2;
import com.ncepu.campus_environment.entity.CampusNodes;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Map;

@Service
public class CampusCO2Service {
    @Autowired
    private CampusCO2Dao campusCO2Dao;
    @Autowired
    private CampusNodesDao campusNodesDao;
    public CampusCO2 selectById(int id){
        return campusCO2Dao.selectById(id);
    }

    public List<CampusCO2> selectByNode(String node, int limit){
        return campusCO2Dao.selectByNode(node, limit);
    }

    public String insertData(Map<String, Object> map){
        if (map.get("node") == null || map.get("node").equals("") ||
                map.get("airCO2") == null || map.get("airCO2").equals("")){
            return "Data of node(number), airCO2 are needed.";
        }
        /* 插入CO2浓度校验的程序，参考CampusAirTHService*/



        /* 结束*/
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        map.put("receiveTime", format.format(new Date()));
        CampusNodes campusNodes = campusNodesDao.selectByNode(map.get("node").toString());
        if (campusNodes != null && !campusNodes.getNumber().equals("")){
            campusCO2Dao.insertData(map);
            return "successful";
        }
        return "error node message!";
    }

    public void deleteByNode(String node){
        campusCO2Dao.deleteByNode(node);
    }


}
