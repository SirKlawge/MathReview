/**@author Ventura Abram
 * This class defines a fundamental set.  This will be a wrapper for java's own set, so
 * it'll add functionality on top of it.  Someday, it'd be nice to build my own version
 * from the ground up, but since my purpose here is study/review of math rather than 
 * an exercise in programming, this approach will suffice.*/

import java.util.Set;
import java.util.HashSet;

public class MySet<E> extends HashSet<E>{
	
	@Override
	public String toString() {
		String result = "{";
		for(E item : this) {
			result += item + ", ";
		}
		result = result.trim();
		return result.substring(0, result.length() - 1) + "}";
	}
	
	/**This method will produce the cartesian product between itself and another set.
	 * @param other a MySet
	 * @return */
	public MySet<OrderedPair<E>> cartesianProduct(MySet<E> other){
		return null;
	}
	
	/**This method will return the powerset of this MySet
	 * @return*/
	public MySet<E> powerset(){
		return null;
	}
	
	/**This method return the intersection of this MySet and an other MySet
	 * @param other another MySet
	 * @return intersection the intersection of this MySet and another MySet*/
	public MySet<E> intersection(MySet<E> other){
		MySet<E> intersection = new MySet<E>();
		for(E item : this) {
			if(other.contains(item)) {
				intersection.add(item);
			}
		}
		return intersection;
	}
	
	/**This method returns the union of this MySet and another MySet.
	 * @param other another MySet
	 * @return union the union of this MySet and another MySet*/
	public MySet<E> union(MySet<E> other){
		MySet<E> union = (MySet<E>) this;
		for(E item : other) {
			union.add(item);
		}
		return union;
	}
	
	/**This will return a MySet such that x is in this or x is in other and x is
	 * not in both.
	 * @param other a MySet
	 * @return xorSet a MySet as described above.*/
	public MySet<E> xor(MySet<E> other){
		MySet<E> xorSet = new MySet<E>();
		for(E item : this) {
			if(!other.contains(item)) {
				xorSet.add(item);
			}
		}
		for(E item : other) {
			if(!this.contains(item)) {
				xorSet.add(item);
			}
		}
		return xorSet;
	}
	
}
