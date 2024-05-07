package extends1.access.child;

import extends1.access.parent.Parent;

public class Child extends Parent {

    public void call() {
        publicValue = 1;
        protectedValue = 1;
        // defaultValue = 1; // 다른 패키지에 접근 불가
        // privateValue = 1; // private 다른 클래스에 접근 불가.

        printParent();
    }
}
