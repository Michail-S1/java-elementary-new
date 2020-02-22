package java;

import org.w3c.dom.ls.LSOutput;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class email {
    String text = "youremail@email.com";
    Pattern pattern = Pattern.compile("^([a-zA-Z0-9_\\-\\.]+)@([a-zA-Z0-9_\\-\\.]+)\\.([a-zA-Z]{2,5})$");

    Matcher matcher = pattern.matcher(text);
        //while (matcher.) {
        int start=matcher.start();
        int end=matcher.end();

    }






