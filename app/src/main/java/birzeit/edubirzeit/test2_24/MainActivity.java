package birzeit.edubirzeit.test2_24;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.Toast;


import java.util.ArrayList;

import birzeit.edubirzeit.test2_24.modle.Drink;
import birzeit.edubirzeit.test2_24.modle.DrinksMockup;

public class MainActivity extends AppCompatActivity {
    private ListView lstDrinks;
    private Spinner spinner;
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setViews();

        setSpinner();

        toastMsgOnClick();

    }

    private void setSpinner() {
        DrinksMockup database = new DrinksMockup();
        String[] cats = database.getCatigories();

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_spinner_item, cats);

        spinner.setAdapter(adapter);

    }

    private void setViews() {
        lstDrinks = findViewById(R.id.lstDrinks);
        spinner = findViewById(R.id.spinner);
    }

    public void btnSubmit_Click(View view){

        String cat = spinner.getSelectedItem().toString();

        DrinksMockup database = new DrinksMockup();

        ArrayList<Drink> result = database.getDrinks(cat);

        ArrayAdapter<Drink> lstAdapter = new ArrayAdapter<Drink>(this,
                android.R.layout.simple_list_item_1, result);
        lstDrinks.setAdapter(lstAdapter);




    }

    private void toastMsgOnClick() {
        lstDrinks.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view,
                                    final int position, long id) {

                Toast.makeText(getApplicationContext(), lstDrinks.getItemAtPosition(position).toString(),
                        Toast.LENGTH_SHORT).show();
            }
        });
    }
}
