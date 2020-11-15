/**@author Ventura Abram
 * This class defines a fundamental set.  This will be a wrapper for java's own set, so
 * it'll add functionality on top of it.  Someday, it'd be nice to build my own version
 * from the ground up, but since my purpose here is study/review of math rather than 
 * an exercise in programming, this approach will suffice.*/

import java.util.Set;
import java.util.HashSet;

public class MySet<E> {
	private Set<E> set;
	
	public MySet() {
		set = new HashSet<E>();
	}
}
