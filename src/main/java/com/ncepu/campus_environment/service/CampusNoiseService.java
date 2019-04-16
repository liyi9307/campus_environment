package com.ncepu.campus_environment.service;

import com.ncepu.campus_environment.dao.CampusNodesDao;
import com.ncepu.campus_environment.dao.CampusNoiseDao;
import com.ncepu.campus_environment.entity.CampusNodes;
import com.ncepu.campus_environment.entity.CampusNoise;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Map;

@Service
public class CampusNoiseService {
    @Autowired
    private CampusNoiseDao campusNoiseDao;
    @Autowired
    private CampusNodesDao campusNodesDao;
    public CampusNoise selectById(int id){
        return campusNoiseDao.selectById(id);
    }

    public List<CampusNoise> selectByNode(String node, int limit){
        return campusNoiseDao.selectByNode(node, limit);
    }

    public String insertData(Map<String, Object> map){
        if (map.get("node") == null || map.get("node").equals("") ||
                map.get("noise") == null || map.get("noise").equals("")){
            return "Data of node(number), noise are needed.";
        }
        /* 插入数据校验的程序，参考CampusAirTHService*/



        /* 结束*/
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        map.put("receiveTime", format.format(new Date()));
        CampusNodes campusNodes = campusNodesDao.selectByNode(map.get("node").toString());
        if (campusNodes != null && !campusNodes.getNumber().equals("")){
            campusNoiseDao.insertData(map);
            return "successful";
        }
        return "error node message!";

    }
    public void deleteByNode(String node){
        campusNoiseDao.deleteByNode(node);
    }

}
