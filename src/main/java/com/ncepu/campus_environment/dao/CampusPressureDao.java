package com.ncepu.campus_environment.dao;

import com.ncepu.campus_environment.entity.CampusPressure;
import com.ncepu.campus_environment.mapper.CampusPressureMapper;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

@Repository
public class CampusPressureDao {

    @Resource
    private CampusPressureMapper campusPressureMapper;

    public CampusPressure selectById(int id){
        return campusPressureMapper.selectById(id);
    }
    public List<CampusPressure> selectByNode(String node, int limit){
        return campusPressureMapper.selectByNode(node,limit);
    }
    public void insertData(Map<String, Object> map){
        campusPressureMapper.insertData(map);
    }
    public void deleteByNode(String node){
        campusPressureMapper.deleteByNode(node);
    }
}

