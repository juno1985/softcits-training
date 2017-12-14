public enum Gender implements GenderDesc
{

	//此处的枚举值必须调用对应构造器来创建
	MALE("男")
	//花括号部分实际上是一个类体部分
	{
		public void info()
		{
			System.out.println("这个枚举值代表男性");
		}
	},
	FEMALE("女")
	{
		public void info()
		{
			System.out.println("这个枚举值代表女性");
		}
	};

	private final String name;
	//枚举类的构造器只能使用private修饰
	private Gender(String name)
	{
		this.name = name;
	}
	public String getName()
	{
		return this.name;
	}
	//默认的info方法也可以存在
//	public void info()
//	{
//		System.out.println("这是一个用于用于定义性别Field的枚举类");
//	}	
	public static void main(String[] args) {
		Gender.MALE.info();
	}
}
