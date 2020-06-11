import java.util.Scanner;

/* 作业1：
 *定义一个长度为[16][16]的整型二维数组并输入所有位置的元素值，
 *分别实现二维数组中所有行和所有列中所有元素的累加和并打印。
 *再分别实现二维数组中左上角到右下角和右上角到左下角所有元素的累加和并打印
 * */
public class ArraySum {

    //定义数组大小
    private static int ARR_SIZE=16;
    //1.定义一个长度为[16][16]的整型二维数组并输入所有位置的元素值，
    private  int[][] arr;

    //2. 数组元素初始化
    public void inputArr(){
        //初始化数组
        arr= new int[ARR_SIZE][ARR_SIZE];
        System.out.println("请输入数组元素");
        Scanner sc = new Scanner(System.in);
        for (int i=0;i<ARR_SIZE;i++) {
            for(int j=0;j<ARR_SIZE;j++){
                System.out.print("arr["+i+"]["+j+"]=");
                arr[i][j]=sc.nextInt();
                System.out.println();
            }
        }
    }
    //3. 所有数组元素的累加和打印
    public  void  sumShow(){
        int sum=0;
        for (int i=0;i<ARR_SIZE;i++){
            for (int j=0;j<ARR_SIZE;j++){
                System.out.print(" "+arr[i][j]);
                sum+=arr[i][j];}
            System.out.println();
        }
        System.out.println("二维数组所有元素之和为"+sum);
    }

    //4. 实现二维数组中所有行中所有元素的累加和并打印。
    public  void rowSumShow(){
        for (int i=0;i<ARR_SIZE;i++){
            int rowSum=0;
            for (int j=0;j<ARR_SIZE;j++){
                rowSum+=arr[i][j];}
            System.out.println("二维数组第"+i+"行之和为"+rowSum);
        }

    }

    //5. 实现二维数组中所有列中所有元素的累加和并打印。
    public  void columnSumShow(){
        for(int j=0;j<ARR_SIZE;j++){
            int columnSum=0;
        for (int i=0;i<ARR_SIZE;i++){
            columnSum+=arr[i][j];
        }
            System.out.println("二维数组第"+j+"列之和为"+columnSum);
    }}
    //6.实现二维数组中左上角到右下角所有元素的累加和并打印
    public  void leftToRightShow(){
            int leftToRightSum=0;
            for (int i=0;i<ARR_SIZE;i++){
                leftToRightSum+=arr[i][i];  //左对角线，规律是行下标与列下标一样
            }
        System.out.println("二维数组中左上角到右下角所有元素为"+leftToRightSum);
        }

    //7.实现二维数组中右上角到左下角所有元素的累加和并打印
    public  void rightToLeftShow(){
        int rightToLeftSum=0;
        for (int i=0;i<ARR_SIZE;i++){
            rightToLeftSum+=arr[ARR_SIZE-i-1][i];//左对角线，规律是行下标与列下标之和为16
        }
        System.out.println("实现二维数组中右上角到左下角所有元素之和为"+rightToLeftSum);
    }

}
