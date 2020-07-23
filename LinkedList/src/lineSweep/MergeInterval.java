package lineSweep;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MergeInterval {
	public static List<Interval> mergeIntervals(Interval[] intervals) {
		List<Point> points = new ArrayList<Point>();

		for (Interval i : intervals) {
			points.add(new Point(i.getStart(), true /* isStart */));
			points.add(new Point(i.getEnd(), false /* isStart */));
		}
		Collections.sort(points);
		List<Interval> result = new ArrayList<Interval>();
		int numIntervals = 0;
		Point startPoint = null;
		for (int i = 0; i < points.size(); i++) {
			Point point = points.get(i);
			if (point.isStart()) {
				numIntervals++;
				if (numIntervals == 1)
					startPoint = point;
			} else {
				numIntervals--;
				if (numIntervals == 0) {
					result.add(new Interval(startPoint.getTime(), point.getTime()));
				}
			}
		}
		return result;
	}
}
