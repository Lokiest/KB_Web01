package exam.aop;

import org.aopalliance.intercept.Joinpoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.springframework.util.StopWatch;

//공통의 기능 : around방식 (사전, 사후)
//사전 : 현재 시간 구하기
//사후 : 현재 시간 구하기

public class TimerAdvice {
	
	public Object around(ProceedingJoinPoint point) throws Throwable {
		
		String methodName =  point.getSignature().getName();
		System.out.println("[LOG] : " + methodName + "before call");
		
		//사전
		Object params [] = point.getArgs();
		for(Object o : params) {
			System.out.print(o + "  ");
		}
		System.out.println();

		StopWatch sw = new StopWatch();
		sw.start();
		
		Object obj = point.proceed(); //실제 핵심 기능을 담당하는 메소드 call
		
		sw.stop();
			
		//사후
		System.out.println("[LOG] : " + methodName + "after call");
		System.out.println("[LOG] : " + obj + " : objs");
		System.out.println("[LOG] : " + sw.getTotalTimeMillis() + " : Times");
		
		return obj;
	}
}
