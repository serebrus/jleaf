package com.company;

import org.springframework.stereotype.Component;

/**
 * Created by java on 26.05.14.
 */

@Component
public class Reader {
    public String Read(String viewname) {
        return "<h2>${x}</h2>";
    }
}
