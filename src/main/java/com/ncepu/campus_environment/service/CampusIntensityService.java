package com.ncepu.campus_environment.service;

import com.ncepu.campus_environment.dao.CampusIntensityDao;
import com.ncepu.campus_environment.dao.CampusNodesDao;
import com.ncepu.campus_environment.entity.CampusIntensity;
import com.ncepu.campus_environment.entity.CampusNodes;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Map;

@Service
public class CampusIntensityService {
    @Autowired
    private CampusIntensityDao campusIntensityDao;
    @Autowired
    private CampusNodesDao campusNodesDao;
    public CampusIntensity selectById(int id){
        return campusIntensityDao.selectById(id);
    }

    public List<CampusIntensity> selectByNode(String node, int limit){
        return campusIntensityDao.selectByNode(node, limit);
    }

    public String insertData(Map<String, Object> map){
        if (map.get("node") == null || map.get("node").equals("") ||
                map.get("intensity") == null || map.get("intensity").equals("")){
            return "Data of node(number), intensity are needed.";
        }
        /* 插入CO2浓度校验的程序，参考CampusAirTHService*/



        /* 结束*/
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        map.put("receiveTime", format.format(new Date()));
        CampusNodes campusNodes = campusNodesDao.selectByNode(map.get("node").toString());
        if (campusNodes != null && !campusNodes.getNumber().equals("")){
            campusIntensityDao.insertData(map);
            return "successful";
        }
        return "error node message!";

    }

    public void deleteByNode(String node){
        campusIntensityDao.deleteByNode(node);
    }


}
