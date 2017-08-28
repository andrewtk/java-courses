public class Calculator {
	private double result;

	/**
	* суммирование аргументов
	*/

	public void add (int ... params) {
		for (Integer param : params) {
			this.result += param;
		}

	}

	/**
	* вычитание аргументов
	*/

	public void minus(int ... params) {
		for (Integer param : params) {
			this.result = this.result - param;
		}

	}

	/**
	* умножение аргументов
	*/

	public void multyplication(int ... params) {
		for (Integer param : params) {
			this.result = param * this.result;
		}

	}

	/**
	деление аргументов
	*/

	public void division(int ... params) {
		this.result=1;
		for (Integer param : params) {
			this.result = (double)param / this.result;
		}

	}



	/**
	получить результат
	*/
	public double getResult() {
		return this.result;
	}

	/**
	очистить результат вычисления
	*/
	public void clearResult() {
		this.result = 0;
	}

}