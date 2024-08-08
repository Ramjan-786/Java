package wrappers;
//object-->Boolean, character, Number : Byte, short, Integer, Float, Double
public class Test {

	public static void main(String[] args) {
	   int data =1234;
      // Integer i1 = new Integer(data);//The constructor Integer(int) is deprecated since version 9
       Integer i1 = Integer.valueOf(data);//boxing : explicitly done by prog
       int value = i1.intValue();//un boxing : explicitly done by prog
       Integer i2 = 1235;//auto boxing : implicitly done javac (int--> Integer : valueOf())
       value = i2;//auto unboxing : implicitly done by javac (Integer-->int : intValue())
       String s = "hello";
       s+=10; //s = s.concat(10);
       System.out.println(s);//hello10
      // s++;//Type mismatch: cannot convert from String to int
      // s*=10;//error
       i2++;//auto unboxing:(Integer-->Int)-->(int)increment--->(Int--->Integer):auto boxing
       System.out.println(i2);//1236
       Double d1 = 1234.56;//auto boxing
       double data2 = d1;//auto unboxing
       data2 = data;//automatic promotion(widening): javac(int --> double)
       //d1= 1234;//int-->Integer(auto boxing)-->type mismatch--->not place in Double(error)
       d1 = (double)1234;//double--->Double(auto boxing)
       data2 = 123.456F;//widening
       //d1 = 12.34F//float-->Float ----X----> Double  ///error
       Number n1 = 123.456;//double-->Double(auto boxing)--->Number : upcasting (Double is a Number)
       n1 = 12.34F;//same as above
       Object ref = "hello";//upcasting : String is object
       ref = true;//autoBoxing : primitive to wrapper Upcasting
       ref = 100;//same above
       ref = 123.456F;//same above
       //Is java pure 100% object oriented language? : No.It's does supports primitive type, No multiple Inheritance and operator Overloding(Search on Google)
       //Can Object type of the referance directly refer to Any data type (pri/ref) in java ? : Yes
       //e.g Line:28,29 etc
       
	}

}
