package org.suggs.gradlesandbox.metadatalogger

import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Test

@DisplayName("With an hello world we can ...")
class HelloWorldTest {

    @Test
    fun `say hello to the whole world`(){
       HelloWorld().sayHello()
    }
}