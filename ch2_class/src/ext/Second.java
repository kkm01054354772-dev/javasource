package ext;

import exam.Parent;

public class Second extends Parent {

    Parent parent = new Parent();

    public void print() {
        // super.name="성춘향"; // default (다른 패키지x)
        super.grade = "B"; // protected (다른 패키지라도 상속관계일 시 가능)

    }

}
