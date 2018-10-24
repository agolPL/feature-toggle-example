package pl.agol.example.basefeature.domain;

import lombok.RequiredArgsConstructor;
import org.togglz.core.manager.FeatureManager;
import pl.agol.example.setup.Features;

@RequiredArgsConstructor
public class BaseFeatureService {

    private final FeatureManager featureManager;

    public String doSomething() {
        if (featureManager.isActive(Features.EXTEND_FEATURE)) {
            return "something cool and something extra";
        }
        return "something cool";
    }
}
