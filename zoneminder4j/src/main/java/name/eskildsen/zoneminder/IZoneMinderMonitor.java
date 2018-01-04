package name.eskildsen.zoneminder;

import java.io.IOException;

import javax.security.auth.login.FailedLoginException;

import name.eskildsen.zoneminder.common.ZoneMinderMonitorFunctionEnum;
import name.eskildsen.zoneminder.common.ZoneMinderMonitorStatusEnum;
import name.eskildsen.zoneminder.exception.ZoneMinderUrlNotFoundException;

public interface IZoneMinderMonitor extends IZoneMinderResponse {

    /**
     * *****************************************************
     * Status methods
     */
    boolean isConnected();

    IZoneMinderMonitorData getMonitorData();

    ZoneMinderMonitorStatusEnum getMonitorDetailedStatus();

    IZoneMinderDaemonStatus getCaptureDaemonStatus();

    IZoneMinderDaemonStatus getAnalysisDaemonStatus();

    IZoneMinderDaemonStatus getFrameDaemonStatus();

    /**
     * *****************************************************
     * Event API
     */
    IZoneMinderEventData getLastEvent();

    IZoneMinderEventData getEventById(String eventId);

    /**
     * *****************************************************
     * Event Methods
     *
     * @throws IOException
     * @throws ZoneMinderUrlNotFoundException
     * @throws FailedLoginException
     */
    void activateForceAlarm(Integer priority, String reason, String note, String showText, Integer timeoutSeconds)
            throws IOException, FailedLoginException, ZoneMinderUrlNotFoundException;

    void deactivateForceAlarm() throws Exception;

    void SetEnabled(boolean enabled);

    /**
     * *****************************************************
     * Set Methods
     */
    void SetFunction(String function);

    void SetFunction(ZoneMinderMonitorFunctionEnum function);

}
