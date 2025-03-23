package com.asivquark.beginnerspringboottraining.configuration

import com.asivquark.beginnerspringboottraining.practice2.Training
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

@Configuration
class ConfigurationWay3 {
    
    @Bean
    fun springBootTrainingWay3(trainingSettings: TrainingSettings) =
        Training("Sprig Boot training", trainingSettings.isForBeginners, trainingSettings.daysDuration)
    
}