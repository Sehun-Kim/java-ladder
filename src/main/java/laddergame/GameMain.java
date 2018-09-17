package laddergame;

import java.util.ArrayList;
import java.util.Scanner;

public class GameMain {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("참여할 사람은 몇 명 인가요?");
        int n = sc.nextInt();
        System.out.println("최대 사다리 높이는 몇 개인가요?");
        int high = sc.nextInt();
        LadderGame ladderGame = new LadderGame(n,high);
        printLadder(ladderGame.run());

        sc.close();
    }

    public static void printLadder(ArrayList<ArrayList<String>> ladder){
        for(ArrayList<String> lines : ladder){
            for(String line : lines){
                System.out.print(line);
            }
            System.out.print("\n");
        }
    }
}
