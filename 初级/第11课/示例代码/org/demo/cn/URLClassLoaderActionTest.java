package org.demo.cn;

import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLClassLoader;

import org.urlclassloader.test.ActionInterface;

public class URLClassLoaderActionTest {
		public static void main(String[] args) throws MalformedURLException, ClassNotFoundException, InstantiationException, IllegalAccessException{
			// 创建一个URL数组
						URL[] urls = {
								new URL("file:///D:\\actiontest.jar") };
						// 以默认的ClassLoader作为父ClassLoader，创建URLClassLoader
						//生成自定义的类加载器
						URLClassLoader myClassLoader = new URLClassLoader(urls);
						//生成ActionTest类对象
						Class myClass = myClassLoader.loadClass("org.urlclassloader.test.ActionTest");
						//通过ActionTest的类对象生成自己的实例对象
						ActionInterface ai = (ActionInterface) myClass.newInstance();
						//通过实例对象调用实例方法sayHello
						System.out.println(ai.sayHello());
		}
}
