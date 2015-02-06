/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package banner.shape;

/**
 *
 * @author CAD3
 */
public class Shape {

    private String str1;
    private String str2;
    private String str3;
    private String str4;
    private String str5;
    private String str6;
    private String str7;
    private int printLine;

    public Shape() {
        printLine = 0;
    }

    public Shape(String string1, String string2, String string3, String string4, String string5, String string6, String string7) {
        this.str1 = string1;
        this.str2 = string2;
        this.str3 = string3;
        this.str4 = string4;
        this.str5 = string5;
        this.str6 = string6;
        this.str7 = string7;
    }

    public String print() {
        printLine++;
        switch (printLine) {
            case 1:
                return str1;
            case 2:
                return str2;
            case 3:
                return str3;
            case 4:
                return str4;
            case 5:
                return str5;
            case 6:
                return str6;
            case 7:
                return str7;
            default:
                return "wtf are you doing?";
        }
    }
}
