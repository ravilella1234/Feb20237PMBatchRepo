package testcases;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.testng.TestNG;
import org.testng.xml.XmlClass;
import org.testng.xml.XmlInclude;
import org.testng.xml.XmlSuite;
import org.testng.xml.XmlTest;

public class SimpleRunner 
{

	public static void main(String[] args) 
	{
		TestNG testng = new TestNG();
		
		XmlSuite mysuite = new XmlSuite();
		mysuite.setName("Bookingsuite");
		ArrayList<XmlSuite> allsuites = new ArrayList<XmlSuite>();
		allsuites.add(mysuite);
		testng.setXmlSuites(allsuites);
		
		XmlTest createBooking = new XmlTest(mysuite);
		createBooking.setName("Create New Booking Test - pay@hotel");
		Map<String, String> parameters = new HashMap<String, String>();
		parameters.put("action", "pay@hotel");
		createBooking.setParameters(parameters);
		
		List<XmlClass> testClasses = new ArrayList<XmlClass>();
		
		XmlClass testclass = new XmlClass("testcases.BookingManagement");
		List<XmlInclude> methods = new ArrayList<XmlInclude>();
		methods.add(new XmlInclude("createBooking"));
		methods.add(new XmlInclude("GuestInfo"));
		testclass.setIncludedMethods(methods);
		testClasses.add(testclass);
		
		testclass = new XmlClass("testcases.PaymentManagement");
		methods.add(new XmlInclude("applyDiscount"));
		methods.add(new XmlInclude("makePayment"));
		testclass.setIncludedMethods(methods);
		testClasses.add(testclass);
		
		testclass = new XmlClass("testcases.CustomerManagement");
		methods.add(new XmlInclude("checkMail"));
		methods.add(new XmlInclude("checkMobile"));
		testclass.setIncludedMethods(methods);
		testClasses.add(testclass);
		
		createBooking.setXmlClasses(testClasses);
		testng.run();
	}

}
