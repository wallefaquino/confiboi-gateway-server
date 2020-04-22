package com.walleftech.confiboigatewayserver

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.cloud.netflix.eureka.EnableEurekaClient
import org.springframework.cloud.netflix.zuul.EnableZuulProxy

@EnableZuulProxy
@EnableEurekaClient
@SpringBootApplication
class ConfiboiGatewayServerApplication

fun main(args: Array<String>) {
	runApplication<ConfiboiGatewayServerApplication>(*args)
}
