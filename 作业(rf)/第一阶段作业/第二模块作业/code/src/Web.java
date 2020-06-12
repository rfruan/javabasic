/*
* 上网套餐类
* 特征：上网流量、每月资费
* 行为：显示所有套餐信息
*/
public class Web extends AbstractPlan implements WebService{
    //成员变量，特征
    private double webFlow;//上网流量
    private double webMoney;//每月资费
    //getter and  setter
    public double getWebFlow() {
        return webFlow;
    }

    public void setWebFlow(double webFlow) {
        this.webFlow = webFlow;
    }

    public double getWebMoney() {
        return webMoney;
    }

    public void setWebMoney(double webMoney) {
        this.webMoney = webMoney;
    }
    //无参构造方法
    public Web() {
    }

    //有参构造方法

    public Web(double webFlow, double webMoney) {
        setWebFlow(webFlow);
        setWebMoney(webMoney);
    }

    //行为
   /* public void show(){
        System.out.println("上网流量: "+getWebFlow()+"  每月资费: "+getWebMoney());
    }*/
    @Override
    public void show() {
        System.out.println("上网套餐对抽象类的显示方法重写");
        System.out.println("上网套餐是（上网流量: "+getWebFlow()+"  每月资费: "+getWebMoney()+"）");
    }

    // 接口方法实例化
    @Override
    public void webShow(double webTime, PhoneCard phoneCard) {
        setWebFlow(webTime);
        System.out.println("上网套餐对上网接口类的显示方法重写");
        System.out.println("用户"+phoneCard.getName()+"的上网流量: "+getWebFlow());
    }


}
