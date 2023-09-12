package com.devbook.pages;

import com.devbook.utilities.ExcelUtil;

import java.util.List;
import java.util.Map;

public class TestingExcel {
    public static void main(String[] args) {
        ExcelUtil excelUtil = new ExcelUtil("src/test/resources/Batch2DevBook.xlsx","Test Data");
        List<Map<String, String>> dataList = excelUtil.getDataList();

        System.out.println("dataList = " + dataList);
        System.out.println("dataList.get(2).get(\"Name\") = " + dataList.get(2).get("Name"));
        System.out.println("dataList.get(5).get(\"Title\") = " + dataList.get(5).get("Title"));
        System.out.println("dataList.get(8).get(\"Company\") = " + dataList.get(7).get("Company"));

    }
}
