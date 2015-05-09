package com.tierconnect.utilities;

import java.sql.Timestamp;

/**
 * Created by Paul Landaeta on 09/05/2015.
 */
public class RandomDate {

    private long beginTime;
    private long endTime;

    public RandomDate () {
        beginTime = Timestamp.valueOf("2015-05-09 00:00:00").getTime();
        endTime = Timestamp.valueOf("2015-12-31 00:58:00").getTime();
    }

    /**
     * Method should generate random number that represents
     * a time between two dates.
     *
     * @return
     */
    public  long getRandomTimeBetweenTwoDates () {
        long diff = endTime - beginTime + 1;
        return beginTime + (long) (Math.random() * diff);
    }
    public  long getRandomTimeBetweenTwoDates (long begin) {
        long diff = endTime - begin + 1;
        return begin + (long) (Math.random() * diff);
    }
}
