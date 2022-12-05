package Hooks;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks 
{
	@Before
	public void method1() {
		System.out.println("Launching the Browser");
	}
	@Before("@searchRestaurants")
	public void before() {
		System.out.println("First Feature File");
	}
	@Before("@RentalCars")
	public void before2() {
		System.out.println("Second Feature File");
	}
	@Before("@Review")
	public void before3() {
		System.out.println("Third Feature File");
	}
	@Before("@RoadTrip")
	public void before4() {
		System.out.println("Fourth Feature File");
	}
	@Before("@AddPlace")
	public void before5() 
	{
		System.out.println("Fifth Feature File");
	}
	@After
	public void method2() {
		System.out.println("Closing the Browser");
	}
}
