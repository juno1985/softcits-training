package ganjidemo;

import java.util.ArrayList;
import java.util.List;

public class Pager<T> {

	//请求的第几页
	private Integer pageNum;
	//固定的每页显示数量
	private Integer itemNum;
	//存储返回的分页数据
	private List<T> datas;
	public Integer getPageNum() {
		return pageNum;
	}
	public void setPageNum(Integer pageNum) {
		this.pageNum = pageNum;
	}
	public Integer getItemNum() {
		return itemNum;
	}
	public void setItemNum(Integer itemNum) {
		this.itemNum = itemNum;
	}
	public List<T> getDatas() {
		return datas;
	}
	public void setDatas(List<T> datas) {
		this.datas = datas;
	}
	public Pager() {
		//设置每页显示3条数据
		this.itemNum = 3;
		datas = new ArrayList<>();
	}
	
	public void browsePage(Integer pageNum, List<T> plist){
		List<T> tempResult = new ArrayList<>();
		
	/*	if(pageNum == null) return;*/
		
		//每页显示三条数据
		Integer count = 1;
		for(int i = (pageNum -1)*3 ; count <= itemNum && i < plist.size(); i++){
			//得到相应的元素
			T bModel = (T) plist.get(i);
			//传递给中间结果集
		/*	tempResult.add(bModel);*/
			this.datas.add(bModel);
			count ++;
		}
		
		/*this.setDatas(tempResult);
		return this;*/
	}
}
