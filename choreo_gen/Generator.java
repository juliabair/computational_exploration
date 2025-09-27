public class Generator extends BodyPart {

  static int quadrants() {
    int low = 1;
    int high = 4;
    int quad = low + (int) (Math.random() * ((high - low) + 1));
    return quad;
  }

  // fluidity method
  static int fluidity_level() {
    int low = 0;
    int high = 5;
    int fluid = low + (int) (Math.random() * ((high - low) + 1));

    return fluid;
  }

  public String generate() {
    String response = "";
    response += "Quadrant: " + quadrants() + "\n";
    response += "Fluidity Level: " + fluidity_level() + "\n";
    response += "Body Part 1: " + body_parts[body_part()] + "\n";
    response += "Body Part 2: " + body_parts[body_part()] + "\n";
    response += "Body Part 3: " + body_parts[body_part()] + "\n";
    return response;
  }

  public static void main(String[] args) {
    Generator g1 = new Generator();
    System.out.println(g1.generate());
  }
}
