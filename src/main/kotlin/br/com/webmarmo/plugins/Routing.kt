package br.com.webmarmo.plugins

import br.com.webmarmo.routes.getAllHeroesAlternative
import br.com.webmarmo.routes.root
import br.com.webmarmo.routes.searchHeroes
import io.ktor.application.*
import io.ktor.http.content.*
import io.ktor.routing.*

fun Application.configureRouting() {

    routing {
        root()
        // getAllHeroes()
        getAllHeroesAlternative()
        searchHeroes()

        static("/images") {
            resources("images")
        }
    }
}
