import java.util.*;
public class DiamondTest
{
	public static void main(String[] args)
	{
		// Java7以后构造器的泛型内容指定可以省略
		List<String> books = new ArrayList<>();
		books.add("操作系统");
		books.add("数据结构");
		// Java自动推断出HashMap的<>里应该是String , List<String>
		Map<String , List<String>> schoolsInfo = new HashMap<>();
		// Java自动推断出ArrayList的<>里应该是String
		List<String> schools = new ArrayList<>();
		schools.add("大连东软信息学院");
		schools.add("东北财经大学");
		schoolsInfo.put("大连市" , schools);
/*		
		schoolsInfo = HashMap
			Set key <= schoolsInfo.keySet();
			for(String k:key){
				key <= k
				value <= schoolsInfo.get(k)
			}
			
			1. "大连市" -> "大连东软信息学院"
						"东北财经大学"
			2. ...			
			3. ...
						*
						*/
			
		//取出Key的集合!
		Set<String> city = schoolsInfo.keySet();
/*		Set keySet(){
			return HashSet();
		}*/
		//使用迭代器遍历key集合
		Iterator it = city.iterator();
		while(it.hasNext()){
			String tempCity = (String) it.next();
			System.out.print(tempCity + "->");
			//使用foreach循环遍历key对应的value集合
			for(String tempStr : schoolsInfo.get(tempCity)){
				System.out.print(tempStr + " ");
			}
		}
	}
}
