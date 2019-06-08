package me.shayansarn.recycler_view_practice;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class MovieDetailActivity extends AppCompatActivity {

    ImageView imageView;
    TextView movieTextView;
    TextView yearTextView;
    TextView actorTextView;
    TextView descriptionTextView;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_movie_detail);

        String movieName = (String) getIntent().getExtras().get("Movie name: ");

        imageView = findViewById(R.id.imageView);
        movieTextView = findViewById(R.id.movieTextView);
        yearTextView = findViewById(R.id.yearTextView);
        actorTextView = findViewById(R.id.actorTextView);
        descriptionTextView = findViewById(R.id.descriptionTextView);


        //System.out.println("movie is here: "+ movieName);
    }
}
