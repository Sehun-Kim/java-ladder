package laddergame;

import java.util.ArrayList;

public class Ladder {

    private ArrayList<Line> ladder;

    public Ladder(int n, int height){
        this.ladder = makeLadder(2*n-1, height);
    }

    public ArrayList<Line> makeLadder(int length, int height){
        ArrayList<Line> ladder = new ArrayList<Line>();
        for(int i=0; i<height; i++){
            ladder.add(new Line(length));
        }
        return ladder;
    }

    public ArrayList<Line> getLadder(){
        return this.ladder;
    }
}
