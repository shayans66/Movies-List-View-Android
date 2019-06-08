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

        if(movie.equals("Forrest gump")){
            imageView.setImageResource(R.drawable.gump);
        }
        if(movie.equals("The Social Network")){
            imageView.setImageResource(R.drawable.gump);
        }
        if(movie.equals("Jobs")){

        }
        if(movie.equals("Forrest gump")){

        }
        if(movie.equals("Forrest gump")){

        }

        //System.out.println("movie is here: "+ movieName);




    }
}
