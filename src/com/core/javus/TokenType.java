package com.core.javus;

public enum TokenType {

    // Single-character tokens.
    LEFT_PARAN, RIGHT_PARAN, LEFT_BRACE,
    RIGHT_BRACE, COMMA, DOT, MINUS, PLUS,
    SEMICOLON, SLASH, STAR,


    // One or two character tokens.
    BANG, BANG_EQUAL,
    EQUAL, EQUAL_EQUAL,
    GREATER, GREATER_OR_EQUAL,
    LESS, LESS_OR_EQUAL,


    // Literals.
    IDENTIFIER, STRING, NUMBER, DECIMAL,


    // Keywords.
    AND, CLASS, ELSE, FALSE, FOR, IF, NULL, OR,
    PRINT, RETURN, SUPER, THIS, TRUE, VAR, WHILE, ELSEIF,


    EOF

}
