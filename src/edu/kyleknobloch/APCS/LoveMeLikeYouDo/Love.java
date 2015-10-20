package edu.kyleknobloch.APCS.LoveMeLikeYouDo;


public class Love {

    public static void main (String args[]) {
        Me me = new Me();
        boolean Me = true;
        boolean You = true;
        You you = new You();

        if (you.inBedWith(Me)) {
            me.doNaughtyThingsTo(You);
        }

        if (you.love(Me)) {
            do {
                you.kiss(Me);
            } while (you.inBedWith(Me));
        }


    }
}

