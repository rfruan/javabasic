// 手机卡的类型总共有 3 种：大卡、小卡、微型卡
public enum  Card {

    // 2.声明本类类型的引用指向本类类型的对象:大卡、小卡、微型卡
    BIG("大卡"),SMALL("小卡"),MICRO("微型卡");

    private final String cardKind;// 用于描述手机卡类型的成员变量
    // 1.私有化构造方法，实现成员变量的初始化
    private Card(String cardKind) {
        this.cardKind = cardKind;
    }
    // 通过公有的get方法可以在本类的外部访问该类成员变量的数值
    public String getCardKind() {
        return cardKind;
    }
}
