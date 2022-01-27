package br.com.webmarmo.di

import br.com.webmarmo.repository.HeroRepository
import br.com.webmarmo.repository.HeroRepositoryAlternative
import br.com.webmarmo.repository.HeroRepositoryImpl
import br.com.webmarmo.repository.HeroRepositoryImplAlternative
import org.koin.dsl.module

val KoinModule = module {
    single<HeroRepository> {
        HeroRepositoryImpl()
    }
    single<HeroRepositoryAlternative> {
        HeroRepositoryImplAlternative()
    }
}