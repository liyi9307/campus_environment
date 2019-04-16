package com.ncepu.campus_environment.dao;

import com.ncepu.campus_environment.entity.CampusIntensity;
import com.ncepu.campus_environment.mapper.CampusIntensityMapper;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

@Repository
public class CampusIntensityDao {

    @Resource
    private CampusIntensityMapper campusIntensityMapper;

    public CampusIntensity selectById(int id){
        return campusIntensityMapper.selectById(id);
    }
    public List<CampusIntensity> selectByNode(String node, int limit){
        return campusIntensityMapper.selectByNode(node, limit);
    }
    public void insertData(Map<String, Object> map){
        campusIntensityMapper.insertData(map);
    }
    public void deleteByNode(String node){
        campusIntensityMapper.deleteByNode(node);
    }

}
