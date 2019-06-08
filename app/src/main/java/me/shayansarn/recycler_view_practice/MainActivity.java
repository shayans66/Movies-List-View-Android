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

        // title, actor, year, summary
        Movie gump = new Movie("Forrest gump",
                "Tom Hanks",
                "1994",
                "Plot summary: Mentally challenged man becomes football star, vietnam war hero, ping pong champion, champion runner, and shrimp boat captain, all the while being cucked by some skank named Jenny who leaves him a kid at the end and dies from an STD contracted from one either her promiscuous sexual past or intravenous drug usage");


        Movie network = new Movie("The Social Network",
                "Jesse Eisenberg",
                "2010",
                "");

        Movie jobs = new Movie("Jobs",
                "Ashton",
                "1994",
                "");

        Movie ip = new Movie("IP Man",
                "Tom Hanks",
                "1994",
                "");
        Movie oldboy = new Movie("Old Boy",
                "Tom Hanks",
                "1994",
                "");

        Movie[] movieList = new Movie[] {gump, network, jobs, ip, oldboy};

        ArrayAdapter<Movie> movieAdapter = new ArrayAdapter<Movie>(getBaseContext(), android.R.layout.simple_list_item_1, movieList);

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
