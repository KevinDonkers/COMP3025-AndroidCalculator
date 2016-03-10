package ca.georgiancollege.calculator;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.TextView;

import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity {

    //PRIVATE INSTANCE VARIABLES
    private TextView _numberDisplay;
    private Button _numOne, _numTwo, _numThree, _numFour, _numFive, _numSix, _numSeven, _numEight, _numNine, _numZero,
                   _decimalPoint, _divide, _add, _subtract, _multiply, _equals, _clear;
    private String operation;
    private double num1, num2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        //create a reference to textView control
        this._numberDisplay = (TextView) findViewById(R.id.numberDisplayTextView);

        //create references to the number buttons
        this._numOne = (Button) findViewById(R.id.oneButton);
        this._numTwo = (Button) findViewById(R.id.twoButton);
        this._numThree = (Button) findViewById(R.id.threeButton);
        this._numFour = (Button) findViewById(R.id.fourButton);
        this._numFive = (Button) findViewById(R.id.fiveButton);
        this._numSix = (Button) findViewById(R.id.sixButton);
        this._numSeven = (Button) findViewById(R.id.sevenButton);
        this._numEight = (Button) findViewById(R.id.eightButton);
        this._numNine = (Button) findViewById(R.id.nineButton);
        this._numZero = (Button) findViewById(R.id.zeroButton);

        //create references to operator and special buttons
        this._decimalPoint = (Button) findViewById(R.id.decimalButton);
        this._divide = (Button) findViewById(R.id.divideButton);
        this._add = (Button) findViewById(R.id.addButton);
        this._subtract = (Button) findViewById(R.id.subtractButton);
        this._multiply = (Button) findViewById(R.id.multiplyButton);
        this._equals = (Button) findViewById(R.id.equalsButton);
        this._clear = (Button) findViewById(R.id.clearButton);

        //create click listeners for button controls
        this._numOne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //this is where the fun happens
                _numberDisplay.setText(_numberDisplay.getText() + "1");
            }
        });

        this._numTwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //this is where the fun happens
                _numberDisplay.setText(_numberDisplay.getText() + "2");
            }
        });

        this._numThree.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //this is where the fun happens
                _numberDisplay.setText(_numberDisplay.getText() + "3");
            }
        });

        this._numFour.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //this is where the fun happens
                _numberDisplay.setText(_numberDisplay.getText() + "4");
            }
        });
        this._numFive.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //this is where the fun happens
                _numberDisplay.setText(_numberDisplay.getText() + "5");
            }
        });
        this._numSix.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //this is where the fun happens
                _numberDisplay.setText(_numberDisplay.getText() + "6");
            }
        });
        this._numSeven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //this is where the fun happens
                _numberDisplay.setText(_numberDisplay.getText() + "7");
            }
        });
        this._numEight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //this is where the fun happens
                _numberDisplay.setText(_numberDisplay.getText() + "8");
            }
        });
        this._numNine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //this is where the fun happens
                _numberDisplay.setText(_numberDisplay.getText() + "9");
            }
        });
        this._numZero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //this is where the fun happens
                _numberDisplay.setText(_numberDisplay.getText() + "0");
            }
        });

        //Other button click listeners
        this._clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //this is where the fun happens
                _numberDisplay.setText("");
                num1 = 0;
                num2 = 0;
                operation = "";
            }
        });

        this._divide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //this is where the fun happens
                num1 = Double.parseDouble(_numberDisplay.getText().toString());
                operation = "divide";
                _numberDisplay.setText("");
            }
        });

        this._multiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //this is where the fun happens
                num1 = Double.parseDouble(_numberDisplay.getText().toString());
                operation = "multiply";
                _numberDisplay.setText("");
            }
        });

        this._add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //this is where the fun happens
                num1 = Double.parseDouble(_numberDisplay.getText().toString());
                operation = "add";
                _numberDisplay.setText("");
            }
        });

        this._subtract.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //this is where the fun happens
                num1 = Double.parseDouble(_numberDisplay.getText().toString());
                operation = "subtract";
                _numberDisplay.setText("");
            }
        });

        this._decimalPoint.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //this is where the fun happens
                _numberDisplay.setText(_numberDisplay.getText() + ".");
            }
        });

        this._equals.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //this is where the fun happen

                DecimalFormat format = new DecimalFormat("#,###.#");

                num2 = Double.parseDouble(_numberDisplay.getText().toString());
                switch (operation){
                    case "divide":
                        String dividend = String.valueOf(format.format(num1/num2));
                        _numberDisplay.setText(dividend);
                        break;
                    case "multiply":
                        String product = String.valueOf(format.format(num1*num2));
                        _numberDisplay.setText(product);
                        break;
                    case "add":
                        String sum = String.valueOf(format.format(num1+num2));
                        _numberDisplay.setText(sum);
                        break;
                    case "subtract":
                        String difference = String.valueOf(format.format(num1-num2));
                        _numberDisplay.setText(difference);
                        break;
                    default:
                        _numberDisplay.setText("Error");
                }
            }
        });
    }
}