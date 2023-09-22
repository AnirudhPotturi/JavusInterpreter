package com.core.javus;

import java.io.*;
import java.nio.file.Path;


public class Main {

    static JavusCore core = new JavusCore();

    public static void main(String[] args) throws IOException {

        if (args.length > 1)
        {
            System.out.println("Usage: Javus [Script]");
            System.exit(64);
        }
        else if (args.length == 1)
        {
            Path path = Path.of(args[0]);
            core.runFile(path);
        }
        else
        {
            core.runPrompt();
        }
    }
}
