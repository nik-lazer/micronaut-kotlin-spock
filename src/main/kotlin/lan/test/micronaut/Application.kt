package lan.test.micronaut

import io.micronaut.runtime.Micronaut

object Application {

    @JvmStatic
    fun main(args: Array<String>) {
        Micronaut.build()
                .packages("lan.test.micronaut")
                .mainClass(Application.javaClass)
                .start()
    }
}