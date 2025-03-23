package com.asivquark.beginnerspringboottraining.configuration

import com.asivquark.beginnerspringboottraining.practice2.Training
import org.springframework.beans.factory.annotation.Value
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

@Configuration
class ConfigurationWay2 {
    
    @Value("\${settings.training.isForBeginners}")
    var isForBeginners: Boolean = false
    
    @Value("\${settings.training.daysDuration}")
    var daysDuration: Int = 0
    
    @Bean
    fun springBootTrainingWay2() = Training("Sprig Boot training", isForBeginners, daysDuration)
}