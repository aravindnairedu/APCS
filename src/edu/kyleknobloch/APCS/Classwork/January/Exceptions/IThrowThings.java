package edu.kyleknobloch.APCS.Classwork.January.Exceptions;

/**
 * Created by kyleknobloch on 1/28/16,
 * For
 * *
 * Actions:
 */
public class IThrowThings {

    public IThrowThings() {
        try {
            throw new myEvreythingException("Fuck you");
        }
        catch (myEvreythingException e) {
            System.out.println(e);
        }

    }
}
