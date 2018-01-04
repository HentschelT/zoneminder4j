package name.eskildsen.zoneminder;

import java.io.IOException;
import java.util.ArrayList;

import javax.security.auth.login.FailedLoginException;

import name.eskildsen.zoneminder.api.config.ZoneMinderConfig;
import name.eskildsen.zoneminder.api.config.ZoneMinderConfigEnum;
import name.eskildsen.zoneminder.exception.ZoneMinderUrlNotFoundException;

public interface IZoneMinderServer extends IZoneMinderResponse {

    /*
     * ******************************************************
     * 
     * Status calls
     * 
     */
    boolean isConnected();

    boolean isApiEnabled();

    boolean isTriggerOptionEnabled();

    /*
     * ******************************************************
     * 
     * Host API
     * 
     */
    IZoneMinderHostVersion getHostVersion() throws FailedLoginException, ZoneMinderUrlNotFoundException, IOException;

    IZoneMinderHostLoad getHostCpuLoad() throws FailedLoginException, ZoneMinderUrlNotFoundException, IOException;

    IZoneMinderDaemonStatus getHostDaemonCheckState();

    IZoneMinderDiskUsage getHostDiskUsage() throws FailedLoginException, ZoneMinderUrlNotFoundException, IOException;

    /**
     * *****************************************************
     * 
     * Monitor API
     * 
     */

    ArrayList<IZoneMinderMonitorData> getMonitors();

    /**
     * *****************************************************
     * 
     * Config API
     * 
     */
    ZoneMinderConfig getConfig(ZoneMinderConfigEnum configId);

    boolean setConfig(ZoneMinderConfigEnum configId, Boolean newValue);

    boolean setConfig(ZoneMinderConfigEnum configId, String value);
}
