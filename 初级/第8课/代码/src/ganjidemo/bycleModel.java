package ganjidemo;
/**
 * 
 * @author thinkpad
 * 二手自行车数据模型
 */
public class bycleModel {

	//品牌
	private String tradeMark;
	//价格
	private float price;
	//取货地址
	private String obtainAdd;
	public bycleModel(String tradeMark, float price, String obtainAdd) {
		super();
		this.tradeMark = tradeMark;
		this.price = price;
		this.obtainAdd = obtainAdd;
	}
	public bycleModel() {
		super();
	}
	public String getTradeMark() {
		return tradeMark;
	}
	public void setTradeMark(String tradeMark) {
		this.tradeMark = tradeMark;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public String getObtainAdd() {
		return obtainAdd;
	}
	public void setObtainAdd(String obtainAdd) {
		this.obtainAdd = obtainAdd;
	}
	@Override
	public String toString() {
		return "bycleModel [tradeMark=" + tradeMark + ", price=" + price + ", obtainAdd=" + obtainAdd + "]";
	}
	
}
