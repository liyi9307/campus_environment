package com.ncepu.campus_environment.controller;

import com.ncepu.campus_environment.entity.CampusNoise;
import com.ncepu.campus_environment.entity.CampusPM;
import com.ncepu.campus_environment.service.CampusNoiseService;
import com.ncepu.campus_environment.service.CampusPMService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class CampusPMController {
    @Autowired
    private CampusPMService campusPMService;


    @GetMapping("/campusPM/insertData")
    public String insertData(String node, String airPM1, String airPM25, String airPM10){
        Map<String, Object> map = new HashMap<>();
        map.put("node", node);
        map.put("airPM1", airPM1);
        map.put("airPM25", airPM25);
        map.put("airPM10", airPM10);
        return campusPMService.insertData(map);
    }

    @GetMapping("/campusPM/selectById")
    public CampusPM selectById(int id){
        return campusPMService.selectById(id);
    }

    @GetMapping("/campusPM/selectByNode")
    public List<CampusPM> selectByNode(@RequestParam(name = "node") String node,
                                          @RequestParam(name = "limit", required = false) Integer limit){
        return campusPMService.selectByNode(node, limit == null ? 5 : limit);
    }

    @GetMapping("/campusPM/deleteByNode")
    public void deleteByNode(String node){
        campusPMService.deleteByNode(node);
    }

}
