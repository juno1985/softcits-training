
public class GenericParamUpperBound <T extends Object>{
	T col;
	public static void main(String[] args){
		GenericParamUpperBound gp = 
				new GenericParamUpperBound<String>();
	}
}
