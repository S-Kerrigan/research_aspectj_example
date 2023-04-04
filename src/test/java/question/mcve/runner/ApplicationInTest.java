package question.mcve.runner;

import question.mcve.ForSimpleCheckInMainScope;

public class ApplicationInTest {

    public static void main(String[] args) {
        ForSimpleCheckInMainScope forSimpleCheckInMainScope = new ForSimpleCheckInMainScope();
        forSimpleCheckInMainScope.methodChecking();

        ForSimpleCheckInTestScope forSimpleCheckInTestScope = new ForSimpleCheckInTestScope();
        forSimpleCheckInTestScope.methodChecking();
    }

}
