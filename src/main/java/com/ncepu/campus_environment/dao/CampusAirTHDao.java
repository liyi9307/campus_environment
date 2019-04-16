package com.ncepu.campus_environment.dao;

import com.ncepu.campus_environment.entity.CampusAirTH;
import com.ncepu.campus_environment.mapper.CampusAirTHMapper;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

@Repository
public class CampusAirTHDao {
    @Resource
    private CampusAirTHMapper<String,Object> campusAirTHMapper;

    public CampusAirTH selectById(int id){
        return campusAirTHMapper.selectById(id);
    }
    public List<CampusAirTH> selectByNode(String node, int limit){
        return campusAirTHMapper.selectByNode(node, limit);
    }
    public void insertData(Map map){
        campusAirTHMapper.insertData(map);
    }
    public void deleteByNode(String node){
        campusAirTHMapper.deleteByNode(node);
    }
}
