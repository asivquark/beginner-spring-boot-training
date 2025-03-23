package com.asivquark.beginnerspringboottraining

import com.asivquark.beginnerspringboottraining.practice2.Training
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.beans.factory.annotation.Qualifier
import org.springframework.boot.test.context.SpringBootTest

@SpringBootTest
class ApplicationTests {
    
    @Autowired
    @Qualifier("springBootTrainingWay1")
    private lateinit var trainingWay1: Training

    @Autowired
    @Qualifier("springBootTrainingWay2")
    private lateinit var trainingWay2: Training

    @Autowired
    @Qualifier("springBootTrainingWay3")
    private lateinit var trainingWay3: Training

    @Test
    fun shouldReturnTrainingsWhenApplyDifferentWaysToInstance() {
        assertThat(trainingWay1)
            .isNotNull
            .usingRecursiveComparison()
            .isEqualTo(trainingWay2)

        assertThat(trainingWay2)
            .isNotNull
            .usingRecursiveComparison()
            .isEqualTo(trainingWay3)

        assertThat(trainingWay3)
            .isNotNull
            .usingRecursiveComparison()
            .isEqualTo(trainingWay1)
    }
    
}
