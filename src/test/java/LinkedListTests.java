import org.junit.jupiter.api.Test;

import java.util.LinkedList;

public class LinkedListTests {
    @Test
    void name() {

        // [100, 101, 102, 103, 104]
        final LinkedList<Integer> elements = new LinkedList<>() {{
            add(100);
            add(101);
            add(102);
            add(103);
            add(104);
        }};

        elements.add(105);
        elements.addLast(106);
        elements.addFirst(99);
        elements.add(1, 99);

        elements.get(1);
        elements.getFirst();
        elements.getLast();
        elements.indexOf(99);
        elements.lastIndexOf(99);

        elements.set(2, 101);

        elements.remove();
        elements.removeFirst();
        elements.removeLast();
        elements.remove(3);
        elements.removeFirstOccurrence(102);
    }
}
