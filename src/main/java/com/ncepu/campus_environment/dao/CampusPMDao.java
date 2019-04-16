package com.ncepu.campus_environment.dao;

import com.ncepu.campus_environment.entity.CampusPM;
import com.ncepu.campus_environment.mapper.CampusPMMapper;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

@Repository
public class CampusPMDao {
    @Resource
    private CampusPMMapper campusPMMapper;

    public CampusPM selectById(int id){
        return campusPMMapper.selectById(id);
    }
    public List<CampusPM> selectByNode(String node, int limit){
        return campusPMMapper.selectByNode(node, limit);
    }
    public void insertData(Map<String, Object> map){
        campusPMMapper.insertData(map);
    }
    public void deleteByNode(String node){
        campusPMMapper.deleteByNode(node);
    }

}
