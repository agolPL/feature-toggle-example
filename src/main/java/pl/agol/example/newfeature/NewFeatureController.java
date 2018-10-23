package pl.agol.example.newfeature;

import lombok.RequiredArgsConstructor;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.agol.example.newfeature.domain.NewFeatureService;
import pl.agol.example.setup.Features;

@RestController
@RequestMapping("/api/newfeature")
@RequiredArgsConstructor
@ConditionalOnProperty(name = Features.NEW_FEATURE, havingValue = "true")
class NewFeatureController {

    private final NewFeatureService newFeatureService;

    @GetMapping
    String baseFeature() {
        return newFeatureService.doSomethingBetter();
    }
}
