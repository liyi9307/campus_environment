package com.ncepu.campus_environment.dao;

import com.ncepu.campus_environment.entity.CampusSoil;
import com.ncepu.campus_environment.mapper.CampusSoilMapper;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

@Repository
public class CampusSoilDao {
    @Resource
    private CampusSoilMapper campusSoilMapper;

    public CampusSoil selectById(int id){
        return campusSoilMapper.selectById(id);
    }
    public List<CampusSoil> selectByNode(String node, int limit){
        return campusSoilMapper.selectByNode(node, limit);
    }
    public void insertData(Map<String, Object> map){
        campusSoilMapper.insertData(map);
    }
    public void deleteByNode(String node){
        campusSoilMapper.deleteByNode(node);
    }
}
