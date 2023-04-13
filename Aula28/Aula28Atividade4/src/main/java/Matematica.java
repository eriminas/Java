public class Matematica {
    public int multiply(int x, int y) {
    if (x > 999) {
      throw new IllegalArgumentException("X should be less than 1000");
    }
    return x * y;
  }
    
    public int divide(int x, int y) {
    if (y <= 0) {
      throw new IllegalArgumentException("y should be positive and more than 0");
    }
    return x / y;
  }
}
