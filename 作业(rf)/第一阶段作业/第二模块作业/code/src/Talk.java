
/*
* 通话套餐类
* 特征：通话时长、短信条数、每月资费
* 行为: 显示所有套餐信息
* 让通话套餐类实现通话服务接口。
*/
public class Talk extends AbstractPlan implements TalkService {
    //成员变量，特征
    private double talkTime;//通话时长
    private int textNum;// 短信条数
    private double talkMoney;// 每月资费

    //getter and setter
    public double getTalkTime() {
        return talkTime;
    }

    public void setTalkTime(double talkTime) {
        this.talkTime = talkTime;
    }

    public int getTextNum() {
        return textNum;
    }

    public void setTextNum(int textNum) {
        this.textNum = textNum;
    }

    public double getTalkMoney() {
        return talkMoney;
    }

    public void setTalkMoney(double talkMoney) {
        this.talkMoney = talkMoney;
    }

    //有参构造方法
    public Talk(double talkTime, int textNum, double talkMoney) {
        setTalkMoney(talkMoney);
        setTalkTime(talkTime);
        setTextNum(textNum);
    }
    //无参构造方法
    public Talk() {
    }

    //行为: 显示所有套餐信息
    /*public void  show(){
        System.out.println("通话时长: "+getTalkTime()+" 短信条数: "+getTextNum()+ " 每月资费:"+getTalkMoney());
    }*/
    @Override
    public void show() {
        System.out.println("通话套餐类对抽象类的显示方法重写");
        System.out.println("通话套餐是（通话时长: "+getTalkTime()+" 短信条数: "+getTextNum()+ " 每月资费:"+getTalkMoney()+"）");
    }

    // 接口方法实例化
    @Override
    public void talkShow(double talkTime, PhoneCard phoneCard) {
        setTalkTime(talkTime);
        System.out.println("通话套餐类对通话接口类的显示方法重写");
        System.out.println("用户"+phoneCard.getName()+"的上网流量: "+getTalkTime());


    }


}
