package session02;

public class Andrei implements PitagoraChecker {

	@Override
	public boolean check(int a, int b, int c) {

		return (a * a + b * b == c * c);
	}

}
