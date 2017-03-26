/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hdip.oop2.code1;

import java.util.ArrayList;

/**
 *
 * @author A00247198
 */
public class NewsPortal {
public static final String ANSI_RED = "\u001B[31m";
public static final String ANSI_RESET = "\u001B[0m";
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<NewsMedia> nm = new ArrayList<NewsMedia>();

        NewsMedia tids = new Tabloid("The Irish Daily Star", "Des Gibson");
        NewsMedia thp = new SubscriptionService("The Huffington Post", "Tara Lee");
        nm.add(tids);
        nm.add(thp);
        processNewsMedia(nm);

    }
    

    public static void processNewsMedia(ArrayList<NewsMedia> nm) {
        for (NewsMedia nm1 : nm) {
            if (nm1 instanceof QualityJournalism) {
                System.out.println(nm1 + ANSI_RED + " - Quality Journalism" + ANSI_RESET);
            } else {
                System.out.println(nm1);
            }
        }
    }
}
