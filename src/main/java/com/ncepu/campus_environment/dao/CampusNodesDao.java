package com.ncepu.campus_environment.dao;

import com.ncepu.campus_environment.entity.CampusNodes;
import com.ncepu.campus_environment.mapper.CampusNodesMapper;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;
import java.util.Map;

@Repository
public class CampusNodesDao {
    @Resource
    private CampusNodesMapper<String,String> campusNodesMapper;

    public CampusNodes selectById(int id){
        return campusNodesMapper.selectById(id);
    }
    public CampusNodes selectByNode(String number){
        return campusNodesMapper.selectByNode(number);
    }
    public void updateNode(Map map){
        campusNodesMapper.updateNode(map);
    }
    public void deleteNode(String number){
        campusNodesMapper.deleteNode(number);
    }
}
