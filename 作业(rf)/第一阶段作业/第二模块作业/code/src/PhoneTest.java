/*测试类：使用多态格式分别调用上述方法，方法体中打印一句话进行功能模拟*/
public class PhoneTest {
    public static void main(String[] args) {
        // 1.声明一个手机卡,并显示手机卡的所有信息
        PhoneCard p1=new PhoneCard("BIG",1001,"RF",123456,300.0,89.97,3654.23);
        p1.show();
        System.out.println("-------------------------------");
        // 2.声明AbstractPlan类型的引用指向通话套餐子类的对象，形成了多态
        AbstractPlan talk1= new Talk(250.9,22,38.24);
        talk1.show();
        AbstractPlan talk2=new Talk();
        talk2.show();

        System.out.println("-------------------------------");

        // 2.声明AbstractPlan类型的引用指向上网套餐子类的对象，形成了多态
        AbstractPlan web1= new Web(2329.39,2.59);
        web1.show();
        AbstractPlan web2=new Web();
        web2.show();

        System.out.println("-------------------------------");

        // 3.接口类型的引用指向实现类型的对象
        TalkService talkService1=new Talk();
        talkService1.talkShow(234.34,p1);
        WebService webService1=new Web();
        webService1.webShow(2349.98,p1);

        System.out.println("-------------------------------");
        // 4.使用匿名内部类的语法格式来得到接口类型的引用
        TalkService talkService2=new TalkService() {
            @Override
            public void talkShow(double talkTime, PhoneCard phoneCard) {
                System.out.println("使用匿名内部类的语法格式实现通话套餐类对通话接口类的显示方法重写");
                System.out.println("用户"+phoneCard.getName()+"的上网流量: "+talkTime);
            }
        };
        talkService2.talkShow(123.45,p1);

        WebService webService2= new WebService() {
            @Override
            public void webShow(double webTime, PhoneCard phoneCard) {
                System.out.println("使用匿名内部类的语法格式实现上网套餐类对上网接口类的显示方法重写");
                System.out.println("用户"+phoneCard.getName()+"的上网流量: "+webTime);
            }
        } ;
        webService2.webShow(2123.45,p1);

        System.out.println("-------------------------------");
        TalkService talkService3= (double talkTime,PhoneCard phoneCard) -> {
            System.out.println("lamda表达式实现通话套餐类对通话接口类的显示方法重写");
            System.out.println("用户"+phoneCard.getName()+"的上网流量: "+talkTime);};
        talkService3.talkShow(345.45,p1);
        WebService webService3=(double webTime,PhoneCard phoneCard) ->{
            System.out.println("lamda表达式实现上网套餐类对上网接口类的显示方法重写");
            System.out.println("用户"+phoneCard.getName()+"的上网流量: "+webTime);};
        webService3.webShow(3248.354,p1);
        }

    }

