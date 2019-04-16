package com.ncepu.campus_environment.service;

import com.ncepu.campus_environment.dao.CampusNodesDao;
import com.ncepu.campus_environment.dao.CampusWindDao;
import com.ncepu.campus_environment.entity.CampusNodes;
import com.ncepu.campus_environment.entity.CampusWind;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Map;

@Service
public class CampusWindService {
    @Autowired
    private CampusWindDao campusWindDao;
    @Autowired
    private CampusNodesDao campusNodesDao;
    public CampusWind selectById(int id){
        return campusWindDao.selectById(id);
    }

    public List<CampusWind> selectByNode(String node, int limit){
        return campusWindDao.selectByNode(node, limit);
    }

    public String insertData(Map<String, Object> map){
        if (map.get("node") == null || map.get("node").equals("") ||
                map.get("windSpeed") == null || map.get("windSpeed").equals("") ||
                map.get("windDirection") == null || map.get("windDirection").equals("")){
            return "Data of node(number), windSpeed, windDirection are needed.";
        }
        /* 插入数据校验的程序，参考CampusAirTHService*/



        /* 结束*/
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        map.put("receiveTime", format.format(new Date()));
        CampusNodes campusNodes = campusNodesDao.selectByNode(map.get("node").toString());
        if (campusNodes != null && !campusNodes.getNumber().equals("")){
            campusWindDao.insertData(map);
            return "successful";
        }
        return "error node message!";

    }
    public void deleteByNode(String node){
        campusWindDao.deleteByNode(node);
    }

}
