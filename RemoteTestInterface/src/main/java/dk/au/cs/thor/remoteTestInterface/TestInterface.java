package dk.au.cs.thor.remoteTestInterface;

import com.robotium.solo.Solo;

import java.util.Map;

public interface TestInterface {

    public void endTest();
    public String[] getRstringsNames();
    public String getRstring(String name);

    public String[] getRIntNames();
    public int getRInt(String name);
}
