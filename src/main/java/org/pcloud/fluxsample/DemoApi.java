package org.pcloud.fluxsample;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
public class DemoApi {
    @GetMapping("/hello")
    public Mono<String> hello() {
        throw new DemoException();
//        return Mono.just("hello");
    }
}
