package br.com.webmarmo.repository

import br.com.webmarmo.models.ApiResponse
import br.com.webmarmo.models.Hero

interface HeroRepositoryAlternative {

    val heroes: List<Hero>

    suspend fun getAllHeroes(page: Int = 1, limit: Int = 4): ApiResponse
    suspend fun searchHeroes(name: String?): ApiResponse

}