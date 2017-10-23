//: com.thinkinginjava.holding/UniqueWords.java

import com.thinkinginjava.net.mindview.util.TextFile;

import java.util.Set;
import java.util.TreeSet;

public class UniqueWords {
    public static void main(String[] args) {
        Set<String> words = new TreeSet<String>(
                new TextFile("SetOperations.java", "\\W+"));
        System.out.println(words);
    }
} /* Output:
[A, B, C, Collections, D, E, F, G, H, HashSet, I, J, K, L, M, N, Output, Print, Set, SetOperations, String, X, Y, Z, add, addAll, added, args, class, contains, containsAll, false, from, com.thinkinginjava.holding, import, in, java, main, mindview, com.thinkinginjava.net, new, print, public, remove, removeAll, removed, set1, set2, split, static, to, true, util, void]
*///:~
