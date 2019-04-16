package com.ncepu.campus_environment.controller;

import com.ncepu.campus_environment.entity.CampusIntensity;
import com.ncepu.campus_environment.service.CampusIntensityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class CampusIntensityController {
    @Autowired
    private CampusIntensityService campusIntensityService;


    @GetMapping("/campusIntensity/insertData")
    public String insertData(String node, String intensity){
        Map<String, Object> map = new HashMap<>();
        map.put("node", node);
        map.put("intensity", intensity);
        return campusIntensityService.insertData(map);
    }

    @GetMapping("/campusIntensity/selectById")
    public CampusIntensity selectById(int id){
        return campusIntensityService.selectById(id);
    }

    @GetMapping("/campusIntensity/selectByNode")
    public List<CampusIntensity> selectByNode(@RequestParam(name = "node") String node,
                                          @RequestParam(name = "limit", required = false) Integer limit){
        return campusIntensityService.selectByNode(node, limit == null ? 5 : limit);
    }

    @GetMapping("/campusIntensity/deleteByNode")
    public void deleteByNode(String node){
        campusIntensityService.deleteByNode(node);
    }

}
