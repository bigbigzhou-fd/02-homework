/**
 * @author ZDH
 * @version 1.0
 * @date 2020/11/7 20:36
 */
public class BreakContinue {

    public static void main(String[] args) {

//        0
//1
//2
//3
//4
//5
//6
//8
//9


//        for(int i = 0;i<10;i++){
//            if(i==7){
//                continue;//跳过本次执行，进入下一次判断
//            }
//            System.out.println(i);
//        }

        for(int i = 0;i<10;i++){
            if(i==7){
                break;//跳出本次执行，同时不进入下一次的判断了
            }
            System.out.println(i);
        }

    }
}
