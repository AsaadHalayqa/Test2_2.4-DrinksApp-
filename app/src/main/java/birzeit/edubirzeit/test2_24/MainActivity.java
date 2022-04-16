package birzeit.edubirzeit.test2_24;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;

import java.util.ArrayList;

import birzeit.edubirzeit.test2_24.modle.Drink;
import birzeit.edubirzeit.test2_24.modle.DrinksMockup;

public class MainActivity extends AppCompatActivity {
    private EditText edtDrinks;
    private Spinner spinner;
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setViews();

        setSpinner();

    }

    private void setSpinner() {
        DrinksMockup database = new DrinksMockup();
        String[] cats = database.getCatigories();

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_spinner_item, cats);

        spinner.setAdapter(adapter);
    }

    private void setViews() {
        edtDrinks = findViewById(R.id.button_res);
        spinner = findViewById(R.id.spinner);
    }

    public void btnSubmit_Click(View view){

        String cat = spinner.getSelectedItem().toString();

        DrinksMockup database = new DrinksMockup();

        ArrayList<Drink> result = database.getDrinks(cat);
        String str = "";
        for (Drink d : result){
            str += d.getName()+", Price: "+d.getUnitPrice() + "\n";
        }

        edtDrinks.setText(str);
    }
}
