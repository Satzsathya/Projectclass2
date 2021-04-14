package org.sample;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Testngrerun {
	
	
	@Test
	private void sample0() {
		System.out.println("example1");
	}
	
	@Test
	private void sample10() {
		System.out.println("example2");
	}
	
	@Test
	private void sample20() {
		System.out.println("example3");
		Assert.assertTrue(true);
	}
	
	@Test
	private void sample30() {
		System.out.println("example4");
	}
	
	@Test
	private void sample40() {
		System.out.println("example5");
	}
	
	
}
