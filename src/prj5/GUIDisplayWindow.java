package prj5;

import CS2114.CircleShape;
import CS2114.WindowSide;
import CS2114.TextShape;
import java.awt.Color;
import java.util.LinkedList;
import CS2114.Button;
import CS2114.Shape;
import CS2114.Window;

/**
 * This is the GUI.
 * 
 * @author Zorian Thornton zorian15
 * @author Ahmad Ayub aayub98
 * @author Harshitha Narayanan hnar
 * @version 2017.04.16
 *
 */
public class GUIDisplayWindow {
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

    private Button repByRegionButton;

    private String legend = "hobby";

    private TextShape textLegend;

    private TextShape shape1;

    private TextShape shape2;

    private TextShape shape3;

    private Shape shape4;


    public GUIDisplayWindow(MusicList music) {
        songs = music;
        window = new Window();

        repByHobbyButton = new Button("Represent Hobby");
        repByMajorButton = new Button("Represent Major");
        repByRegionButton = new Button("Represent Region");
        sortArtistsButton = new Button("Sort Artists");
        sortSongTitleButton = new Button("Sort Song Title");
        sortYearButton = new Button("Sort Year");
        sortGenreButton = new Button("Sort Genre");
        nextButton = new Button("Next -->");
        previousButton = new Button("<-- Previous");
        quitButton = new Button("Quit");

        window.addButton(previousButton, WindowSide.NORTH);
        window.addButton(sortArtistsButton, WindowSide.NORTH);
        window.addButton(sortSongTitleButton, WindowSide.NORTH);
        window.addButton(sortYearButton, WindowSide.NORTH);
        window.addButton(sortGenreButton, WindowSide.NORTH);
<<<<<<< HEAD
        window.addButton(nextButton, WindowSide.NORTH);
        window.addButton(repByHobbyButton, WindowSide.SOUTH);
        window.addButton(repByMajorButton, WindowSide.SOUTH);
        window.addButton(repByRegionButton, WindowSide.SOUTH);
=======
        window.addButton(previousButton, WindowSide.NORTH);
        window.addButton(nextButton, WindowSide.NORTH);
>>>>>>> 175c6d2e3a20e0b71da4ce15c68a952ec274a147
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

        if (legend.equals("hobby")) {
            textLegend = new TextShape(window.getGraphPanelWidth() - 172, 20,
                "Hobby Legend");
            window.addShape(textLegend);
            textLegend.setBackgroundColor(Color.WHITE);
            shape1 = new TextShape(window.getGraphPanelWidth() - 172, 40,
                "Read", Color.MAGENTA);
            window.addShape(shape1);
            shape1.setBackgroundColor(Color.WHITE);
            shape2 = new TextShape(window.getGraphPanelWidth() - 172, 60, "Art",
                Color.BLUE);

            window.addShape(shape2);
            shape2.setBackgroundColor(Color.WHITE);
            shape3 = new TextShape(window.getGraphPanelWidth() - 172, 80,
                "Sport", Color.ORANGE);
            window.addShape(shape3);
            shape3.setBackgroundColor(Color.WHITE);
            shape4 = new TextShape(window.getGraphPanelWidth() - 172, 100,
                "Music", Color.GREEN);
            window.addShape(shape4);
            shape4.setBackgroundColor(Color.WHITE);
        }
        else if (legend.equals("major")) {
            textLegend = new TextShape(window.getGraphPanelWidth() - 172, 20,
                "Major Legend");
            window.addShape(textLegend);
            textLegend.setBackgroundColor(Color.WHITE);
            shape1 = new TextShape(window.getGraphPanelWidth() - 172, 40,
                "Math or CMDA", Color.MAGENTA);
            window.addShape(shape1);
            shape1.setBackgroundColor(Color.WHITE);
            shape2 = new TextShape(window.getGraphPanelWidth() - 172, 60,
                "Comp Scie", Color.BLUE);
            window.addShape(shape2);
            shape2.setBackgroundColor(Color.WHITE);
            shape3 = new TextShape(window.getGraphPanelWidth() - 172, 80,
                "Other Eng", Color.ORANGE);
            window.addShape(shape3);
            shape3.setBackgroundColor(Color.WHITE);
            shape4 = new TextShape(window.getGraphPanelWidth() - 172, 100,
                "Other", Color.GREEN);
            window.addShape(shape4);
            shape4.setBackgroundColor(Color.WHITE);
        }
        else if (legend.equals("region")) {
            textLegend = new TextShape(window.getGraphPanelWidth() - 172, 20,
                "Region Legend");
            window.addShape(textLegend);
            textLegend.setBackgroundColor(Color.WHITE);
            shape1 = new TextShape(window.getGraphPanelWidth() - 172, 40,
                "Northeast", Color.MAGENTA);
            window.addShape(shape1);
            shape1.setBackgroundColor(Color.WHITE);
            shape2 = new TextShape(window.getGraphPanelWidth() - 172, 60,
                "Southeast", Color.BLUE);
            window.addShape(shape2);
            shape2.setBackgroundColor(Color.WHITE);
            shape3 = new TextShape(window.getGraphPanelWidth() - 172, 80,
                "United States", Color.ORANGE);
            window.addShape(shape3);
            shape3.setBackgroundColor(Color.WHITE);
            shape4 = new TextShape(window.getGraphPanelWidth() - 172, 100,
                "Outside US", Color.GREEN);
            window.addShape(shape4);
            shape4.setBackgroundColor(Color.WHITE);
        }

        TextShape song1 = new TextShape(0, 0, "All These Things I've Done",
            Color.BLACK);
        window.addShape(song1);
        song1.setX(1);
        song1.setY(1);

        Shape rec1 = new Shape(2, 2, 100, 30, Color.MAGENTA);
        window.addShape(rec1);
        Shape rec2 = new Shape(2, 10, 100, 30, Color.BLUE);
        window.addShape(rec2);
        Shape rec3 = new Shape(2, 20, 100, 30, Color.ORANGE);
        window.addShape(rec3);
        Shape rec4 = new Shape(2, 30, 100, 30, Color.GREEN);
        window.addShape(rec4);

        TextShape song2 = new TextShape(1, 1, "Help!", Color.BLACK);
        window.addShape(song2);
        song2.setX(1);
        song2.setY(100);

        Shape rec5 = new Shape(200, 15, 100, 20, Color.MAGENTA);
        window.addShape(rec5);
        Shape rec6 = new Shape(200, 20, 100, 20, Color.BLUE);
        window.addShape(rec6);
        Shape rec7 = new Shape(200, 30, 100, 20, Color.ORANGE);
        window.addShape(rec7);
        Shape rec8 = new Shape(200, 40, 100, 20, Color.GREEN);
        window.addShape(rec8);

        TextShape song3 = new TextShape(50, 50, "Hey Jude", Color.BLACK);
        window.addShape(song3);
        song3.setX(1);
        song3.setY(200);

        Shape rec9 = new Shape(350, 15, 100, 20, Color.MAGENTA);
        window.addShape(rec9);
        Shape rec10 = new Shape(350, 20, 100, 20, Color.BLUE);
        window.addShape(rec10);
        Shape rec11 = new Shape(350, 30, 100, 20, Color.ORANGE);
        window.addShape(rec11);
        Shape rec12 = new Shape(350, 40, 100, 20, Color.GREEN);
        window.addShape(rec12);

        TextShape song4 = new TextShape(50, 50, "Let It Be", Color.BLACK);
        window.addShape(song4);
        song4.setX(200);
        song4.setY(1);

        Shape rec13 = new Shape(2, 140, 100, 20, Color.MAGENTA);
        window.addShape(rec13);
        Shape rec14 = new Shape(2, 150, 100, 20, Color.BLUE);
        window.addShape(rec14);
        Shape rec15 = new Shape(2, 160, 100, 20, Color.ORANGE);
        window.addShape(rec15);
        Shape rec16 = new Shape(2, 170, 100, 20, Color.GREEN);
        window.addShape(rec16);

        TextShape song5 = new TextShape(50, 50, "Imagine", Color.BLACK);
        window.addShape(song5);
        song5.setX(200);
        song5.setY(100);

        Shape rec17 = new Shape(200, 140, 100, 20, Color.MAGENTA);
        window.addShape(rec17);
        Shape rec18 = new Shape(200, 150, 100, 20, Color.BLUE);
        window.addShape(rec18);
        Shape rec19 = new Shape(200, 160, 100, 20, Color.ORANGE);
        window.addShape(rec19);
        Shape rec20 = new Shape(200, 170, 100, 20, Color.GREEN);
        window.addShape(rec20);

        TextShape song6 = new TextShape(50, 50, "No One", Color.BLACK);
        window.addShape(song6);
        song6.setX(200);
        song6.setY(200);

        Shape rec21 = new Shape(350, 140, 100, 20, Color.MAGENTA);
        window.addShape(rec21);
        Shape rec22 = new Shape(350, 150, 100, 20, Color.BLUE);
        window.addShape(rec22);
        Shape rec23 = new Shape(350, 160, 100, 20, Color.ORANGE);
        window.addShape(rec23);
        Shape rec24 = new Shape(350, 170, 100, 20, Color.GREEN);
        window.addShape(rec24);

        TextShape song7 = new TextShape(50, 50, "Party Rock Anthem",
            Color.BLACK);
        window.addShape(song7);
        song7.setX(300);
        song7.setY(1);

        Shape rec25 = new Shape(2, 210, 100, 20, Color.MAGENTA);
        window.addShape(rec25);
        Shape rec26 = new Shape(2, 220, 100, 20, Color.BLUE);
        window.addShape(rec26);
        Shape rec27 = new Shape(2, 230, 100, 20, Color.ORANGE);
        window.addShape(rec27);
        Shape rec28 = new Shape(2, 240, 100, 20, Color.GREEN);
        window.addShape(rec28);

        TextShape song8 = new TextShape(50, 50, "Rehab", Color.BLACK);
        window.addShape(song8);
        song8.setX(300);
        song8.setY(100);

        Shape rec29 = new Shape(200, 210, 100, 20, Color.MAGENTA);
        window.addShape(rec29);
        Shape rec30 = new Shape(200, 220, 100, 20, Color.BLUE);
        window.addShape(rec30);
        Shape rec31 = new Shape(200, 230, 100, 20, Color.ORANGE);
        window.addShape(rec31);
        Shape rec32 = new Shape(200, 240, 100, 20, Color.GREEN);
        window.addShape(rec32);

        TextShape song9 = new TextShape(50, 50, "Shake It Off", Color.BLACK);
        window.addShape(song9);
        song9.setX(300);
        song9.setY(200);

        Shape rec33 = new Shape(350, 210, 100, 20, Color.MAGENTA);
        window.addShape(rec33);
        Shape rec34 = new Shape(350, 220, 100, 20, Color.BLUE);
        window.addShape(rec34);
        Shape rec35 = new Shape(350, 230, 100, 20, Color.ORANGE);
        window.addShape(rec35);
        Shape rec36 = new Shape(350, 240, 100, 20, Color.GREEN);
        window.addShape(rec36);

    }


    public Window getWindow() {
        return window;
    }


    /*
     * public void addGlyph(Button button)
     * {
     * window.removeAllShapes();
     * window.repaint();
     * 
     * if (button.equals(sortArtistsButton))
     * {
     * 
     * }
     * 
     * else if (button.equals(sortSongTitleButton))
     * {
     * 
     * }
     * 
     * else if (button.equals(sortYearButton))
     * {
     * 
     * }
     * 
     * else if (button.equals(sortGenreButton))
     * {
     * 
     * }
     * }
     */

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


    public void clickedQuit(Button button) {
        System.exit(0);
    }
}
