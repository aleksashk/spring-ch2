package org.lessons.ch6_aop.change_params_and_return_type.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.lessons.ch6_aop.simple_aspect.model.Comment;

import java.util.logging.Logger;

@Aspect
public class LoggingAspect {

    private Logger logger = Logger.getLogger(LoggingAspect.class.getName());

    @Around("execution(* org.lessons.ch6_aop.change_params_and_return_type.service.*.*(..))")
    public Object log(ProceedingJoinPoint joinPoint) throws Throwable {
        String methodName = joinPoint.getSignature().getName();
        Object[] argument = joinPoint.getArgs();

        Comment comment = new Comment();
        comment.setText("Hello after aspect");
        comment.setAuthor("Benjamin");
        Object[] newArgs = {comment};

        Object returnedByMethod = joinPoint.proceed(newArgs);

        logger.info("Method executed and returned " + returnedByMethod);

        return "FAILED";
    }

    public void setLogger(Logger logger) {
        this.logger = logger;
    }

}
