import support.cse131.ArgsProcessor;

import java.util.Random;

import static java.lang.Integer.MAX_VALUE;

/**
 * @author ZDH
 * @version 1.0
 * @date 2020/11/7 19:37
 * Start your work by creating a Nim class in the assignment2 package.
 * Use ArgsProcessor to prompt for inputs.
 * Your program must continue play until somebody (computer or human) wins.
 * Your output should resemble the sample output shown above. It should clearly show if the computer or the human wins.
 * When it’s time to demo be prepared to discuss how you would implement a “smarter” strategy for the computer player.
 *
 *
 * Round 0: 7 at start human takes 2, so 5 remain
 * Round 1: 5 at start computer takes 2, so 3 remain
 * Round 2: 3 at start human takes 2, so 1 remain
 * Round 3: 1 at start computer takes 1, so 0 remain
 * The computer wins / you lose!
 *
 *  The goal of the game is to be the player who removes the last stick.
 */
public class Nim {

    public static void main(String[] args) {

        ArgsProcessor ap = new ArgsProcessor(args);

        //我现在需要你告诉我，我一共有几根木棒
        int sticks = ap.nextInt();

        int Round = 0;//计算机和我交互拿木棒
//        for(int i = 0;i<MAX_VALUE;i++) {
        while(sticks > 0) {

//            if(sticks == 0){
//                System.out.println("游戏结束");
//                break;
//            }

            if (Round % 2 == 0) {//奇数小明来拿

                int mystick = ap.nextInt();//我来拿，但是一次只能拿一根或者两根

                while (mystick != 1 && mystick != 2) {
                    System.out.println("请重新输入");
                    mystick = ap.nextInt();
                }

                int remain = sticks - mystick;
                if (remain > 0) {
                    String output = "Round" + Round + ":" + sticks + "at start human takes" + mystick + ", so" + remain + "remain";
                    System.out.println(output);
                } else {
                    String output = "you win/the computer lose";
                    System.out.println(output);
                }
                sticks = remain;
                Round++;

            } else {//计算机来拿
                int computerstick = (int) (Math.random() * 1) + 1;
                int remain = sticks - computerstick;
                if (remain > 0) {
                    String output = "Round" + Round + ":" + sticks + "at start computer takes" + computerstick + ", so" + remain + "remain";
                    System.out.println(output);
                } else {
                    String output = "The computer wins / you lose!";
                    System.out.println(output);
                }
                sticks = remain;
                Round++;
            }
        }
//        }
        System.out.println("游戏结束");

    }

}
