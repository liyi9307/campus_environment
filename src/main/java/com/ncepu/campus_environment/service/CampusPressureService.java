package com.ncepu.campus_environment.service;

import com.ncepu.campus_environment.dao.CampusNodesDao;
import com.ncepu.campus_environment.dao.CampusPressureDao;
import com.ncepu.campus_environment.entity.CampusNodes;
import com.ncepu.campus_environment.entity.CampusPressure;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Map;

@Service
public class CampusPressureService {
    @Autowired
    private CampusPressureDao campusPressureDao;
    @Autowired
    private CampusNodesDao campusNodesDao;
    public CampusPressure selectById(int id){
        return campusPressureDao.selectById(id);
    }

    public List<CampusPressure> selectByNode(String node, int limit){
        return campusPressureDao.selectByNode(node, limit);
    }

    public String insertData(Map<String, Object> map){
        if (map.get("node") == null || map.get("node").equals("") ||
                map.get("pressure") == null || map.get("pressure").equals("")){
            return "Data of node(number), pressure are needed.";
        }
        /* 插入数据校验的程序，参考CampusAirTHService*/



        /* 结束*/
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        map.put("receiveTime", format.format(new Date()));
        CampusNodes campusNodes = campusNodesDao.selectByNode(map.get("node").toString());
        if (campusNodes != null && !campusNodes.getNumber().equals("")){
            campusPressureDao.insertData(map);
            return "successful";
        }
        return "error node message!";

    }

    public void deleteByNode(String node){
        campusPressureDao.deleteByNode(node);
    }

}
