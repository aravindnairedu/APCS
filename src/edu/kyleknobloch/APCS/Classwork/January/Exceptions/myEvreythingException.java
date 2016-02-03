package edu.kyleknobloch.APCS.Classwork.January.Exceptions;


public class myEvreythingException extends Exception {

    private String message = null;

    public myEvreythingException()
    {
        super();
    }

    public myEvreythingException(String message)
    {
        super(message);
        this.message = message;
    }

    public myEvreythingException(Throwable cause)
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
