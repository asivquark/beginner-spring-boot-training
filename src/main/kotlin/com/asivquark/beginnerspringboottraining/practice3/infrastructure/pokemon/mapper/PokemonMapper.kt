package com.asivquark.beginnerspringboottraining.practice3.infrastructure.pokemon.mapper

import com.asivquark.beginnerspringboottraining.practice3.domain.pokemon.model.Pokemon
import com.asivquark.beginnerspringboottraining.practice3.infrastructure.pokemon.controller.PokemonDto

class PokemonMapper {
    
    fun map(pokemonDto: PokemonDto) = with(pokemonDto) {
        Pokemon(name, attack, defense, speed)
    }
    
    fun map(pokemon: Pokemon) = with(pokemon) {
        PokemonDto(name, attack, defense, speed)
    }
}