package com.ncepu.campus_environment.controller;

import com.ncepu.campus_environment.entity.CampusTvoc;
import com.ncepu.campus_environment.entity.CampusWind;
import com.ncepu.campus_environment.service.CampusTvocService;
import com.ncepu.campus_environment.service.CampusWindService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class CampusWindController {
    @Autowired
    private CampusWindService campusWindService;


    @GetMapping("/campusWind/insertData")
    public String insertData(String node, String windSpeed, String windDirection){
        Map<String, Object> map = new HashMap<>();
        map.put("node", node);
        map.put("windSpeed", windSpeed);
        map.put("windDirection", windDirection);
        return campusWindService.insertData(map);
    }

    @GetMapping("/campusWind/selectById")
    public CampusWind selectById(int id){
        return campusWindService.selectById(id);
    }

    @GetMapping("/campusWind/selectByNode")
    public List<CampusWind> selectByNode(@RequestParam(name = "node") String node,
                                          @RequestParam(name = "limit", required = false) Integer limit){
        return campusWindService.selectByNode(node, limit == null ? 5 : limit);
    }

    @GetMapping("/campusWind/deleteByNode")
    public void deleteByNode(String node){
        campusWindService.deleteByNode(node);
    }

}
