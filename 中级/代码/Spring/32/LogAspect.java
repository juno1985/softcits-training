package proxy;

import org.aspectj.lang.JoinPoint;
import org.springframework.stereotype.Component;

@Component("logAspect")//让这个切面类被Spring所管理
public class LogAspect {
	
	public void logStart() {
		Logger.info("加入日志");
	}
	
	/**
	 * execution(* dao.*.add*(..))
	 * 第一个*表示任意返回值
	 * 第二个*表示 dao包中的所有类
	 * 第三个*表示以add开头的所有方法
	 * (..)表示任意参数
	 */
	/*@Before("execution(* dao.*.add*(..))||" +
			"execution(* dao.*.delete*(..))||" +
			"execution(* dao.*.update*(..))")
	public void logStart(JoinPoint jp) {
		//得到执行的对象
		System.out.println(jp.getTarget());
		//得到执行的方法
		System.out.println(jp.getSignature().getName());
		Logger.info("加入日志");
	}*/

	//通过JoinPoint可以得到执行的对象
	public void logEnd(JoinPoint jp) {
		//得到执行的对象
		System.out.println(jp.getTarget());
		//得到执行的方法
		System.out.println(jp.getSignature().getName());
		Logger.info("方法调用结束加入日志");
	}
	
	/**
	 * 函数调用中执行
	 * @param pjp
	 * @throws Throwable
	 */
	/*@Around("execution(* dao.*.add*(..))||" +
			"execution(* dao.*.delete*(..))||" +
			"execution(* dao.*.update*(..))")
	public void logAround(ProceedingJoinPoint pjp) throws Throwable {
		Logger.info("开始在Around中加入日志");
		pjp.proceed();//执行程序
		Logger.info("结束Around");
	}*/
	
}
