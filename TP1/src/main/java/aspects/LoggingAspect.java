package aspects;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class LoggingAspect {
    //Journaliser toutes les methodes
    @Pointcut("execution(* metier.IMetierBanqueImpl.*(..))")
    public  void pc1(){

    }
}
