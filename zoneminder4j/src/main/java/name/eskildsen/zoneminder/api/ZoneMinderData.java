package name.eskildsen.zoneminder.api;

import name.eskildsen.zoneminder.IZoneMinderResponse;

public abstract class ZoneMinderData implements IZoneMinderResponse {

    private int responseCode = 0;
    private String responseMessage = "";

    @Override
    public int getHttpResponseCode() {
        return responseCode;
    }

    public void setHttpResponseCode(int rc) {
        responseCode = rc;
    }

    @Override
    public String getHttpResponseMessage() {
        return responseMessage;
    }

    public void setHttpResponseMessage(String rm) {
        responseMessage = rm;
    }

    public String getKey() {
        return this.getClass().getSimpleName();
    }

    @Override
    public String getHttpUrl() {
        // TODO Auto-generated method stub
        return "http://";
    }

}
