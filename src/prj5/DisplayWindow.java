package prj5;

import CS2114.CircleShape;
import CS2114.WindowSide;
import CS2114.TextShape;
import java.awt.Color;
import java.util.LinkedList;
import CS2114.Button;
import CS2114.Shape;
import CS2114.Window;

public class DisplayWindow {
    private LinkedList dataList;

    private Window window;

    private Button repByHobbyButton;

    private Button repByMajorButton;

    private Button sortArtistsButton;

    private Button sortSongTitleButton;

    private Button sortYearButton;

    private Button sortGenreButton;

    private Button nextButton;

    private Button previousButton;

    private Button quitButton;
    
    private MusicList songs;


    public DisplayWindow(MusicList music) {
        songs = music;
        window = new Window();

        repByHobbyButton = new Button("Represent By Hobby");
        repByMajorButton = new Button("Represent By Major");
        sortArtistsButton = new Button("Sort Artists");
        sortSongTitleButton = new Button("Sort Song Title");
        sortYearButton = new Button("Sort Year");
        sortGenreButton = new Button("Sort Genre");
        nextButton = new Button("Next");
        previousButton = new Button("Previous");
        quitButton = new Button("Quit");

        window.addButton(repByHobbyButton, WindowSide.SOUTH);
        window.addButton(repByMajorButton, WindowSide.SOUTH);
        window.addButton(sortArtistsButton, WindowSide.NORTH);
        window.addButton(sortSongTitleButton, WindowSide.NORTH);
        window.addButton(sortYearButton, WindowSide.NORTH);
        window.addButton(sortGenreButton, WindowSide.NORTH);
        window.addButton(nextButton, WindowSide.NORTH);
        window.addButton(previousButton, WindowSide.NORTH);
        window.addButton(quitButton, WindowSide.SOUTH);

        repByHobbyButton.onClick(this, "clickedSortHobby");
        repByMajorButton.onClick(this, "clickedSortMajor");
        sortArtistsButton.onClick(this, "clickedSortArtist");
        sortSongTitleButton.onClick(this, "clickedSortTitle");
        sortYearButton.onClick(this, "clickedSortYear");
        sortGenreButton.onClick(this, "clickedSortGenre");
        nextButton.onClick(this, "clickedNext");
        previousButton.onClick(this, "clickedPrevious");
        quitButton.onClick(this, "clickedQuit");
    }


    public void clickedSortHobby(Button button) {

    }


    public void clickedSortMajor(Button button) {

    }


    public void clickedSortRegion(Button button) {

    }


    public void clickedSortArtist(Button button) {

    }


    public void clickedSortYear(Button button) {

    }


    public void clickedNext(Button button) {

    }


    public void clickedPrevious(Button button) {

    }


    public void clickedQuit(Button button)
    {
        System.exit(0);
    }
}
