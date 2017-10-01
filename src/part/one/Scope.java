package part.one;

public class Scope {

    {
        int x = 12;
        //only "x"
        {
            int q = 96;
            //only "q"
        }
        {
            String s = new String("test");
            //only "s"
        }
    }
}
