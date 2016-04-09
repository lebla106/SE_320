package com.chapman.operationsaferide;

/**
 * Created by MadisonPahl on 4/9/16.
 */
public interface EmergencySystem {

    public void emergencyNotification(String newMessage);

    public boolean sendEmergency();

    public String getMessage();
}