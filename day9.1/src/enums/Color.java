package enums;
//refer java doc
//programmer enum class implicitly added all feature of class & interface.
//use third party d-compiler tool checking for auto added feature by java compiler.
//public final class Color extends Enum{...}
public enum Color //implicitly extends java.lang.Enum
{
//java compiler implicitly added constructor,methods like valueOf(),etc.
//public static final Constant  : implicitly added for all
	RED,GREN,PINK,BLUE,YELLOW; //Constants
	
//you can override toString() but cannot override equal(),compareTo() because its a final method : refer java doc 
    @Override
    public String toString() {
    	return name().toLowerCase();
    }
}
