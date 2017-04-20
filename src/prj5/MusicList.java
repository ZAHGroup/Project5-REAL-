package prj5;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class MusicList extends LinkedList<Songs> implements Iterable<Songs> {

    /**
     * Returns the total number of students that like reading.
     * 
     * @return the total number of students that like reading.
     */
    public int totalReading() {
        int num = 0;
        for (int i = 0; i < getSize(); i++) {
            num += getEntry(i).getHobbyHeard(0) + getEntry(i).getHobbyLiked(0);
        }
        if (num == 0) {
            return 1;
        }
        return num;
    }


    /**
     * Returns the total number of students that like art.
     * 
     * @return the total number of students that like art.
     */
    public int totalArt() {
        int num = 0;
        for (int i = 0; i < getSize(); i++) {
            num += getEntry(i).getHobbyHeard(1) + getEntry(i).getHobbyLiked(1);
        }
        if (num == 0) {
            return 1;
        }
        return num;
    }


    /**
     * Returns the total number of students that like sports.
     * 
     * @return the total number of students that like sports.
     */
    public int totalSports() {
        int num = 0;
        for (int i = 0; i < getSize(); i++) {
            num += getEntry(i).getHobbyHeard(2) + getEntry(i).getHobbyLiked(2);
        }
        if (num == 0) {
            return 1;
        }
        return num;
    }


    /**
     * Returns the total number of students that like music.
     * 
     * @return the total number of students that like music.
     */
    public int totalMusic() {
        int num = 0;
        for (int i = 0; i < getSize(); i++) {
            num += getEntry(i).getHobbyHeard(3) + getEntry(i).getHobbyLiked(3);
        }
        if (num == 0) {
            return 1;
        }
        return num;
    }


    /**
     * strings the song list together
     * 
     * @return string of what's in the list
     */
    public String toString() {
        int totalReading = 0;
        int totalArt = 0;
        int totalSports = 0;
        int totalMusic = 0;
        String ans = "";
        for (int i = 0; i < getSize(); i++) {
            totalReading += getEntry(i).getHobbyHeard(0) + getEntry(i)
                .getHobbyLiked(0);
            totalArt += getEntry(i).getHobbyHeard(1) + getEntry(i)
                .getHobbyLiked(1);
            totalSports += getEntry(i).getHobbyHeard(2) + getEntry(i)
                .getHobbyLiked(2);
            totalMusic += getEntry(i).getHobbyHeard(3) + getEntry(i)
                .getHobbyLiked(3);
            if (totalReading == 0) {
                totalReading = 1;
            }
            if (totalArt == 0) {
                totalArt = 1;
            }
            if (totalSports == 0) {
                totalSports = 1;
            }
            if (totalMusic == 0) {
                totalMusic = 1;
            }

            ans += "";
            System.out.println("Song Title: " + getEntry(i).getTitle());
            ;
            System.out.println("Song Artist: " + getEntry(i).getArtist());
            System.out.println("Song Genre: " + getEntry(i).getGenre());
            System.out.println("Song Year: " + getEntry(i).getYear());
            System.out.println("Heard");
            System.out.println("reading:" + ((getEntry(i).getHobbyHeard(0)
                * 100) / totalReading) + " art:" + ((getEntry(i)
                    .getHobbyHeard(1) * 100) / totalArt) + " sports:"
                + ((getEntry(i).getHobbyHeard(2) * 100) / totalSports)
                + " music" + ((getEntry(i).getHobbyHeard(3) * 100)
                    / totalMusic));
            System.out.println("Likes");
            System.out.println("reading:" + ((getEntry(i).getHobbyLiked(0)
                * 100) / totalReading) + " art:" + ((getEntry(i)
                    .getHobbyLiked(1) * 100) / totalArt) + " sports:"
                + ((getEntry(i).getHobbyLiked(2) * 100) / totalSports)
                + " music" + ((getEntry(i).getHobbyLiked(3) * 100)
                    / totalMusic));
        }
        System.out.print("\n");
        for (int i = 0; i < getSize(); i++) {
            totalReading += getEntry(i).getHobbyHeard(0) + getEntry(i)
                .getHobbyLiked(0);
            totalArt += getEntry(i).getHobbyHeard(1) + getEntry(i)
                .getHobbyLiked(1);
            totalSports += getEntry(i).getHobbyHeard(2) + getEntry(i)
                .getHobbyLiked(2);
            totalMusic += getEntry(i).getHobbyHeard(3) + getEntry(i)
                .getHobbyLiked(3);
            if (totalReading == 0) {
                totalReading = 1;
            }
            if (totalArt == 0) {
                totalArt = 1;
            }
            if (totalSports == 0) {
                totalSports = 1;
            }
            if (totalMusic == 0) {
                totalMusic = 1;
            }

            ans += "";
            System.out.println("Song Title: " + getEntry(i).getTitle());
            ;
            System.out.println("Song Artist: " + getEntry(i).getArtist());
            System.out.println("Song Genre: " + getEntry(i).getGenre());
            System.out.println("Song Year: " + getEntry(i).getYear());
            System.out.println("Heard");
            System.out.println("reading:" + ((getEntry(i).getHobbyHeard(0)
                * 200) / totalReading) + " art:" + ((getEntry(i)
                    .getHobbyHeard(1) * 200) / totalArt) + " sports:"
                + ((getEntry(i).getHobbyHeard(2) * 200) / totalSports)
                + " music" + ((getEntry(i).getHobbyHeard(3) * 200)
                    / totalMusic));
            System.out.println("Likes");
            System.out.println("reading:" + ((getEntry(i).getHobbyLiked(0)
                * 200) / totalReading) + " art:" + ((getEntry(i)
                    .getHobbyLiked(1) * 200) / totalArt) + " sports:"
                + ((getEntry(i).getHobbyLiked(2) * 200) / totalSports)
                + " music" + ((getEntry(i).getHobbyLiked(3) * 200)
                    / totalMusic));
        }

        return ans;
    }


    /**
     * Inner iterator class for the MusicList.
     * 
     * @param <Songs>
     *            Iterates over song objects
     */
    @SuppressWarnings("hiding")
    public class MusicListIterator<Songs> implements Iterator<Songs> {
        // The index where the iterator is.
        private int index;


        /**
         * Creates a new MusicListIterator() object.
         * Sets the index at 0.
         */
        public MusicListIterator() {
            index = 0;
        }


        /**
         * To see if list has next
         * 
         * @return true if list has next
         */
        public boolean hasNext() {
            return index < getSize();
        }


        /**
         * iterates to the next song
         * 
         * @return next entry
         */
        public Songs next() {
            if (hasNext()) {
                @SuppressWarnings("unchecked")
                Songs nextEntry = (Songs)getEntry(index++);
                return nextEntry;
            }
            else {
                throw new NoSuchElementException("Illegal call to next(); "
                    + "iterator is after end of list.");
            }
        }
    }


    public Iterator<Songs> iterator() {
        return new MusicListIterator();
    }

}
