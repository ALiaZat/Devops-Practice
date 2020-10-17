package edu.ppu.ser;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class main {

    public static void main(String[] args) throws IOException {
        FileWriter w = new FileWriter(new File("pseutest"));
        w.write("Hello World intisar alia");
        w.close();
    }
}
