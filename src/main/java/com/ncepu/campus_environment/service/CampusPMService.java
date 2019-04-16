package com.ncepu.campus_environment.service;

import com.ncepu.campus_environment.dao.CampusNodesDao;
import com.ncepu.campus_environment.dao.CampusPMDao;
import com.ncepu.campus_environment.entity.CampusNodes;
import com.ncepu.campus_environment.entity.CampusPM;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Map;

@Service
public class CampusPMService {
    @Autowired
    private CampusPMDao campusPMDao;
    @Autowired
    private CampusNodesDao campusNodesDao;
    public CampusPM selectById(int id){
        return campusPMDao.selectById(id);
    }

    public List<CampusPM> selectByNode(String node, int limit){
        return campusPMDao.selectByNode(node, limit);
    }

    public String insertData(Map<String, Object> map){
        if (map.get("node") == null || map.get("node").equals("") ||
                map.get("airPM1") == null || map.get("airPM1").equals("") ||
                map.get("airPM25") == null || map.get("airPM25").equals("") ||
                map.get("airPM10") == null || map.get("airPM10").equals("")){
            return "Data of node(number), airPM1.0, airPM2.5, airPM10 are needed.";
        }
        /* 插入数据校验的程序，参考CampusAirTHService*/



        /* 结束*/
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        map.put("receiveTime", format.format(new Date()));
        CampusNodes campusNodes = campusNodesDao.selectByNode(map.get("node").toString());
        if (campusNodes != null && !campusNodes.getNumber().equals("")){
            campusPMDao.insertData(map);
            return "successful";
        }
        return "error node message!";

    }

    public void deleteByNode(String node){
        campusPMDao.deleteByNode(node);
    }


}
