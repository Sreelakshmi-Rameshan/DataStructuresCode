package lineSweep;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Overlap {

	public static boolean hasOverlap(Interval[] intervals) {
		List<Point> points = new ArrayList<Point>();

		for (Interval i : intervals) {
			points.add(new Point(i.getStart(), true /* isStart */));
			points.add(new Point(i.getEnd(), false /* isStart */));
		}
		Collections.sort(points);
		int count = 0;
		for (int i = 0; i < points.size(); i++) {
			count = points.get(i).isStart() ? count + 1 : count - 1;
			if (count > 1)
				return true;
		}
		return false;
	}
}
