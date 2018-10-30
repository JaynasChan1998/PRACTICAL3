package com.example.taruc.practical3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class PRAC3 extends AppCompatActivity {
    private int mCount = 0;
    private TextView mshowCount;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_prac3);
        mshowCount = (TextView)findViewById(R.id.show_Count);
    }

    public void showToast(View view) {
        Toast toast = Toast.makeText(this, R.string.toast_message,Toast.LENGTH_SHORT);
        toast.show();
    }

    public void countUp(View view) {
        ++mCount;
        if(mshowCount !=null){
            mshowCount.setText(Integer.toString(mCount));

        }
    }
}
