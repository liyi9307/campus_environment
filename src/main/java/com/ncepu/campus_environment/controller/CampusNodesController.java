package com.ncepu.campus_environment.controller;

import com.ncepu.campus_environment.entity.CampusNodes;
import com.ncepu.campus_environment.entity.CampusWind;
import com.ncepu.campus_environment.service.CampusNodesService;
import com.ncepu.campus_environment.service.CampusWindService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class CampusNodesController {
    @Autowired
    private CampusNodesService campusNodesService;


    @GetMapping("/campusNodes/insertData")
    public String insertData(String number, String name, String location){
        Map<String, Object> map = new HashMap<>();
        map.put("number", number);
        map.put("name", name);
        map.put("location", location);
        return campusNodesService.insertData(map);
    }

    @GetMapping("/campusNodes/selectById")
    public CampusNodes selectById(int id){
        return campusNodesService.selectById(id);
    }

    @GetMapping("/campusNodes/selectByNode")
    public CampusNodes selectByNode(@RequestParam(name = "node") String node){
        return campusNodesService.selectByNode(node);
    }

    @GetMapping("/campusNodes/deleteByNode")
    public void deleteByNode(String node){
        campusNodesService.deleteNode(node);
    }

}
