package prj5;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * The main class for this project that will
 * read the input files.
 * 
 * @author Zorian Thornton zorian15
 * @version 2017.04.16
 *
 */
public class Input
{
    // List of the music.
    private static MusicList music;

    // List of people that took the survey.
    private static LinkedList<Person> people;

    // Array of hobby choices.
    private static int[] hobbyArray =
    { 0, 0, 0, 0 };

    // Array of major occurrences.
    private static int[] majorsArray =
    { 0, 0, 0, 0 };

    // Array of region occurrences
    private static int[] regionsArray =
    { 0, 0, 0, 0 };

    // GUI
    // private GUIDisplayWindow window;


    /**
     * Default constructor for the Input file
     * 
     * @param musicInfo
     *            the files with information about the music
     * @param studentData
     *            the files with the information about the students.
     * @throws FileNotFoundException
     *             file is not found in directory
     */
    public Input(String musicInfo, String studentInfo)
        throws FileNotFoundException
    {
        music = new MusicList();
        people = new LinkedList<Person>();
        new GUIDisplayWindow(music);
    }


    /**
     * The main method that runs the program.
     * 
     * @param args
     *            the files being passed.
     * @throws FileNotFoundException
     *             if file is not found.
     */
    public static void main(String[] args) throws FileNotFoundException
    {
        Input input = new Input(args[0], args[1]);
        input.readMusicData(args[1]);

        input.readStudentData(args[0]);
        music.insertionSort("Genre");
        System.out.print(music.toString());
        music.insertionSort("Title");
        System.out.println(music.toString());

        if (args.length == 2)
        {
            new Input(args[0], args[1]);
        }
        else
        {
            new Input("SongList.csv", "MusicSurveyData.csv");
        }
    }


    /**
     * Reads data on the song list
     * 
     * @param fileName
     *            of song read
     * @throws FileNotFoundException
     */
    public void readMusicData(String fileName) throws FileNotFoundException
    {
        Scanner scanner = null;
        boolean cont = true;
        try
        {
            scanner = new Scanner(new File(fileName));
        }
        catch (FileNotFoundException e)
        {
            e.printStackTrace();
            cont = false;
        }
        scanner.nextLine().trim().split(",");
        if (cont && fileName != null)
        {
            String[] val;
            scanner.hasNextLine();
            while (scanner.hasNextLine())
            {
                val = scanner.nextLine().trim().split(",");
                music.addToLast(new Songs(val[0], val[1], val[2], val[3]));
            }
            scanner.close();
        }

    }


    /**
     * Reads the file given in the argument.
     * 
     * @param fileName
     *            the name of the file to be read.
     * @throws FileNotFoundException
     *             if file is not found.
     */
    public void readStudentData(String fileName) throws FileNotFoundException
    {
        Boolean fileExists = true;
        Scanner input = null;
        String[] str;
        try
        {
            input = new Scanner(new File(fileName));
        }
        catch (FileNotFoundException exception)
        {
            exception.printStackTrace();
            fileExists = false;
        }
        if (fileExists && fileName != null)
        {
            input.nextLine();
            while (input.hasNextLine())
            {
                String[] data = input.nextLine().trim().split(",");
                if (data.length == (music.getSize() * 2 + 4))
                {
                    str = new String[data.length + 1];
                    for (int i = 0; i < data.length; i++)
                    {
                        str[i] = data[i];
                    }
                    str[data.length] = "";
                }
                else
                {
                    str = data;
                }

                if (data.length > 2)
                {
                    fileExists = false;
                }
                if (data.length >= 5)
                {
                    String major = data[2];

                    if (major.equals("Math or CMDA"))
                    {
                        majorsArray[0] = majorsArray[0] + 1;
                    }
                    else if (major.equals("Computer Science"))
                    {
                        majorsArray[1] = majorsArray[1] + 1;
                    }
                    else if (major.equals("Other Engineering"))
                    {
                        majorsArray[2] = majorsArray[2] + 1;
                    }
                    else
                    {
                        majorsArray[3] = majorsArray[3] + 1;
                    }

                    String region = data[3];
                    if (region.equals("Northeast"))
                    {
                        regionsArray[0] = regionsArray[0] + 1;
                    }
                    else if (region.equals("Southeast"))
                    {
                        regionsArray[1] = regionsArray[1] + 1;

                    }
                    else if (region.equals(
                        "United States (other than Southeast "
                            + "or Northwest)"))
                    {
                        regionsArray[2] = regionsArray[2] + 1;
                    }
                    else
                    {
                        regionsArray[3] = regionsArray[3] + 1;
                    }

                    String hobby = data[4];

                    if (hobby.equals("reading"))
                    {
                        hobbyArray[0] += 1;
                    }
                    else if (hobby.equals("art"))
                    {
                        hobbyArray[1] += 1;
                    }
                    else if (hobby.equals("sports"))
                    {
                        hobbyArray[2] += 1;
                    }
                    else
                    {
                        hobbyArray[3] += 1;
                    }

                    people.addToLast(new Person(hobby, major, region));

                    int songIndex = 0;
                    for (int i = 5; i < data.length - 1; i += 2)
                    {
                        if (data[i].equals("Yes"))
                        {

                            music.getEntry(songIndex).addHeardHobby(
                                getCorrespondingIndex(hobby, "reading", "art",
                                    "sports"));
                            music.getEntry(songIndex).addHeardMajor(
                                getCorrespondingIndex(major, "Math or CMDA",
                                    "Computer Science", "Other Engineering"));
                            music.getEntry(songIndex).addHeardRegion(
                                getCorrespondingIndex(region, "Northeast",
                                    "Southeast",
                                    "United States (other than Southeast "
                                        + "or Northwest)"));

                        }

                        if (data[i + 1].equals("Yes"))
                        {

                            music.getEntry(songIndex).addLikedHobby(
                                getCorrespondingIndex(hobby, "reading", "art",
                                    "sports"));
                            music.getEntry(songIndex).addLikedMajor(
                                getCorrespondingIndex(major, "Math or CMDA",
                                    "Computer Science", "Other Engineering"));
                            music.getEntry(songIndex).addLikedRegion(
                                getCorrespondingIndex(region, "Northeast",
                                    "Southeast",
                                    "United States (other than Southeast "
                                        + "or Northwest)"));
                        }
                        songIndex++;

                    }
                }

            }
        }
    }


    /**
     * Finds the corresponding index of either the hobby, major or region of the
     * person who liked that song
     * 
     * @param actual
     *            the actual value of the Song
     * @param case1
     *            the first case to be checked against
     * @param case2
     *            the second case to be checked against
     * @param case3
     *            the third case to be checked against
     * @return int
     */
    private static int getCorrespondingIndex(
        String actual,
        String case1,
        String case2,
        String case3)
    {

        if (actual.equals(case1))
        {
            return 0;
        }
        else if (actual.equals(case2))
        {
            return 1;
        }
        else if (actual.equals(case3))
        {
            return 2;
        }
        else
        {
            return 3;
        }
    }

}
