/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package banner;

import banner.shape.*;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author CAD3
 */
public class Banner {

    List<Shape> shapes;
    String word;

    public Banner() {
        init("ADAM");
    }

    public Banner(String word) {
        init(word);
    }
    
    private void init(String word){
        shapes = new ArrayList<>();
        for (char c : word.toCharArray()) {
            switch (c) {
                case 'A':
                    shapes.add(new A());
                    break;
                case 'D':
                    shapes.add(new D());
                    break;
                case 'M':
                    shapes.add(new M());
                    break;
            }
        }
    }
    public String toString(){
        StringBuilder sb = new StringBuilder();
        for(int i = 1; i <=7; i++){
            for(Shape s: shapes){
                sb.append(s.print());                
            }
            sb.append(System.getProperty("line.separator"));
        }   
        return sb.toString();
    }
}
