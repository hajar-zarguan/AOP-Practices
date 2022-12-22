package org.example.aspect;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
//annotation interpretee au moment de lexecution
@Target(ElementType.METHOD)
//Lutilisqtion seulement pour les methodes

public @interface SecuredByAspect {
    String[] roles() ;
}
