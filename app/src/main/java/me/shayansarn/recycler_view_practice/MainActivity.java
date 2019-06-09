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

    Movie[] movieList;

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
                "Mark Zuckerberg and a couple of his friends found \"The Facebook\", an online social media platform that helps friends and acquantences connected with each other. However, Zuck finds himself in a lot of legal troubles after people accuse him of stealing their ideas for Facebook");

        Movie jobs = new Movie("Jobs",
                "Ashton",
                "2013",
                "Steve Jobs and his friend Steve Wozniak cofound Apple, and it becomes a huge company. However, Jobs gets fired from the company and founds Pixar. In the end, whatever Jobs makes turns into a multi billion dollar company.");

        Movie ip = new Movie("IP Man",
                "Donnie Yen",
                "2008",
                "There is an old Kung fu guy named Ip man (Yes, that's his real name). And he teaches Bruce Lee his form of martial arts, Wing chun, to make Bruce lee the biggest martial arts legend of all time.");
        Movie oldboy = new Movie("Old Boy",
                "Josh Brolin",
                "2013",
                "Some dude gets kidnapped and locked in a hotel room for 20 years, where he gets fed and showered, but he never finds out why he's being kept there and cannot escape. When he gets released without any whereabouts of his captors, he goes on a mission to find out who imprisoned him and exact justice on his captors. ");

        movieList = new Movie[] {gump, network, jobs, ip, oldboy};

        ArrayAdapter<Movie> movieAdapter = new ArrayAdapter<Movie>(getBaseContext(), android.R.layout.simple_list_item_1, movieList);

        listView.setAdapter(movieAdapter);

        listView.setOnItemClickListener(this);


    }


    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        //System.out.println(movies[position]);

        Intent moveToDetailIntent = new Intent(getBaseContext() , MovieDetailActivity.class);

        moveToDetailIntent.putExtra("Movie name: ", movieList[position]);
        startActivity(moveToDetailIntent);
    }
}
