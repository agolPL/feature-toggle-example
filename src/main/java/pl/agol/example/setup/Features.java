package pl.agol.example.setup;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Setter
@Getter
@Component
@ConfigurationProperties(prefix = "info.runtime.features")
public class Features {

    public static final String NEW_FEATURE = "info.runtime.features.newFeature";
    public static final String EXTEND_FEATURE = "info.runtime.features.extendFeature";

    private boolean newFeature;
    private boolean extendFeature;
}
