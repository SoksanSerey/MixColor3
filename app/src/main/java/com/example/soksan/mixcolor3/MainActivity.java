package com.example.soksan.mixcolor3;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.RelativeLayout;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private SeekBar seekBar1,seekBar2,seekBar3,seekBar4;
    private RelativeLayout layout;
    int k1=0,k2=0,k3=0,k4=0,color=0;
    TextView textView1, textView2, textView3, textView4,result;
    //RelativeLayout layout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        result=(TextView)findViewById(R.id.result);
        seekBar1=(SeekBar)findViewById(R.id.seekBar1);
        seekBar1.setMax(255);
        seekBar2=(SeekBar)findViewById(R.id.seekBar2);
        seekBar2.setMax(255);
        seekBar3=(SeekBar)findViewById(R.id.seekBar3);
        seekBar3.setMax(255);
        seekBar4=(SeekBar)findViewById(R.id.seekBar4);
        seekBar4.setMax(255);

        layout=(RelativeLayout)findViewById(R.id.layout);

        textView1=(TextView)findViewById(R.id.textView1);
        textView1.setText("0");
        textView2=(TextView)findViewById(R.id.textView2);
        textView2.setText("0");
        textView3=(TextView)findViewById(R.id.textView3);
        textView3.setText("0");
        textView4=(TextView)findViewById(R.id.textView4);
        textView4.setText("0");

        seekBar1.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int i, boolean b) {
                k1=seekBar1.getProgress();
                textView1.setText(""+k1);
                color=Color.argb(k1,k2,k3,k4);
                layout.setBackgroundColor(color);
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {
                Toast.makeText(MainActivity.this,"Start Tracking", Toast.LENGTH_LONG).show();
            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });
        seekBar2.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int i, boolean b) {
                k2=seekBar2.getProgress();
                textView2.setText(""+k2);
                color=Color.argb(k1,k2,k3,k4);
                layout.setBackgroundColor(color);
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {
                Toast.makeText(MainActivity.this,"Start Tracking", Toast.LENGTH_LONG).show();
            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });
        seekBar3.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int i, boolean b) {
                k3=seekBar3.getProgress();
                textView3.setText(""+k3);
                color=Color.argb(k1,k2,k3,k4);
                layout.setBackgroundColor(color);
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {
                Toast.makeText(MainActivity.this,"Start Tracking", Toast.LENGTH_LONG).show();
            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });
        seekBar4.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int i, boolean b) {
                k4=seekBar4.getProgress();//pass values from seekbar to k4
                textView4.setText(""+k4);//pass values from k4 to textView4
                color=Color.argb(k1,k2,k3,k4);//pass values from k1 k2 k3 k4 to color argb
                layout.setBackgroundColor(color);//set color to id result
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {
                Toast.makeText(MainActivity.this,"Start Tracking", Toast.LENGTH_LONG).show();
            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });
    }
}