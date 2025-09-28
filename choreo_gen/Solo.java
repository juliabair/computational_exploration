public abstract class Solo {

  abstract String generate();

  static int quadrants() {
    int low = 1;
    int high = 4;
    int quad = low + (int) (Math.random() * ((high - low) + 1));
    return quad;
  }
}
