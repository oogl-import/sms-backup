package com.googlecode.sms_backup;

import android.app.Activity;
import android.os.Bundle;
import android.content.*;
import android.widget.*;
import android.view.*;

public class MainActivity extends Activity
{
    public final static String EXTRA_MESSAGE = "com.googlecode.sms_backup.MESSAGE";
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
    }

    /** Called when the user clicks the About button 
    public void displayAbout(View view) {
        // Do something in response to button
        Intent intent = new Intent(this, DisplayAboutActivity.class);
        // EditText editText = (EditText) findViewById(R.id.edit_message);
        String message = editText.getText().toString();
        intent.putExtra(EXTRA_MESSAGE, message);
        startActivity(intent);
    }
    **/

}
