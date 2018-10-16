package com.adeveloperdiary.springbootibm;

import com.adeveloperdiary.springbootibm.model.Student;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

import java.util.HashMap;

@SpringBootApplication
public class SpringbootibmApplication extends SpringBootServletInitializer {

    @Override
    protected SpringApplicationBuilder configure( SpringApplicationBuilder springApplicationBuilder) {
        return springApplicationBuilder.sources( SpringbootibmApplication.class );
    }

    public static void main( String[] args ) {
        SpringApplication.run( SpringbootibmApplication.class, args );
    }
}
