package com.ncepu.campus_environment.controller;

import com.ncepu.campus_environment.entity.CampusAirTH;
import com.ncepu.campus_environment.service.CampusAirTHService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class CampusAirTHController {
    @Autowired
    private CampusAirTHService campusAirTHService;

    /* Test:
    *  http://localhost/campusAirTH/insertData?node=10001&airTem=50&airHum=50*/
    @GetMapping("/campusAirTH/insertData")
    public String insertData(String node, String airTem, String airHum){
        Map<String, Object> map = new HashMap<>();
        map.put("node", node);
        map.put("airTem", airTem);
        map.put("airHum", airHum);
        return campusAirTHService.insertData(map);
    }

    @GetMapping("/campusAirTH/selectById")
    public CampusAirTH selectById(int id){
        return campusAirTHService.selectById(id);
    }

    @GetMapping("/campusAirTH/selectByNode")
    public List<CampusAirTH> selectByNode(@RequestParam(name = "node") String node,
                                          @RequestParam(name = "limit", required = false) Integer limit){
        return campusAirTHService.selectByNode(node, limit == null ? 5 : limit);
    }

    @GetMapping("/campusAirTH/deleteByNode")
    public void deleteByNode(String node){
        campusAirTHService.deleteByNode(node);
    }
}
