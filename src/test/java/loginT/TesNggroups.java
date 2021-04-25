package loginT;

import org.junit.Assert;
import org.testng.annotations.Test;

public class TesNggroups {
@Test(groups="smoke")
public void method1() {
	System.out.println("smoke");

}
@Test(groups="smoke")
public void method2() {
	System.out.println("smoke");
	Assert.assertTrue(false);

}
@Test(groups="sanity", dependsOnGroups="smoke")
public void method3() {
	System.out.println("sanity");


}
@Test(groups="smoke")
public void method4() {
	System.out.println("smoke");

}
@Test(groups="reg")
public void method5() {
	System.out.println("reg");

}
}
