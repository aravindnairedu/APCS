package edu.kyleknobloch.APCS.Classwork.September;


public class RomanNumeral {
    private String roman;
    private int    number;

    public RomanNumeral(int number) {

        setNumber(number);
        findCASERomanNumeral();
        System.out.println(roman);

    }

    private void findCASERomanNumeral() {

        switch ( getNumber() ) {
            case 0:
                System.out.println("There is no Roman Numeral for 0. ");
                break;
            case 1:
                roman = "I";
                break;
            case 2:
                roman = "II";
                break;
            case 3:
                roman = "III";
                break;
            case 4:
                roman = "IV";
                break;
            case 5:
                roman = "V";
                break;
            case 6:
                roman = "VI";
                break;
            case 7:
                roman = "VII";
                break;
            case 8:
                roman = "VIII";
                break;
            case 9:
                roman = "IX";
                break;
            case 10:
                roman = "X";
                break;
            default:
                System.out.println("Number is out of range. ");
                break;
        }
    }

    private void findRomanNumeral() {


    }

    private void findCASENumber() {

        switch ( getRoman() ) {
            case "X":
                number = 1;
                break;

        }

    }

    private void findNumber() {


    }

    /*
     * Get Methods
     */

    public String getRoman() {

        return roman;

    }

    public int getNumber() {

        return number;
    }

    /*
     * Set Methods
     */

    public void setRoman(String roman) {

        this.roman = roman;

    }

    public void setNumber(int number) {

        this.number = number;

    }
}
