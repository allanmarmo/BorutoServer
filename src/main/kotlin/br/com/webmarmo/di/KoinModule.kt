package br.com.webmarmo.di

import br.com.webmarmo.repository.HeroRepository
import br.com.webmarmo.repository.HeroRepositoryImpl
import org.koin.dsl.module

val KoinModule = module {
    single<HeroRepository> {
        HeroRepositoryImpl()
    }
}