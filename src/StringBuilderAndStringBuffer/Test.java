package StringBuilderAndStringBuffer;

public class Test {

	public static void main() {
		long startTime = System.currentTimeMillis(); //time
		
		StringBuilder sb = new StringBuilder("JAVA"); //object
		for(int i=0; i<10000; i++) { //loop
			sb.append("vtalent");     //value append
		}
		System.out.println("Time taken for stringbuilder:"+(System.currentTimeMillis()-startTime)+"ms");
		
		
		startTime = System.currentTimeMillis(); //time
		StringBuffer sb2 = new StringBuffer("JAVA"); //object
		for(int i=0; i<10000; i++) { //loop
			sb2.append("vtalent");     //value append
		}
		System.out.println("Time taken for stringbuffer:"+(System.currentTimeMillis()-startTime)+"ms");
	}

}
