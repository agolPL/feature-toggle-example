package pl.agol.example.setup;

import org.togglz.core.Feature;
import org.togglz.core.context.FeatureContext;


public enum Features implements Feature {

    NEW_FEATURE, EXTEND_FEATURE;

    public boolean isActive() {
        return FeatureContext.getFeatureManager().isActive(this);
    }
}
