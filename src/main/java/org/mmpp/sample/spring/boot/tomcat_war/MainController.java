package org.mmpp.sample.spring.boot.tomcat_war;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@EnableAutoConfiguration
@RestController
public class MainController {

    @RequestMapping("/")
    public String index() {
        return "Sample : Spring boot  tomcat -war- ";
    }


}
