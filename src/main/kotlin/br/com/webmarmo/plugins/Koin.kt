package br.com.webmarmo.plugins

import br.com.webmarmo.di.KoinModule
import io.ktor.application.*
import org.koin.core.logger.Level
import org.koin.ktor.ext.Koin
import org.koin.logger.slf4jLogger

fun Application.configureKoin() {
    install(Koin) {
        slf4jLogger(level = Level.ERROR)
        modules(
            //specify your modules
            KoinModule
        )
    }
}