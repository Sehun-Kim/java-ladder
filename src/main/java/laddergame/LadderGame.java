package laddergame;

import java.util.ArrayList;
import java.util.Random;

public class LadderGame {

    private static final int EXIST = 1;
    private static final int NONE = 0;

    private ArrayList<ArrayList<String>> ladder;
    private int length;
    private int high;

    public LadderGame(int n, int high){
        this.length = 2*n - 1; // 사다리의 사이의 라인 갯수를 추가해야함.
        this.high = high;
        this.ladder = new ArrayList<ArrayList<String>>();
        for(int i=0; i<this.high; i++){
            this.ladder.add(new ArrayList<String>());
        }
    }

    public ArrayList<ArrayList<String>> run(){
        ArrayList<ArrayList<String>> ladder = makeLadder(this.length, this.high);
        return ladder;
    }

    public static ArrayList<ArrayList<String>> makeLadder(int length, int high){
        ArrayList<ArrayList<String>> ladder = new ArrayList<ArrayList<String>>();
        for(int i=0; i<high; i++){
            ladder.add(makeLine(length));
        }
        return ladder;
    }

    public static ArrayList<String> makeLine(int length){
        ArrayList<String> line = new ArrayList<String>();
        for(int i=0; i<length; i++){
            line.add(checkLine(i));
        }
        return line;
    }

    public static int randNum(){
        return (Math.random() < 0.5) ? NONE : EXIST;
    }

    public static String randLine(int randNum){
        if(randNum == NONE){
            return " ";
        }
        return "-";
    }

    public static String checkLine(int i){
        if(i%2 == NONE){
            return "|";
        }
        return randLine(randNum());
    }
}
