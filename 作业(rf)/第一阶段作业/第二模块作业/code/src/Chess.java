import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.Scanner;

/*
* 2. 编程实现控制台版并支持两人对战的五子棋游戏。
*（1）绘制棋盘 - 写一个成员方法实现
*（2）提示黑方和白方分别下棋并重新绘制棋盘 - 写一个成员方法实现。
*（3）每当一方下棋后判断是否获胜 - 写一个成员方法实现。
*（4）提示： 采用二维数组来模拟并描述棋盘
  */
public class Chess {

    //定义棋盘大小
    private static int BOARD_SIZE = 15;
    //定义二维数组充当棋盘
    private char[][] chessArr;
    //标志位，用于判别黑方白方，true为黑方 false 为白方
    private static boolean flag = true;
    // 判断输赢标志
    private  static  boolean winFlag =false;

    //1.初始化棋盘
    public void inputChess() {
        chessArr = new char[BOARD_SIZE][BOARD_SIZE]; //初始化棋盘大小
        //4. 赋值给其他行
        for (int i = 0; i < BOARD_SIZE; i++) {
            //其余行的首元素为i-1
            for (int j = 0; j < BOARD_SIZE; j++) {
                //赋值 其他列元素为+
                chessArr[i][j] = '+';
            }
        }
    }


    //2.显示棋盘方法
    public void show() {
        for (int i = 0; i < BOARD_SIZE; i++) {
            for (int j = 0; j < BOARD_SIZE; j++) {
                System.out.print(chessArr[i][j] + "     ");
            }
            System.out.println();
        }
    }


    //3. 下棋方法，提示黑方和白方分别下棋并重新绘制棋盘, 通过设置棋盘横纵坐标来确定下棋位置
    public void play() {
        //介绍游戏规则
        System.out.println("游戏规则：黑子先行，黑白双方轮流落子");
        System.out.println("首先在横、竖、斜方向上成五（连续五个己方棋子）者为胜。");
        System.out.println("双方选手输入棋盘坐标进行下棋，如: 8,4  表示在第8行第4列下棋");
        System.out.println("游戏开始！！！");
        Scanner sc = new Scanner(System.in);
        char x = ' '; //x储存x坐标点位置
        char y = ' '; //y储存y坐标点位置
        //通过标志位判断哪一方下棋
     over:   while (true) {
            while (true == flag) {
                System.out.println("现在轮到黑方选手下棋");
                x = (char) (sc.nextInt() - 1); //x储存x坐标点位置
                y = (char) (sc.nextInt() - 1); //y储存y坐标点位置
                //判断所下位置是否有棋子
                if (chessArr[x][y] == '+') {
                    chessArr[x][y] = '●';
                    //显示下棋后的棋盘
                    if (win('●')==true ) {
                        System.out.println("恭喜黑方获胜");
                        break over;
                    }
                    flag = !flag;
                } else {
                        System.out.println("此处已有棋子，请选择其他位置下棋");
                    }

                }

                while (false == flag) {
                    System.out.println("现在轮到白方选手下棋");
                    x = (char) (sc.nextInt() - 1); //x储存x坐标点位置
                    y = (char) (sc.nextInt() - 1); //y储存y坐标点位置
                    //判断所下位置是否有棋子
                    if (chessArr[x][y] == '+') {
                        chessArr[x][y] = '○';
                        //显示下棋子后的棋盘并判断输赢
                        //显示下棋后的棋盘
                        if (win('○')==true ) {
                            System.out.println("恭喜白方获胜");
                            break over;
                        }
                        //若赢了则重置标志位，未赢则将标志位取反
                        flag = !flag;
                    } else {
                        System.out.println("此处已有棋子，请选择其他位置下棋");
                    }
                }
            }
        System.out.println("是否重新开始五子棋游戏?");
        String str= sc.next();
        if (str.equals("YES")){
            inputChess();
            play();
        }else {
            System.out.println("退出游戏");
        }
        }


        //4. 每当一方下棋后判断是否获胜 - 写一个成员方法实现。
        public boolean win ( char c) {
            //显示下棋的棋盘结果
            show();

            //获胜原则：在横、竖、斜方向上成五（连续五个己方棋子）者为胜。
            //计数器
            int rowNum = 1;
            //计数器
            int columnNum =1;
            //计数器
            int leftNum=1;
            //计数器
            int rightNum=1;
            tip:  for (int i = 1; i < BOARD_SIZE; i++) {
                for (int j = 1; j < BOARD_SIZE ; j++) {

                    //当找到相邻元素相同且不为‘+’时，开始计数
                    //在横方向上成五（连续五个己方棋子）者为胜。
                    if (chessArr[i - 1][j] == c && chessArr[i - 1][j] == chessArr[i - 1][j - 1]) {
                        rowNum++;
                    } else {
                        rowNum = 1;
                    }

                    //在竖方向上成五（连续五个己方棋子）者为胜
                    if (chessArr[i][j - 1] == c && chessArr[i][j - 1] == chessArr[i - 1][j - 1]) {
                        columnNum++;
                    }

                    //在左斜方向上成五（连续五个己方棋子）者为胜。
                    if (chessArr[i][j] == c && chessArr[i][j] == chessArr[i - 1][j - 1]) {
                        leftNum++;
                    }

                    //在右斜方向上成五（连续五个己方棋子）者为胜。
                    if (chessArr[BOARD_SIZE - 1 - i][j] == c && chessArr[BOARD_SIZE - i - 1][j] == chessArr[BOARD_SIZE - i][j - 1]) {
                        rightNum++;
                    }

                    if (rowNum >= 5 || columnNum >= 5 || leftNum >= 5 || rightNum >= 5) {
                        winFlag = true;
                        break tip;
                    }
                }
            }
           return  winFlag;
        }
}
