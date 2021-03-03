package mcm.edu.ph.montero_intent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView display = findViewById(R.id.txtDisplay);

        Button next1 = findViewById(R.id.btnNextCon1);

        next1.setOnClickListener(this);

    }
    @Override
    public void onClick(View v){

        EditText input = findViewById(R.id.txtMonthValue);

        Intent i = new Intent(MainActivity.this,Activity2.class);

        startActivity(i);

        int numberMonths = Integer.parseInt(String.valueOf(input.getText()));

        switch(v.getId()) {
            case R.id.btnNextCon1:

                i.putExtra("INT_MONTHS", numberMonths);

                startActivity(i);
                break;
        }
    }

}