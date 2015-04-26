package dk.au.cs.thor.rti.rtinterface;

public interface SchedulerInterface {
    public void ready();

    public void atInjectionSite(String viewAction);
}
