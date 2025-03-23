package com.asivquark.beginnerspringboottraining.practice3.infrastructure.pokemon.repository

import com.asivquark.beginnerspringboottraining.practice3.domain.pokemon.model.Pokemon
import com.asivquark.beginnerspringboottraining.practice3.domain.pokemon.repository.PokemonRepository
import com.asivquark.beginnerspringboottraining.practice3.infrastructure.pokemon.controller.PokemonNotFoundException

class MemoryPokemonRepository : PokemonRepository {
    
    private val pokemons: MutableMap<String, Pokemon> = mutableMapOf()
    
    override fun get(name: String) =
        pokemons[name] ?: throw PokemonNotFoundException(name)
    
    override fun create(pokemon: Pokemon): Pokemon =
        pokemon.apply { pokemons[pokemon.name] = pokemon }
    
    
    override fun update(pokemon: Pokemon): Pokemon =
        pokemon.apply { pokemons[pokemon.name] = this }
    
    override fun delete(name: String): Pokemon =
        pokemons.remove(name) ?: throw PokemonNotFoundException(name)
}