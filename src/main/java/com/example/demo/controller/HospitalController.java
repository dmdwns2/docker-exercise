package com.example.demo.controller;

import com.example.demo.Dao.HospitalDao;
import com.example.demo.domain.Hospital;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class HospitalController {

    private final HospitalDao hospitalDao;

    public HospitalController(HospitalDao hospitalDao) {
        this.hospitalDao = hospitalDao;
    }

//     1병원 이름, 2주소, 3도로명주소, 4의료진 수, 5병상 수, 6면적

    @GetMapping("/name")
    public Hospital name() {
        return hospitalDao.findById(110000); // name부분만 어떻게 가져올지
    }

}

