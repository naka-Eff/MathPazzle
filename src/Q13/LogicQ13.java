package Q13;

import java.util.Arrays;
import java.util.Optional;
import java.util.function.Consumer;

import com.gs.collections.api.list.ImmutableList;
import com.gs.collections.api.list.MutableList;
import com.gs.collections.api.map.ImmutableMap;
import com.gs.collections.api.map.MutableMap;
import com.gs.collections.impl.factory.Lists;
import com.gs.collections.impl.factory.Maps;

public class LogicQ13 {
	private static Contener contener;
	private static MutableList<firstForm> first = Lists.mutable.of();
	private static MutableList<secondForm> second = Lists.mutable.of();

	public LogicQ13() {

	}

	public ImmutableMap<String, Boolean> setMap() {
		MutableMap<String, Boolean> q13 = Maps.mutable.of();
		q13.put("r", true);
		q13.put("w", true);
		q13.put("t", true);
		q13.put("s", true);
		q13.put("e", false);
		q13.put("a", false);
		q13.put("d", false);
		q13.put("i", false);
		q13.put("l", false);
		q13.put("k", false);
		return q13.toImmutable();
	}

	public ImmutableList<Integer> getHeadList() {
		return Lists.immutable.ofAll(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9));
	}

	public ImmutableList<Integer> getNormalList() {
		return Lists.immutable.ofAll(Arrays.asList(0, 1, 2, 3, 4, 5, 6, 7, 8, 9));
	}

	public void start(Contener con) {
		contener = con;
		// d + e + k = lのリストを作成
		contener.getD().forEach(cheakLast());
		ImmutableList<firstForm> list = first.toImmutable();
		// s-w <= 2のリスト
		contener.getW().forEach(checkHead());
		ImmutableList<secondForm> list2 = second.toImmutable();
		run(list, list2);
	}

	public void run(ImmutableList<firstForm> list, ImmutableList<secondForm> list2) {
		MutableList<Optional<thirdForm>> finish = Lists.mutable.of();
		list.each(firsts -> {
			int d = firsts.getD();
			int e = firsts.getE();
			int k = firsts.getK();
			int l = firsts.getL();
			list2.each(seconds -> {
				int w = seconds.getW();
				int s = seconds.getS();
				finish.addAll(getFinish(d, e, k, l, w, s));

			});
		});
		ImmutableList<Optional<thirdForm>> finishImmu = finish.toImmutable();
		finishImmu.each(op->{
			if(op.isPresent()){
				thirdForm thirdForm = op.get();
				thirdForm.print();
			}
		});
	}

	public MutableList<Optional<thirdForm>> getFinish(int d, int e, int k, int l, int w, int s) {
		MutableList<Optional<thirdForm>> list = Lists.mutable.of();
		contener.getR().each(r -> {
			contener.getA().each(a -> {
				contener.getI().each(i -> {
					contener.getT().each(t -> {
						int read = r * 1000 + e * 100 + a * 10 + d;
						int write = w * 10000 + r * 1000 + i * 100 + t * 10 + e;
						int talk = t * 1000 + a * 100 + l * 10 + k;
						int skill = s * 10000 + k * 1000 + i * 100 + l * 10 + l;
						if (read + write + talk == skill) {
							list.add(Optional.of(new thirdForm(r, e, a, d, w, i, t, l, k, s)));
						}
					});
				});
			});
		});
		return list;
	}

	public Consumer checkHead() {
		Consumer roop = x -> {
			int w = (int) x;
			contener.getS().each(s -> {
				if ((s - w) <= 2) {
					second.add(new secondForm(w, s));
				}
			});
		};
		return roop;
	}

	public Consumer cheakLast() {

		// dから始まり、e→k→l
		Consumer roop = x -> {
			int d = (int) x;
			contener.getE().each(e -> {
				contener.getK().each(k -> {
					contener.getL().each(l -> {
						Optional<firstForm> firstForm = InsertFirstForm(d, e, k, l);
						if (firstForm.isPresent()) {
							first.add(firstForm.get());
						}
					});
				});
			});
		};
		return roop;
	}

	public Optional<firstForm> InsertFirstForm(int d, int e, int k, int l) {
		if (d + e + k == l) {
			return Optional.of(new firstForm(d, e, k, l));
		}
		return Optional.empty();
	}
}
