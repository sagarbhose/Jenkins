package entity;

public interface Interface1 {
	public abstract String  print();
	default void swhow() {
		System.out.println("defult hai bhai");
	}
}
