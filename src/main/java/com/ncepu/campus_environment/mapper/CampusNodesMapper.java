package com.ncepu.campus_environment.mapper;

import com.ncepu.campus_environment.entity.CampusNodes;
import org.apache.ibatis.annotations.Mapper;

import java.util.Map;

@Mapper
public interface CampusNodesMapper<K, V> {
    CampusNodes selectById(int id);
    CampusNodes selectByNode(String number);
    void updateNode(Map<K, V> map);
    void deleteNode(String number);
}
