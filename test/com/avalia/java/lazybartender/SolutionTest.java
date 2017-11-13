package com.avalia.java.lazybartender;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class SolutionTest {
	private Solution s1;
	private Solution2 s2;

	@Before
	public void setUp() throws Exception {
		s1 = new Solution();
		s2 = new Solution2();
	}

	@After
	public void tearDown() throws Exception {
		s1 = null;
		s2 = null;
	}

	@Test
	public void testSolution() {
		int[][] T = { { 8,1, 2, 4, 5, 6, 8, 9, 10 }, {2, 2, 4 }, {2, 2, 5 }, {1, 3 }, { 3,5, 6, 10 }, { 2,1, 2 } };
		assertEquals(3, s1.solution(10, 6, T));
	}

}
