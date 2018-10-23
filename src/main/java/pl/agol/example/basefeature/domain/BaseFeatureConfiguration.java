package pl.agol.example.basefeature.domain;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import pl.agol.example.setup.Features;

@Configuration
class BaseFeatureConfiguration {

    @Bean
    BaseFeatureService baseFeatureService(Features features) {
        return new BaseFeatureService(features);
    }
}
