package futbol.championship.utilities;

public class Pair<T,E> {
	private T first;
	private E snd;
	
	public Pair(){
		
	}
	
	public Pair(T f, E s){
		this.first=f;
		this.snd=s;
	}
	
	public T getFirst() {
		return first;
	}
	public void setFirst(T first) {
		this.first = first;
	}
	public E getSnd() {
		return snd;
	}
	public void setSnd(E snd) {
		this.snd = snd;
	}
	@Override
	public String toString() {
		return " ENCUENTRO: [" + first + "-- VS --" + snd + "]";
	}
	
	
}
