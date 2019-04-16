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
public class CampusNodesService {

    @Autowired
    private CampusNodesDao campusNodesDao;
    public CampusNodes selectById(int id){
        return campusNodesDao.selectById(id);
    }

    public CampusNodes selectByNode(String node){
        return campusNodesDao.selectByNode(node);
    }

    public String insertData(Map<String, Object> map){
        if (map.get("number") == null || map.get("number").equals("") ||
                map.get("name") == null || map.get("name").equals("") ||
                map.get("location") == null || map.get("location").equals("")){
            return "Data of node(number, name, location) are needed.";
        }
        /* 插入数据校验的程序，参考CampusAirTHService*/



        /* 结束*/
        campusNodesDao.updateNode(map);
        return "successful!";

    }

    public void deleteNode(String number){
        campusNodesDao.deleteNode(number);
    }

}
