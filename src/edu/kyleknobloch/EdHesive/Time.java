package edu.kyleknobloch.EdHesive;


/**
 * Created by kyleknobloch on 3/21/17,
 * For
 * *
 * Actions:
 */
public class Time {

    public int h, m;


    public Time(int h, int m) {
        this.h = h;
        this.m = m;
    }

    public int compareTo(Time other) {
        if (other.h == h && other.m == m)
            return 0;
        else if (h > other.h || (h == other.h && m > other.m))
            return 1;
        else
            return -1;
    }

    public String difference(Time other) {

        return "The difference is" + Math.abs((other.h-h)) + ":" + Math.abs((other.m-m));

    }



    @Override
    public String toString() {
        return "" + h + ":" + m;
    }
}
