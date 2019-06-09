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

        Movie movie = (Movie) getIntent().getExtras().get("Movie name: ");

        imageView = findViewById(R.id.imageView);
        movieTextView = findViewById(R.id.movieTextView);
        yearTextView = findViewById(R.id.yearTextView);
        actorTextView = findViewById(R.id.actorTextView);
        descriptionTextView = findViewById(R.id.descriptionTextView);

        // title, actor, year, summary, image
        movieTextView.setText(movie.getTitle());
        actorTextView.setText(movie.getActor());
        yearTextView.setText(movie.getYear());
        descriptionTextView.setText(movie.getSummary());

        if(movie.getTitle().equals("Forrest gump")){
            imageView.setImageResource(R.drawable.gump);
        }
        if(movie.getTitle().equals("The Social Network")){
            imageView.setImageResource(R.drawable.socialnetwork);
        }
        if(movie.getTitle().equals("Jobs")){
            imageView.setImageResource(R.drawable.jobs);
        }
        if(movie.getTitle().equals("IP Man")){
            imageView.setImageResource(R.drawable.ipman);
        }
        if(movie.getTitle().equals("Old Boy")){
            imageView.setImageResource(R.drawable.oldoby);
        }

        //System.out.println("movie is here: "+ movieName);




    }
}
