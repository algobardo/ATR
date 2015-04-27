package dk.au.cs.thor.rti.rtinterface;

import java.util.List;

public interface SchedulerTestInterface {
    public void start();

    public void loadNeutralComponents(String[] neutralComponentNames);

    public void executeNeutralComponents(String[] neutralComponentNames);
}
