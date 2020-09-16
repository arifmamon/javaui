import org.jsoup.*;
import org.jsoup.nodes.*;
import org.jsoup.select.*;

import java.awt.*;
import java.io.*; // Only needed if scraping a local File.

public class main {

    public static void main(String[] args) throws IOException{
        /*Document doc = Jsoup.connect("http://jsoup.org").get();


        String title = doc.title();
        Element link = doc.select("a").first();
        String relHref = link.attr("href"); // == "/"
        String absHref = link.attr("abs:href"); // "http://jsoup.org/"*/

        File input = new File("/tmp/input.html");
        Document doc = Jsoup.connect("https://es.manhwas.men/manga-list/?title=&order=update&status=&type=").userAgent("https://es.manhwas.men")
                .get();

        Elements pagi = doc.select(".pagi > li > a");


        Elements links = doc.select("a[href]"); // a with href
        Elements pngs = doc.select("img[src$=.jpg]");
        // img with src ending .png
        Elements title = doc.select("div.title");
        System.out.println(title);

        Element masthead = doc.select("div.masthead").first();
        // div with class=masthead

        Elements resultLinks = doc.select("h3.r > a"); // direct a after h3


        String URLStr = doc.select("a[class = inactive]").attr("href");
        System.out.println(URLStr);

        Connection urlstr = Jsoup.connect(URLStr);
        Elements til = urlstr.get().select("div.title");
        System.out.println(til);

        Elements newl= doc.select("div[class=pagination] > a");

        for (Element link : newl) {

            System.out.println(link.attr("abs:href"));

        }


    }

}


	