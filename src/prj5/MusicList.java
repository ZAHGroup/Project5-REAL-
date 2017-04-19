package prj5;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class MusicList extends LinkedList<Songs> implements Iterable<Songs>
{
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
