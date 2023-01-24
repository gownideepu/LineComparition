package Com.bridgeLabs;

public class LineComparition {
	static Double Length (Integer x1, Integer  x2,Integer  y1,Integer  y2 ) {
		return Math.sqrt((x2-x1)^2 + (y2-y2)^2);
	}
	public static void main(String[] args) {
		double l1=(Length(1,6,3,4));
		double l2=(Length(1,6,3,4));

		System.out.println(l1);
		System.out.println(l2);
    
	}
}
