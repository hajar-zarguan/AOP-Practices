package org.example.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.example.service.SecurityContext;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;

@Aspect
@Component
@EnableAspectJAutoProxy
public class AuthorizationAspect {
@Around(value = "@annotation(securedByAspect)", argNames = "pjp,securedByAspect")
    public Object secure(ProceedingJoinPoint pjp, SecuredByAspect securedByAspect) throws Throwable {
    String[] roles = securedByAspect.roles();
    boolean authorized = false;
    for (String r :roles){
        if(SecurityContext.hasRole(r)){
            authorized = true;
            break;
        }
    }
    if(authorized == true){
       Object result = pjp.proceed();
       return result;
    }
    throw new RuntimeException("Unauthorized=>430");


}

}
