package com.javacourse.se.lesson6;

public class Numbers {

    //Приметивный тип переменных

    static byte a = 11; // 2^8 = 256; -128 to 127
    static short b = 12313; // 2^16 = 65 538; -32 768 to 32 767
    static  int c = 2135523; // 2^32 = 4 294 967 296; - 2 147 483 648 to 2 147 483 647
    static  long d = 125523452313112L; // 2^64 = 18 446 744 073 709 551 616L; - 9 223 372 036 854 775 808L to 9 223 372 036 854 775 807L

    static  float e = 1.4123f; // 2^32 ~-1,4*10^45 to ~3,4*10^38
    static  double f = 234234.12352345f; // 2^64 ~-4,9*10^324 to ~1,8*10^308

    static  char g = '&'; // 2^16 = 65 538; 0 to 65537 Кодировка Unicode

    static  boolean h = true; // 8 bit в массивах и 32 bit не в массивах
}
