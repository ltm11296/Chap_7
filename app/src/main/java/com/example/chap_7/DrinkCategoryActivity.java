package com.example.chap_7;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class DrinkCategoryActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_drink_category);
        ArrayAdapter<Drinks> listAdapter = new ArrayAdapter<>(this,android.R.layout.simple_list_item_1,Drinks.drink);
        ListView listDrink = findViewById(R.id.list_drinks);
        listDrink.setAdapter(listAdapter);
        AdapterView.OnItemClickListener itcl = new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent(DrinkCategoryActivity.this, DrinkActivity.class);
                intent.putExtra(DrinkActivity.EXTRA_DRINKID, (int)id);
                startActivity(intent);

            }
        };
        listDrink.setOnItemClickListener(itcl);
    }
}
