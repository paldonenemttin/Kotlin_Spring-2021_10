package com.callor.sprint

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class KSpringApplication

/**
 * Spring bott project를 시작하는 함수
 */
fun main(args: Array<String>) {
	runApplication<KSpringApplication>(*args)
}
