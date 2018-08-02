package id.cathode.currencyconverterrp_usd;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public void convertToUSD(View view){
        EditText ammountEditText = findViewById(R.id.ammountEditText);
        int parseInt = Integer.parseInt(ammountEditText.getText().toString());

        Double convertResult = parseInt * 0.000069;

        Toast.makeText(getApplicationContext(), (String.format("USD %.2f", convertResult)), Toast.LENGTH_LONG).show();
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
