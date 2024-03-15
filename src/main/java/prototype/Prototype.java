package prototype;

public interface Prototype {
	public static final int x = 0;
    public static final int y = 0;
	String getColor();
    Prototype clone();
}