package Task2;

import java.util.Random;

public class GaussRandom {
	private Random rand1;
	private Random rand2;

	public GaussRandom() {
		this.rand1 = new Random();
		this.rand2 = new Random();
	}

	public GaussRandom(long seed) {
		this.rand1 = new Random(seed);
		this.rand2 = new Random(seed+1);
	}

	public double nextNormal(int m, int sigma) {
		double a = rand1.nextDouble();
		double b = rand2.nextDouble();
		double answer = Math.cos(2 * a * Math.PI) * Math.sqrt(-2 * Math.log(b));
		return answer * sigma + m;
	}

	public double nextNormal() {
		double a = rand1.nextDouble();
		double b = rand2.nextDouble();
		System.out.println(a);
		System.out.println(b);
		double answer = Math.cos(2 * a * Math.PI) * Math.sqrt(-2 * Math.log(b));
		return answer;
	}
}
