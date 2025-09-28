class FirstSolo extends Solo {

  BodyPart bodyPart;

  public FirstSolo(){
    bodyPart = new BodyPart();
  }

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
    response += "Body Part 1: " + bodyPart.get() + "\n";
    response += "Body Part 2: " + bodyPart.get() + "\n";
    response += "Body Part 3: " + bodyPart.get() + "\n";
    return response;
  }

  public static void main(String[] args) {
    FirstSolo firstSolo = new FirstSolo();
    System.out.println(firstSolo.generate());
  }
}
