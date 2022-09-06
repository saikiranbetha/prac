package practice_examples;

public class explicitTypeCasting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double d = 75.0;
		float f = (float)d;
		long l = (long)f;
		int i = (int)l;
		short s = (short)i;
		byte b = (byte)s;
		
		// converting higher byte to lower byte
		System.out.println("double value " + d);
		System.out.println("float value " + f);
		System.out.println("long value " + l);
		System.out.println("int value " + i);
		System.out.println("short value " + s);
		System.out.println("byte value " + b);
		
	}

}
