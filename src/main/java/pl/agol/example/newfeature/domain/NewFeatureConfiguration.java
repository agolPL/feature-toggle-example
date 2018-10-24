package pl.agol.example.newfeature.domain;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import pl.agol.example.setup.Features;

@Configuration
@ConditionalOnProperty(name = "togglz.features.NEW_FEATURE.enabled", havingValue = "true")
class NewFeatureConfiguration {

    @Bean
    NewFeatureService newFeatureService(){
        return new NewFeatureService();
    }
}
