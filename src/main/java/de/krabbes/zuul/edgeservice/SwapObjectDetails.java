package de.krabbes.zuul.edgeservice;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.parser.Parser;
import org.jsoup.select.Elements;
import org.jsoup.select.Evaluator;

public class SwapObjectDetails {

    public static String swap(final String xmlObjectDetails) {
        Document doc = Jsoup.parse(xmlObjectDetails, "", Parser.xmlParser());
        Evaluator eval = new Evaluator.Tag("ns2:parameter");
        Elements elements = doc.select(eval);
        doc.selectFirst(new Evaluator.Tag("ns2:job")).child(2).before(elements.get(1));
        return doc.html();
    }
}
