package com.example.simplecalculator;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;


public class MainActivity extends AppCompatActivity {

    private enum Operator{none,add,minus,multiply,divide}
    private double data1=0,data2=0;
    private Operator optr=Operator.none;
    private TextView Screen;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void btn00Click(View view){
        TextView etext=(TextView)findViewById(R.id.resultEdit);
        etext.setText(etext.getText()+"0");
    }
    public void btn01Click(View view){
        TextView etext=(TextView)findViewById(R.id.resultEdit);
        etext.setText(etext.getText()+"1");
    }
    public void btn02Click(View view){
        TextView etext=(TextView)findViewById(R.id.resultEdit);
        etext.setText(etext.getText()+"2");
    }
    public void btn03Click(View view){
        TextView etext=(TextView)findViewById(R.id.resultEdit);
        etext.setText(etext.getText()+"3");
    }
    public void btn04Click(View view){
        TextView etext=(TextView)findViewById(R.id.resultEdit);
        etext.setText(etext.getText()+"4");
    }
    public void btn05Click(View view){
        TextView etext=(TextView)findViewById(R.id.resultEdit);
        etext.setText(etext.getText()+"5");
    }
    public void btn06Click(View view){
        TextView etext=(TextView)findViewById(R.id.resultEdit);
        etext.setText(etext.getText()+"6");
    }
    public void btn07Click(View view){
        TextView etext=(TextView)findViewById(R.id.resultEdit);
        etext.setText(etext.getText()+"7");
    }
    public void btn08Click(View view){
        TextView etext=(TextView)findViewById(R.id.resultEdit);
        etext.setText(etext.getText()+"8");
    }
    public void btn09Click(View view){
        TextView etext=(TextView)findViewById(R.id.resultEdit);
        etext.setText(etext.getText()+"9");
    }
    public void btnMultiplyClick(View view){
        optr=Operator.multiply;
        TextView eText=(TextView) findViewById(R.id.resultEdit);
        data1=Double.parseDouble(eText.getText().toString());
        eText.setText("");
    }
    public void btnDivideClick(View view){
        optr=Operator.divide;
        TextView eText=(TextView) findViewById(R.id.resultEdit);
        data1=Double.parseDouble(eText.getText().toString());
        eText.setText("");
    }
    public void btnAddClick(View view){
        optr=Operator.add;
        TextView eText=(TextView) findViewById(R.id.resultEdit);
        data1=Double.parseDouble(eText.getText().toString());
        eText.setText("");
    }
    public void btnMinusClick(View view){
        optr=Operator.minus;
        TextView eText=(TextView) findViewById(R.id.resultEdit);
        data1=Double.parseDouble(eText.getText().toString());
        eText.setText("");
    }
    public void btnClearClick(View view){
        TextView eText=(TextView) findViewById(R.id.resultEdit);
        eText.setText("");
    }
    public void btnDotClick(View view){
        TextView eText=(TextView) findViewById(R.id.resultEdit);
        eText.setText("eText.getText()"+".");
    }
    public void btnResultClick(View view){
        if(optr!=Operator.none){
            TextView eText=(TextView)findViewById(R.id.resultEdit);
            data2=Double.parseDouble(eText.getText().toString());
            double result=0;
            if(optr==Operator.add){
                result=data1+data2;
            }else if(optr==Operator.minus){
                result=data1-data2;
            }else if(optr==Operator.multiply){
                result=data1*data2;
            }else if(optr==Operator.divide){
                result=data1/data2;
            }
            optr=Operator.none;
            data1=result;
            if((result-(int)result)!=0)
                eText.setText(String.valueOf(result));
            else
                eText.setText(String.valueOf((int)result));
        }

    }
}