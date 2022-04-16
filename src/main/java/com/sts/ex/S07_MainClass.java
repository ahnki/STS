package com.sts.ex;

import org.springframework.context.support.GenericXmlApplicationContext;

public class S07_MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext(); //생성
		
		ctx.load("classpath:s07_applicationCTX.xml"); //설정
		
		ctx.refresh();
		
		System.out.println("S07_MainClass.java");
		System.out.println("===========================");
		
		S07_Student student = ctx.getBean("student", S07_Student.class); //사용
		System.out.println("이름 : " + student.getName());
		System.out.println("나이 : " + student.getAge());
		System.out.println();
		
		S07_Student student2 = ctx.getBean("student", S07_Student.class);
		student2.setName("홍길동");
		student2.setAge(20);
		
		System.out.println("이름 : " + student.getName());
		System.out.println("나이 : " + student.getAge());
		System.out.println();
		
		
		S07_OtherStudent student1 = ctx.getBean("otherStudent", S07_OtherStudent.class); //사용
		System.out.println("이름 : " + student1.getName());
		System.out.println("나이 : " + student1.getAge());
		
		System.out.println("===========================");
		
		if(student.equals(student2)) {
			System.out.println("student == student2");
		} else {
			System.out.println("student != student2");
		}
		
		System.out.println("===========================");
		ctx.close(); //종료
	}

}
