package org.launchcode.techjobs.console;

import java.util.Comparator;
import java.util.HashMap;

public class MapCompare implements Comparator<HashMap<String, String>>
{
    private final String key ;

    public MapCompare(String key)
    {
        this.key = key ;
    }

    public int compare(HashMap<String, String> first, HashMap<String, String> second)
    {
        String firstVal = first.get(key) ;
        String secondVal = second.get(key) ;

        String[] keys = new String[] {"name", "employer", "location", "core competency"} ;

        int index = 0 ;
        int result = firstVal.compareTo(secondVal);

        while(result == 0)
        {
            firstVal = first.get(keys[index]) ;
            secondVal = second.get(keys[index]) ;

            result = firstVal.compareTo(secondVal);
            index++ ;

            if(index == keys.length)
            {
                break ;
            }
        }

        return result ;
    }
}
