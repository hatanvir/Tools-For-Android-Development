package com.example.tanvir.tictactoy;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.Toolbar;

public class GameActivity extends AppCompatActivity implements View.OnClickListener{
    android.support.v7.widget.Toolbar toolbar;

    Button button1,button2,button3,button4,button5,button6,button7,button8,button9;
    Button resetButton;

    TextView textViewPlayer1,textViewPlayer2;

    int count=0,b1count=0,b2count=0,b3count=0,b4count=0,b5count=0,b6count=0,b7count=0,b8count=0,b9count=0;
    int player1=0,player2=0;
    int tiecount=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);

        //finding button
        button1=findViewById(R.id.Button1XmlId);
        button2=findViewById(R.id.Button2XmlId);
        button3=findViewById(R.id.Button3XmlId);
        button4=findViewById(R.id.Button4XmlId);
        button5=findViewById(R.id.Button5XmlId);
        button6=findViewById(R.id.Button6XmlId);
        button7=findViewById(R.id.Button7XmlId);
        button8=findViewById(R.id.Button8XmlId);
        button9=findViewById(R.id.Button9XmlId);

        resetButton=findViewById(R.id.ResetButtonXmlID);

        textViewPlayer1=findViewById(R.id.textView1XmlID);
        textViewPlayer2=findViewById(R.id.textView2XmlID);

        button1.setOnClickListener(this);
        button2.setOnClickListener(this);
        button3.setOnClickListener(this);
        button4.setOnClickListener(this);
        button5.setOnClickListener(this);
        button6.setOnClickListener(this);
        button7.setOnClickListener(this);
        button8.setOnClickListener(this);
        button9.setOnClickListener(this);

        resetButton.setOnClickListener(this);
    }

    //for navigation bar
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.navigation, menu);
        return true;
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item)
    {
        switch (item.getItemId())
        {
            case R.id.navigation_help:
                Intent intent= new Intent(GameActivity.this,HelpActivity.class);
                startActivity(intent);
                finish();
                break;
            default:
                return super.onOptionsItemSelected(item);
        }
        return true;
    }
    //for clicking from user
    @Override
    public void onClick(View view) {
        if(view.getId()==R.id.Button1XmlId){
            count++;
            b1count++;
            if(count%2==0){
                button1.setText("O");
                button1.setTextColor(Color.RED);
            }else {
                button1.setText("X");
                button1.setTextColor(Color.GREEN);
            }
            if(b1count>1){
                CheatingMassage(b1count,button1);
                reset();
            }
        }
        if(view.getId()==R.id.Button2XmlId){
            count++;
            b2count++;
            if(count%2==0){
                button2.setText("O");
                button2.setTextColor(Color.RED);
            }else{
                button2.setText("X");
                button2.setTextColor(Color.GREEN);
            }

            if(b2count>1){
                CheatingMassage(b2count,button2);
                reset();
            }
        }
        if(view.getId()==R.id.Button3XmlId){
            count++;
            b3count++;
            if(count%2==0){
                button3.setText("O");
                button3.setTextColor(Color.RED);
            }else{
                button3.setText("X");
                button3.setTextColor(Color.GREEN);
            }

            if(b3count>1){
                CheatingMassage(b3count,button3);;
                reset();
            }
        }
        if(view.getId()==R.id.Button4XmlId){
            count++;
            b4count++;
            if(count%2==0){
                button4.setText("O");
                button4.setTextColor(Color.RED);
            }else{
                button4.setText("X");
                button4.setTextColor(Color.GREEN);
            }

            if(b4count>1){
                CheatingMassage(b4count,button4);
                reset();
            }


        }
        if(view.getId()==R.id.Button5XmlId){
            count++;
            b5count++;
            if(count%2==0){
                button5.setText("O");
                button5.setTextColor(Color.RED);
            }else{
                button5.setText("X");
                button5.setTextColor(Color.GREEN);
            }

            if(b5count>1){
                CheatingMassage(b5count,button5);
                reset();
            }
        }
        if(view.getId()==R.id.Button6XmlId){
            count++;
            b6count++;
            if(count%2==0){
                button6.setText("O");
                button6.setTextColor(Color.RED);
            }else{
                button6.setText("X");
                button6.setTextColor(Color.GREEN);
            }

            if(b6count>1){
                CheatingMassage(b6count,button6);
                reset();
            }
        }
        if(view.getId()==R.id.Button7XmlId){
            count++;
            b7count++;
            if(count%2==0){
                button7.setText("O");
                button7.setTextColor(Color.RED);
            } else{
                button7.setText("X");
                button7.setTextColor(Color.GREEN);
            }
            if(b7count>1){
                CheatingMassage(b7count,button7);
                reset();
            }
        }
        if(view.getId()==R.id.Button8XmlId){
            count++;
            b8count++;
            if(count%2==0){
                button8.setText("O");
                button8.setTextColor(Color.RED);
            }else{
                button8.setText("X");
                button8.setTextColor(Color.GREEN);
            }
            if(b8count>1){
                CheatingMassage(b8count,button8);
                reset();
            }
        }
        if(view.getId()==R.id.Button9XmlId){
            count++;
            b9count++;
            if(count%2==0){
                button9.setText("O");
                button9.setTextColor(Color.RED);
            }else{
                button9.setText("X");
                button9.setTextColor(Color.GREEN);
            }


            if(b9count>1){
                CheatingMassage(b9count,button9);
                reset();
            }
        }
        if(view.getId()==R.id.ResetButtonXmlID){
            reset();
        }
        winner();
    }
    //winner selection function
    public void winner(){
        String b1= (String) button1.getText();
        String b2= (String) button2.getText();
        String b3= (String) button3.getText();
        String b4= (String) button4.getText();
        String b5= (String) button5.getText();
        String b6= (String) button6.getText();
        String b7= (String) button7.getText();
        String b8= (String) button8.getText();
        String b9= (String) button9.getText();

            //For player 1
            if (b1 == "X" && b2 == "X" && b3 == "X") {
                button1.setBackgroundColor(Color.GREEN);
                button2.setBackgroundColor(Color.GREEN);
                button3.setBackgroundColor(Color.GREEN);
                player1++;
                player1ConMasage();
                ShearePreferanceRead("0", String(player1));
                StopButton();
            }
            else if (b4 == "X" && b5 == "X" && b6 == "X") {
                button4.setBackgroundColor(Color.GREEN);
                button5.setBackgroundColor(Color.GREEN);
                button6.setBackgroundColor(Color.GREEN);
                player1++;
                player1ConMasage();
                ShearePreferanceRead("0", String(player1));
                StopButton();
            }
            else if (b7 == "X" && b8 == "X" && b9 == "X") {
                button7.setBackgroundColor(Color.GREEN);
                button8.setBackgroundColor(Color.GREEN);
                button9.setBackgroundColor(Color.GREEN);
                player1++;
                player1ConMasage();
                ShearePreferanceRead("0", String(player1));
                StopButton();
            }
            else if (b1 == "X" && b4 == "X" && b7 == "X") {
                button1.setBackgroundColor(Color.GREEN);
                button4.setBackgroundColor(Color.GREEN);
                button7.setBackgroundColor(Color.GREEN);
                player1++;
                player1ConMasage();
                ShearePreferanceRead("0", String(player1));
                StopButton();
            }
            else if (b2 == "X" && b5 == "X" && b8 == "X") {
                button2.setBackgroundColor(Color.GREEN);
                button5.setBackgroundColor(Color.GREEN);
                button8.setBackgroundColor(Color.GREEN);
                player1++;
                player1ConMasage();
                ShearePreferanceRead("0", String(player1));
                StopButton();
            }
            else if (b3 == "X" && b6 == "X" && b9 == "X") {
                button3.setBackgroundColor(Color.GREEN);
                button6.setBackgroundColor(Color.GREEN);
                button9.setBackgroundColor(Color.GREEN);
                player1++;
                player1ConMasage();
                ShearePreferanceRead("0", String(player1));
                StopButton();
            }
            else if (b1 == "X" && b5 == "X" && b9 == "X") {
                button1.setBackgroundColor(Color.GREEN);
                button5.setBackgroundColor(Color.GREEN);
                button9.setBackgroundColor(Color.GREEN);
                player1++;
                player1ConMasage();
                ShearePreferanceRead("0", String(player1));
                StopButton();
            }
            else if (b3 == "X" && b5 == "X" && b7 == "X") {
                button3.setBackgroundColor(Color.GREEN);
                button5.setBackgroundColor(Color.GREEN);
                button7.setBackgroundColor(Color.GREEN);
                player1++;
                player1ConMasage();
                ShearePreferanceRead("0", String(player1));
                StopButton();
            }

            //For Player 2

            else if (b1 == "O" && b2 == "O" && b3 == "O") {
                button1.setBackgroundColor(Color.RED);
                button2.setBackgroundColor(Color.RED);
                button3.setBackgroundColor(Color.RED);
                player2++;
                player2ConMasage();
                ShearePreferanceRead("0", String(player2));
                StopButton();
            }
            else if (b4 == "O" && b5 == "O" && b6 == "O") {
                button4.setBackgroundColor(Color.RED);
                button5.setBackgroundColor(Color.RED);
                button6.setBackgroundColor(Color.RED);
                player2++;
                player2ConMasage();
                ShearePreferanceRead("0", String(player2));
                StopButton();
            }
            else if (b7 == "O" && b8 == "O" && b9 == "O") {
                button7.setBackgroundColor(Color.RED);
                button8.setBackgroundColor(Color.RED);
                button9.setBackgroundColor(Color.RED);
                player2++;
                player2ConMasage();
                ShearePreferanceRead("0", String(player2));
                StopButton();
            }
            else if (b1 == "O" && b4 == "O" && b7 == "O") {
                button1.setBackgroundColor(Color.RED);
                button4.setBackgroundColor(Color.RED);
                button7.setBackgroundColor(Color.RED);
                player2++;
                player2ConMasage();
                ShearePreferanceRead("0", String(player2));
                StopButton();
            }
            else if (b2 == "O" && b5 == "O" && b8 == "O") {
                button2.setBackgroundColor(Color.RED);
                button5.setBackgroundColor(Color.RED);
                button8.setBackgroundColor(Color.RED);
                player2++;
                player2ConMasage();
                ShearePreferanceRead("0", String(player2));
                StopButton();
            }
            else if (b3 == "O" && b6 == "O" && b9 == "O") {
                button3.setBackgroundColor(Color.RED);
                button6.setBackgroundColor(Color.RED);
                button9.setBackgroundColor(Color.RED);
                player2++;
                player2ConMasage();
                ShearePreferanceRead("0", String(player2));
                StopButton();
            }
            else if (b1 == "O" && b5 == "O" && b9 == "O") {
                button1.setBackgroundColor(Color.RED);
                button5.setBackgroundColor(Color.RED);
                button9.setBackgroundColor(Color.RED);
                player2++;
                player2ConMasage();
                ShearePreferanceRead("0", String(player2));
                StopButton();
            }
            else if (b3 == "O" && b5 == "O" && b7 == "O") {
                button3.setBackgroundColor(Color.RED);
                button5.setBackgroundColor(Color.RED);
                button7.setBackgroundColor(Color.RED);
                player2++;
                player2ConMasage();
                ShearePreferanceRead("0", String(player2));
                StopButton();
            }
           else{
                tie();
                //reset();
            }
    }
    //game tie function
    public void tie(){
        if (count==9){
            Toast.makeText(this, "Tie!", Toast.LENGTH_SHORT).show();
        }
    }
    //cheating messege
    private void CheatingMassage(int buttonCount,Button button) {
        if(buttonCount>1 && button.getText()=="X"){
            player1--;
            ShearePreferanceRead("0", String(player1));
            Toast.makeText(GameActivity.this, "Cheating player 1! The game has restarted", Toast.LENGTH_SHORT).show();
        }
        else{
            player2--;
            ShearePreferanceRead("0", String(player2));
            Toast.makeText(GameActivity.this, "Cheating player 2! The game has restarted", Toast.LENGTH_SHORT).show();
        }

    }
    //congratulation message for players
    public void player1ConMasage() {
        Toast.makeText(this, "Congratulation Player 1 :)", Toast.LENGTH_SHORT).show();
    }
    public void player2ConMasage() {
        Toast.makeText(this, "Congratulation Player 2 :)", Toast.LENGTH_SHORT).show();
    }
    //for reset the game
    private void reset() {

        button1.setBackgroundResource(R.drawable.buttonstyle);
        button2.setBackgroundResource(R.drawable.buttonstyle);
        button3.setBackgroundResource(R.drawable.buttonstyle);
        button4.setBackgroundResource(R.drawable.buttonstyle);
        button5.setBackgroundResource(R.drawable.buttonstyle);
        button6.setBackgroundResource(R.drawable.buttonstyle);
        button7.setBackgroundResource(R.drawable.buttonstyle);
        button8.setBackgroundResource(R.drawable.buttonstyle);
        button9.setBackgroundResource(R.drawable.buttonstyle);

        button1.setText("");
        button2.setText("");
        button3.setText("");
        button4.setText("");
        button5.setText("");
        button6.setText("");
        button7.setText("");
        button8.setText("");
        button9.setText("");
        b1count=0;
        b2count=0;
        b3count=0;
        b4count=0;
        b5count=0;
        b6count=0;
        b7count=0;
        b8count=0;
        b9count=0;
        count=0;
        StartButton();
    }
    //for disable those button
    public void StopButton(){
        button1.setEnabled(false);
        button2.setEnabled(false);
        button3.setEnabled(false);
        button4.setEnabled(false);
        button5.setEnabled(false);
        button6.setEnabled(false);
        button7.setEnabled(false);
        button8.setEnabled(false);
        button9.setEnabled(false);
    }
    //for enable those button
    public void StartButton(){
        button1.setEnabled(true);
        button2.setEnabled(true);
        button3.setEnabled(true);
        button4.setEnabled(true);
        button5.setEnabled(true);
        button6.setEnabled(true);
        button7.setEnabled(true);
        button8.setEnabled(true);
        button9.setEnabled(true);
    }

    //for save game data
    public void ShearePreferanceRead(String p1,String p2){
        SharedPreferences sharedPreferences = getSharedPreferences("Point", Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putString("Player1",String(player1));
        editor.putString("Player2",String(player2));
        editor.commit();
        SharedPreferences sharedPreferenceswrite = getSharedPreferences("Point", Context.MODE_PRIVATE);
        String player1 = sharedPreferenceswrite.getString("Player1","No Value");
        String player2 = sharedPreferenceswrite.getString("Player2","No Value");
        textViewPlayer1.setText("Player 1:"+player1);
        textViewPlayer2.setText("Player 2:"+player2);
    }
    public String String(int player){
        Integer integer = new Integer(player);
        String string = integer.toString();
        return string;
    }
}
