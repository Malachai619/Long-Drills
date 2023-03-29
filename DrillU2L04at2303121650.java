package lrn.cc.drill.current;


import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.Scanner;

import org.junit.jupiter.api.Test;

class DrillU2L04at2303121650 {

	@Test
	void testU2L03int() {
		// https://resources.coderscampus.com/docs/drills/U2L04/ for more detailed instructions
        int let = 1;
        long expert = 0;
        long grass = 0;
        long doctor = 12345678901L;
        long copy = 55L;
        long ship = 1L;
        long minLong = -9223372036854775808L;
        long maxLong = 2147483647L;
		assertEquals(Integer.MIN_VALUE, Integer.MAX_VALUE + let); // this might not be obvious if you didn't pay attention to Trevor's video
		assertTrue(Long.class.isInstance(expert));
		assertTrue(Long.class.isInstance(grass));
		assertEquals(minLong, Long.MIN_VALUE);
		assertEquals(maxLong, Integer.MAX_VALUE);
		assertEquals(12_345_678_901L, doctor);
		assertEquals(54L, copy - ship);
	}

}
