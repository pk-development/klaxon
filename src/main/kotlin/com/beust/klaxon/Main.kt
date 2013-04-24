package com.beust.klaxon

import java.io.InputStream
import java.io.FileInputStream
import java.io.File

fun main(args : Array<String>) {
    val name =
//            "/Users/cbeust/kotlin/klaxon/src/test/resources/c.json"
            "/d.json"
//            "/Users/cbeust/kotlin/klaxon/src/test/resources/b.json"
    val cls = javaClass<Parser2>()
    val inputStream = cls.getResourceAsStream(name)!!

    if (false) {
        val lexer = Lexer(inputStream)
        var token = lexer.nextToken()
        while (token.tokenType != Type.EOF) {
            println("Read : ${token}")
            token = lexer.nextToken()
        }
    } else {
        val jo = Parser2().parse(inputStream)
        println("Parsed ${jo}")
    }
}