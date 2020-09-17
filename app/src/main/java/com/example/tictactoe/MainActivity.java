package com.example.tictactoe;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    int[] myGameState={2,2,2,2,2,2,2,2,2};  //2 is the default state for all the images as 0 and 1 are already being used
                                            //this default state can be anything like 100 or 4,as soon as some logic  is run,that initial state(i.e 2)would be changed

    int myActivePlayer=0;
    public void imageTapped(View view) {

    ImageView myTapped = (ImageView) view;
    int tappedImageTag=Integer.parseInt(myTapped.getTag().toString());

    if(myGameState[tappedImageTag]==2){
        myGameState[tappedImageTag]=myActivePlayer;
        if (myActivePlayer == 0) {
            myTapped.setImageResource(R.drawable.myx);
            myTapped.animate().rotation(360).setDuration(1000);
            myActivePlayer = 1;
        } else {
            myTapped.setImageResource(R.drawable.myo);
            myActivePlayer = 0;

        }
    }else{
        Toast toast=Toast.makeText(getApplicationContext(),"Image Tapped already,cannot be tapped again.",Toast.LENGTH_SHORT);
        toast.setMargin(50,50);
        toast.show();
    }
}
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
