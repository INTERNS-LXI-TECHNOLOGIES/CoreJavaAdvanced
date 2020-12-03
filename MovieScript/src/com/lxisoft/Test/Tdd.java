package com.lxisoft.Test;    
import com.lxisoft.View.Movie;
import java.io.File;
import java.io.IOException;
public class Tdd
{
	public static void main(String[] arg)
	{
		Movie movie = new Movie();
		movie.movieDetails();
		movie.playList();
	}
}
