package ganjidemo;

import java.util.ArrayList;
import java.util.List;

public class dataStore {

	//存储招聘数据
	public static List<jobModel> jobList = new ArrayList<>();
	//存储二手自行车数据
	public static List<bycleModel> bycleList = new ArrayList<>();
	
	//静态代码块
	static {
		jobModel j1 = new jobModel("理财规划师底薪3000",  8000, "大连鼎融宝投资管理有限公司");
		jobModel j2 = new jobModel("华南链家地产诚聘精英 底薪3000 ", 3000, "大连鼎融宝投资管理有限公司");
		jobModel j3 = new jobModel("瑞家地产招聘销售", 2000, "大连鼎融宝投资管理有限公司");
		jobModel j4 = new jobModel("底薪三千+五险一金高薪诚聘电话销售", 7000, "大连鼎融宝投资管理有限公司");
		jobModel j5 = new jobModel("Sharkman高薪诚聘销售精英 ", 5000, "大连鼎融宝投资管理有限公司");
		jobModel j6 = new jobModel("急招电话销售(女)女 ", 2000, "大连鼎融宝投资管理有限公司");
		jobModel j7 = new jobModel("大连交通国旅诚招旅游销售 代表 ", 6000, "大连鼎融宝投资管理有限公司");
		jobModel j8 = new jobModel("简约时尚男装诚聘男女导购4000五险 ", 10000, "大连鼎融宝投资管理有限公司");
		jobModel j9 = new jobModel("主管人好诚聘想挣钱电话销售待遇好",  20000, "大连鼎融宝投资管理有限公司");
		
		jobList.add(j1);
		jobList.add(j2);
		jobList.add(j3);
		jobList.add(j4);
		jobList.add(j5);
		jobList.add(j6);
		jobList.add(j7);
		jobList.add(j8);
		jobList.add(j9);
		
		bycleModel b1 = new bycleModel("绿源电动车", 1350, "地址：金州体育场16号门。可以分期付款");
		bycleModel b2 = new bycleModel("飞哥电动车", 130, "地址：金州体育场16号门。可以分期付款");
		bycleModel b3 = new bycleModel("永久电动车", 350, "地址：金州体育场16号门。可以分期付款");
		bycleModel b4 = new bycleModel("你好电动车", 350, "地址：金州体育场16号门。可以分期付款");
		bycleModel b5 = new bycleModel("小苗电动车", 1350, "地址：金州体育场16号门。可以分期付款");
		bycleModel b6 = new bycleModel("毛呢电动车", 1350, "地址：金州体育场16号门。可以分期付款");
		bycleModel b7 = new bycleModel("猫腻电动车", 1350, "地址：金州体育场16号门。可以分期付款");
		bycleModel b8 = new bycleModel("狗狗电动车", 1350, "地址：金州体育场16号门。可以分期付款");
		bycleModel b9 = new bycleModel("猪猪电动车", 1350, "地址：金州体育场16号门。可以分期付款");
		bycleModel b10 = new bycleModel("小马电动车", 1350, "地址：金州体育场16号门。可以分期付款");
		
		bycleList.add(b1);
		bycleList.add(b2);
		bycleList.add(b3);
		bycleList.add(b4);
		bycleList.add(b5);
		bycleList.add(b6);
		bycleList.add(b7);
		bycleList.add(b8);
		bycleList.add(b9);
		bycleList.add(b10);
		
		System.out.println("数据进行装载！");
	}
	
	public dataStore() {
		
	
		
	}
	
	
}
