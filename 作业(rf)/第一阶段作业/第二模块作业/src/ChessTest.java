    /*
     * 使用二维数组和循环实现五子棋盘绘制
     * 五子棋盘16行10列

     */
//导入数组工具包
    import java.util.Arrays;
public class ChessTest {

        //主方法
        public static void main(String[] args){

           //1. 声明一个棋盘对象并初始化棋盘
            Chess c= new Chess();
            c.inputChess();  //棋盘初始化
            c.show();   //初始化棋盘界面显示
            c.play();

        }
    }


