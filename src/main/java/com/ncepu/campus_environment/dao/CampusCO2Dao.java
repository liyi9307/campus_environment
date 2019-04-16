package com.ncepu.campus_environment.dao;

import com.ncepu.campus_environment.entity.CampusCO2;
import com.ncepu.campus_environment.mapper.CampusCO2Mapper;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

@Repository
public class CampusCO2Dao {
    @Resource
    private CampusCO2Mapper campusCO2Mapper;

    public CampusCO2 selectById(int id){
        return campusCO2Mapper.selectById(id);
    }

    public List<CampusCO2> selectByNode(String node, int limit){
        return campusCO2Mapper.selectByNode(node, limit);
    }

    public void insertData(Map<String, Object> map){
        campusCO2Mapper.insertData(map);
    }
    public void deleteByNode(String node){
        campusCO2Mapper.deleteByNode(node);
    }

}
