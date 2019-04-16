package com.ncepu.campus_environment.controller;

import com.ncepu.campus_environment.entity.CampusSoil;
import com.ncepu.campus_environment.entity.CampusTvoc;
import com.ncepu.campus_environment.service.CampusSoilService;
import com.ncepu.campus_environment.service.CampusTvocService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class CampusTvocController {
    @Autowired
    private CampusTvocService campusTvocService;


    @GetMapping("/campusTvoc/insertData")
    public String insertData(String node, String tvoc){
        Map<String, Object> map = new HashMap<>();
        map.put("node", node);
        map.put("tvoc", tvoc);
        return campusTvocService.insertData(map);
    }

    @GetMapping("/campusTvoc/selectById")
    public CampusTvoc selectById(int id){
        return campusTvocService.selectById(id);
    }

    @GetMapping("/campusTvoc/selectByNode")
    public List<CampusTvoc> selectByNode(@RequestParam(name = "node") String node,
                                          @RequestParam(name = "limit", required = false) Integer limit){
        return campusTvocService.selectByNode(node, limit == null ? 5 : limit);
    }

    @GetMapping("/campusTvoc/deleteByNode")
    public void deleteByNode(String node){
        campusTvocService.deleteByNode(node);
    }

}
