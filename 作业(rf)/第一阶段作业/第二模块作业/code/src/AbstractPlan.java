
/* 实体类的优化
* 将通话套餐类和上网套餐类中相同的特征和行为提取出来组成抽象套餐类。
* */
public abstract class AbstractPlan {

    //抽象类特征
    private  double time;  //套餐时长
    private  double money; //每月资费

    //抽象类行为：显示套餐信息
    public abstract void show();


}
