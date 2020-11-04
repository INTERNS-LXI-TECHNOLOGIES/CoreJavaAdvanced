package com.lxisoft.Movies;

public class View
{
	public void viewMenu()
	{
	Movie movie=new Movie();
			CharacterInfo characterinfo=new CharacterInfo();
						Director director=new Director();


		movie.movieDetails();
			characterinfo.infoPrint();
				director.menu();
	}
}