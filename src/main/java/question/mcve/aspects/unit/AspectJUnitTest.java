package question.mcve.aspects.unit;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;


@Slf4j
@Aspect
public class AspectJUnitTest {

    @Around("@annotation(forMethod) && execution(* *(..))")
    public Object maintainAnnotation(ProceedingJoinPoint joinPoint, ForMethod forMethod) throws Throwable {
        System.out.println(forMethod.value());

        return joinPoint.proceed();
    }
}
