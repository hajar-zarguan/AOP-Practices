package aspects;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Logger;

@Aspect
public class LoggingAspect {
    //Journaliser toutes les methodes
    //spring aop ne supporte pas call
    long t1 ,t2;
    Logger logger = Logger.getLogger(LoggingAspect.class.getName());
    public LoggingAspect() throws IOException {
        logger.addHandler(new FileHandler("log.xml"));
        logger.setUseParentHandlers(false);
    }

    @Pointcut("execution(* metier.IMetierBanqueImpl.*(..))")
    public  void pc1(){ }

    @Before("pc1()")
    public  void  avant(JoinPoint joinPoint){
        t1 = System.currentTimeMillis();
        logger.info("Avant l'execution de la methode"+joinPoint.getSignature());
    }

    @After("pc1()")
    public  void apres(JoinPoint joinPoint){
        t2= System.currentTimeMillis();
        logger.info("Apres l'execution de la methode"+joinPoint.getSignature());
        logger.info("Durée de l'execution de la méthode est "+(t2-t1));
    }

}
