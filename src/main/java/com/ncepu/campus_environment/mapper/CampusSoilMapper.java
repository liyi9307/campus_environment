package com.ncepu.campus_environment.mapper;

import com.ncepu.campus_environment.entity.CampusSoil;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

@Mapper
public interface CampusSoilMapper {
    CampusSoil selectById(int id);
    List<CampusSoil> selectByNode(@Param("node")String node, @Param("limit")int limit);
    void insertData(Map<String, Object> map);
    void deleteByNode(String node);
}
