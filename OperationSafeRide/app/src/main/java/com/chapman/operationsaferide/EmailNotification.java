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

    public EmailNotification(String email)
    {
        userEmail = email;
    }

    public void addNotification()
    {

    }

    @Override
    public void sendNotification() {

    }

    public void sendNotification(String toEmail)
    {

    }

    public void editNotification()
    {

    }

    public boolean notificationResult()
    {
        return true;
    }

    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        setContentView(R.layout.main);
//
//        final Button send = (Button) this.findViewById(R.id.send);
//        send.setOnClickListener(new View.OnClickListener() {
//
//            public void onClick(View v) {
//                // TODO Auto-generated method stub
//
//                try {
//                    GMailSender sender = new GMailSender("username@gmail.com", "password");
//                    sender.sendMail("This is Subject",
//                            "This is Body",
//                            "user@gmail.com",
//                            "user@yahoo.com");
//                } catch (Exception e) {
//                    Log.e("SendMail", e.getMessage(), e);
//                }
//
//            }
//        });

    }
}
