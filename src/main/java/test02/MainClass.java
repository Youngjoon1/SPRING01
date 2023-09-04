package test02;

import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {

	public static void main(String[] args) {
		
		String path = "classpath:application_test02.xml";
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext(path);
		
		SaveClass sc = ctx.getBean("sc",SaveClass.class);
		
		System.out.println(sc.getNum1());
		System.out.println(sc.getOp());
		System.out.println(sc.getOc());
		
		
		
		sc.OperationClass();
		sc.printClass();
	}

}
