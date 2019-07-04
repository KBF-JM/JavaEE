package org.kbf.jmshome;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("org.kbf.jmshome.dao")
public class JmshomeApplication {

    public static void main(String[] args) {
        SpringApplication.run(JmshomeApplication.class, args);
    }

}
