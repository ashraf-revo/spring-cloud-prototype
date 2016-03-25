package org.revo

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.cloud.client.discovery.EnableDiscoveryClient
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard

@SpringBootApplication
@EnableHystrixDashboard
class RevoHystrixApplication {

    static void main(String[] args) {
        SpringApplication.run RevoHystrixApplication, args
    }
}
