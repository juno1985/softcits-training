package ganjidemo;

import java.util.ArrayList;
import java.util.List;

public class StartGanJi {

	public static void main(String[] args) {
		dataStore ds = new dataStore();
		dataStore ds1 = new dataStore();
		dataStore ds2 = new dataStore();
		/*Pager<bycleModel> pb = browseByclePage(2);
		System.out.println(pb.getDatas());*/
		
		Pager<bycleModel> pb = new Pager<>();
		pb.browsePage(2, dataStore.bycleList);
		System.out.println(pb.getDatas());
		
		System.out.println("-----------------------------");
		
		Pager<jobModel> jb = new Pager<>();
		jb.browsePage(1, dataStore.jobList);
		System.out.println(jb.getDatas());
		
		System.out.println("-----------------------------");
		
 		
	}
	
/*public static Pager browseByclePage(Integer pageNum){
		Pager<bycleModel> byclePager = new Pager<>();
		List<bycleModel> bycleResult = new ArrayList<>();
		
		//每页显示三条数据
		int count = 1;
		for(int i = (pageNum -1)*3 ; count <= byclePager.getItemNum(); i++){
			//得到相应的元素
			bycleModel bModel = dataStore.bycleList.get(i);
			//传递给中间结果集
			bycleResult.add(bModel);
			count ++;
		}
		
		byclePager.setDatas(bycleResult);
		return byclePager;
	}
*/
}
