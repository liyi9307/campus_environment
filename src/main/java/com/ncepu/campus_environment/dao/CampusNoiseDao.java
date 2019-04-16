package com.ncepu.campus_environment.dao;

import com.ncepu.campus_environment.entity.CampusNoise;
import com.ncepu.campus_environment.mapper.CampusNoiseMapper;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

@Repository
public class CampusNoiseDao {

    @Resource
    private CampusNoiseMapper campusNoiseMapper;

    public CampusNoise selectById(int id){
        return campusNoiseMapper.selectById(id);
    }

    public List<CampusNoise> selectByNode(String node, int limit){
        return campusNoiseMapper.selectByNode(node, limit);
    }
    public void insertData(Map<String, Object> map){
        campusNoiseMapper.insertData(map);
    }
    public void deleteByNode(String node){
        campusNoiseMapper.deleteByNode(node);
    }

}
