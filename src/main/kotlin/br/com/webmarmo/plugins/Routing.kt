package br.com.webmarmo.plugins

import br.com.webmarmo.routes.root
import io.ktor.application.*
import io.ktor.routing.*

fun Application.configureRouting() {

    routing {
        root()
    }
}
