package org.name;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class junit {
	@After
	public void dc1() {
System.out.println("@After");
	}
	@Before
	public void dc2() {
System.out.println("@Before");
	}
	@Test
	public void dc3() {
System.out.println("@Test1");
	}
	@Test
	public void dc4() {
System.out.println("@Test2");
	}
	@AfterClass
	public static void dc5() {
System.out.println("@AfterClass");
	}
	@BeforeClass
	public static void dc6() {
System.out.println("@BeforeClass");
	}

}
//bc//b/t1/a/b/t2/a/ac