package question.mcve.unit.aspect;

import org.junit.jupiter.api.Test;
import question.mcve.aspects.unit.ForMethod;

public class BasicTests {

    @ForMethod("from annotation")
    @Test
    void attempt1() {
        System.out.println("from method");
    }
}
