package serven.one.one;

import java.util.*;
public class ListTest
{
	public static void main(String[] args)
	{
		List tea = new ArrayList();
		// 向tea集合中添加三个元素
		tea.add(new String("人间茶事"));
		tea.add(new String("寻香百年"));
		tea.add(new String("碧螺原产洞庭边"));
		tea.add(new String("春来蜀中茶更早"));
		System.out.println(tea);
		// 将新字符串对象插入在第二个位置
		tea.add(1 , new String("观光茶园"));
		for (int i = 0 ; i < tea.size() ; i++ )
		{
			System.out.println(tea.get(i));
		}
		// 删除第三个元素
		tea.remove(1);
		System.out.println(tea);
		// 判断指定元素在List集合中位置
		System.out.println(tea.indexOf(new String("碧螺原产洞庭边"))); //①
		//将第二个元素替换成新的字符串对象
		tea.set(1, new String("千年留香"));
		System.out.println(tea);
	}
}