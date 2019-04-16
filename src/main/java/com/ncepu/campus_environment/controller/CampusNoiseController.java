package com.ncepu.campus_environment.controller;

import com.ncepu.campus_environment.entity.CampusIntensity;
import com.ncepu.campus_environment.entity.CampusNoise;
import com.ncepu.campus_environment.service.CampusIntensityService;
import com.ncepu.campus_environment.service.CampusNoiseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class CampusNoiseController {
    @Autowired
    private CampusNoiseService campusNoiseService;


    @GetMapping("/campusNoise/insertData")
    public String insertData(String node, String noise){
        Map<String, Object> map = new HashMap<>();
        map.put("node", node);
        map.put("noise", noise);
        return campusNoiseService.insertData(map);
    }

    @GetMapping("/campusNoise/selectById")
    public CampusNoise selectById(int id){
        return campusNoiseService.selectById(id);
    }

    @GetMapping("/campusNoise/selectByNode")
    public List<CampusNoise> selectByNode(@RequestParam(name = "node") String node,
                                          @RequestParam(name = "limit", required = false) Integer limit){
        return campusNoiseService.selectByNode(node, limit == null ? 5 : limit);
    }

    @GetMapping("/campusNoise/deleteByNode")
    public void deleteByNode(String node){
        campusNoiseService.deleteByNode(node);
    }

}
