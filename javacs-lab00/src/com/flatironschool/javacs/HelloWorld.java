package com.flatironschool.javacs;

public class HelloWorld {
    public static Double getVersion() {
        String version = System.getProperty("java.specification.version");
	//	Double d = 0.00;
		Double result = Double.parseDouble(version);
		return result;
    }

    public static void main(String[] args) {
		System.out.println(getVersion());
    }
}
