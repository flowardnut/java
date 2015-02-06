/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package banner;

import banner.Banner;
import org.testng.annotations.Test;
import static org.testng.Assert.assertTrue;

/**
 *
 * @author CAD3
 */
public class BannerTest {

    @Test
    public void testPassedInChars() {
        Banner banner = new Banner("DAMA");
        String actualBanner = banner.toString();
        String testBanner = "######     #    #     #    #    " + System.getProperty("line.separator")
                          + "#     #   # #   ##   ##   # #   " + System.getProperty("line.separator")
                          + "#     #  #   #  # # # #  #   #  " + System.getProperty("line.separator")
                          + "#     # #     # #  #  # #     # " + System.getProperty("line.separator")
                          + "#     # ####### #     # ####### " + System.getProperty("line.separator")
                          + "#     # #     # #     # #     # " + System.getProperty("line.separator")
                          + "######  #     # #     # #     # " + System.getProperty("line.separator");
        assertTrue(actualBanner.equals(testBanner));
    }

    @Test
    public void testDefaultChars() {
        Banner banner = new Banner();
        String testBanner = "   #    ######     #    #     # " + System.getProperty("line.separator")
                          + "  # #   #     #   # #   ##   ## " + System.getProperty("line.separator")
                          + " #   #  #     #  #   #  # # # # " + System.getProperty("line.separator")
                          + "#     # #     # #     # #  #  # " + System.getProperty("line.separator")
                          + "####### #     # ####### #     # " + System.getProperty("line.separator")
                          + "#     # #     # #     # #     # " + System.getProperty("line.separator")
                          + "#     # ######  #     # #     # " + System.getProperty("line.separator");
        assertTrue(banner.toString().equals(testBanner));
    }
}
