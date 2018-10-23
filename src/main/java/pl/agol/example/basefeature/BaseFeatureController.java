package pl.agol.example.basefeature;


import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.agol.example.basefeature.domain.BaseFeatureService;


@RestController
@RequestMapping("/api/basefeature")
@RequiredArgsConstructor
class BaseFeatureController {

    private final BaseFeatureService baseFeatureService;

    @GetMapping
    String baseFeature() {
        return baseFeatureService.doSomething();
    }

}
