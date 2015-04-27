package dk.au.cs.thor.rti.rtinterface;

import java.util.List;

public interface SchedulerInterface {
    public void ready();

    public void atInjectionSite(String viewAction, String[] activeNeutralComponentNames);
}
