package org.revo

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.cloud.client.discovery.EnableDiscoveryClient
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

import java.security.Principal

@SpringBootApplication
@EnableDiscoveryClient
class RevoAuthServiceApplication {
    static void main(String[] args) {
        SpringApplication.run RevoAuthServiceApplication, args
    }

}

@RestController
public class UserController {
    @RequestMapping("/user")
    public Principal getUser(Principal principal) {
        return principal;
    }
}
