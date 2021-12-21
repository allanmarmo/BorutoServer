package br.com.webmarmo.plugins

import br.com.webmarmo.routes.getAllHeroes
import br.com.webmarmo.routes.root
import br.com.webmarmo.routes.searchHeroes
import io.ktor.application.*
import io.ktor.http.content.*
import io.ktor.routing.*

fun Application.configureRouting() {

    routing {
        root()
        getAllHeroes()
        searchHeroes()

        static("/images") {
            resources("images")
        }
    }
}
