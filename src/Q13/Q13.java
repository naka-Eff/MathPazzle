package Q13;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Q13 {
	public static void main(String[] args) {
		values val = new values();
		val.run();
		System.out.println(val.getCount());
	}

	public static class values {
		values val = new values();
		final List<Integer> R = getHead();
		final List<Integer> E = getBody();
		final List<Integer> A = getBody();
		final List<Integer> D = getBody();
		final List<Integer> W = getHead();
		// R
		final List<Integer> I = getBody();
		final List<Integer> T = getHead();
		// E
		// T
		// A
		// L
		// K
		final List<Integer> S = getHead();
		final List<Integer> K = getBody();
		// I
		final List<Integer> L = getBody();
		// L
		public int read = 0;
		public int write = 0;
		public int talk = 0;
		public int skill = 0;
		public int count = 0;

		public int r = 0;
		public int e = 0;
		public int a = 0;
		public int d = 0;
		public int w = 0;
		public int i = 0;
		public int t = 0;
		public int s = 0;
		public int k = 0;
		public int l = 0;

		public int getRead() {
			return read;
		}

		public void setRead(int read) {
			this.read = read;
		}

		public int getWrite() {
			return write;
		}

		public void setWrite(int write) {
			this.write = write;
		}

		public int getTalk() {
			return talk;
		}

		public void setTalk(int talk) {
			this.talk = talk;
		}

		public int getSkill() {
			return skill;
		}

		public void setSkill(int skill) {
			this.skill = skill;
		}

		public int getCount() {
			return count;
		}

		public void setR(int r) {
			this.r = r;
		}

		public void setE(int e) {
			this.e = e;
		}

		public void setA(int a) {
			this.a = a;
		}

		public void setD(int d) {
			this.d = d;
		}

		public void setW(int w) {
			this.w = w;
		}

		public void setI(int i) {
			this.i = i;
		}

		public void setT(int t) {
			this.t = t;
		}

		public void setS(int s) {
			this.s = s;
		}

		public void setK(int k) {
			this.k = k;
		}

		public void setL(int l) {
			this.l = l;
		}

		public void run() {
			runR();
		}

		public void runR() {
			for (int li : R) {
				setR(li);
				runE();
			}
		}

		public void runE() {
			for (int li : E) {
				setE(li);
				runA();
			}
		}

		public void runA() {
			for (int li : A) {
				setA(li);
				runD();
			}
		}

		public void runD() {
			for (int li : D) {
				setD(li);
				runW();
			}
		}

		public void runW() {
			for (int li : W) {
				setW(li);
				runI();
			}
		}

		public void runI() {
			for (int li : I) {
				setI(li);
				runT();
			}
		}

		public void runT() {
			for (int li : T) {
				setT(li);
				runL();
			}
		}

		public void runL() {
			for (int li : L) {
				setL(li);
			}
		}

		public void runK() {
			for (int li : K) {
				setK(li);
			}
		}

		public void runS() {
			for (int li : S) {
				setS(li);
				setTree();
			}
		}

		public void setTree() {
			setRead(r * 1000 + e * 100 + a * 10 + d);
			setWrite(w * 10000 + r * 1000 + i * 100 + t * 10 + e);
			setTalk(t * 1000 + a * 100 + l * 10 + k);
			setSkill(s * 10000 + k * 1000 + i * 100 + l * 10 + l);
			lastCheck();
		}

		public void lastCheck() {
			if (getRead() + getWrite() + getTalk() == getSkill()) {
				count++;
			}
		}

		public static List<Integer> getHead() {
			return new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9));
		}

		public static List<Integer> getBody() {
			return new ArrayList<>(Arrays.asList(0, 1, 2, 3, 4, 5, 6, 7, 8, 9));
		}
	}
}
