package laddergame;

public class GameMain {
    public static void main(String[] args){
        System.out.println("참여할 사람은 몇 명 인가요?");
        String[] people = LadderMaker.inputPeople();
        System.out.println("최대 사다리 높이는 몇 개인가요?");
        int high = LadderMaker.inputNum();

        Ladder ladder = new Ladder(LadderMaker.printPeopleLength(people),high);
        LadderMaker.printLadder(ladder.getLadder());
    }
}
