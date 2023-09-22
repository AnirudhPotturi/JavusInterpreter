package com.core.javus;

import java.util.ArrayList;
import java.util.List;

import static com.core.javus.TokenType.EOF;

public class Scanner {
    private final String source;
    private int line = 1;
    private int start = 0;
    private int current = 0;

    private final List<Token> tokens = new ArrayList<>();

    Scanner(String source)
    {
        this.source = source;
    }

    List<Token> scanTokens()
    {
        while(!isAtEnd())
        {
            start = current;
            scanToken();
        }

        tokens.add(new Token(EOF, "", null, line));
        return tokens;
    }

    private boolean isAtEnd()
    {
        return current >= source.length();
    }

    private void scanToken()
    {
       /* char c = advance();
        switch(c)
        {
            case '(': addToken()
        }*/
    }

}
