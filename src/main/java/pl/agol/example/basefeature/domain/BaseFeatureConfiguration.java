package pl.agol.example.basefeature.domain;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
class BaseFeatureConfiguration {

    @Bean
    BaseFeatureService baseFeatureService() {
        return new BaseFeatureService();
    }
}
