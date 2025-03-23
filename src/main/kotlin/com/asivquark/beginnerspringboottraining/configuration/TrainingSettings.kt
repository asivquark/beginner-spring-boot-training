package com.asivquark.beginnerspringboottraining.configuration

import org.springframework.boot.context.properties.ConfigurationProperties
import org.springframework.boot.context.properties.ConstructorBinding

@ConstructorBinding
@ConfigurationProperties(prefix = "settings.training")
data class TrainingSettings(
    val isForBeginners: Boolean,
    val daysDuration: Int
)