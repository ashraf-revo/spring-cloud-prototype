package org.revo

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.cloud.config.server.EnableConfigServer

@SpringBootApplication
@EnableConfigServer
class RevoConfigServerApplication {

    static void main(String[] args) {
        SpringApplication.run RevoConfigServerApplication, args
    }
}
