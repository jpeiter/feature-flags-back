package pt.crossjoin.rogers.scrumteams.featureflags.environment;

public interface AppEnvironment {

    String getName();

    default Boolean isBetaProgramActive() {
        return Boolean.FALSE;
    }

}
