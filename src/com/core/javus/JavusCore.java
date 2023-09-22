package com.core.javus;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class JavusCore {
    static boolean hadError = false;

    static void runFile(Path path) throws IOException
    {
        byte[] bytes = Files.readAllBytes(path);
        run(new String(bytes, Charset.defaultCharset()));
        if(hadError)
        {
            System.exit(65);
        }
    }

    static void runPrompt() throws IOException {
        InputStreamReader input = new InputStreamReader(System.in);
        BufferedReader reader = new BufferedReader(input);
        for (;;) {
            System.out.print("> ");
            String line = reader.readLine();
            if (line == null) break;
            run(line);
            hadError = false;
        }
    }

    private static void run(String source) {
        Scanner scanner = new Scanner(source);
        List<String> tokens = scanner.tokens().collect(Collectors.toList());
        // For now, just print the tokens.
        for (String token : tokens) {
            System.out.println(token);
        }
    }

    static void error(int line, String message)
    {
        report(line, "", message);
    }

    private static void report(int line, String where, String message)
    {
        System.err.println("Error at [line " + line + "] " + where + " : " + message);
        hadError = true;
    }
}
