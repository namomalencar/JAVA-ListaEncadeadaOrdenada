package Q2ListaEncadeadaOrdenada;

public class No {
	
	private int value;
	private No next;
	
	public No(int value){
//		this.value = value;
		this.next = null;
	}
	
	public No(){
//		this.value = Integer.MIN_VALUE;
		this.next = null;
	}
	
	public int getValue() {
		return value;
	}
	public void setValue(int value) {
		this.value = value;
	}
	public No getNext() {
		return next;
	}
	public void setNext(No next) {
		this.next = next;
	}
	
	
	
	
	

}
