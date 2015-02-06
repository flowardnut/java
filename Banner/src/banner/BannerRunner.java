/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package banner;

import banner.shape.Banner;

/**
 *
 * @author CAD3
 */
public class BannerRunner {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Banner banner = new Banner("DAMA");
        System.out.println(banner.toString());
        banner = new Banner();
        System.out.println(banner.toString());
        banner = new Banner("MADAM IM ADAM");
        System.out.println(banner.toString());
    }
}
