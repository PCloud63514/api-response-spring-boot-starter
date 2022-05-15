package org.pcloud.fluxsample;

import com.zkdlu.apiresponsespringbootstarter.autoconfig.EnableResponse;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@EnableResponse
@SpringBootApplication
public class FluxSampleApplication {

    public static void main(String[] args) {
        SpringApplication.run(FluxSampleApplication.class, args);
    }

}
