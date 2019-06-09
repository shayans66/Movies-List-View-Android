package me.shayansarn.recycler_view_practice;

import android.widget.ImageView;

import java.io.Serializable;
import java.io.SerializablePermission;

public class Movie implements Serializable {


    private String title, actor, year, summary;

    public Movie(String title, String actor, String year, String summary) {
        this.title = title;
        this.actor = actor;
        this.year = year;
        this.summary = summary;

    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getActor() {
        return actor;
    }

    public void setActor(String actor) {
        this.actor = actor;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public String toString(){
        return title;
    }
}
