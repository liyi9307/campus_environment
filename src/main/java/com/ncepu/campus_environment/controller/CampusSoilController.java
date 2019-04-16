package com.ncepu.campus_environment.controller;

import com.ncepu.campus_environment.entity.CampusPressure;
import com.ncepu.campus_environment.entity.CampusSoil;
import com.ncepu.campus_environment.service.CampusPressureService;
import com.ncepu.campus_environment.service.CampusSoilService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class CampusSoilController {
    @Autowired
    private CampusSoilService campusSoilService;


    @GetMapping("/campusSoil/insertData")
    public String insertData(String node, String soilHum, String soilTem, String soilPH){
        Map<String, Object> map = new HashMap<>();
        map.put("node", node);
        map.put("soilHum", soilHum);
        map.put("soilTem", soilTem);
        map.put("soilPH", soilPH);
        return campusSoilService.insertData(map);
    }

    @GetMapping("/campusSoil/selectById")
    public CampusSoil selectById(int id){
        return campusSoilService.selectById(id);
    }

    @GetMapping("/campusSoil/selectByNode")
    public List<CampusSoil> selectByNode(@RequestParam(name = "node") String node,
                                          @RequestParam(name = "limit", required = false) Integer limit){
        return campusSoilService.selectByNode(node, limit == null ? 5 : limit);
    }

    @GetMapping("/campusSoil/deleteByNode")
    public void deleteByNode(String node){
        campusSoilService.deleteByNode(node);
    }

}
