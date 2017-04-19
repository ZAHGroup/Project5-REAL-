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
        readMusicData(musicInfo);
        people = new LinkedList<Person>();

        readMusicData(studentInfo);
        System.out.println(music.getSize());

        // new DisplayWindow(music);
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
     * Reads the file given in the argument.
     * 
     * @param fileName
     *            the name of the file to be read.
     * @throws FileNotFoundException
     *             if file is not found.
     */
    public void readMusicData(String fileName) throws FileNotFoundException
    {
        Boolean fileExists = true;
        Scanner input = null;
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
                    String[] str = new String[data.length + 1];
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
                        majorArray[0] += 1;
                    }
                    else if (major.equals("Computer Science"))
                    {
                        majorArray[1] += 1;
                    }
                    else if (major.equals("Other Engineering"))
                    {
                        majorArray[2] += 1;
                    }
                    else
                    {
                        majorArray[3] += 1;
                    }

                    String region = data[3];
                    if (region.equals("Northeast"))
                    {
                        regionArray[0] += 1;
                    }
                    else if (region.equals("Southeast"))
                    {
                        regionArray[1] += 1;

                    }
                    else if (region.equals(
                        "United States (other than Southeast "
                            + "or Northwest)"))
                    {
                        regionArray[2] += 1;
                    }
                    else
                    {
                        regionArray[3] += 1;
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

                    people.add(new Person(hobby, major, region));

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

}
