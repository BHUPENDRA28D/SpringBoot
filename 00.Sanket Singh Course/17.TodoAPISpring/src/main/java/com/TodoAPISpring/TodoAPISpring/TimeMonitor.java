package com.TodoAPISpring.TodoAPISpring;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.METHOD)  //this whould be applied on the methods.
@Retention(RetentionPolicy.RUNTIME) //RetentionPolicy - RUNTIME -SOURCE -CLASS.




public @interface TimeMonitor {
    /*Automatical tell the time required to execution of the methode.*/
}
