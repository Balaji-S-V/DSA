import java.util.regex.Pattern;
public class PatternMatchesExmp
{
public static void main(String[]args)
{
String text = "This is the text to be searched";
String pattern = "is";
boolean matches = Pattern.matches(pattern,text);
System.out.println("matches = " +matches);
}
}