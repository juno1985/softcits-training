package postProcessBean;
//实现该接口的类可以在进行注入前进行检查是否配置正确
public interface InstanceValidator {
	void validateInstance();
}
