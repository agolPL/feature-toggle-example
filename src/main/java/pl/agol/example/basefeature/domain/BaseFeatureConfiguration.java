package pl.agol.example.basefeature.domain;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.togglz.core.manager.FeatureManager;

@Configuration
class BaseFeatureConfiguration {

    @Bean
    BaseFeatureService baseFeatureService(FeatureManager featureManager) {
        return new BaseFeatureService(featureManager);
    }
}
