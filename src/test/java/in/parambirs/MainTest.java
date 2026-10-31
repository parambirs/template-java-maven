package in.parambirs;

import static org.junit.jupiter.api.Assertions.*;

import org.apache.commons.lang3.tuple.Pair;
import org.junit.jupiter.api.Test;

class MainTest {

    @Test
    void testPair() {
        var pair = Pair.of(123, "One Hundred and Twenty Three");
        assertEquals(123, pair.getLeft());
    }
}
