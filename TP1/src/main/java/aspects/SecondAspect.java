package aspects;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class SecondAspect {
  @Pointcut("execution(* *.main(..))")
    public  void pc1(){

  }
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

}
