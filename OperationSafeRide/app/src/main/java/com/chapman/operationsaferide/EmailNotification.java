package com.chapman.operationsaferide;
import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

/**
 * Created by klamkin on 4/4/16.
 * Help from http://stackoverflow.com/questions/2020088/sending-email-in-android-using-javamail-api-without-using-the-default-built-in-a
 */
public class EmailNotification extends Activity implements NotificationSystem {

    private String userEmail;
    private String message;

    public EmailNotification(String email)
    {
        userEmail = email;
    }

    public void addNotification(String newMessage)
    {
        message = newMessage;
    }

    public void sendNotification()
    {
        try
        {
            GMailSender sender = new GMailSender("operationsaferidechap@gmail.com", "chapmanpsafe");
            sender.sendMail("Operation Safe Ride",
                    message,
                    "operationsaferidechap@gmail.com",
                    userEmail);
        }
        catch(Exception e)
        {
            Log.e("SendMail", e.getMessage(), e);
        }
    }

    public void editNotification(String edittedMessage)
    {
        message = edittedMessage;
    }

    /** Called when the activity is first created. */
//    @Override
//    public void onCreate(Bundle savedInstanceState)
//    {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.main);
//
//        final Button send = (Button) this.findViewById(R.id.send);
//        send.setOnClickListener(new View.OnClickListener()
//        {
//            public void onClick(View v)
//            {
//                // TODO Auto-generated method stub
//                sendNotification();
//            }
//        });
//    }

}
