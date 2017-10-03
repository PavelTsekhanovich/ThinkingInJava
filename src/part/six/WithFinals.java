package part.six;

import static part.five.Print.print;

public class WithFinals {
    // To же, что и просто private:
    private final void f() {
        print("WithFinals.f()");
    }

    // Также автоматически является final:
    private void g() {
        print("WithFinals.g()");
    }
}

class OverridingPrivate extends WithFinals {
    private final void f() {
        print("OverridingPrivate.f()");
    }

    private void g() {
        print("OverridingPrivate.g()");
    }
}

class OverridingPrivate2 extends OverridingPrivate {
    public final void f() {
        print("OverridingPrivate2.f()");
    }

    public void g() {
        print("OverridingPrivate2.g()");
    }
}

class FinalOverridingIllusion {
    public static void main(String[] args) {
        OverridingPrivate2 op2 = new OverridingPrivate2();
        op2.f();
        op2.g();
        // Можно провести восходящее преобразование:
        OverridingPrivate op = op2;
        // Но методы при этом вызвать невозможно:
        //! op.f();
        //! op.g();
        // И то же самое здесь:
        WithFinals wf = op2;
        //! wf.f();
        //! wf.g();
    }
}
