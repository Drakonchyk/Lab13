package ua.ucu.edu.apps.task3;

import lombok.SneakyThrows;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

public class PDLReader {
    @SneakyThrows
    public static Company getInfo(String url) {
        Company company = new Company();
        Document doc = Jsoup.connect(url).get();
        company.setName(doc.title());

        Elements description = doc.select("meta[name=description]");
        company.setDescription(description.attr("content"));

        Elements title = doc.select("title");
        company.setName(title.text());

        String logo = doc.select("link[rel$=icon]").attr("href");
        if (logo.startsWith("/")) { logo = url + logo; }
        company.setLogo(logo);

        return company;
    }
}
