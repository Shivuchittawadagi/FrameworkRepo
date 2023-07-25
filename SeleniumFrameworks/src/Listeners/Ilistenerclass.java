package Listeners;

import org.testng.ITestListener;
import org.testng.ITestResult;

public class Ilistenerclass implements ITestListener
{

	@Override
	public void onTestSuccess(ITestResult result) {
		System.out.println("test successful");
	}

	@Override
	public void onTestFailure(ITestResult result) {
		System.out.println("test failed");
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		System.out.println("test skipped");
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		System.out.println("success with percentage");
	}

}