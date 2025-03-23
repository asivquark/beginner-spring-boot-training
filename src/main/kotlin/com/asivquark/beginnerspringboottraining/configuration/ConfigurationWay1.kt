package com.asivquark.beginnerspringboottraining.configuration

import com.asivquark.beginnerspringboottraining.practice2.Training
import org.springframework.beans.factory.annotation.Value
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

@Configuration
class ConfigurationWay1 {
    
    @Bean
    fun springBootTrainingWay1(
        @Value("\${settings.training.isForBeginners}") isForBeginners: Boolean,
        @Value("\${settings.training.daysDuration}") daysDuration: Int
    ) = Training("Sprig Boot training", isForBeginners, daysDuration)
}