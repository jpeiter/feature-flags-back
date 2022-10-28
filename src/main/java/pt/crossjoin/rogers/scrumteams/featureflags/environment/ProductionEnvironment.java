package pt.crossjoin.rogers.scrumteams.featureflags.environment;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Profile("prod")
@Component
public class ProductionEnvironment implements AppEnvironment {

    public static final String NAME = "Production Environment";

    @Override
    public String getName() {
        return NAME;
    }

    @Override
    public Boolean isBetaProgramActive() {
        return Boolean.FALSE;
    }
}
