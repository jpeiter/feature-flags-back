package pt.crossjoin.rogers.scrumteams.featureflags.environment;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Profile("dev")
@Component
public class DevelopmentEnvironment implements AppEnvironment {

    public static final String NAME = "Development Environment";

    @Override
    public String getName() {
        return NAME;
    }

    @Override
    public Boolean isBetaProgramActive() {
        return Boolean.TRUE;
    }

}
