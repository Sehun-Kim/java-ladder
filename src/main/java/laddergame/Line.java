package laddergame;

import java.util.ArrayList;

public class Line {
    static final int HORIZONTAL = 2; // 가로
    static final int VERTICAL = 1; // 세로
    static final int NONE = 0;

    private ArrayList<Integer> line;

    public Line(int length){
        this.line = makeLine(length, new ArrayList<Integer>());
    }

    public ArrayList<Integer> makeLine(int length, ArrayList<Integer> line){
        for(int i=0; i<length; i++){
            line.add(checkLine(i, line));
        }
        return line;
    }

    public ArrayList<Integer> getLine(){
        return this.line;
    }

    public static int randNum(){
        return (Math.random() < 0.5) ? NONE : VERTICAL;
    }

    public static int checkHorizon(int randNum, ArrayList<Integer> line){
        if(randNum == VERTICAL && !(line.contains(HORIZONTAL))){ // randNum이 1이고 이미 가로선을 가지고 있으면 가로를 채운다.
            return HORIZONTAL;
        }
        return NONE;
    }

    public static int checkLine(int i, ArrayList<Integer> line){
        if(i%2 == NONE){
            return VERTICAL;
        }
        return checkHorizon(randNum(), line);
    }

}
