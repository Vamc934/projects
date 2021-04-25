package org.junit;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;

public class Details {
@Test
public void Detais() {
	Result runClasses = JUnitCore.runClasses(Login.class,Login2.class);
	int runCount = runClasses.getRunCount();
	System.out.println(runCount);
	long runTime = runClasses.getRunTime();
	System.out.println(runTime);
	int failures = runClasses.getFailureCount();
	System.out.println(failures);
}
}
