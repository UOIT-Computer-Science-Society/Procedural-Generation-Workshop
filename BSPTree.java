import java.awt.image.BufferedImage;
import java.awt.Graphics2D;
import java.awt.Color;
import java.awt.BasicStroke;
import java.util.Random;
public class BSPTree{
  private BufferedImage dungeon;
  private Random random;
  private Graphics2D graphics;
  private final int WIDTH;
  private final int HEIGHT;
  final private int GRIDS_ACROSS;
  final private int GRIDS_DOWN;
  
  //A class that generates a dungeon for a video game using a BSP tree
  public BSPTree(int width, int height){
      dungeon = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);
      WIDTH = width;
      HEIGHT = height;
      graphics = dungeon.createGraphics();
      random = new Random();
      GRIDS_DOWN = 20;
      GRIDS_ACROSS = 20;
  }

  public void genDungeon(){

  }
  public void genBoundBox() {}
  public void genRooms(){}
  public void genPaths(){}

  public void drawDungeon(){
    this.graphics.setBackground(new Color(0, 0, 0));
    drawGrid();
  }
  /*
  Draws a grid with how many grids you want down and across
  */
  public void drawGrid(){
    this.graphics.setColor(new Color(0, 50, 50)); // Color of grid lines
    this.graphics.setStroke(new BasicStroke(5));
    int gridWidth = this.WIDTH / GRIDS_ACROSS;
    int gridHeight = this.HEIGHT / GRIDS_DOWN;
    int horizonStart = 0;

    //Draws the horizontal lines
    for(int i = 0; i < GRIDS_ACROSS+1; i ++){
      graphics.drawLine(0,  gridHeight * i, this.WIDTH, gridHeight * i);
      horizonStart += gridWidth;
    }
    //Draws the verticals lines
    for(int i = 0; i < GRIDS_DOWN +1; i ++){
      graphics.drawLine(gridWidth * i, 0, gridWidth * i, this.HEIGHT);
    }
  }
  public void drawBound(){}
  public void drawRoom(){}
  public void drawPath(){}

  public BufferedImage getDungeon(){return dungeon;}
}
