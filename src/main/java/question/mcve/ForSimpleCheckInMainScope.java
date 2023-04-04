package question.mcve;

import question.mcve.aspects.unit.ForMethod;

public class ForSimpleCheckInMainScope {
    @ForMethod(value = "Text from annotation")
    public void methodChecking() {
        System.out.println("Text from method");
    }
}
