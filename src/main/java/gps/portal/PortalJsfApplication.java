package gps.portal;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableAutoConfiguration
@RestController
@ComponentScan // search the com.company package for @Component classes
public class PortalJsfApplication {

    public static void main(String[] args) {
        SpringApplication.run(PortalJsfApplication.class, args);
    }
    
    @RequestMapping("ouchn")
    public String sayHello(){
        return "hello";
    }
}
