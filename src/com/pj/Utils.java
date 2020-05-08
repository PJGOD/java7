package com.pj;

//产生随机数0（砍）1（不砍）
public class Utils {
    private static int min =0;
    private static int max=2;
    public static int randomMonsterChop(){
        return (int)(Math.random()*(max-min)+min);
    }
}
