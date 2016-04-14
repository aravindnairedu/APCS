package edu.kyleknobloch.APCS.CaseStudy.ElevensLab;

/**
 * SizeMismatch Exception
 */

public class SizeMismatch extends Exception {

    private String message = "There was a size mismatch";

    public SizeMismatch()
    {
        super();
    }

    public SizeMismatch(String message)
    {
        super(message);
        this.message = message;
    }

    public SizeMismatch(Throwable cause)
    {
        super(cause);
    }

    @Override
    public String toString()
    {
        return message;
    }

    @Override
    public String getMessage()
    {
        return toString();
    }
}
