package aspects;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;

@Aspect
public class SecondAspect {
  @Pointcut("execution(* *.mai(..))")
    public  void pc1(){

  }
  /*
  @Before("pc1()")
  public  void  beforeMain(){
      System.out.println("********************************************");
      System.out.println("before main from AspectJ with class syntax");
      System.out.println("*********************************************");
  }
    @After("pc1()")
    public  void  AfterMain(){
        System.out.println("********************************************");
        System.out.println("After main from AspectJ with class syntax");
        System.out.println("*********************************************");
    }
*/
    @Around("pc1()")
    public  void  AroundMain(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        System.out.println("********************************************");
        System.out.println("before main from AspectJ with class syntax");
        System.out.println("*********************************************");

        proceedingJoinPoint.proceed();

        System.out.println("********************************************");
        System.out.println("After main from AspectJ with class syntax");
        System.out.println("*********************************************");

    }
}
