package prj5;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class MusicList extends LinkedList<Songs> implements Iterable<Songs>
{
    /**
     * strings the song list together
     * @return string of what's in the list
     */
    public String toString() {
        String ans = "";
        for (int i = 0; i < getSize(); i++) {
            ans += "";
            System.out.println("Song Title: " + getEntry(i).getTitle());;
            System.out.println("Song Artist: " + getEntry(i).getArtist());
            System.out.println("Song Genre: " + getEntry(i).getGenre());
            System.out.println("Song Year: " + getEntry(i).getYear());
            System.out.println("Heard");
            System.out.println("reading:" + getEntry(i).getHobbyHeard(0) + " art:"
                    + getEntry(i).getHobbyHeard(1) + " sports:"
                    + getEntry(i).getHobbyHeard(2) + " music"
                    + getEntry(i).getHobbyHeard(3));
            System.out.println("Likes");
            System.out.println("reading:" + getEntry(i).getHobbyLiked(0) + " art:"
                    + getEntry(i).getHobbyLiked(1) + " sports:"
                    + getEntry(i).getHobbyLiked(2) + " music"
                    + getEntry(i).getHobbyLiked(3));
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
    public class MusicListIterator<Songs> implements Iterator<Songs>
    {
        // The index where the iterator is.
        private int index;


        /**
         * Creates a new MusicListIterator() object.
         * Sets the index at 0.
         */
        public MusicListIterator()
        {
            index = 0;
        }


        /**
         * To see if list has next
         * 
         * @return true if list has next
         */
        public boolean hasNext()
        {
            return index < getSize();
        }


        /**
         * iterates to the next song
         * 
         * @return next entry
         */
        public Songs next()
        {
            if (hasNext())
            {
                @SuppressWarnings("unchecked")
                Songs nextEntry = (Songs)getEntry(index++);
                return nextEntry;
            }
            else
            {
                throw new NoSuchElementException("Illegal call to next(); "
                    + "iterator is after end of list.");
            }
        }
    }


    public Iterator<Songs> iterator()
    {
        return new MusicListIterator();
    }

}
