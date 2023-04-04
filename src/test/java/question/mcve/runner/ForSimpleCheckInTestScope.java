package question.mcve.runner;

import question.mcve.aspects.unit.ForMethod;

public class ForSimpleCheckInTestScope {
    @ForMethod(value = "Text from annotation in TEST")
    public void methodChecking() {
        System.out.println("Text from method in TEST");
    }
}
