package com.ncepu.campus_environment.dao;

import com.ncepu.campus_environment.entity.CampusTvoc;
import com.ncepu.campus_environment.mapper.CampusTvocMapper;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

@Repository
public class CampusTvocDao {
    @Resource
    private CampusTvocMapper campusTvocMapper;

    public CampusTvoc selectById(int id){
        return campusTvocMapper.selectById(id);
    }
    public List<CampusTvoc> selectByNode(String node, int limit){
        return campusTvocMapper.selectByNode(node, limit);
    }
    public void insertData(Map<String, Object> map){
        campusTvocMapper.insertData(map);
    }
    public void deleteByNode(String node){
        campusTvocMapper.deleteByNode(node);
    }
}
