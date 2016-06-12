package Q13;

import com.gs.collections.api.list.ImmutableList;

public class Contener {
	private static final Contener contener = new Contener();
	LogicQ13 logicObj = new LogicQ13();
	ImmutableList<Integer> head = logicObj.getHeadList();
	ImmutableList<Integer> normal = logicObj.getNormalList();
	// ImmutableMap<String, Boolean> map = logicObj.setMap();
	ImmutableList<Integer> r = head;
	ImmutableList<Integer> w = head;
	ImmutableList<Integer> t = head;
	ImmutableList<Integer> s = head;
	ImmutableList<Integer> e = normal;
	ImmutableList<Integer> a = normal;
	ImmutableList<Integer> d = normal;
	ImmutableList<Integer> i = normal;
	ImmutableList<Integer> l = normal;
	ImmutableList<Integer> k = normal;

	private Contener() {

	}

	public LogicQ13 getLogicObj() {
		return logicObj;
	}

	public ImmutableList<Integer> getR() {
		return r;
	}

	public ImmutableList<Integer> getW() {
		return w;
	}

	public ImmutableList<Integer> getT() {
		return t;
	}

	public ImmutableList<Integer> getS() {
		return s;
	}

	public ImmutableList<Integer> getE() {
		return e;
	}

	public ImmutableList<Integer> getA() {
		return a;
	}

	public ImmutableList<Integer> getD() {
		return d;
	}

	public ImmutableList<Integer> getI() {
		return i;
	}

	public ImmutableList<Integer> getL() {
		return l;
	}

	public ImmutableList<Integer> getK() {
		return k;
	}

	public static Contener getInstance() {
		return contener;
	}

	public ImmutableList<Integer> getHead() {
		return head;
	}

	public ImmutableList<Integer> getNormal() {
		return normal;
	}

	// public ImmutableMap<String, Boolean> getMap(){
	// return map;
	// }
}