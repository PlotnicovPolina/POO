package com;
import java.lang.String;

public class Main {

    public static void main(String[] args) {
        String str = "А я– маленькая мерзость, а я– маленькая гнусь! Я поганками объелась, и напакостить стремлюсь! Я людей пугаю ночью, обожаю крик и брань, а я маленькая сволочь, а я маленькая дрянь.";
        String str1 = "Там на неведомых дорожках скелеты бродят в босоножках.";
        String str2 = "Living easy, living free Season ticket on a one-way ride Asking nothing, leave me be Taking everything in my stride Don't need reason, don't need rhyme Ain't nothing I would rather do Going down, party time My friends are gonna be there too, yeah I'm on the highway to hell On the highway to hell Highway to hell I'm on the highway to hell";
        String str3 = "We are the champions!";
        System.out.println();
        System.out.println("First string:");
        System.out.println("А я– маленькая мерзость, а я– маленькая гнусь!\n" +
                " Я поганками объелась, и напакостить стремлюсь!\n" +
                " Я людей пугаю ночью, обожаю крик и брань,\n" +
                "а я маленькая сволочь, а я маленькая дрянь.");
        System.out.println();
        System.out.println("Second string:");
        System.out.println(str1);
        System.out.println();
        System.out.println("Third string:");
        System.out.println("Living easy, living free\n" +
                "Season ticket on a one-way ride\n" +
                "Asking nothing, leave me be\n" +
                "Taking everything in my stride\n" +
                "Don't need reason, don't need rhyme\n" +
                "Ain't nothing I would rather do\n" +
                "Going down, party time\n" +
                "My friends are gonna be there too, yeah\n" +
                "I'm on the highway to hell\n" +
                "On the highway to hell\n" +
                "Highway to hell\n" +
                "I'm on the highway to hell");
        System.out.println();
        System.out.println("Fourth string:");
        System.out.println(str3);
        System.out.println();
        System.out.println("First string:");
        Text text = new Text(str);
        text.TextCalculations();
        System.out.println();
        System.out.println("Second string:");
        Text text1 = new Text(str1);
        text1.TextCalculations();
        System.out.println();
        System.out.println("Third string:");
        Text text2 = new Text(str2);
        text2.TextCalculations();
        System.out.println();
        System.out.println("Fourth string:");
        Text text3 = new Text(str3);
        text3.TextCalculations();
    }
}
