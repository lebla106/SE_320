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
 * Help from http://www.techrepublic.com/blog/software-engineer/how-to-send-a-text-message-from-within-your-android-app/
 */
public class TextNotification implements NotificationSystem {

    private String userNumber;
    private String message;

    public TextNotification(String num)
    {
        userNumber = num;
    }

    public void addNotification(String newMessage)
    {
        message = newMessage;
    }

    public boolean sendNotification()
    {
        try
        {
            SmsManager.getDefault().sendTextMessage(userNumber, null, message, null, null);
        }
        catch (Exception e)
        {
            Log.e("SendText", e.getMessage(), e);
            return false;
        }
        return true;
    }

    public void editNotification(String edittedMessage)
    {
        message = edittedMessage;
    }

    public String getMessage()
    {
        return message;
    }
}


//public class MainActivity extends Activity implements OnClickListener
//{
//    @Override
//    protected void onCreate(Bundle savedInstanceState)
//    {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);
//
//        findViewById(R.id.button1).setOnClickListener(this);
//    }
//    @Override
//    public void onClick(View v)
//    {
//        String phoneNumber = ((EditText) findViewById(R.id.editView1)).getText().toString();
//
//        sendNotification();
//    }
//}