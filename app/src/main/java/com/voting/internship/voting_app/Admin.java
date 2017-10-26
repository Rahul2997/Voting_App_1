package com.voting.internship.voting_app;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.util.Objects;

public class Admin extends Activity {

    EditText et1,et2;
    Button b1;
    String Enter_Admin_id,Enter_Admin_pwd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin);
         et1 = (EditText)findViewById(R.id.tv1_admin);
        et2 = (EditText)findViewById(R.id.tv2_admin);
        b1 = (Button)findViewById(R.id.b1_admin);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Enter_Admin_id = et1.getText().toString();
               Enter_Admin_pwd= et2.getText().toString();

                if (!Objects.equals(Enter_Admin_id, "Admin")) {

                        et1.setError("Invalid username");
                }
                if(!Objects.equals(Enter_Admin_pwd, "Admin"))
                {
                    et2.setError("Invalid password");
                }
                else {
                    if(Enter_Admin_id != null && Enter_Admin_pwd != null) {

                        Intent count = new Intent("count");
                        startActivity(count);
                    }
                }
            }
        });
    }
}
