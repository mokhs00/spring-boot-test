package com.example.demo;


import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;


@SpringBootTest
public class AutoConfigurationApplicationTests {

    @Value("${property.test.name}")
    private String propertyTestName;

    @Value("${propertyTest}")
    private String propertyTest;


    @Value("${propertyTestList}")
    private String[] propertyTestArray;

    @Value("${nokey:default value}")
    private String defaultValue;

    @Value("#{'${propertyTestList}'.split(',')}")
    private List<String> propertyTestList;




    // 책 내용은 Junit 4 기준 -> Junit 5 버전으로 해보기
    @Test
    public void testValue(){
//        assertThat(propertyTestName, is("property depth test"));

        System.out.println("propertyTestName = " + propertyTestName);
        System.out.println("propertyTest = " + propertyTest);
        System.out.println("propertyTestArray = " + propertyTestArray);
        System.out.println("propertyTestList = " + propertyTestList);
        System.out.println("defaultValue = " + defaultValue);
                
    }


}
