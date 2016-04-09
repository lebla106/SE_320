package com.chapman.operationsaferide;
import android.os.Bundle;
import android.telephony.SmsManager;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.EditText;
import android.app.Activity;
import android.app.AlertDialog;

/**
 * Created by klamkin on 4/4/16.
 */
public class EmergencyPanic implements EmergencySystem{

    private String userNumber;
    private String message;

    public EmergencyPanic(String num)
    {
        userNumber= "7608280121";  //this must be changed to public safety, but for now it is Madison's number for testing purposes.
        userNumber = num;
    }

    public void emergencyNotification(String newMessage)
    {
        message = "Emergency button activated. Send Public Safety officer to:"; //this part needs added location of the user when button pushed.
        message = newMessage;
    }

    public boolean sendEmergency()
    {
        try
        {
            SmsManager.getDefault().sendTextMessage(userNumber, null, message, null, null);
        }
        catch (Exception e)
        {
            Log.e("EmergencyPanic", e.getMessage(), e);
            return false;
        }
        return true;
    }

    public String getMessage()
    {
        return message;
    }

}
