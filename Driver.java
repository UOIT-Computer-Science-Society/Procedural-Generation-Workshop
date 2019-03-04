public class Driver{
  public static void main(String[] args){
    final int WIDTH = 2048;
    final int HEIGHT = 2048;
    BSPTree tree = new BSPTree(WIDTH, HEIGHT);
    tree.drawDungeon();
    ImageCreator.save(tree.getDungeon(), "png", "grid");

  }
}
