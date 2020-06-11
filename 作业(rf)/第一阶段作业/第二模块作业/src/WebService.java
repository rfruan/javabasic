/*（2）上网服务接口
*　抽象方法: 参数 1: 上网流量,参数 2: 手机卡类对象
*  让上网套餐类实现上网服务接口。
* */
public interface WebService {
    //抽象类方法
    public abstract void webShow(double webTime,PhoneCard phoneCard);
}
