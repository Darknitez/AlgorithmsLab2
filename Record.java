//
// RECORD.JAVA
// Record type for string hash table
//
// A record associates a certain string (the key value) with 
// a list of sequence positions at which that string occurs.
//

import java.util.*;


public class Record {
    public String key;
    public int keyInt; 
    public final ArrayList<Integer> positions;

    public void setKeyInt(int keyInt) {
		this.keyInt = keyInt;
	}

	/**
     * Constructs a Record with the given string
     *
     * @param s key of the Record
     */
    public Record(String s) {
        key = s;
        keyInt = StringTable.toHashKey(s);
        positions = new ArrayList<Integer>(1);
    }

    /**
     * Returns the key associated with this Record.
     */
    public String getKey() {
        return key;
    }
    /**
     * Returns integer result of hashing the String Key of this record
     */
    public int keyInt(){
    	return keyInt;
    }
    /**
     * Adds a new position to the positions list.
     *
     * @param position of the key
     */
    public void addPosition(Integer position) {
        positions.add(position);
    }

    /**
     * @return The number of positions we have for this key.
     */
    public int getPositionsCount() {
        return positions.size();
    }

    /**
     * @return the Integer position at index
     */
    public Integer getPosition(int index) {
        return positions.get(index);
    }
}
