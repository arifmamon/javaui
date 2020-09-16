import org.jsoup.*;
import org.jsoup.nodes.*;
import org.jsoup.select.*;

import java.awt.*;
import java.io.*; // Only needed if scraping a local File.

public class scrap {

    public static void main(String[] args) throws IOException{
        /*Document doc = Jsoup.connect("http://jsoup.org").get();


        String title = doc.title();
        Element link = doc.select("a").first();
        String relHref = link.attr("href"); // == "/"
        String absHref = link.attr("abs:href"); // "http://jsoup.org/"*/

        Document doc = Jsoup.connect("https://manhwas.men/latest-release")
                .get();

        Elements title = doc.select("h3 > a");
        System.out.println(title);

        String URLStr = doc.select(".col-xs-12").select(".pagination").select("li > a").attr("href");
        System.out.println(URLStr);

        Connection urlstr = Jsoup.connect(URLStr);
        Elements til = urlstr.get().select("h3 > a");
        System.out.println(til);

        Elements newl= doc.select("div[class=pagination] > a");

        for (Element link : newl) {

            System.out.println(link.attr("abs:href"));

        }

    }

}


