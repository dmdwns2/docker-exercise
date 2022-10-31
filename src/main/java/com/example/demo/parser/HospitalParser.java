package com.example.demo.parser;

import com.example.demo.domain.Hospital;

import java.time.LocalDateTime;

public class HospitalParser implements Parser<Hospital>{

    @Override
    public Hospital parse(String str){
        String[] row = str.split("\",\"");
        Hospital hospital = new Hospital();


        //substring 사용
        int year = Integer.parseInt(row[5].substring(0,4));
        int month = Integer.parseInt(row[5].substring(4,6));
        int day = Integer.parseInt(row[5].substring(6,8));

        hospital.setLicenseDate(LocalDateTime.of(year,month,day,0,0,0));

        hospital.setId(Integer.parseInt(row[0]));
        hospital.setOpenServiceName(row[1]);
        hospital.setOpenLocalGovernmentCode(Integer.parseInt(row[3]));
        hospital.setManagementNumber(row[4]);

        hospital.setLicenseDate(LocalDateTime.parse(row[5]));
        hospital.setBusinessStatus(Integer.parseInt(row[7]));
        hospital.setBusinessStatusCode(Integer.parseInt(row[9]));
        hospital.setPhone(row[15]);
        hospital.setFullAddress(row[18]);
        hospital.setRoadNameAddress(row[19]);
        hospital.setHospitalName(row[21]);
        hospital.setBusinessTypeName(row[25]);
        hospital.setHealthcareProviderCount(Integer.parseInt(row[29]));
        hospital.setPatientRoomCount(Integer.parseInt(row[30]));
        hospital.setTotalNumberOfBeds(Integer.parseInt(row[31]));
        hospital.setTotalAreaSize(Float.parseFloat(row[32]));


        return hospital;
    }
}
