package me.shayansarn.recycler_view_practice;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemClickListener {

    String[] movies = new String[]{"Forrest Gump", "The Social Network", "Jobs", "IP man", "Old Boy"};

    ListView listView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = findViewById(R.id.listView);

        ArrayAdapter<String> movieAdapter = new ArrayAdapter<String>(getBaseContext(), android.R.layout.simple_list_item_1, movies);

        listView.setAdapter(movieAdapter);

        listView.setOnItemClickListener(this);


    }


    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        //System.out.println(movies[position]);

        Intent moveToDetailIntent = new Intent(getBaseContext() , MovieDetailActivity.class);

        moveToDetailIntent.putExtra("Movie name: ", movies[position]);
        startActivity(moveToDetailIntent);
    }
}
