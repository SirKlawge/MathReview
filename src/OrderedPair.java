/**@author Ventura Abram
 * This will define an Ordered Pair.  It might not be necessary for this
 * to be a separate class, so this may later be defined as an inner class in MySet*/
public class OrderedPair<E> {
	private E first, second;
	
	public OrderedPair(E first, E second) {
		this.first = first;
		this.second = second;
	}
	
	public String toString() {
		return "(" + this.first + ", " + this.second + ")";
	}
	
	public boolean equals(Object o) {
		if(o instanceof OrderedPair) {
			OrderedPair<E> other = (OrderedPair<E>) o;
			return this.first.equals(other.first) && this.second.equals(other.second);
		}
		return false;
	}
	
	public E getFirst() {
		return this.first;
	}
	
	public E getSecond() {
		return this.second;
	}
	
	public void setFirst(E first) {
		this.first = first;
	}
	
	public void setSecond(E second) {
		this.second = second;
	}
}
