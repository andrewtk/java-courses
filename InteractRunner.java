import java.util.Scanner;
/**
rkfcc lkz pfgcrf rfkmrekznjhf gjllth;bdftn ddjl gjkmpjdfntkz
*/
public class InteractRunner {

	public static void main(String[] arg) {
		String operation;
		Scanner reader = new Scanner(System.in);

		try {
			Calculator calc = new Calculator();
			String exit = "no";
			while (!exit.equals("yes")) {
				System.out.println("Enter first arg : ");
				String first = reader.next();
				System.out.println("Enter second arg : ");
				String second = reader.next();
				System.out.println("Enter operation : ");
				operation = choiceOperation();
				System.out.println("operation is : "+ operation);
				switch (operation){
					case "+": calc.add(Integer.valueOf(first), Integer.valueOf(second));
								break;
					case "-": calc.minus(Integer.valueOf(first), Integer.valueOf(second));
								break;
					case "/": calc.division(Integer.valueOf(first), Integer.valueOf(second));
								break;			
					case "*": calc.multyplication(Integer.valueOf(first), Integer.valueOf(second));
								break;
					
				}

				System.out.println("result : " + calc.getResult());
				calc.clearResult();
				System.out.println("Exit : yes/no");
				System.out.println("Exit is: " + exit);
				if (reader.hasNext() )
					exit = reader.next();
			}

		} finally {
			reader.close();
		}
	}
	
	/**
	* метод выбора арифметической операции калькулятора
	*/
	public static String choiceOperation() {
		Scanner readerOp = new Scanner(System.in);
		String operation = "";
		try 
		{
		
			while (operation == "") 
				{
					System.out.println("Enter operation ('+', '-', '*', '/') : ");
					operation = readerOp.next();
					System.out.println("You choose the operation : "+ "\"" + operation+"\"");
				}

		} finally 
		{
			//readerOp.close();
		}
		return operation;
	}
}