package com.chapman.operationsaferide;

/**
 * Created by klamkin on 4/4/16.
 */
public interface NotificationSystem {

    public void addNotification(String newMessage);

    public boolean sendNotification();

    public void editNotification(String edittedMessage);
}
