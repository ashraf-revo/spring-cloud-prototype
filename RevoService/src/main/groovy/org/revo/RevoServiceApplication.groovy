package org.revo

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.cloud.client.discovery.DiscoveryClient
import org.springframework.cloud.client.discovery.EnableDiscoveryClient
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableOAuth2Client
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@SpringBootApplication
@EnableDiscoveryClient
@EnableResourceServer
@EnableOAuth2Client
class RevoServiceApplication {
    static void main(String[] args) {
        SpringApplication.run RevoServiceApplication, args
    }
}

@RestController
class Main {
    @Autowired
    DiscoveryClient discoveryClient

    @RequestMapping(value = "/")
    def index() {
        discoveryClient.localServiceInstance
    }
}