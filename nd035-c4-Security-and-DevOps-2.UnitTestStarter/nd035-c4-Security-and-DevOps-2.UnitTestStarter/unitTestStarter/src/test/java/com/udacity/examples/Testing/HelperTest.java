package com.udacity.examples.Testing;

import junit.framework.TestCase;
import org.junit.*;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class HelperTest {
@Test
    public void test()
    {
  assertEquals(4,4);
    }
    @Test
    public void verify_getCount()
    {
        List<String> empNames = Arrays.asList("sareeta","udacity");
        final long actual = Helper.getCount(empNames);
        assertEquals(2, actual);
    }

    @Test
    public void verify_getStats()
    {
        List<Integer> yrsOfExperience = Arrays.asList(13,4,15,6,17,8,19,1,2,3);
        IntSummaryStatistics stats = Helper.getStats(yrsOfExperience);
        assertEquals(19, stats.getMax());
    }

    @Before
    public void init()
    {
 System.out.println("runs before each method");
    }

    @BeforeClass
    public static  void setup()
    {
        System.out.println("runs before each class");
    }

    @After
    public void init1()
    {
        System.out.println("runs after each method");
    }

    @AfterClass
    public static  void setup1()
    {
        System.out.println("runs after each class");
    }
}
