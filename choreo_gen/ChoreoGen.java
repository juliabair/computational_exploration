public class ChoreoGen {
  public static void main(String[] args) {
    FirstSolo firstSolo = new FirstSolo();
    ModelPoses modelPoses = new ModelPoses();
    FinalSolo finalSolo = new FinalSolo();

    System.out.println(firstSolo.generate());
    System.out.println(modelPoses.generate());
    System.out.println(finalSolo.generate());
  }
}
