package org.suggs.`gradle-sandbox`.buildvars

import org.slf4j.Logger
import org.slf4j.LoggerFactory

class HelloWorld {

    companion object {
        val log: Logger = LoggerFactory.getLogger(this::class.java)
    }

    fun sayHello(){
        log.info("hello world")
    }
}