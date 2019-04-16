package com.ncepu.campus_environment.mapper;

import com.ncepu.campus_environment.entity.CampusWind;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

@Mapper
public interface CampusWindMapper {
    CampusWind selectById(int id);
    List<CampusWind> selectByNode(String node, int limit);
    void insertData(Map<String, Object> map);
    void deleteByNode(String node);
}
