package cinqPremiersEntiersPairs;

import java.util.stream.Stream;

public class Main {

	public static void main(String[] args) {

		Stream.iterate(2L, n -> n + 3).filter(Main::isPair).limit(10)

				.forEach(System.out::println);

	}

	public static boolean isPair(long n) {
		if (n % 2 == 0)
			return true;

		else
			return false;

	}

}
