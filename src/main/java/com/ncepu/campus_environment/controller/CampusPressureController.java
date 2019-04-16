package com.ncepu.campus_environment.controller;

import com.ncepu.campus_environment.entity.CampusPM;
import com.ncepu.campus_environment.entity.CampusPressure;
import com.ncepu.campus_environment.service.CampusPMService;
import com.ncepu.campus_environment.service.CampusPressureService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class CampusPressureController {
    @Autowired
    private CampusPressureService campusPressureService;


    @GetMapping("/campusPressure/insertData")
    public String insertData(String node, String pressure){
        Map<String, Object> map = new HashMap<>();
        map.put("node", node);
        map.put("pressure", pressure);
        return campusPressureService.insertData(map);
    }

    @GetMapping("/campusPressure/selectById")
    public CampusPressure selectById(int id){
        return campusPressureService.selectById(id);
    }

    @GetMapping("/campusPressure/selectByNode")
    public List<CampusPressure> selectByNode(@RequestParam(name = "node") String node,
                                          @RequestParam(name = "limit", required = false) Integer limit){
        return campusPressureService.selectByNode(node, limit == null ? 5 : limit);
    }

    @GetMapping("/campusPressure/deleteByNode")
    public void deleteByNode(String node){
        campusPressureService.deleteByNode(node);
    }

}
