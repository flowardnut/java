/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package banner;

import banner.Banner;
import org.testng.annotations.Test;

/**
 *
 * @author CAD3
 */
public class BannerTest {
    @Test
    public void testPassedInChars(){
        Banner banner = new Banner("DAMA");
        assert(banner.toString().equals("######     #    #     #    #    \n" +
                                        "#     #   # #   ##   ##   # #   \n" +
                                        "#     #  #   #  # # # #  #   #  \n" +
                                        "#     # #     # #  #  # #     # \n" +
                                        "#     # ####### #     # ####### \n" +
                                        "#     # #     # #     # #     # \n" +
                                        "######  #     # #     # #     # "));
    }

    @Test
    public void testDefaultChars(){
        Banner banner = new Banner();
        assert(banner.toString().equals("   #    ######     #    #     # \n" +
                                        "  # #   #     #   # #   ##   ## \n" +
                                        " #   #  #     #  #   #  # # # # \n" +
                                        "#     # #     # #     # #  #  # \n" +
                                        "####### #     # ####### #     # \n" +
                                        "#     # #     # #     # #     # \n" +
                                        "#     # ######  #     # #     # "));
    }
}
