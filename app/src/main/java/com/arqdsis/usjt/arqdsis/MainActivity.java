package com.arqdsis.usjt.arqdsis;
//CESAR DISTASI BASTOS 201508447
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    public static final String EXTRA_MESSAGE = "br.usjt.meuprimeiroapp.MESSAGE";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void sendMessage(View view) {
        Intent intent = new Intent(this, DisplayMessageActivity.class);
        EditText editText = (EditText) findViewById(R.id.EditField1);
        EditText editText1 = (EditText) findViewById(R.id.EditField2);
        String message = editText.getText().toString() + "X" + editText1.getText().toString() + "=" + conta();
        intent.putExtra(EXTRA_MESSAGE, message);
        startActivity(intent);

    }
    public double conta()
    {
        Intent intent = new Intent(this, DisplayMessageActivity.class);
        EditText editText = (EditText) findViewById(R.id.EditField1);
        EditText editText1 = (EditText) findViewById(R.id.EditField2);
        double  num1 = Double.parseDouble(editText.getText().toString());
        double num2 = Double.parseDouble(editText1.getText().toString());
        double resultado = num1 * num2;
        return resultado;
    }

}