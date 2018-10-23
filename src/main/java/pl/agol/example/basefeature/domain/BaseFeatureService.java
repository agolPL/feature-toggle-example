package pl.agol.example.basefeature.domain;

import lombok.RequiredArgsConstructor;
import pl.agol.example.setup.Features;

@RequiredArgsConstructor
public class BaseFeatureService {

    private final Features features;

    public String doSomething() {
        if (features.isExtendFeature()) {
            return "something cool and something extra";
        }
        return "something cool";
    }
}
