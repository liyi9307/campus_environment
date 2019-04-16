package com.ncepu.campus_environment.dao;

import com.ncepu.campus_environment.entity.CampusWind;
import com.ncepu.campus_environment.mapper.CampusWindMapper;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

@Repository
public class CampusWindDao {
    @Resource
    private CampusWindMapper campusWindMapper;

    public CampusWind selectById(int id){
        return campusWindMapper.selectById(id);
    }
    public List<CampusWind> selectByNode(String node, int limit){
        return campusWindMapper.selectByNode(node, limit);
    }
    public void insertData(Map<String, Object> map){
        campusWindMapper.insertData(map);
    }
    public void deleteByNode(String node){
        campusWindMapper.deleteByNode(node);
    }
}
