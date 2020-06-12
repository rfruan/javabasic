/*
* 手机卡类
* 特征：卡类型、卡号、用户名、密码、账户余额、通话时长(分钟)、上网流量
* 行为：显示（卡号 + 用户名 + 当前余额）
*/
public class PhoneCard {

    //特征，成员变量
    private String kind;  //卡类型
    private long number;//卡号
    private String name;//用户名
    private int password;//密码
    private double money;//账户余额
    private double min;//通话时长（分钟）
    private double flow;//上网流量

    //getter and setter

    public String getKind() {
        return kind;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }

    public int getPassword() {
        return password;
    }

    public void setPassword(int password) {
        this.password = password;
    }

    public double getMin() {
        return min;
    }

    public void setMin(double min) {
        this.min = min;
    }

    public double getFlow() {
        return flow;
    }

    public void setFlow(double flow) {
        this.flow = flow;
    }

    public long getNumber() {
        return number;
    }

    public void setNumber(long number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

   //有参构造方法
    public PhoneCard(String kind, long number, String name, int password, double money, double min, double flow) {
       setKind(kind);
       setName(name);
       setNumber(number);
       setPassword(password);
       setMin(min);
       setFlow(flow);
       setMoney(money);
    }
    //无参构造方法
    public PhoneCard(){};

    //行为
    public void show(){
        System.out.println("手机卡类的行为是显示（卡号 + 用户名 + 当前余额）");
        System.out.println("（卡号: "+getNumber()+" 用户名: "+getName()+ " 当前余额:"+getMoney()+" ）");
    }

}
