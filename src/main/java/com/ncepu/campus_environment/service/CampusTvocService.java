package com.ncepu.campus_environment.service;

import com.ncepu.campus_environment.dao.CampusNodesDao;
import com.ncepu.campus_environment.dao.CampusTvocDao;
import com.ncepu.campus_environment.entity.CampusNodes;
import com.ncepu.campus_environment.entity.CampusTvoc;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Map;

@Service
public class CampusTvocService {
    @Autowired
    private CampusTvocDao campusTvocDao;
    @Autowired
    private CampusNodesDao campusNodesDao;
    public CampusTvoc selectById(int id){
        return campusTvocDao.selectById(id);
    }

    public List<CampusTvoc> selectByNode(String node, int limit){
        return campusTvocDao.selectByNode(node, limit);
    }

    public String insertData(Map<String, Object> map){
        if (map.get("node") == null || map.get("node").equals("") ||
                map.get("tvoc") == null || map.get("tvoc").equals("")){
            return "Data of node(number), tvoc are needed.";
        }
        /* 插入数据校验的程序，参考CampusAirTHService*/



        /* 结束*/
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        map.put("receiveTime", format.format(new Date()));
        CampusNodes campusNodes = campusNodesDao.selectByNode(map.get("node").toString());
        if (campusNodes != null && !campusNodes.getNumber().equals("")){
            campusTvocDao.insertData(map);
            return "successful";
        }
        return "error node message!";

    }

    public void deleteByNode(String node){
        campusTvocDao.deleteByNode(node);
    }


}
