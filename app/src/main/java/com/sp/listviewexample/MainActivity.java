package com.sp.listviewexample;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import com.sp.listviewexample.models.Car;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemClickListener{

    private ListView listViewNames;
    public static List<Car> listCars = new ArrayList<>();
    //private String[] names = {"diego","franco","luis"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listViewNames = findViewById(R.id.listViewNames);
        //ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,names);
        //Car c = new Car("FORD MUDSTANG","2000","2021","140000000",null);
        //listCars.add(new Car("FORD MUDSTANG","2000","2021","140000000",null));
        //listCars.add(new Car("CAMARO","2000","2021","140000000",null));
        //listCars.add(new Car("COBRA","2000","1966   ","140000000",null));
        formulario formu = new formulario();
        listCars = formu.carros;
        AdapterCar adapter = new AdapterCar(this, (ArrayList<Car>) listCars);
        listViewNames.setAdapter(adapter);
        listViewNames.setOnItemClickListener(this);
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id){
        Toast.makeText(this,"ha pulsado el elemento numero "+position,Toast.LENGTH_LONG).show();
    }
}
