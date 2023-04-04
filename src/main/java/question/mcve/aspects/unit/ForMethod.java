package question.mcve.aspects.unit;



import java.lang.annotation.*;


@Inherited
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface ForMethod {
    String value();
}
