import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.LinkedList;

public class LinkedListTests {

    @Test
    void testList() {
        // Init
        final LinkedList<Integer> elements = new LinkedList<>() {{
            add(100);
            add(101);
            add(102);
            add(103);
            add(104);
        }};

        // Create
        // [100, 101, 102, 103, 104]
        elements.add(105); // [100, 101, 102, 103, 104, 105]
        Assertions.assertEquals(105, elements.getLast());
        elements.addLast(106); // [100, 101, 102, 103, 104, 105, 106]
        Assertions.assertEquals(106, elements.getLast());
        elements.addFirst(98); // [98, 100, 101, 102, 103, 104, 105, 106]
        Assertions.assertEquals(98, elements.getFirst());
        elements.add(1, 99); // [98, 99, 100, 101, 102, 103, 104, 105, 106]
        Assertions.assertEquals(99, elements.get(1));

        // Read
        // [98, 99, 100, 101, 102, 103, 104, 105, 106]
        Assertions.assertEquals(99, elements.get(1));
        Assertions.assertEquals(98, elements.getFirst());
        Assertions.assertEquals(106, elements.getLast());
        Assertions.assertEquals(1, elements.indexOf(99));
        elements.add(1, 98); // [98, 98, 99, 100, 101, 102, 103, 104, 105, 106]
        Assertions.assertEquals(1, elements.lastIndexOf(98));

        // Update
        // [98, 98, 99, 100, 101, 102, 103, 104, 105, 106]
        elements.set(0, 97); // [97, 98, 99, 100, 101, 102, 103, 104, 105, 106]
        Assertions.assertEquals(97, elements.get(0));

        // Delete
        // [97, 98, 99, 100, 101, 102, 103, 104, 105, 106]
        elements.remove(); // [98, 99, 100, 101, 102, 103, 104, 105, 106]
        Assertions.assertEquals(98, elements.getFirst());
        elements.removeFirst(); // [99, 100, 101, 102, 103, 104, 105, 106]
        Assertions.assertEquals(99, elements.getFirst());
        elements.removeLast(); // [99, 100, 101, 102, 103, 104, 105]
        Assertions.assertEquals(105, elements.getLast());
        elements.remove(3); // [99, 100, 101, 103, 104, 105]
        Assertions.assertEquals(103, elements.get(3));
        elements.removeFirstOccurrence(100);
        Assertions.assertEquals(101, elements.get(1));
    }

    @Test
    void testStack() {
    }

    @Test
    void testQueue() {
    }

    @Test
    void testDeque() {
    }
}
