package com.company;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.io.IOException;

/**
 * Created by java on 26.05.14.
 */

@Component
public class Renderer {

    @Autowired
    private Reader reader;
    @Autowired
    private Parser parser;

    /*@Autowired
    public Renderer(Reader rd, Parser ps) {
        reader = rd;
        parser = ps;
    }*/

    public String Render(String viewname) {
        //Reader reader = new Reader();
        //Parser parser = new Parser();

        String tmpl = reader.Read(viewname);
        String html = parser.Parse(tmpl);

        return html;
    }
}