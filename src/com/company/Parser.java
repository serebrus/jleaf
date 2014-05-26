package com.company;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by java on 26.05.14.
 */

@Component
public class Parser {

    @Autowired
    private X x;

    public String Parse(String tmpl) {
        return tmpl.replace("${x}", "Hello");
    }
}
