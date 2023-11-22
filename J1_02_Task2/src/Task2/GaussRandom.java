package Task2;

import java.util.Random;

public class GaussRandom {
	private Random rand;

	public GaussRandom() {
		this.rand = new Random();
	}

	public GaussRandom(long seed) {
		this.rand = new Random(seed);
	}

	public double nextNormal(int m, int sigma) {
		double a = rand.nextDouble();
		double b = rand.nextDouble();
		double answer = Math.cos(2 * a * Math.PI) * Math.sqrt(-2 * Math.log(b));
		return answer * sigma + m;
	}

	public double nextNormal() {
		double a = rand.nextDouble();
		double b = rand.nextDouble();
		double answer = Math.cos(2 * a * Math.PI) * Math.sqrt(-2 * Math.log(b));
		return answer;
	}
}
