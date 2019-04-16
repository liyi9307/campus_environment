package com.ncepu.campus_environment.mapper;

import com.ncepu.campus_environment.entity.CampusAirTH;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

@Mapper
public interface CampusAirTHMapper<K, V> {
    CampusAirTH selectById(int id);
    List<CampusAirTH> selectByNode(@Param("node") String node, @Param("limit") int limit);
    void insertData(Map<K, V> map);
    void deleteByNode(String node);
}
