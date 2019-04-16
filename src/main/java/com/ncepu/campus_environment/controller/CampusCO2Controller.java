package com.ncepu.campus_environment.controller;

import com.ncepu.campus_environment.entity.CampusCO2;
import com.ncepu.campus_environment.service.CampusCO2Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class CampusCO2Controller {
    @Autowired
    private CampusCO2Service campusCO2Service;


    @GetMapping("/campusCO2/insertData")
    public String insertData(String node, String airCO2){
        Map<String, Object> map = new HashMap<>();
        map.put("node", node);
        map.put("airCO2", airCO2);
        return campusCO2Service.insertData(map);
    }

    @GetMapping("/campusCO2/selectById")
    public CampusCO2 selectById(int id){
        return campusCO2Service.selectById(id);
    }

    @GetMapping("/campusCO2/selectByNode")
    public List<CampusCO2> selectByNode(@RequestParam(name = "node") String node,
                                          @RequestParam(name = "limit", required = false) Integer limit){
        return campusCO2Service.selectByNode(node, limit == null ? 5 : limit);
    }

    @GetMapping("/campusCO2/deleteByNode")
    public void deleteByNode(String node){
        campusCO2Service.deleteByNode(node);
    }

}
