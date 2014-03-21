import java.util.Scanner;
public class NumbersToWords 
{
	public static void main(String[] args) 
	{
		Scanner console = new Scanner(System.in);
		while (true)
		{
			int input = console.nextInt();
			if (input == 0) System.out.println ("zero");
			else System.out.println(wholeConvert(input));
		}
	}
	
	public static String wholeConvert(int intNum)
	{
		String billions = "";
		String millions = "";
		String thousands = "";
		if (intNum / 1000000000 != 0)
			billions = convert(intNum /1000000000) + "billion ";
		if ((intNum % 1000000000) / 1000000 != 0)
			 millions = convert((intNum % 1000000000) / 1000000) + "million ";
		if ((intNum % 1000000) / 1000 != 0)
			thousands = convert((intNum % 1000000) / 1000) + "thousand ";
		return billions + millions + thousands + convert (intNum % 1000);	
	}
	
	public static String convert(int intNum)
	{
		String hundreds = "";
		String tens = "";
		String ones = "";
		if (intNum / 100 != 0)
		{
			hundreds = intToWord(intNum / 100, 0) + "hundred ";
			if (intNum % 100 != 0)
				hundreds = hundreds + "and ";
		}
		if (intNum % 100 != 0)
			tens = intToWord(intNum % 100 - intNum % 10, intNum % 100);
		if (intNum % 10 != 0 && (intNum % 100 < 10 || intNum % 100 > 19))
			ones = intToWord(intNum % 10, 0);
		return hundreds + tens + ones;
	}
	
	public static String intToWord(int num, int actualNum)
	{
		switch (num)
		{
			case 1: return "one ";
			case 2: return "two ";
			case 3: return "three ";
			case 4: return "four ";
			case 5: return "five ";
			case 6: return "six ";
			case 7: return "seven ";
			case 8: return "eight ";
			case 9: return "nine ";
			case 10: return tens(actualNum);
			case 20: return "twenty ";
			case 30: return "thirty ";
			case 40: return "forty ";
			case 50: return "fifty ";
			case 60: return "sixty ";
			case 70: return "seventy ";
			case 80: return "eighty ";
			case 90: return "ninety ";
			default : return "";
		}
	}
	
	public static String tens(int num)
	{
		switch (num)
		{
		case 10: return "ten ";
		case 11: return "eleven ";
		case 12: return "twelve ";
		case 13: return "thirteen ";
		case 14: return "fourteen ";
		case 15: return "fifteen ";
		case 16: return "sixteen ";
		case 17: return "seventeen ";
		case 18: return "eighteen ";
		case 19: return "nineteen ";
		default: return "";
		}
	}
}
