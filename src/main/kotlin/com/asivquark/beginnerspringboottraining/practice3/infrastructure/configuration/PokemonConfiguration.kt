package com.asivquark.beginnerspringboottraining.practice3.infrastructure.configuration

import com.asivquark.beginnerspringboottraining.practice3.infrastructure.pokemon.repository.MemoryPokemonRepository
import com.asivquark.beginnerspringboottraining.practice3.infrastructure.pokemon.mapper.PokemonMapper
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

@Configuration
class PokemonConfiguration {
    
    @Bean
    fun pokemonRepository() = MemoryPokemonRepository()
    
    @Bean
    fun pokemonMapper() = PokemonMapper()
}