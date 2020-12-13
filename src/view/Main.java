package view;

import view.Main;




import java.util.ArrayList;

import model.Bomb;
import model.Enemy;
import model.Path;
import model.Player;
import model.Treasure;
import model.Tile;
import processing.core.PApplet;
import processing.core.PImage;


public class Main extends PApplet {

	public static void main(String[] args) {
		PApplet.main(Main.class.getName());
	}

	

	// Counter
	private int screen;
	private int treasureCount;
	private int treasureCount2;
	private int treasureCount3;
	private int treasureCount4;
	
	
	//Bombs

	// Grid GAMEPLAY1
	private int rows = 11;
	private int colums = 22;
	private Tile tileArray[][]= new Tile[rows][colums];
	private float tilezeroX = 59;
	private float tilezeroY = 113;
	private float tileWidth = 49;
	
	// Grid GAMEPLAY2
	
	private int rows2 = 11;
	private int colums2 = 22;
	private Tile tileArray2[][] = new Tile[rows2][colums2];
	private float tilezero2X = 59;
	private float tilezero2Y = 113;
	private float tileWidth2 = 49;
	
	// Grid GAMEPLAY3
	
		private int rows3 = 11;
		private int colums3 = 22;
		private Tile tileArray3[][] = new Tile[rows3][colums3];
		private float tilezero3X = 59;
		private float tilezero3Y = 113;
		private float tileWidth3 = 49;
		
	// Grid GAMEPLAY4
		
	private int rows4 = 11;
	private int colums4 = 22;
	private Tile tileArray4[][] = new Tile[rows4][colums4];
	private float tilezero4X = 59;
	private float tilezero4Y = 113;
    private float tileWidth4 = 49;
	
	

	// Spawn tiles GAME PLAY 1
	private ArrayList<Tile> spawnTiles = new ArrayList<Tile>();
	
	//Spawn tiles GAME PLAY 2
	
	private ArrayList<Tile> spawnTiles2 = new ArrayList<Tile>();
	
	//Spawn tiles GAME PLAY 3
	
	private ArrayList<Tile> spawnTiles3 = new ArrayList<Tile>();
		
	//Spawn tiles GAME PLAY 4
		
	private ArrayList<Tile> spawnTiles4 = new ArrayList<Tile>();
	
	

	// Player GAMEPLAY 1
	private Player player;
	
	// Player GAMEPLAY 2
	private Player player2;
	
	// Player GAMEPLAY 2
	private Player player3;
	
	// Player GAMEPLAY 2
	private Player player4;
	
	private PImage playerImage;
	
	
	//Player GAMEPLAY1
	
	private int playerMatX = 7;
	private int playerMatY = 7;

	//Player GAMEPLAY2
	
	private int playerMat2X = 7;
	private int playerMat2Y = 7;
		
	//Player GAMEPLAY3
		
	private int playerMat3X = 7;
	private int playerMat3Y = 7;
	
	//Player GAMEPLAY4
	
	private int playerMat4X = 7;
	private int playerMat4Y = 7;

	// Lives
	private PImage heart;

	// treasure
	private ArrayList<Treasure> treasureList = new ArrayList<Treasure>();
	private ArrayList<Treasure> treasureList2 = new ArrayList<Treasure>();
	private ArrayList<Treasure> treasureList3 = new ArrayList<Treasure>();
	private ArrayList<Treasure> treasureList4 = new ArrayList<Treasure>();
	
	private PImage treasureImage;
	private PImage treasureImage2;
	private PImage treasureImage3;
	private PImage treasureImage4;
	
	//bomb
	
	private ArrayList< Bomb > bombList4 = new ArrayList<Bomb>();
	private PImage bombImage;
	
	
	

	// Enemies
	private ArrayList<Enemy> enemyList = new ArrayList<Enemy>();
	private ArrayList<Enemy> enemyList2 = new ArrayList<Enemy>();
	private ArrayList<Enemy> enemyList3 = new ArrayList<Enemy>();
	private ArrayList<Enemy> enemyList4 = new ArrayList<Enemy>();
	
	
	private PImage glyfoImage;
	private PImage glyfosatoImage;
	private PImage cashImage;
	private PImage moneybagImage;
	private PImage royaImage;
	private PImage roya2Image;
	private PImage roya3Image;
	private PImage starbucksImage;
	private PImage starbucks2Image;
	private PImage starbucks3Image;
	
	

	// Screens
	private PImage gameplayImage;
	private PImage gameplay2Image;
	private PImage gameplay3Image;
	private PImage gameplay4Image;
	private PImage firstImage;
	private PImage secondImage;
	private PImage thirdImage;
	private PImage fourthImage;
	private PImage fifthImage;
	private PImage sixthImage;
	private PImage seventhImage;
	private PImage deathScreen;
	private PImage introlevel2;
	private PImage introlevel3;
	private PImage introlevel4;
	private PImage weapon;
	private PImage goodluck;
	private PImage victory;
	private PImage equipment;
	
	
	
   //GAME PLAY
	// Enemies path
	private Path leftBottom;
	private Path leftBottom2;
	private Path leftBottom3;

	private Path rightBottom;
	private Path rightBottom2;
	private Path rightBottom3;
	private Path rightBottom4;

	private Path topBottomRight;
	private Path topBottomRight2;
	private Path topBottomRight3;

	private Path bottomLeftRight;
	private Path bottomLeftRight2;

	private Path topLeftRight;
	private Path topLeftRight2;

	private Path topLeftBottom;
	private Path topLeftBottom2;
	private Path topLeftBottom3;

	private Path topLeft;
	private Path topLeft2;
	private Path topLeft3;
	private Path topLeft4;

	private Path topRight;
	private Path topRight2;
	private Path topRight3;
	
	 // GAME PLAY 2
	
	private Path left2Bottom;
	private Path left2Bottom2;
	private Path left2Bottom3;

	private Path right2Bottom;
	private Path right2Bottom2;
	private Path right2Bottom3;
	private Path right2Bottom4;

	private Path topBottom2Right;
	private Path topBottom2Right2;
	private Path topBottom2Right3;

	private Path bottom2LeftRight;
	private Path bottom2LeftRight2;

	private Path topLeft2Right;
	private Path topLeft2Right2;

	private Path topLeft2Bottom;
	private Path topLeft2Bottom2;
	private Path topLeft2Bottom3;

	private Path top2Left;
	private Path top2Left2;
	private Path top2Left3;
	private Path top2Left4;

	private Path top2Right;
	private Path top2Right2;
	private Path top2Right3;
	
	// GAME PLAY 3
	
		private Path left3Bottom;
		private Path left3Bottom2;
		private Path left3Bottom3;

		private Path right3Bottom;
		private Path right3Bottom2;
		private Path right3Bottom3;
		private Path right3Bottom4;

		private Path topBottom3Right;
		private Path topBottom3Right2;
		private Path topBottom3Right3;

		private Path bottom3LeftRight;
		private Path bottom3LeftRight2;

		private Path topLeft3Right;
		private Path topLeft3Right2;

		private Path topLeft3Bottom;
		private Path topLeft3Bottom2;
		private Path topLeft3Bottom3;

		private Path top3Left;
		private Path top3Left2;
		private Path top3Left3;
		private Path top3Left4;

		private Path top3Right;
		private Path top3Right2;
		private Path top3Right3;
		
		// GAME PLAY 4
		
			private Path left4Bottom;
			private Path left4Bottom2;
			private Path left4Bottom3;

			private Path right4Bottom;
			private Path right4Bottom2;
			private Path right4Bottom3;
			private Path right4Bottom4;

			private Path topBottom4Right;
			private Path topBottom4Right2;
			private Path topBottom4Right3;

			private Path bottom4LeftRight;
			private Path bottom4LeftRight2;

			private Path topLeft4Right;
			private Path topLeft4Right2;

			private Path topLeft4Bottom;
			private Path topLeft4Bottom2;
			private Path topLeft4Bottom3;

			private Path top4Left;
			private Path top4Left2;
			private Path top4Left3;
			private Path top4Left4;
			
			private Path top4Right;
			private Path top4Right2;
			private Path top4Right3;
	

	public void settings() {
		size(1200, 700);
	}
	
	
	public void reset() {
		

	
				

				// Images
				this.heart = loadImage("../img/vida.png");
				this.treasureImage = loadImage("../img/vitamina.png");
				this.treasureImage2 = loadImage("../img/llave.png");
				this.treasureImage3 = loadImage("../img/manzanilla.png");
				this.treasureImage4 = loadImage("../img/safelives.png");
				
				//bombs
				
				
				
				

				// Add enemies
			
				glyfoImage = loadImage("../img/glyfosato.png");
				glyfosatoImage = loadImage("../img/glyfosato.png");
				cashImage = loadImage("../img/$.png");
			    moneybagImage = loadImage("../img/moneybag.png");
			    royaImage = loadImage("../img/roya.png");
			    roya2Image = loadImage("../img/roya.png");
			    roya3Image = loadImage("../img/roya.png");
			    starbucksImage = loadImage("../img/octopus.png");
			    starbucks2Image = loadImage("../img/octopus.png");
			    
	  

				this.firstImage = loadImage("../img/logo.jpg");
				this.secondImage = loadImage("../img/2welcome.jpg");
				this.thirdImage = loadImage("../img/3history.jpg");
				this.fourthImage = loadImage("../img/4keyboard.jpg");
				this.fifthImage = loadImage("../img/5Mapaayuda.jpg");
				this.sixthImage = loadImage("../img/6Mapadeayudaoh.jpg");
				this.seventhImage = loadImage("../img/7Mapadeayudaoh.jpg");
				this.gameplayImage = loadImage("../img/Mapa1.png");
				this.gameplay2Image = loadImage("../img/level2a.png");
				this.gameplay3Image = loadImage("../img/level3.png");
				this.gameplay4Image = loadImage("../img/level4.png");
				this.deathScreen = loadImage("../img/lost.jpg");
				this.introlevel2 = loadImage("../img/10pear.jpg");
				this.introlevel3 = loadImage("../img/12pear.jpg");
				this.introlevel4 = loadImage("../img/14pear.jpg");
				this.weapon = loadImage("../img/15pear.jpg");
				this.goodluck = loadImage("../img/16pear.jpg");
				this.victory= loadImage("../img/victory.jpg");
				this.equipment= loadImage("../img/equipment.jpg");
				
			    
	    
	    
		screen = 0;
		treasureCount = 0;
		treasureCount2 = 0;
		treasureCount3 = 0;
		treasureCount4 = 0;
		
		

       // GAMEPLAY 1
		
		this.playerImage = loadImage("../img/cafecito.png");
		this.player = new Player(7 + tilezeroX + tileWidth * playerMatX, 3 + tilezeroY + tileWidth * playerMatY, 32, 40,
				49, 5, 0, this.playerImage, this);

		//GAMEPLAY2
		
		this.playerImage = loadImage("../img/cafecito.png");
		this.player2 = new Player(7 + tilezero2X + tileWidth2 * playerMat2X, 3 + tilezero2Y + tileWidth2 * playerMat2Y, 32, 40,
				49, 5, 0, this.playerImage, this);
		
		//GAMEPLAY3
		
		this.playerImage = loadImage("../img/cafecito.png");
		this.player3 = new Player(7 + tilezero3X + tileWidth3 * playerMat3X, 3 + tilezero3Y + tileWidth3 * playerMat3Y, 32, 40,
		49, 5, 0, this.playerImage, this);
		
		//GAMEPLAY4
		
		this.playerImage = loadImage("../img/cafeunder.png");
		this.player4 = new Player(7 + tilezero4X + tileWidth4 * playerMat4X, 3 + tilezero4Y + tileWidth4 * playerMat4Y, 32, 40,
		49, 5, 0, this.playerImage, this);
		
		
		// Images
		
		// Add enemies
	 
       // enemies GAME PLAY 1
	    
		this.enemyList.add(new Enemy(tilezeroX + tileWidth * 6, tilezeroY + tileWidth * 0, 60, 90, "glyfo", 1, 0, 7, 
				2, false, glyfoImage, this));

		this.enemyList.add(new Enemy(tilezeroX + tileWidth * 21, tilezeroY + tileWidth * 2, 60, 90, "glyfosato", -1, 0, 7,
				2, false, glyfosatoImage, this));
		
		// enemies GAME PLAY 2
		this.enemyList2.add(new Enemy(tilezero2X + tileWidth2 * 6, tilezero2Y + tileWidth2 * 0, 80, 55, "moneybag", 1, 0, 7, 
				2, false, moneybagImage, this));

		this.enemyList2.add(new Enemy(tilezero2X + tileWidth2 * 21, tilezero2Y + tileWidth2 * 2, 68, 40, "cash", -1, 0, 7,
				2, false, cashImage, this));
		
		// enemies GAME PLAY 3
		
		this.enemyList3.add(new Enemy(tilezero3X + tileWidth3 * 6, tilezero3Y + tileWidth3 * 0, 80, 55, "roya", 1, 0, 7, 
				2, false, royaImage, this));
		
		this.enemyList3.add(new Enemy(tilezero3X + tileWidth3 * 21, tilezero3Y + tileWidth3 * 2, 80, 55, "roya2", -1, 0, 7,
				2, false, roya2Image, this));
		
		this.enemyList3.add(new Enemy(tilezero3X + tileWidth3 * 17, tilezero3Y + tileWidth3 * 10, 80, 55, "roya3", -1, 0, 7,
				2, false, roya3Image, this));
		
		// enemies GAME PLAY 4
		
		this.enemyList4.add(new Enemy(tilezero4X + tileWidth4 * 6, tilezero4Y + tileWidth4 * 0, 66, 70, "starbucks", 1, 0, 7, 
				2, false, starbucksImage, this));
		
		this.enemyList4.add(new Enemy(tilezero4X + tileWidth4 * 17, tilezero4Y + tileWidth4 * 10, 66, 70, "starbucks2", -1, 0, 7,
				2, false, starbucks2Image, this));
		
		
		

	/*	this.enemyList.add(new Enemy(tilezeroX + tileWidth * 17, tilezeroY + tileWidth * 10, 49, 49, "unkwon", -1, 0, 7,
				2, false, unkwonImage, this));*/

		

		//GAME PLAY 1

		for (int i = 0; i < this.rows; i++) {
			for (int j = 0; j < this.colums; j++) {
				this.tileArray[i][j] = new Tile(this.tilezeroX + (this.tileWidth * j),
						this.tilezeroY + (this.tileWidth * i), this.tileWidth, this.tileWidth, 0, false, this);
				this.tileArray[i][j].setMatX(i);
				this.tileArray[i][j].setMatY(j);
			}
			
		}
			
		//GAME PLAY 2	
			
			for (int i = 0; i < this.rows2; i++) {
				for (int j = 0; j < this.colums2; j++) {
					this.tileArray2[i][j] = new Tile(this.tilezero2X + (this.tileWidth2 * j),
							this.tilezero2Y + (this.tileWidth2 * i), this.tileWidth2, this.tileWidth2, 0, false, this);
					this.tileArray2[i][j].setMatX(i);
					this.tileArray2[i][j].setMatY(j);
		    }
		}
			
        //GAME PLAY 3	
			
			for (int i = 0; i < this.rows3; i++) {
				for (int j = 0; j < this.colums3; j++) {
					this.tileArray3[i][j] = new Tile(this.tilezero3X + (this.tileWidth3 * j),
							this.tilezero3Y + (this.tileWidth3 * i), this.tileWidth3, this.tileWidth3, 0, false, this);
					this.tileArray3[i][j].setMatX(i);
					this.tileArray3[i][j].setMatY(j);
	     	}
		}
			
        //GAME PLAY 4	
			
			for (int i = 0; i < this.rows4; i++) {
				for (int j = 0; j < this.colums4; j++) {
					this.tileArray4[i][j] = new Tile(this.tilezero4X + (this.tileWidth4 * j),
							this.tilezero4Y + (this.tileWidth4 * i), this.tileWidth4, this.tileWidth4, 0, false, this);
					this.tileArray4[i][j].setMatX(i);
					this.tileArray4[i][j].setMatY(j);
	     	}
		}
			
			

	//	GAME PLAY 1	
			
		// row 0
		this.tileArray[0][6].setType(1);
		this.tileArray[0][7].setType(1);
		this.tileArray[0][8].setType(1);
		this.tileArray[0][9].setType(1);
		this.tileArray[0][10].setType(1);
		this.tileArray[0][11].setType(1);
		this.tileArray[0][12].setType(1);

		// row 1
		this.tileArray[1][3].setType(1);
		this.tileArray[1][4].setType(1);
		this.tileArray[1][5].setType(1);
		this.tileArray[1][6].setType(1);
		this.tileArray[1][12].setType(1);

		// row 2
		this.tileArray[2][3].setType(1);
		this.tileArray[2][12].setType(1);
		this.tileArray[2][13].setType(1);
		this.tileArray[2][14].setType(1);
		this.tileArray[2][15].setType(1);
		this.tileArray[2][16].setType(1);
		this.tileArray[2][17].setType(1);
		this.tileArray[2][18].setType(1);
		this.tileArray[2][19].setType(1);
		this.tileArray[2][20].setType(1);
		this.tileArray[2][21].setType(1);

		// row 3
		this.tileArray[3][3].setType(1);
		this.tileArray[3][12].setType(1);
		this.tileArray[3][18].setType(1);
		this.tileArray[3][21].setType(1);

		// row 4
		this.tileArray[4][0].setType(1);
		this.tileArray[4][1].setType(1);
		this.tileArray[4][2].setType(1);
		this.tileArray[4][3].setType(1);
		this.tileArray[4][12].setType(1);
		this.tileArray[4][18].setType(1);
		this.tileArray[4][21].setType(1);

		// row 5
		this.tileArray[5][0].setType(1);
		this.tileArray[5][7].setType(1);
		this.tileArray[5][8].setType(1);
		this.tileArray[5][9].setType(1);
		this.tileArray[5][10].setType(1);
		this.tileArray[5][11].setType(1);
		this.tileArray[5][12].setType(1);
		this.tileArray[5][18].setType(1);
		this.tileArray[5][19].setType(1);
		this.tileArray[5][20].setType(1);
		this.tileArray[5][21].setType(1);

		// row 6
		this.tileArray[6][0].setType(1);
		this.tileArray[6][7].setType(1);
		this.tileArray[6][12].setType(1);
		this.tileArray[6][21].setType(1);

		// row 7
		this.tileArray[7][0].setType(1);
		this.tileArray[7][7].setType(1);
		this.tileArray[7][12].setType(1);
		this.tileArray[7][13].setType(1);
		this.tileArray[7][14].setType(1);
		this.tileArray[7][15].setType(1);
		this.tileArray[7][16].setType(1);
		this.tileArray[7][17].setType(1);
		this.tileArray[7][21].setType(1);

		// row 8
		this.tileArray[8][0].setType(1);
		this.tileArray[8][1].setType(1);
		this.tileArray[8][2].setType(1);
		this.tileArray[8][3].setType(1);
		this.tileArray[8][4].setType(1);
		this.tileArray[8][5].setType(1);
		this.tileArray[8][6].setType(1);
		this.tileArray[8][7].setType(1);
		this.tileArray[8][8].setType(1);
		this.tileArray[8][9].setType(1);
		this.tileArray[8][10].setType(1);
		this.tileArray[8][11].setType(1);
		this.tileArray[8][12].setType(1);
		this.tileArray[8][17].setType(1);
		this.tileArray[8][18].setType(1);
		this.tileArray[8][19].setType(1);
		this.tileArray[8][20].setType(1);
		this.tileArray[8][21].setType(1);

		// row 9
		this.tileArray[9][4].setType(1);
		this.tileArray[9][12].setType(1);
		this.tileArray[9][17].setType(1);

		// row 10
		this.tileArray[10][4].setType(1);
		this.tileArray[10][5].setType(1);
		this.tileArray[10][6].setType(1);
		this.tileArray[10][7].setType(1);
		this.tileArray[10][8].setType(1);
		this.tileArray[10][9].setType(1);
		this.tileArray[10][10].setType(1);
		this.tileArray[10][11].setType(1);
		this.tileArray[10][12].setType(1);
		this.tileArray[10][13].setType(1);
		this.tileArray[10][14].setType(1);
		this.tileArray[10][15].setType(1);
		this.tileArray[10][16].setType(1);
		this.tileArray[10][17].setType(1);

		//GAME PLAY 1
		
		// Save spawn tiles
		for (int i = 0; i < this.rows; i++) {
			for (int j = 0; j < this.colums; j++) {
				if (tileArray[i][j].getType() == 1) {
					spawnTiles.add(tileArray[i][j]);
				}
			}
		}
		
		// GAME PLAY 2
		
		// row 2
		
				this.tileArray2[2][15].setType(2);
				this.tileArray2[2][16].setType(2);
				this.tileArray2[2][17].setType(2);
				this.tileArray2[2][18].setType(2);
				this.tileArray2[2][19].setType(2);
				this.tileArray2[2][20].setType(2);
				this.tileArray2[2][21].setType(2);
			

				// row 3
				this.tileArray2[3][4].setType(2);
				this.tileArray2[3][15].setType(2);
				this.tileArray2[3][21].setType(2);

				// row 4
				
				this.tileArray2[4][4].setType(2);
				this.tileArray2[4][11].setType(2);
				this.tileArray2[4][12].setType(2);
				this.tileArray2[4][13].setType(2);
				this.tileArray2[4][14].setType(2);
				this.tileArray2[4][15].setType(2);
				this.tileArray2[4][21].setType(2);
				
			

				// row 5
				this.tileArray2[5][4].setType(2);
				this.tileArray2[5][11].setType(2);
				this.tileArray2[5][15].setType(2);
				this.tileArray2[5][21].setType(2);

				// row 6
				this.tileArray2[6][4].setType(2);
				this.tileArray2[6][9].setType(2);
				this.tileArray2[6][10].setType(2);
				this.tileArray2[6][11].setType(2);
				this.tileArray2[6][12].setType(2);
				this.tileArray2[6][13].setType(2);
				this.tileArray2[6][14].setType(2);
				this.tileArray2[6][15].setType(2);
				this.tileArray2[6][21].setType(2);

				// row 7
				this.tileArray2[7][4].setType(2);
				this.tileArray2[7][9].setType(2);
				this.tileArray2[7][11].setType(2);
				this.tileArray2[7][15].setType(2);
				this.tileArray2[7][16].setType(2);
				this.tileArray2[7][17].setType(2);
				this.tileArray2[7][18].setType(2);
				this.tileArray2[7][19].setType(2);
				this.tileArray2[7][20].setType(2);
				this.tileArray2[7][21].setType(2);

				// row 8
			
				this.tileArray2[8][1].setType(2);
				this.tileArray2[8][2].setType(2);
				this.tileArray2[8][3].setType(2);
				this.tileArray2[8][4].setType(2);
				this.tileArray2[8][5].setType(2);
				this.tileArray2[8][6].setType(2);
				this.tileArray2[8][7].setType(2);
				this.tileArray2[8][8].setType(2);
				this.tileArray2[8][9].setType(2);
				
				this.tileArray2[8][11].setType(2);
				this.tileArray2[8][18].setType(2);
				this.tileArray2[8][21].setType(2);

				// row 9
				this.tileArray2[9][1].setType(2);
				this.tileArray2[9][7].setType(2);
				this.tileArray2[9][11].setType(2);
				this.tileArray2[9][18].setType(2);
				this.tileArray2[9][21].setType(2);

				// row 10
				this.tileArray2[10][1].setType(2);
				this.tileArray2[10][2].setType(2);
				this.tileArray2[10][3].setType(2);
				this.tileArray2[10][4].setType(2);
				this.tileArray2[10][5].setType(2);
				this.tileArray2[10][6].setType(2);
				this.tileArray2[10][7].setType(2);
				this.tileArray2[10][11].setType(2);
				this.tileArray2[10][12].setType(2);
				this.tileArray2[10][13].setType(2);
				this.tileArray2[10][14].setType(2);
				this.tileArray2[10][15].setType(2);
				this.tileArray2[10][16].setType(2);
				this.tileArray2[10][17].setType(2);
				this.tileArray2[10][18].setType(2);
				this.tileArray2[10][19].setType(2);
				this.tileArray2[10][20].setType(2);
				this.tileArray2[10][21].setType(2);
				
				//GAME PLAY 2
				
				// Save spawn tiles 2
				
				for (int i = 0; i < this.rows2; i++) {
					for (int j = 0; j < this.colums2; j++) {
						if (tileArray2[i][j].getType() == 2) {
							spawnTiles2.add(tileArray2[i][j]);
						}
					}
				}
				
		
		// GAME PLAY 3
				
				// row 0
				this.tileArray3[0][0].setType(3);
				this.tileArray3[0][1].setType(3);
				this.tileArray3[0][2].setType(3);
				this.tileArray3[0][3].setType(3);
				this.tileArray3[0][6].setType(3);
				this.tileArray3[0][7].setType(3);
				this.tileArray3[0][8].setType(3);
				this.tileArray3[0][9].setType(3);
				this.tileArray3[0][10].setType(3);
				this.tileArray3[0][11].setType(3);
				this.tileArray3[0][12].setType(3);
				this.tileArray3[0][13].setType(3);
				this.tileArray3[0][14].setType(3);
				this.tileArray3[0][15].setType(3);
				this.tileArray3[0][16].setType(3);
				this.tileArray3[0][17].setType(3);
				this.tileArray3[0][18].setType(3);
				this.tileArray3[0][19].setType(3);
				this.tileArray3[0][20].setType(3);
				this.tileArray3[0][21].setType(3);
				
				

				// row 1
				
				this.tileArray3[1][0].setType(3);
				this.tileArray3[1][1].setType(3);
				this.tileArray3[1][3].setType(3);
				this.tileArray3[1][4].setType(3);
				this.tileArray3[1][5].setType(3);
				this.tileArray3[1][6].setType(3);
				this.tileArray3[1][14].setType(3);
				this.tileArray3[1][18].setType(3);
				this.tileArray3[1][21].setType(3);
				
				
				// row 2
				
			    this.tileArray3[2][0].setType(3);
			    this.tileArray3[2][1].setType(3);
				this.tileArray3[2][2].setType(3);
				this.tileArray3[2][3].setType(3);
				this.tileArray3[2][6].setType(3);
				this.tileArray3[2][14].setType(3);
				this.tileArray3[2][18].setType(3);
				this.tileArray3[2][21].setType(3);
					

				// row 3
				this.tileArray3[3][0].setType(3);
				this.tileArray3[3][2].setType(3);
				this.tileArray3[3][6].setType(3);
				this.tileArray3[3][9].setType(3);
				this.tileArray3[3][10].setType(3);
				this.tileArray3[3][11].setType(3);
				this.tileArray3[3][12].setType(3);
				this.tileArray3[3][13].setType(3);
				this.tileArray3[3][14].setType(3);
				this.tileArray3[3][15].setType(3);
				this.tileArray3[3][16].setType(3);
				this.tileArray3[3][17].setType(3);
				this.tileArray3[3][18].setType(3);
				this.tileArray3[3][21].setType(3);
				
			
				// row 4
						
				this.tileArray3[4][0].setType(3);
				this.tileArray3[4][2].setType(3);
				this.tileArray3[4][3].setType(3);
				this.tileArray3[4][4].setType(3);
				this.tileArray3[4][5].setType(3);
				this.tileArray3[4][6].setType(3);
				this.tileArray3[4][9].setType(3);
				this.tileArray3[4][14].setType(3);
				this.tileArray3[4][18].setType(3);
				this.tileArray3[4][19].setType(3);
				this.tileArray3[4][20].setType(3);
				this.tileArray3[4][21].setType(3);
			

				// row 5
				this.tileArray3[5][0].setType(3);
				this.tileArray3[5][4].setType(3);
				this.tileArray3[5][9].setType(3);
				this.tileArray3[5][14].setType(3);
				this.tileArray3[5][19].setType(3);
				this.tileArray3[5][21].setType(3);

				// row 6
				this.tileArray3[6][0].setType(3);
				this.tileArray3[6][4].setType(3);
				this.tileArray3[6][9].setType(3);
				this.tileArray3[6][14].setType(3);
				this.tileArray3[6][19].setType(3);
				this.tileArray3[6][21].setType(3);
			

				// row 7
				this.tileArray3[7][0].setType(3);
				this.tileArray3[7][4].setType(3);
				this.tileArray3[7][7].setType(3);
				this.tileArray3[7][9].setType(3);
				this.tileArray3[7][14].setType(3);
				this.tileArray3[7][16].setType(3);
				this.tileArray3[7][17].setType(3);
				this.tileArray3[7][18].setType(3);
				this.tileArray3[7][19].setType(3);
				this.tileArray3[7][21].setType(3);

				// row 8
					
				this.tileArray3[8][0].setType(3);
				this.tileArray3[8][4].setType(3);
				this.tileArray3[8][7].setType(3);
				this.tileArray3[8][9].setType(3);
				this.tileArray3[8][14].setType(3);
				this.tileArray3[8][16].setType(3);
				this.tileArray3[8][21].setType(3);
			
				// row 9
				this.tileArray3[9][0].setType(3);
				this.tileArray3[9][1].setType(3);
				this.tileArray3[9][2].setType(3);
				this.tileArray3[9][3].setType(3);
				this.tileArray3[9][4].setType(3);
				this.tileArray3[9][5].setType(3);
				this.tileArray3[9][6].setType(3);
				this.tileArray3[9][7].setType(3);
				this.tileArray3[9][8].setType(3);
				this.tileArray3[9][9].setType(3);
				this.tileArray3[9][10].setType(3);
				this.tileArray3[9][11].setType(3);
				this.tileArray3[9][12].setType(3);
				this.tileArray3[9][14].setType(3);
				this.tileArray3[9][16].setType(3);
				this.tileArray3[9][18].setType(3);
				this.tileArray3[9][19].setType(3);
				this.tileArray3[9][20].setType(3);
				this.tileArray3[9][21].setType(3);
				
				// row 10
				this.tileArray3[10][12].setType(3);
				this.tileArray3[10][13].setType(3);
				this.tileArray3[10][14].setType(3);
				this.tileArray3[10][15].setType(3);
				this.tileArray3[10][16].setType(3);
				this.tileArray3[10][17].setType(3);
				this.tileArray3[10][18].setType(3);
				this.tileArray3[10][21].setType(3);
			
						
				//GAME PLAY 3
						
				// Save spawn tiles 3
						
				for (int i = 0; i < this.rows3; i++) {
					for (int j = 0; j < this.colums3; j++) {
						  if (tileArray3[i][j].getType() == 3) {
							  spawnTiles3.add(tileArray3[i][j]);
						}
					}
				}
				
				
				
				//GAME PLAY 4	
				
				
				// row 0
				this.tileArray4[0][6].setType(4);
				this.tileArray4[0][7].setType(4);
				this.tileArray4[0][8].setType(4);
				this.tileArray4[0][9].setType(4);
				this.tileArray4[0][10].setType(4);
				this.tileArray4[0][11].setType(4);
				this.tileArray4[0][12].setType(4);

				// row 1
				this.tileArray4[1][3].setType(4);
				this.tileArray4[1][4].setType(4);
				this.tileArray4[1][5].setType(4);
				this.tileArray4[1][6].setType(4);
				this.tileArray4[1][7].setType(4);
				this.tileArray4[1][8].setType(4);
				this.tileArray4[1][9].setType(4);
				this.tileArray4[1][10].setType(4);
				this.tileArray4[1][11].setType(4);
				this.tileArray4[1][12].setType(4);

				// row 2
				this.tileArray4[2][3].setType(4);
				this.tileArray4[2][4].setType(4);
				this.tileArray4[2][5].setType(4);
				this.tileArray4[2][6].setType(4);
				this.tileArray4[2][7].setType(4);
				this.tileArray4[2][8].setType(4);
				this.tileArray4[2][9].setType(4);
				this.tileArray4[2][10].setType(4);
				this.tileArray4[2][11].setType(4);
				this.tileArray4[2][12].setType(4);
				this.tileArray4[2][13].setType(4);
				this.tileArray4[2][14].setType(4);
				this.tileArray4[2][15].setType(4);
				this.tileArray4[2][16].setType(4);
				this.tileArray4[2][17].setType(4);
				this.tileArray4[2][18].setType(4);
				this.tileArray4[2][19].setType(4);
				this.tileArray4[2][20].setType(4);
				this.tileArray4[2][21].setType(4);
			
				// row 3
				this.tileArray4[3][3].setType(4);
				this.tileArray4[3][4].setType(4);
				this.tileArray4[3][5].setType(4);
				this.tileArray4[3][6].setType(4);
				this.tileArray4[3][12].setType(4);
				this.tileArray4[3][18].setType(4);
				this.tileArray4[3][19].setType(4);
				this.tileArray4[3][20].setType(4);
				this.tileArray4[3][21].setType(4);

				// row 4
				this.tileArray4[4][0].setType(4);
				this.tileArray4[4][1].setType(4);
				this.tileArray4[4][2].setType(4);
				this.tileArray4[4][3].setType(4);
				this.tileArray4[4][4].setType(4);
				this.tileArray4[4][5].setType(4);
				this.tileArray4[4][12].setType(4);
				this.tileArray4[4][18].setType(4);
				this.tileArray4[4][19].setType(4);
				this.tileArray4[4][20].setType(4);
				this.tileArray4[4][21].setType(4);


				// row 5
				this.tileArray4[5][0].setType(4);
				this.tileArray4[5][1].setType(4);
				this.tileArray4[5][2].setType(4);
				this.tileArray4[5][3].setType(4);
				this.tileArray4[5][4].setType(4);
				this.tileArray4[5][5].setType(4);
				this.tileArray4[5][6].setType(4);
				this.tileArray4[5][7].setType(4);
				this.tileArray4[5][8].setType(4);
				this.tileArray4[5][9].setType(4);
				this.tileArray4[5][10].setType(4);
				this.tileArray4[5][11].setType(4);
				this.tileArray4[5][12].setType(4);
				this.tileArray4[5][18].setType(4);
				this.tileArray4[5][19].setType(4);
				this.tileArray4[5][20].setType(4);
				this.tileArray4[5][21].setType(4);

				// row 6
				this.tileArray4[6][0].setType(4);
				this.tileArray4[6][1].setType(4);
				this.tileArray4[6][2].setType(4);
				this.tileArray4[6][3].setType(4);
				this.tileArray4[6][7].setType(4);
				this.tileArray4[6][11].setType(4);
				this.tileArray4[6][12].setType(4);
				this.tileArray4[6][21].setType(4);
				
				// row 7
				this.tileArray4[7][0].setType(4);
				this.tileArray4[7][1].setType(4);
				this.tileArray4[7][2].setType(4);
				this.tileArray4[7][3].setType(4);
				this.tileArray4[7][7].setType(4);
				this.tileArray4[7][11].setType(4);
				this.tileArray4[7][12].setType(4);
				this.tileArray4[7][13].setType(4);
				this.tileArray4[7][14].setType(4);
				this.tileArray4[7][15].setType(4);
				this.tileArray4[7][16].setType(4);
				this.tileArray4[7][17].setType(4);
				this.tileArray4[7][18].setType(4);
				this.tileArray4[7][19].setType(4);
				this.tileArray4[7][20].setType(4);
				this.tileArray4[7][21].setType(4);

				// row 8
				this.tileArray4[8][0].setType(4);
				this.tileArray4[8][1].setType(4);
				this.tileArray4[8][2].setType(4);
				this.tileArray4[8][3].setType(4);
				this.tileArray4[8][4].setType(4);
				this.tileArray4[8][5].setType(4);
				this.tileArray4[8][6].setType(4);
				this.tileArray4[8][7].setType(4);
				this.tileArray4[8][8].setType(4);
				this.tileArray4[8][9].setType(4);
				this.tileArray4[8][10].setType(4);
				this.tileArray4[8][11].setType(4);
				this.tileArray4[8][12].setType(4);
				this.tileArray4[8][13].setType(4);
				this.tileArray4[8][14].setType(4);
				this.tileArray4[8][15].setType(4);
				this.tileArray4[8][16].setType(4);
				this.tileArray4[8][17].setType(4);
				this.tileArray4[8][18].setType(4);
				this.tileArray4[8][19].setType(4);
				this.tileArray4[8][20].setType(4);
				this.tileArray4[8][21].setType(4);

				// row 9
				this.tileArray4[9][4].setType(4);
				this.tileArray4[9][5].setType(4);
				this.tileArray4[9][6].setType(4);
				this.tileArray4[9][7].setType(4);
				this.tileArray4[9][8].setType(4);
				this.tileArray4[9][9].setType(4);
				this.tileArray4[9][10].setType(4);
				this.tileArray4[9][11].setType(4);
				this.tileArray4[9][12].setType(4);
				this.tileArray4[9][13].setType(4);
				this.tileArray4[9][14].setType(4);
				this.tileArray4[9][15].setType(4);
				this.tileArray4[9][16].setType(4);
				this.tileArray4[9][17].setType(4);

				// row 10
				this.tileArray4[10][4].setType(4);
				this.tileArray4[10][5].setType(4);
				this.tileArray4[10][6].setType(4);
				this.tileArray4[10][7].setType(4);
				this.tileArray4[10][8].setType(4);
				this.tileArray4[10][9].setType(4);
				this.tileArray4[10][10].setType(4);
				this.tileArray4[10][11].setType(4);
				this.tileArray4[10][12].setType(4);
				this.tileArray4[10][13].setType(4);
				this.tileArray4[10][14].setType(4);
				this.tileArray4[10][15].setType(4);
				this.tileArray4[10][16].setType(4);
				this.tileArray4[10][17].setType(4);
				
				
				//GAME PLAY 4
				
				// Save spawn tiles 4
						
				for (int i = 0; i < this.rows4; i++) {
					for (int j = 0; j < this.colums4; j++) {
						  if (tileArray4[i][j].getType() == 4) {
							  spawnTiles4.add(tileArray4[i][j]);
						}
					}
				}	
				
		
		// GAME PLAY 1

		// Set change paths
		// Left Bottom
		
		leftBottom = new Path(tilezeroX + tileWidth * 12, tilezeroY + tileWidth * 0, tileWidth, tileWidth,
				"left,bottom", this);

		leftBottom2 = new Path(tilezeroX + tileWidth * 21, tilezeroY + tileWidth * 2, tileWidth, tileWidth,
				"left,bottom", this);

		leftBottom3 = new Path(tilezeroX + tileWidth * 17, tilezeroY + tileWidth * 7, tileWidth, tileWidth,
				"left,bottom", this);

		// Top Left Right
		topLeftRight = new Path(tilezeroX + tileWidth * 12, tilezeroY + tileWidth * 10, tileWidth, tileWidth,
				"top,left,right", this);

		topLeftRight2 = new Path(tilezeroX + tileWidth * 7, tilezeroY + tileWidth * 8, tileWidth, tileWidth,
				"top,left,right", this);

		// Right Bottom
		rightBottom = new Path(tilezeroX + tileWidth * 6, tilezeroY + tileWidth * 0, tileWidth, tileWidth,
				"right,bottom", this);

		rightBottom2 = new Path(tilezeroX + tileWidth * 3, tilezeroY + tileWidth * 1, tileWidth, tileWidth,
				"right,bottom", this);

		rightBottom3 = new Path(tilezeroX + tileWidth * 0, tilezeroY + tileWidth * 4, tileWidth, tileWidth,
				"right,bottom", this);

		rightBottom4 = new Path(tilezeroX + tileWidth * 7, tilezeroY + tileWidth * 5, tileWidth, tileWidth,
				"right,bottom", this);

		// Top Bottom Right
		topBottomRight = new Path(tilezeroX + tileWidth * 12, tilezeroY + tileWidth * 2, tileWidth, tileWidth,
				"top,bottom,right", this);

		topBottomRight2 = new Path(tilezeroX + tileWidth * 12, tilezeroY + tileWidth * 7, tileWidth, tileWidth,
				"top,bottom,right", this);

		topBottomRight3 = new Path(tilezeroX + tileWidth * 17, tilezeroY + tileWidth * 8, tileWidth, tileWidth,
				"top,bottom,right", this);

		// Bottom Left Right
		bottomLeftRight = new Path(tilezeroX + tileWidth * 4, tilezeroY + tileWidth * 8, tileWidth, tileWidth,
				"bottom,left,right", this);

		bottomLeftRight2 = new Path(tilezeroX + tileWidth * 18, tilezeroY + tileWidth * 2, tileWidth, tileWidth,
				"bottom,left,right", this);

		// Top Left Bottom
		topLeftBottom = new Path(tilezeroX + tileWidth * 12, tilezeroY + tileWidth * 5, tileWidth, tileWidth,
				"top,left,bottom", this);

		topLeftBottom2 = new Path(tilezeroX + tileWidth * 12, tilezeroY + tileWidth * 8, tileWidth, tileWidth,
				"top,left,bottom", this);

		topLeftBottom3 = new Path(tilezeroX + tileWidth * 21, tilezeroY + tileWidth * 5, tileWidth, tileWidth,
				"top,left,bottom", this);

		// Top Left
		topLeft = new Path(tilezeroX + tileWidth * 6, tilezeroY + tileWidth * 1, tileWidth, tileWidth, "top,left",
				this);

		topLeft2 = new Path(tilezeroX + tileWidth * 3, tilezeroY + tileWidth * 4, tileWidth, tileWidth, "top,left",
				this);

		topLeft3 = new Path(tilezeroX + tileWidth * 17, tilezeroY + tileWidth * 10, tileWidth, tileWidth, "top,left",
				this);

		topLeft4 = new Path(tilezeroX + tileWidth * 21, tilezeroY + tileWidth * 8, tileWidth, tileWidth, "top,left",
				this);

		topRight = new Path(tilezeroX + tileWidth * 4, tilezeroY + tileWidth * 10, tileWidth, tileWidth, "top,right",
				this);
		topRight2 = new Path(tilezeroX + tileWidth * 18, tilezeroY + tileWidth * 5, tileWidth, tileWidth, "top,right",
				this);
		topRight3 = new Path(tilezeroX + tileWidth * 0, tilezeroY + tileWidth * 8, tileWidth, tileWidth, "top,right",
				this);
		
	// GAME PLAY 2

			// Set change paths
		
			// Left Bottom
			
			left2Bottom = new Path(tilezero2X + tileWidth2 * 12, tilezero2Y + tileWidth2 * 0, tileWidth2, tileWidth2,
					"left,bottom", this);

			left2Bottom2 = new Path(tilezero2X + tileWidth2 * 21, tilezero2Y + tileWidth2 * 2, tileWidth2, tileWidth2,
					"left,bottom", this);

			left2Bottom3 = new Path(tilezero2X + tileWidth2 * 17, tilezero2Y + tileWidth2 * 7, tileWidth2, tileWidth2,
					"left,bottom", this);

			// Top Left Right
			
			topLeft2Right = new Path(tilezero2X + tileWidth2 * 12, tilezero2Y + tileWidth2 * 10, tileWidth2, tileWidth2,
					"top,left,right", this);

			topLeft2Right2 = new Path(tilezero2X + tileWidth2 * 7, tilezero2Y + tileWidth2 * 8, tileWidth2, tileWidth2,
					"top,left,right", this);

			// Right Bottom
			right2Bottom = new Path(tilezero2X + tileWidth2 * 6, tilezero2Y + tileWidth2 * 0, tileWidth2, tileWidth2,
					"right,bottom", this);

			right2Bottom2 = new Path(tilezero2X + tileWidth2 * 3, tilezero2Y + tileWidth2 * 1, tileWidth2, tileWidth2,
					"right,bottom", this);

			right2Bottom3 = new Path(tilezero2X + tileWidth2 * 0, tilezero2Y + tileWidth2 * 4, tileWidth2, tileWidth2,
					"right,bottom", this);

			right2Bottom4 = new Path(tilezero2X + tileWidth2 * 7, tilezero2Y + tileWidth2 * 5, tileWidth2, tileWidth2,
					"right,bottom", this);

			// Top Bottom Right
			topBottom2Right = new Path(tilezero2X + tileWidth2 * 12, tilezero2Y + tileWidth2 * 2, tileWidth2, tileWidth2,
					"top,bottom,right", this);

			topBottom2Right2 = new Path(tilezero2X + tileWidth2 * 12, tilezero2Y + tileWidth2 * 7, tileWidth2, tileWidth2,
					"top,bottom,right", this);

			topBottom2Right3 = new Path(tilezero2X + tileWidth2 * 17, tilezero2Y + tileWidth2 * 8, tileWidth2, tileWidth2,
					"top,bottom,right", this);

			// Bottom Left Right
			bottom2LeftRight = new Path(tilezero2X + tileWidth2 * 4, tilezero2Y + tileWidth2 * 8, tileWidth2, tileWidth2,
					"bottom,left,right", this);

			bottom2LeftRight2 = new Path(tilezero2X + tileWidth2 * 18, tilezero2Y + tileWidth2 * 2, tileWidth2, tileWidth2,
					"bottom,left,right", this);

			// Top Left Bottom
			topLeft2Bottom = new Path(tilezero2X + tileWidth2 * 12, tilezero2Y + tileWidth2 * 5, tileWidth2, tileWidth2,
					"top,left,bottom", this);

			topLeft2Bottom2 = new Path(tilezero2X + tileWidth2 * 12, tilezero2Y + tileWidth2 * 8, tileWidth2, tileWidth2,
					"top,left,bottom", this);

			topLeft2Bottom3 = new Path(tilezero2X + tileWidth2 * 21, tilezero2Y + tileWidth2 * 5, tileWidth2, tileWidth2,
					"top,left,bottom", this);

			// Top Left
			top2Left = new Path(tilezero2X + tileWidth2 * 6, tilezero2Y + tileWidth2 * 1, tileWidth2, tileWidth2, "top,left",
					this);

			top2Left2 = new Path(tilezero2X + tileWidth2 * 3, tilezero2Y + tileWidth2 * 4, tileWidth2, tileWidth2, "top,left",
					this);

			top2Left3 = new Path(tilezero2X + tileWidth2 * 17, tilezero2Y + tileWidth2 * 10, tileWidth2, tileWidth2, "top,left",
					this);

			top2Left4 = new Path(tilezero2X + tileWidth2 * 21, tilezero2Y + tileWidth2 * 8, tileWidth2, tileWidth2, "top,left",
					this);

			top2Right = new Path(tilezero2X + tileWidth2 * 4, tilezero2Y + tileWidth2 * 10, tileWidth2, tileWidth2, "top,right",
					this);
			top2Right2 = new Path(tilezero2X + tileWidth2 * 18, tilezero2Y + tileWidth2 * 5, tileWidth2, tileWidth2, "top,right",
					this);
			top2Right3 = new Path(tilezero2X + tileWidth2 * 0, tilezero2Y + tileWidth2 * 8, tileWidth2, tileWidth2, "top,right",
					this);
			
			
			
			// GAME PLAY 3

			// Set change paths
								
			// Left Bottom
									
			left3Bottom = new Path(tilezero3X + tileWidth3 * 12, tilezero3Y + tileWidth3 * 0, tileWidth3, tileWidth3,
			"left,bottom", this);

			left3Bottom2 = new Path(tilezero3X + tileWidth3 * 21, tilezero3Y + tileWidth3 * 2, tileWidth3, tileWidth3,
			"left,bottom", this);

			left3Bottom3 = new Path(tilezero3X + tileWidth3 * 17, tilezero3Y + tileWidth3 * 7, tileWidth3, tileWidth3,
			"left,bottom", this);

			// Top Left Right
									
			topLeft3Right = new Path(tilezero3X + tileWidth3 * 12, tilezero3Y + tileWidth3 * 10, tileWidth3, tileWidth3,
			"top,left,right", this);
						
			topLeft3Right2 = new Path(tilezero3X + tileWidth3 * 7, tilezero3Y + tileWidth3 * 8, tileWidth3, tileWidth3,
			"top,left,right", this);
						
     		// Right Bottom
			right3Bottom = new Path(tilezero3X + tileWidth3 * 6, tilezero3Y + tileWidth3 * 0, tileWidth3, tileWidth3,
			"right,bottom", this);

			right3Bottom2 = new Path(tilezero3X + tileWidth3 * 3, tilezero3Y + tileWidth3 * 1, tileWidth3, tileWidth3,
			"right,bottom", this);

			right3Bottom3 = new Path(tilezero3X + tileWidth3 * 0, tilezero3Y + tileWidth3 * 4, tileWidth3, tileWidth3,
			"right,bottom", this);

			right3Bottom4 = new Path(tilezero3X + tileWidth3 * 7, tilezero3Y + tileWidth3 * 5, tileWidth3, tileWidth3,
			"right,bottom", this);

			// Top Bottom Right
			topBottom3Right = new Path(tilezero3X + tileWidth3 * 12, tilezero3Y + tileWidth3 * 2, tileWidth3, tileWidth3,
			"top,bottom,right", this);

			topBottom3Right2 = new Path(tilezero3X + tileWidth3 * 12, tilezero3Y + tileWidth3 * 7, tileWidth3, tileWidth3,
			"top,bottom,right", this);

			topBottom3Right3 = new Path(tilezero3X + tileWidth3 * 17, tilezero3Y + tileWidth3 * 8, tileWidth3, tileWidth3,
			"top,bottom,right", this);

			// Bottom Left Right
			bottom3LeftRight = new Path(tilezero3X + tileWidth3 * 4, tilezero3Y + tileWidth3 * 8, tileWidth3, tileWidth3,
			"bottom,left,right", this);

			bottom3LeftRight2 = new Path(tilezero3X + tileWidth3 * 18, tilezero3Y + tileWidth3 * 2, tileWidth3, tileWidth3,
			"bottom,left,right", this);

			// Top Left Bottom
			topLeft3Bottom = new Path(tilezero3X + tileWidth3 * 12, tilezero3Y + tileWidth3 * 5, tileWidth3, tileWidth3,
			"top,left,bottom", this);

			topLeft3Bottom2 = new Path(tilezero3X + tileWidth3 * 12, tilezero3Y + tileWidth3 * 8, tileWidth3, tileWidth3,
			"top,left,bottom", this);

			topLeft3Bottom3 = new Path(tilezero3X + tileWidth3 * 21, tilezero3Y + tileWidth3 * 5, tileWidth3, tileWidth3,
			"top,left,bottom", this);

			// Top Left
			top3Left = new Path(tilezero3X + tileWidth3 * 6, tilezero3Y + tileWidth3 * 1, tileWidth3, tileWidth3, "top,left",
			this);

			top3Left2 = new Path(tilezero3X + tileWidth3 * 3, tilezero3Y + tileWidth3 * 4, tileWidth3, tileWidth3, "top,left",
			this);

			top3Left3 = new Path(tilezero3X + tileWidth3 * 17, tilezero3Y + tileWidth3 * 10, tileWidth3, tileWidth3, "top,left",
			this);

			top3Left4 = new Path(tilezero3X + tileWidth3 * 21, tilezero3Y + tileWidth3 * 8, tileWidth3, tileWidth3, "top,left",
				this);

			top3Right = new Path(tilezero3X + tileWidth3 * 4, tilezero3Y + tileWidth3 * 10, tileWidth3, tileWidth3, "top,right",
			this);
		
			top3Right2 = new Path(tilezero3X + tileWidth3 * 18, tilezero3Y + tileWidth3 * 5, tileWidth3, tileWidth3, "top,right",
			this);
				
			top3Right3 = new Path(tilezero3X + tileWidth3 * 0, tilezero3Y + tileWidth3 * 8, tileWidth3, tileWidth3, "top,right",
			this);
			
			// GAME PLAY 4

			// Set change paths
											
			// Left Bottom
												
			left4Bottom = new Path(tilezero4X + tileWidth4 * 12, tilezero4Y + tileWidth4 * 0, tileWidth4, tileWidth4,
			"left,bottom", this);

			left4Bottom2 = new Path(tilezero4X + tileWidth4 * 21, tilezero4Y + tileWidth4 * 2, tileWidth4, tileWidth4,
			"left,bottom", this);

			left4Bottom3 = new Path(tilezero4X + tileWidth4 * 17, tilezero4Y + tileWidth4 * 7, tileWidth4, tileWidth4,
			"left,bottom", this);

			// Top Left Right
												
			topLeft4Right = new Path(tilezero4X + tileWidth4 * 12, tilezero4Y + tileWidth4 * 10, tileWidth4, tileWidth4,
			"top,left,right", this);
									
			topLeft4Right2 = new Path(tilezero4X + tileWidth4 * 7, tilezero4Y + tileWidth4 * 8, tileWidth4, tileWidth4,
			"top,left,right", this);
									
			// Right Bottom
			right4Bottom = new Path(tilezero4X + tileWidth4 * 6, tilezero4Y + tileWidth4 * 0, tileWidth4, tileWidth4,
			"right,bottom", this);

			right4Bottom2 = new Path(tilezero4X + tileWidth4 * 3, tilezero4Y + tileWidth4 * 1, tileWidth4, tileWidth4,
			"right,bottom", this);

			right4Bottom3 = new Path(tilezero4X + tileWidth4 * 0, tilezero4Y + tileWidth4 * 4, tileWidth4, tileWidth4,
			"right,bottom", this);

			right4Bottom4 = new Path(tilezero4X + tileWidth4 * 7, tilezero4Y + tileWidth4 * 5, tileWidth4, tileWidth4,
			"right,bottom", this);

			// Top Bottom Right
			topBottom4Right = new Path(tilezero4X + tileWidth4 * 12, tilezero4Y + tileWidth4 * 2, tileWidth4, tileWidth4,
			"top,bottom,right", this);

			topBottom4Right2 = new Path(tilezero4X + tileWidth4 * 12, tilezero4Y + tileWidth4 * 7, tileWidth4, tileWidth4,
			"top,bottom,right", this);

			topBottom4Right3 = new Path(tilezero4X + tileWidth4 * 17, tilezero4Y + tileWidth4 * 8, tileWidth4, tileWidth4,
			"top,bottom,right", this);

			// Bottom Left Right
			bottom4LeftRight = new Path(tilezero4X + tileWidth4 * 4, tilezero4Y + tileWidth4 * 8, tileWidth4, tileWidth4,
			"bottom,left,right", this);

			bottom4LeftRight2 = new Path(tilezero4X + tileWidth4 * 18, tilezero4Y + tileWidth4 * 2, tileWidth4, tileWidth4,
			"bottom,left,right", this);

			// Top Left Bottom
			topLeft4Bottom = new Path(tilezero4X + tileWidth4 * 12, tilezero4Y + tileWidth4 * 5, tileWidth4, tileWidth4,
			"top,left,bottom", this);

			topLeft4Bottom2 = new Path(tilezero4X + tileWidth4 * 12, tilezero4Y + tileWidth4 * 8, tileWidth4, tileWidth4,
			"top,left,bottom", this);

			topLeft4Bottom3 = new Path(tilezero4X + tileWidth4 * 21, tilezero4Y + tileWidth4 * 5, tileWidth4, tileWidth4,
			"top,left,bottom", this);

			// Top Left
			top4Left = new Path(tilezero4X + tileWidth4 * 6, tilezero4Y + tileWidth4 * 1, tileWidth4, tileWidth4, "top,left",
			this);

			top4Left2 = new Path(tilezero4X + tileWidth4 * 3, tilezero4Y + tileWidth4 * 4, tileWidth4, tileWidth4, "top,left",
			this);

			top4Left3 = new Path(tilezero4X + tileWidth4 * 17, tilezero4Y + tileWidth4 * 10, tileWidth4, tileWidth4, "top,left",
			this);

			top4Left4 = new Path(tilezero4X + tileWidth4 * 21, tilezero4Y + tileWidth4 * 8, tileWidth4, tileWidth4, "top,left",
			this);

			top4Right = new Path(tilezero4X + tileWidth4 * 4, tilezero4Y + tileWidth4 * 10, tileWidth4, tileWidth4, "top,right",
			this);
					
			top4Right2 = new Path(tilezero4X + tileWidth4 * 18, tilezero4Y + tileWidth4 * 5, tileWidth4, tileWidth4, "top,right",
			this);
							
			top4Right3 = new Path(tilezero4X + tileWidth4 * 0, tilezero4Y + tileWidth4 * 8, tileWidth4, tileWidth4, "top,right",
			this);
						
		
	}

	public void setup() {
		background(155);
		
		

		screen = 0;
		treasureCount = 0;
		treasureCount2 = 0;
		treasureCount3 = 0;
		treasureCount4 = 0;
		
		

       // GAMEPLAY 1
		
		this.playerImage = loadImage("../img/cafecito.png");
		this.player = new Player(7 + tilezeroX + tileWidth * playerMatX, 3 + tilezeroY + tileWidth * playerMatY, 32, 40,
				49, 5, 0, this.playerImage, this);

		//GAMEPLAY2
		
		this.playerImage = loadImage("../img/cafecito.png");
		this.player2 = new Player(7 + tilezero2X + tileWidth2 * playerMat2X, 3 + tilezero2Y + tileWidth2 * playerMat2Y, 32, 40,
				49, 5, 0, this.playerImage, this);
		
		//GAMEPLAY3
		
		this.playerImage = loadImage("../img/cafecito.png");
		this.player3 = new Player(7 + tilezero3X + tileWidth3 * playerMat3X, 3 + tilezero3Y + tileWidth3 * playerMat3Y, 32, 40,
		49, 5, 0, this.playerImage, this);
		
		//GAMEPLAY4
		
		this.playerImage = loadImage("../img/cafeunder.png");
		this.player4 = new Player(7 + tilezero4X + tileWidth4 * playerMat4X, 3 + tilezero4Y + tileWidth4 * playerMat4Y, 32, 40,
		49, 5, 0, this.playerImage, this);
		
		
		// Images
		this.heart = loadImage("../img/vida.png");
		this.treasureImage = loadImage("../img/vitamina.png");
		this.treasureImage2 = loadImage("../img/llave.png");
		this.treasureImage3 = loadImage("../img/manzanilla.png");
		this.treasureImage4 = loadImage("../img/safelives.png");
		this.bombImage = loadImage("../img/bomb.png");

		// Add enemies
	
		glyfoImage = loadImage("../img/glyfosato.png");
		glyfosatoImage = loadImage("../img/glyfosato.png");
		cashImage = loadImage("../img/$.png");
	    moneybagImage = loadImage("../img/moneybag.png");
	    royaImage = loadImage("../img/roya.png");
	    roya2Image = loadImage("../img/roya.png");
	    roya3Image = loadImage("../img/roya.png");
	    starbucksImage = loadImage("../img/octopus.png");
	    starbucks2Image = loadImage("../img/octopus.png");
	    starbucks3Image = loadImage("../img/octopus.png");
	   
	 
       // enemies GAME PLAY 1
	    
		this.enemyList.add(new Enemy(tilezeroX + tileWidth * 6, tilezeroY + tileWidth * 0, 60, 90, "glyfo", 1, 0, 7, 
				3, false, glyfoImage, this));

		this.enemyList.add(new Enemy(tilezeroX + tileWidth * 21, tilezeroY + tileWidth * 2, 60, 90, "glyfosato", -1, 0, 7,
				2, false, glyfosatoImage, this));
		
		// enemies GAME PLAY 2
		this.enemyList2.add(new Enemy(tilezero2X + tileWidth2 * 6, tilezero2Y + tileWidth2 * 0, 80, 55, "moneybag", 1, 0, 7, 
				3, false, moneybagImage, this));

		this.enemyList2.add(new Enemy(tilezero2X + tileWidth2 * 21, tilezero2Y + tileWidth2 * 2, 68, 40, "cash", -1, 0, 7,
				2, false, cashImage, this));
		
		// enemies GAME PLAY 3
		
		this.enemyList3.add(new Enemy(tilezero3X + tileWidth3 * 6, tilezero3Y + tileWidth3 * 0, 80, 55, "roya", 1, 0, 7, 
				2, false, royaImage, this));
		
		this.enemyList3.add(new Enemy(tilezero3X + tileWidth3 * 21, tilezero3Y + tileWidth3 * 2, 80, 55, "roya2", -1, 0, 7,
				2, false, roya2Image, this));
		
		this.enemyList3.add(new Enemy(tilezero3X + tileWidth3 * 17, tilezero3Y + tileWidth3 * 10, 80, 55, "roya3", -1, 0, 7,
				2, false, roya3Image, this));
		
		// enemies GAME PLAY 4
		
		this.enemyList4.add(new Enemy(tilezero4X + tileWidth4 * 6, tilezero4Y + tileWidth4 * 0, 66, 70, "starbucks", 1, 0, 7, 
				2, false, starbucksImage, this));
		
		this.enemyList4.add(new Enemy(tilezero4X + tileWidth4 * 17, tilezero4Y + tileWidth4 * 10, 66, 70, "starbucks2", -1, 0, 7,
				2, false, starbucks2Image, this));
		
		this.enemyList4.add(new Enemy(tilezero4X + tileWidth4 * 17, tilezero4Y + tileWidth4 * 10, 66, 70, "starbucks3", -1, 0, 7,
				2, false, starbucks3Image, this));
		

	/*	this.enemyList.add(new Enemy(tilezeroX + tileWidth * 17, tilezeroY + tileWidth * 10, 49, 49, "unkwon", -1, 0, 7,
				2, false, unkwonImage, this));*/

		this.firstImage = loadImage("../img/logo.jpg");
		this.secondImage = loadImage("../img/2welcome.jpg");
		this.thirdImage = loadImage("../img/3history.jpg");
		this.fourthImage = loadImage("../img/4keyboard.jpg");
		this.fifthImage = loadImage("../img/5Mapaayuda.jpg");
		this.sixthImage = loadImage("../img/6Mapadeayudaoh.jpg");
		this.seventhImage = loadImage("../img/7Mapadeayudaoh.jpg");
		this.gameplayImage = loadImage("../img/Mapa1.png");
		this.gameplay2Image = loadImage("../img/level2a.png");
		this.gameplay3Image = loadImage("../img/level3.png");
		this.gameplay4Image = loadImage("../img/level4.png");
		this.deathScreen = loadImage("../img/lost.jpg");
		this.introlevel2 = loadImage("../img/10pear.jpg");
		this.introlevel3 = loadImage("../img/12pear.jpg");
		this.introlevel4 = loadImage("../img/14pear.jpg");
		this.weapon = loadImage("../img/15pear.jpg");
		this.goodluck = loadImage("../img/16pear.jpg");
		this.victory= loadImage("../img/victory.jpg");
		this.equipment= loadImage("../img/equipment.jpg");
		
		
		

		//GAME PLAY 1

		for (int i = 0; i < this.rows; i++) {
			for (int j = 0; j < this.colums; j++) {
				this.tileArray[i][j] = new Tile(this.tilezeroX + (this.tileWidth * j),
						this.tilezeroY + (this.tileWidth * i), this.tileWidth, this.tileWidth, 0, false, this);
				this.tileArray[i][j].setMatX(i);
				this.tileArray[i][j].setMatY(j);
			}
			
		}
			
		//GAME PLAY 2	
			
			for (int i = 0; i < this.rows2; i++) {
				for (int j = 0; j < this.colums2; j++) {
					this.tileArray2[i][j] = new Tile(this.tilezero2X + (this.tileWidth2 * j),
							this.tilezero2Y + (this.tileWidth2 * i), this.tileWidth2, this.tileWidth2, 0, false, this);
					this.tileArray2[i][j].setMatX(i);
					this.tileArray2[i][j].setMatY(j);
		    }
		}
			
        //GAME PLAY 3	
			
			for (int i = 0; i < this.rows3; i++) {
				for (int j = 0; j < this.colums3; j++) {
					this.tileArray3[i][j] = new Tile(this.tilezero3X + (this.tileWidth3 * j),
							this.tilezero3Y + (this.tileWidth3 * i), this.tileWidth3, this.tileWidth3, 0, false, this);
					this.tileArray3[i][j].setMatX(i);
					this.tileArray3[i][j].setMatY(j);
	     	}
		}
			
        //GAME PLAY 4	
			
			for (int i = 0; i < this.rows4; i++) {
				for (int j = 0; j < this.colums4; j++) {
					this.tileArray4[i][j] = new Tile(this.tilezero4X + (this.tileWidth4 * j),
							this.tilezero4Y + (this.tileWidth4 * i), this.tileWidth4, this.tileWidth4, 0, false, this);
					this.tileArray4[i][j].setMatX(i);
					this.tileArray4[i][j].setMatY(j);
	     	}
		}
			
			

	//	GAME PLAY 1	
			
		// row 0
		this.tileArray[0][6].setType(1);
		this.tileArray[0][7].setType(1);
		this.tileArray[0][8].setType(1);
		this.tileArray[0][9].setType(1);
		this.tileArray[0][10].setType(1);
		this.tileArray[0][11].setType(1);
		this.tileArray[0][12].setType(1);

		// row 1
		this.tileArray[1][3].setType(1);
		this.tileArray[1][4].setType(1);
		this.tileArray[1][5].setType(1);
		this.tileArray[1][6].setType(1);
		this.tileArray[1][12].setType(1);

		// row 2
		this.tileArray[2][3].setType(1);
		this.tileArray[2][12].setType(1);
		this.tileArray[2][13].setType(1);
		this.tileArray[2][14].setType(1);
		this.tileArray[2][15].setType(1);
		this.tileArray[2][16].setType(1);
		this.tileArray[2][17].setType(1);
		this.tileArray[2][18].setType(1);
		this.tileArray[2][19].setType(1);
		this.tileArray[2][20].setType(1);
		this.tileArray[2][21].setType(1);

		// row 3
		this.tileArray[3][3].setType(1);
		this.tileArray[3][12].setType(1);
		this.tileArray[3][18].setType(1);
		this.tileArray[3][21].setType(1);

		// row 4
		this.tileArray[4][0].setType(1);
		this.tileArray[4][1].setType(1);
		this.tileArray[4][2].setType(1);
		this.tileArray[4][3].setType(1);
		this.tileArray[4][12].setType(1);
		this.tileArray[4][18].setType(1);
		this.tileArray[4][21].setType(1);

		// row 5
		this.tileArray[5][0].setType(1);
		this.tileArray[5][7].setType(1);
		this.tileArray[5][8].setType(1);
		this.tileArray[5][9].setType(1);
		this.tileArray[5][10].setType(1);
		this.tileArray[5][11].setType(1);
		this.tileArray[5][12].setType(1);
		this.tileArray[5][18].setType(1);
		this.tileArray[5][19].setType(1);
		this.tileArray[5][20].setType(1);
		this.tileArray[5][21].setType(1);

		// row 6
		this.tileArray[6][0].setType(1);
		this.tileArray[6][7].setType(1);
		this.tileArray[6][12].setType(1);
		this.tileArray[6][21].setType(1);

		// row 7
		this.tileArray[7][0].setType(1);
		this.tileArray[7][7].setType(1);
		this.tileArray[7][12].setType(1);
		this.tileArray[7][13].setType(1);
		this.tileArray[7][14].setType(1);
		this.tileArray[7][15].setType(1);
		this.tileArray[7][16].setType(1);
		this.tileArray[7][17].setType(1);
		this.tileArray[7][21].setType(1);

		// row 8
		this.tileArray[8][0].setType(1);
		this.tileArray[8][1].setType(1);
		this.tileArray[8][2].setType(1);
		this.tileArray[8][3].setType(1);
		this.tileArray[8][4].setType(1);
		this.tileArray[8][5].setType(1);
		this.tileArray[8][6].setType(1);
		this.tileArray[8][7].setType(1);
		this.tileArray[8][8].setType(1);
		this.tileArray[8][9].setType(1);
		this.tileArray[8][10].setType(1);
		this.tileArray[8][11].setType(1);
		this.tileArray[8][12].setType(1);
		this.tileArray[8][17].setType(1);
		this.tileArray[8][18].setType(1);
		this.tileArray[8][19].setType(1);
		this.tileArray[8][20].setType(1);
		this.tileArray[8][21].setType(1);

		// row 9
		this.tileArray[9][4].setType(1);
		this.tileArray[9][12].setType(1);
		this.tileArray[9][17].setType(1);

		// row 10
		this.tileArray[10][4].setType(1);
		this.tileArray[10][5].setType(1);
		this.tileArray[10][6].setType(1);
		this.tileArray[10][7].setType(1);
		this.tileArray[10][8].setType(1);
		this.tileArray[10][9].setType(1);
		this.tileArray[10][10].setType(1);
		this.tileArray[10][11].setType(1);
		this.tileArray[10][12].setType(1);
		this.tileArray[10][13].setType(1);
		this.tileArray[10][14].setType(1);
		this.tileArray[10][15].setType(1);
		this.tileArray[10][16].setType(1);
		this.tileArray[10][17].setType(1);

		//GAME PLAY 1
		
		// Save spawn tiles
		for (int i = 0; i < this.rows; i++) {
			for (int j = 0; j < this.colums; j++) {
				if (tileArray[i][j].getType() == 1) {
					spawnTiles.add(tileArray[i][j]);
				}
			}
		}
		
		// GAME PLAY 2
		
		// row 2
		
				this.tileArray2[2][15].setType(2);
				this.tileArray2[2][16].setType(2);
				this.tileArray2[2][17].setType(2);
				this.tileArray2[2][18].setType(2);
				this.tileArray2[2][19].setType(2);
				this.tileArray2[2][20].setType(2);
				this.tileArray2[2][21].setType(2);
			

				// row 3
				this.tileArray2[3][4].setType(2);
				this.tileArray2[3][15].setType(2);
				this.tileArray2[3][21].setType(2);

				// row 4
				
				this.tileArray2[4][4].setType(2);
				this.tileArray2[4][11].setType(2);
				this.tileArray2[4][12].setType(2);
				this.tileArray2[4][13].setType(2);
				this.tileArray2[4][14].setType(2);
				this.tileArray2[4][15].setType(2);
				this.tileArray2[4][21].setType(2);
				
			

				// row 5
				this.tileArray2[5][4].setType(2);
				this.tileArray2[5][11].setType(2);
				this.tileArray2[5][15].setType(2);
				this.tileArray2[5][21].setType(2);

				// row 6
				this.tileArray2[6][4].setType(2);
				this.tileArray2[6][9].setType(2);
				this.tileArray2[6][10].setType(2);
				this.tileArray2[6][11].setType(2);
				this.tileArray2[6][12].setType(2);
				this.tileArray2[6][13].setType(2);
				this.tileArray2[6][14].setType(2);
				this.tileArray2[6][15].setType(2);
				this.tileArray2[6][21].setType(2);

				// row 7
				this.tileArray2[7][4].setType(2);
				this.tileArray2[7][9].setType(2);
				this.tileArray2[7][11].setType(2);
				this.tileArray2[7][15].setType(2);
				this.tileArray2[7][16].setType(2);
				this.tileArray2[7][17].setType(2);
				this.tileArray2[7][18].setType(2);
				this.tileArray2[7][19].setType(2);
				this.tileArray2[7][20].setType(2);
				this.tileArray2[7][21].setType(2);

				// row 8
			
				this.tileArray2[8][1].setType(2);
				this.tileArray2[8][2].setType(2);
				this.tileArray2[8][3].setType(2);
				this.tileArray2[8][4].setType(2);
				this.tileArray2[8][5].setType(2);
				this.tileArray2[8][6].setType(2);
				this.tileArray2[8][7].setType(2);
				this.tileArray2[8][8].setType(2);
				this.tileArray2[8][9].setType(2);
				
				this.tileArray2[8][11].setType(2);
				this.tileArray2[8][18].setType(2);
				this.tileArray2[8][21].setType(2);

				// row 9
				this.tileArray2[9][1].setType(2);
				this.tileArray2[9][7].setType(2);
				this.tileArray2[9][11].setType(2);
				this.tileArray2[9][18].setType(2);
				this.tileArray2[9][21].setType(2);

				// row 10
				this.tileArray2[10][1].setType(2);
				this.tileArray2[10][2].setType(2);
				this.tileArray2[10][3].setType(2);
				this.tileArray2[10][4].setType(2);
				this.tileArray2[10][5].setType(2);
				this.tileArray2[10][6].setType(2);
				this.tileArray2[10][7].setType(2);
				this.tileArray2[10][11].setType(2);
				this.tileArray2[10][12].setType(2);
				this.tileArray2[10][13].setType(2);
				this.tileArray2[10][14].setType(2);
				this.tileArray2[10][15].setType(2);
				this.tileArray2[10][16].setType(2);
				this.tileArray2[10][17].setType(2);
				this.tileArray2[10][18].setType(2);
				this.tileArray2[10][19].setType(2);
				this.tileArray2[10][20].setType(2);
				this.tileArray2[10][21].setType(2);
				
				//GAME PLAY 2
				
				// Save spawn tiles 2
				
				for (int i = 0; i < this.rows2; i++) {
					for (int j = 0; j < this.colums2; j++) {
						if (tileArray2[i][j].getType() == 2) {
							spawnTiles2.add(tileArray2[i][j]);
						}
					}
				}
				
		
		// GAME PLAY 3
				
				// row 0
				this.tileArray3[0][0].setType(3);
				this.tileArray3[0][1].setType(3);
				this.tileArray3[0][2].setType(3);
				this.tileArray3[0][3].setType(3);
				this.tileArray3[0][6].setType(3);
				this.tileArray3[0][7].setType(3);
				this.tileArray3[0][8].setType(3);
				this.tileArray3[0][9].setType(3);
				this.tileArray3[0][10].setType(3);
				this.tileArray3[0][11].setType(3);
				this.tileArray3[0][12].setType(3);
				this.tileArray3[0][13].setType(3);
				this.tileArray3[0][14].setType(3);
				this.tileArray3[0][15].setType(3);
				this.tileArray3[0][16].setType(3);
				this.tileArray3[0][17].setType(3);
				this.tileArray3[0][18].setType(3);
				this.tileArray3[0][19].setType(3);
				this.tileArray3[0][20].setType(3);
				this.tileArray3[0][21].setType(3);
				
				

				// row 1
				
				this.tileArray3[1][0].setType(3);
				this.tileArray3[1][1].setType(3);
				this.tileArray3[1][3].setType(3);
				this.tileArray3[1][4].setType(3);
				this.tileArray3[1][5].setType(3);
				this.tileArray3[1][6].setType(3);
				this.tileArray3[1][14].setType(3);
				this.tileArray3[1][18].setType(3);
				this.tileArray3[1][21].setType(3);
				
				
				// row 2
				
			    this.tileArray3[2][0].setType(3);
			    this.tileArray3[2][1].setType(3);
				this.tileArray3[2][2].setType(3);
				this.tileArray3[2][3].setType(3);
				this.tileArray3[2][6].setType(3);
				this.tileArray3[2][14].setType(3);
				this.tileArray3[2][18].setType(3);
				this.tileArray3[2][21].setType(3);
					

				// row 3
				this.tileArray3[3][0].setType(3);
				this.tileArray3[3][2].setType(3);
				this.tileArray3[3][6].setType(3);
				this.tileArray3[3][9].setType(3);
				this.tileArray3[3][10].setType(3);
				this.tileArray3[3][11].setType(3);
				this.tileArray3[3][12].setType(3);
				this.tileArray3[3][13].setType(3);
				this.tileArray3[3][14].setType(3);
				this.tileArray3[3][15].setType(3);
				this.tileArray3[3][16].setType(3);
				this.tileArray3[3][17].setType(3);
				this.tileArray3[3][18].setType(3);
				this.tileArray3[3][21].setType(3);
				
			
				// row 4
						
				this.tileArray3[4][0].setType(3);
				this.tileArray3[4][2].setType(3);
				this.tileArray3[4][3].setType(3);
				this.tileArray3[4][4].setType(3);
				this.tileArray3[4][5].setType(3);
				this.tileArray3[4][6].setType(3);
				this.tileArray3[4][9].setType(3);
				this.tileArray3[4][14].setType(3);
				this.tileArray3[4][18].setType(3);
				this.tileArray3[4][19].setType(3);
				this.tileArray3[4][20].setType(3);
				this.tileArray3[4][21].setType(3);
			

				// row 5
				this.tileArray3[5][0].setType(3);
				this.tileArray3[5][4].setType(3);
				this.tileArray3[5][9].setType(3);
				this.tileArray3[5][14].setType(3);
				this.tileArray3[5][19].setType(3);
				this.tileArray3[5][21].setType(3);

				// row 6
				this.tileArray3[6][0].setType(3);
				this.tileArray3[6][4].setType(3);
				this.tileArray3[6][9].setType(3);
				this.tileArray3[6][14].setType(3);
				this.tileArray3[6][19].setType(3);
				this.tileArray3[6][21].setType(3);
			

				// row 7
				this.tileArray3[7][0].setType(3);
				this.tileArray3[7][4].setType(3);
				this.tileArray3[7][7].setType(3);
				this.tileArray3[7][9].setType(3);
				this.tileArray3[7][14].setType(3);
				this.tileArray3[7][16].setType(3);
				this.tileArray3[7][17].setType(3);
				this.tileArray3[7][18].setType(3);
				this.tileArray3[7][19].setType(3);
				this.tileArray3[7][21].setType(3);

				// row 8
					
				this.tileArray3[8][0].setType(3);
				this.tileArray3[8][4].setType(3);
				this.tileArray3[8][7].setType(3);
				this.tileArray3[8][9].setType(3);
				this.tileArray3[8][14].setType(3);
				this.tileArray3[8][16].setType(3);
				this.tileArray3[8][21].setType(3);
			
				// row 9
				this.tileArray3[9][0].setType(3);
				this.tileArray3[9][1].setType(3);
				this.tileArray3[9][2].setType(3);
				this.tileArray3[9][3].setType(3);
				this.tileArray3[9][4].setType(3);
				this.tileArray3[9][5].setType(3);
				this.tileArray3[9][6].setType(3);
				this.tileArray3[9][7].setType(3);
				this.tileArray3[9][8].setType(3);
				this.tileArray3[9][9].setType(3);
				this.tileArray3[9][10].setType(3);
				this.tileArray3[9][11].setType(3);
				this.tileArray3[9][12].setType(3);
				this.tileArray3[9][14].setType(3);
				this.tileArray3[9][16].setType(3);
				this.tileArray3[9][18].setType(3);
				this.tileArray3[9][19].setType(3);
				this.tileArray3[9][20].setType(3);
				this.tileArray3[9][21].setType(3);
				
				// row 10
				this.tileArray3[10][12].setType(3);
				this.tileArray3[10][13].setType(3);
				this.tileArray3[10][14].setType(3);
				this.tileArray3[10][15].setType(3);
				this.tileArray3[10][16].setType(3);
				this.tileArray3[10][17].setType(3);
				this.tileArray3[10][18].setType(3);
				this.tileArray3[10][21].setType(3);
			
						
				//GAME PLAY 3
						
				// Save spawn tiles 3
						
				for (int i = 0; i < this.rows3; i++) {
					for (int j = 0; j < this.colums3; j++) {
						  if (tileArray3[i][j].getType() == 3) {
							  spawnTiles3.add(tileArray3[i][j]);
						}
					}
				}
				
				
				
				//GAME PLAY 4	
				
				
				// row 0
				this.tileArray4[0][6].setType(4);
				this.tileArray4[0][7].setType(4);
				this.tileArray4[0][8].setType(4);
				this.tileArray4[0][9].setType(4);
				this.tileArray4[0][10].setType(4);
				this.tileArray4[0][11].setType(4);
				this.tileArray4[0][12].setType(4);

				// row 1
				this.tileArray4[1][3].setType(4);
				this.tileArray4[1][4].setType(4);
				this.tileArray4[1][5].setType(4);
				this.tileArray4[1][6].setType(4);
				this.tileArray4[1][7].setType(4);
				this.tileArray4[1][8].setType(4);
				this.tileArray4[1][9].setType(4);
				this.tileArray4[1][10].setType(4);
				this.tileArray4[1][11].setType(4);
				this.tileArray4[1][12].setType(4);

				// row 2
				this.tileArray4[2][3].setType(4);
				this.tileArray4[2][4].setType(4);
				this.tileArray4[2][5].setType(4);
				this.tileArray4[2][6].setType(4);
				this.tileArray4[2][7].setType(4);
				this.tileArray4[2][8].setType(4);
				this.tileArray4[2][9].setType(4);
				this.tileArray4[2][10].setType(4);
				this.tileArray4[2][11].setType(4);
				this.tileArray4[2][12].setType(4);
				this.tileArray4[2][13].setType(4);
				this.tileArray4[2][14].setType(4);
				this.tileArray4[2][15].setType(4);
				this.tileArray4[2][16].setType(4);
				this.tileArray4[2][17].setType(4);
				this.tileArray4[2][18].setType(4);
				this.tileArray4[2][19].setType(4);
				this.tileArray4[2][20].setType(4);
				this.tileArray4[2][21].setType(4);
			
				// row 3
				this.tileArray4[3][3].setType(4);
				this.tileArray4[3][4].setType(4);
				this.tileArray4[3][5].setType(4);
				this.tileArray4[3][6].setType(4);
				this.tileArray4[3][12].setType(4);
				this.tileArray4[3][18].setType(4);
				this.tileArray4[3][19].setType(4);
				this.tileArray4[3][20].setType(4);
				this.tileArray4[3][21].setType(4);

				// row 4
				this.tileArray4[4][0].setType(4);
				this.tileArray4[4][1].setType(4);
				this.tileArray4[4][2].setType(4);
				this.tileArray4[4][3].setType(4);
				this.tileArray4[4][4].setType(4);
				this.tileArray4[4][5].setType(4);
				this.tileArray4[4][12].setType(4);
				this.tileArray4[4][18].setType(4);
				this.tileArray4[4][19].setType(4);
				this.tileArray4[4][20].setType(4);
				this.tileArray4[4][21].setType(4);


				// row 5
				this.tileArray4[5][0].setType(4);
				this.tileArray4[5][1].setType(4);
				this.tileArray4[5][2].setType(4);
				this.tileArray4[5][3].setType(4);
				this.tileArray4[5][4].setType(4);
				this.tileArray4[5][5].setType(4);
				this.tileArray4[5][6].setType(4);
				this.tileArray4[5][7].setType(4);
				this.tileArray4[5][8].setType(4);
				this.tileArray4[5][9].setType(4);
				this.tileArray4[5][10].setType(4);
				this.tileArray4[5][11].setType(4);
				this.tileArray4[5][12].setType(4);
				this.tileArray4[5][18].setType(4);
				this.tileArray4[5][19].setType(4);
				this.tileArray4[5][20].setType(4);
				this.tileArray4[5][21].setType(4);

				// row 6
				this.tileArray4[6][0].setType(4);
				this.tileArray4[6][1].setType(4);
				this.tileArray4[6][2].setType(4);
				this.tileArray4[6][3].setType(4);
				this.tileArray4[6][7].setType(4);
				this.tileArray4[6][11].setType(4);
				this.tileArray4[6][12].setType(4);
				this.tileArray4[6][21].setType(4);
				
				// row 7
				this.tileArray4[7][0].setType(4);
				this.tileArray4[7][1].setType(4);
				this.tileArray4[7][2].setType(4);
				this.tileArray4[7][3].setType(4);
				this.tileArray4[7][7].setType(4);
				this.tileArray4[7][11].setType(4);
				this.tileArray4[7][12].setType(4);
				this.tileArray4[7][13].setType(4);
				this.tileArray4[7][14].setType(4);
				this.tileArray4[7][15].setType(4);
				this.tileArray4[7][16].setType(4);
				this.tileArray4[7][17].setType(4);
				this.tileArray4[7][18].setType(4);
				this.tileArray4[7][19].setType(4);
				this.tileArray4[7][20].setType(4);
				this.tileArray4[7][21].setType(4);

				// row 8
				this.tileArray4[8][0].setType(4);
				this.tileArray4[8][1].setType(4);
				this.tileArray4[8][2].setType(4);
				this.tileArray4[8][3].setType(4);
				this.tileArray4[8][4].setType(4);
				this.tileArray4[8][5].setType(4);
				this.tileArray4[8][6].setType(4);
				this.tileArray4[8][7].setType(4);
				this.tileArray4[8][8].setType(4);
				this.tileArray4[8][9].setType(4);
				this.tileArray4[8][10].setType(4);
				this.tileArray4[8][11].setType(4);
				this.tileArray4[8][12].setType(4);
				this.tileArray4[8][13].setType(4);
				this.tileArray4[8][14].setType(4);
				this.tileArray4[8][15].setType(4);
				this.tileArray4[8][16].setType(4);
				this.tileArray4[8][17].setType(4);
				this.tileArray4[8][18].setType(4);
				this.tileArray4[8][19].setType(4);
				this.tileArray4[8][20].setType(4);
				this.tileArray4[8][21].setType(4);

				// row 9
				this.tileArray4[9][4].setType(4);
				this.tileArray4[9][5].setType(4);
				this.tileArray4[9][6].setType(4);
				this.tileArray4[9][7].setType(4);
				this.tileArray4[9][8].setType(4);
				this.tileArray4[9][9].setType(4);
				this.tileArray4[9][10].setType(4);
				this.tileArray4[9][11].setType(4);
				this.tileArray4[9][12].setType(4);
				this.tileArray4[9][13].setType(4);
				this.tileArray4[9][14].setType(4);
				this.tileArray4[9][15].setType(4);
				this.tileArray4[9][16].setType(4);
				this.tileArray4[9][17].setType(4);

				// row 10
				this.tileArray4[10][4].setType(4);
				this.tileArray4[10][5].setType(4);
				this.tileArray4[10][6].setType(4);
				this.tileArray4[10][7].setType(4);
				this.tileArray4[10][8].setType(4);
				this.tileArray4[10][9].setType(4);
				this.tileArray4[10][10].setType(4);
				this.tileArray4[10][11].setType(4);
				this.tileArray4[10][12].setType(4);
				this.tileArray4[10][13].setType(4);
				this.tileArray4[10][14].setType(4);
				this.tileArray4[10][15].setType(4);
				this.tileArray4[10][16].setType(4);
				this.tileArray4[10][17].setType(4);
				
				
				//GAME PLAY 4
				
				// Save spawn tiles 4
						
				for (int i = 0; i < this.rows4; i++) {
					for (int j = 0; j < this.colums4; j++) {
						  if (tileArray4[i][j].getType() == 4) {
							  spawnTiles4.add(tileArray4[i][j]);
						}
					}
				}	
				
		
		// GAME PLAY 1

		// Set change paths
		// Left Bottom
		
		leftBottom = new Path(tilezeroX + tileWidth * 12, tilezeroY + tileWidth * 0, tileWidth, tileWidth,
				"left,bottom", this);

		leftBottom2 = new Path(tilezeroX + tileWidth * 21, tilezeroY + tileWidth * 2, tileWidth, tileWidth,
				"left,bottom", this);

		leftBottom3 = new Path(tilezeroX + tileWidth * 17, tilezeroY + tileWidth * 7, tileWidth, tileWidth,
				"left,bottom", this);

		// Top Left Right
		topLeftRight = new Path(tilezeroX + tileWidth * 12, tilezeroY + tileWidth * 10, tileWidth, tileWidth,
				"top,left,right", this);

		topLeftRight2 = new Path(tilezeroX + tileWidth * 7, tilezeroY + tileWidth * 8, tileWidth, tileWidth,
				"top,left,right", this);

		// Right Bottom
		rightBottom = new Path(tilezeroX + tileWidth * 6, tilezeroY + tileWidth * 0, tileWidth, tileWidth,
				"right,bottom", this);

		rightBottom2 = new Path(tilezeroX + tileWidth * 3, tilezeroY + tileWidth * 1, tileWidth, tileWidth,
				"right,bottom", this);

		rightBottom3 = new Path(tilezeroX + tileWidth * 0, tilezeroY + tileWidth * 4, tileWidth, tileWidth,
				"right,bottom", this);

		rightBottom4 = new Path(tilezeroX + tileWidth * 7, tilezeroY + tileWidth * 5, tileWidth, tileWidth,
				"right,bottom", this);

		// Top Bottom Right
		topBottomRight = new Path(tilezeroX + tileWidth * 12, tilezeroY + tileWidth * 2, tileWidth, tileWidth,
				"top,bottom,right", this);

		topBottomRight2 = new Path(tilezeroX + tileWidth * 12, tilezeroY + tileWidth * 7, tileWidth, tileWidth,
				"top,bottom,right", this);

		topBottomRight3 = new Path(tilezeroX + tileWidth * 17, tilezeroY + tileWidth * 8, tileWidth, tileWidth,
				"top,bottom,right", this);

		// Bottom Left Right
		bottomLeftRight = new Path(tilezeroX + tileWidth * 4, tilezeroY + tileWidth * 8, tileWidth, tileWidth,
				"bottom,left,right", this);

		bottomLeftRight2 = new Path(tilezeroX + tileWidth * 18, tilezeroY + tileWidth * 2, tileWidth, tileWidth,
				"bottom,left,right", this);

		// Top Left Bottom
		topLeftBottom = new Path(tilezeroX + tileWidth * 12, tilezeroY + tileWidth * 5, tileWidth, tileWidth,
				"top,left,bottom", this);

		topLeftBottom2 = new Path(tilezeroX + tileWidth * 12, tilezeroY + tileWidth * 8, tileWidth, tileWidth,
				"top,left,bottom", this);

		topLeftBottom3 = new Path(tilezeroX + tileWidth * 21, tilezeroY + tileWidth * 5, tileWidth, tileWidth,
				"top,left,bottom", this);

		// Top Left
		topLeft = new Path(tilezeroX + tileWidth * 6, tilezeroY + tileWidth * 1, tileWidth, tileWidth, "top,left",
				this);

		topLeft2 = new Path(tilezeroX + tileWidth * 3, tilezeroY + tileWidth * 4, tileWidth, tileWidth, "top,left",
				this);

		topLeft3 = new Path(tilezeroX + tileWidth * 17, tilezeroY + tileWidth * 10, tileWidth, tileWidth, "top,left",
				this);

		topLeft4 = new Path(tilezeroX + tileWidth * 21, tilezeroY + tileWidth * 8, tileWidth, tileWidth, "top,left",
				this);

		topRight = new Path(tilezeroX + tileWidth * 4, tilezeroY + tileWidth * 10, tileWidth, tileWidth, "top,right",
				this);
		topRight2 = new Path(tilezeroX + tileWidth * 18, tilezeroY + tileWidth * 5, tileWidth, tileWidth, "top,right",
				this);
		topRight3 = new Path(tilezeroX + tileWidth * 0, tilezeroY + tileWidth * 8, tileWidth, tileWidth, "top,right",
				this);
		
	// GAME PLAY 2

			// Set change paths
		
			// Left Bottom
			
			left2Bottom = new Path(tilezero2X + tileWidth2 * 12, tilezero2Y + tileWidth2 * 0, tileWidth2, tileWidth2,
					"left,bottom", this);

			left2Bottom2 = new Path(tilezero2X + tileWidth2 * 21, tilezero2Y + tileWidth2 * 2, tileWidth2, tileWidth2,
					"left,bottom", this);

			left2Bottom3 = new Path(tilezero2X + tileWidth2 * 17, tilezero2Y + tileWidth2 * 7, tileWidth2, tileWidth2,
					"left,bottom", this);

			// Top Left Right
			
			topLeft2Right = new Path(tilezero2X + tileWidth2 * 12, tilezero2Y + tileWidth2 * 10, tileWidth2, tileWidth2,
					"top,left,right", this);

			topLeft2Right2 = new Path(tilezero2X + tileWidth2 * 7, tilezero2Y + tileWidth2 * 8, tileWidth2, tileWidth2,
					"top,left,right", this);

			// Right Bottom
			right2Bottom = new Path(tilezero2X + tileWidth2 * 6, tilezero2Y + tileWidth2 * 0, tileWidth2, tileWidth2,
					"right,bottom", this);

			right2Bottom2 = new Path(tilezero2X + tileWidth2 * 3, tilezero2Y + tileWidth2 * 1, tileWidth2, tileWidth2,
					"right,bottom", this);

			right2Bottom3 = new Path(tilezero2X + tileWidth2 * 0, tilezero2Y + tileWidth2 * 4, tileWidth2, tileWidth2,
					"right,bottom", this);

			right2Bottom4 = new Path(tilezero2X + tileWidth2 * 7, tilezero2Y + tileWidth2 * 5, tileWidth2, tileWidth2,
					"right,bottom", this);

			// Top Bottom Right
			topBottom2Right = new Path(tilezero2X + tileWidth2 * 12, tilezero2Y + tileWidth2 * 2, tileWidth2, tileWidth2,
					"top,bottom,right", this);

			topBottom2Right2 = new Path(tilezero2X + tileWidth2 * 12, tilezero2Y + tileWidth2 * 7, tileWidth2, tileWidth2,
					"top,bottom,right", this);

			topBottom2Right3 = new Path(tilezero2X + tileWidth2 * 17, tilezero2Y + tileWidth2 * 8, tileWidth2, tileWidth2,
					"top,bottom,right", this);

			// Bottom Left Right
			bottom2LeftRight = new Path(tilezero2X + tileWidth2 * 4, tilezero2Y + tileWidth2 * 8, tileWidth2, tileWidth2,
					"bottom,left,right", this);

			bottom2LeftRight2 = new Path(tilezero2X + tileWidth2 * 18, tilezero2Y + tileWidth2 * 2, tileWidth2, tileWidth2,
					"bottom,left,right", this);

			// Top Left Bottom
			topLeft2Bottom = new Path(tilezero2X + tileWidth2 * 12, tilezero2Y + tileWidth2 * 5, tileWidth2, tileWidth2,
					"top,left,bottom", this);

			topLeft2Bottom2 = new Path(tilezero2X + tileWidth2 * 12, tilezero2Y + tileWidth2 * 8, tileWidth2, tileWidth2,
					"top,left,bottom", this);

			topLeft2Bottom3 = new Path(tilezero2X + tileWidth2 * 21, tilezero2Y + tileWidth2 * 5, tileWidth2, tileWidth2,
					"top,left,bottom", this);

			// Top Left
			top2Left = new Path(tilezero2X + tileWidth2 * 6, tilezero2Y + tileWidth2 * 1, tileWidth2, tileWidth2, "top,left",
					this);

			top2Left2 = new Path(tilezero2X + tileWidth2 * 3, tilezero2Y + tileWidth2 * 4, tileWidth2, tileWidth2, "top,left",
					this);

			top2Left3 = new Path(tilezero2X + tileWidth2 * 17, tilezero2Y + tileWidth2 * 10, tileWidth2, tileWidth2, "top,left",
					this);

			top2Left4 = new Path(tilezero2X + tileWidth2 * 21, tilezero2Y + tileWidth2 * 8, tileWidth2, tileWidth2, "top,left",
					this);

			top2Right = new Path(tilezero2X + tileWidth2 * 4, tilezero2Y + tileWidth2 * 10, tileWidth2, tileWidth2, "top,right",
					this);
			top2Right2 = new Path(tilezero2X + tileWidth2 * 18, tilezero2Y + tileWidth2 * 5, tileWidth2, tileWidth2, "top,right",
					this);
			top2Right3 = new Path(tilezero2X + tileWidth2 * 0, tilezero2Y + tileWidth2 * 8, tileWidth2, tileWidth2, "top,right",
					this);
			
			
			
			// GAME PLAY 3

			// Set change paths
								
			// Left Bottom
									
			left3Bottom = new Path(tilezero3X + tileWidth3 * 12, tilezero3Y + tileWidth3 * 0, tileWidth3, tileWidth3,
			"left,bottom", this);

			left3Bottom2 = new Path(tilezero3X + tileWidth3 * 21, tilezero3Y + tileWidth3 * 2, tileWidth3, tileWidth3,
			"left,bottom", this);

			left3Bottom3 = new Path(tilezero3X + tileWidth3 * 17, tilezero3Y + tileWidth3 * 7, tileWidth3, tileWidth3,
			"left,bottom", this);

			// Top Left Right
									
			topLeft3Right = new Path(tilezero3X + tileWidth3 * 12, tilezero3Y + tileWidth3 * 10, tileWidth3, tileWidth3,
			"top,left,right", this);
						
			topLeft3Right2 = new Path(tilezero3X + tileWidth3 * 7, tilezero3Y + tileWidth3 * 8, tileWidth3, tileWidth3,
			"top,left,right", this);
						
     		// Right Bottom
			right3Bottom = new Path(tilezero3X + tileWidth3 * 6, tilezero3Y + tileWidth3 * 0, tileWidth3, tileWidth3,
			"right,bottom", this);

			right3Bottom2 = new Path(tilezero3X + tileWidth3 * 3, tilezero3Y + tileWidth3 * 1, tileWidth3, tileWidth3,
			"right,bottom", this);

			right3Bottom3 = new Path(tilezero3X + tileWidth3 * 0, tilezero3Y + tileWidth3 * 4, tileWidth3, tileWidth3,
			"right,bottom", this);

			right3Bottom4 = new Path(tilezero3X + tileWidth3 * 7, tilezero3Y + tileWidth3 * 5, tileWidth3, tileWidth3,
			"right,bottom", this);

			// Top Bottom Right
			topBottom3Right = new Path(tilezero3X + tileWidth3 * 12, tilezero3Y + tileWidth3 * 2, tileWidth3, tileWidth3,
			"top,bottom,right", this);

			topBottom3Right2 = new Path(tilezero3X + tileWidth3 * 12, tilezero3Y + tileWidth3 * 7, tileWidth3, tileWidth3,
			"top,bottom,right", this);

			topBottom3Right3 = new Path(tilezero3X + tileWidth3 * 17, tilezero3Y + tileWidth3 * 8, tileWidth3, tileWidth3,
			"top,bottom,right", this);

			// Bottom Left Right
			bottom3LeftRight = new Path(tilezero3X + tileWidth3 * 4, tilezero3Y + tileWidth3 * 8, tileWidth3, tileWidth3,
			"bottom,left,right", this);

			bottom3LeftRight2 = new Path(tilezero3X + tileWidth3 * 18, tilezero3Y + tileWidth3 * 2, tileWidth3, tileWidth3,
			"bottom,left,right", this);

			// Top Left Bottom
			topLeft3Bottom = new Path(tilezero3X + tileWidth3 * 12, tilezero3Y + tileWidth3 * 5, tileWidth3, tileWidth3,
			"top,left,bottom", this);

			topLeft3Bottom2 = new Path(tilezero3X + tileWidth3 * 12, tilezero3Y + tileWidth3 * 8, tileWidth3, tileWidth3,
			"top,left,bottom", this);

			topLeft3Bottom3 = new Path(tilezero3X + tileWidth3 * 21, tilezero3Y + tileWidth3 * 5, tileWidth3, tileWidth3,
			"top,left,bottom", this);

			// Top Left
			top3Left = new Path(tilezero3X + tileWidth3 * 6, tilezero3Y + tileWidth3 * 1, tileWidth3, tileWidth3, "top,left",
			this);

			top3Left2 = new Path(tilezero3X + tileWidth3 * 3, tilezero3Y + tileWidth3 * 4, tileWidth3, tileWidth3, "top,left",
			this);

			top3Left3 = new Path(tilezero3X + tileWidth3 * 17, tilezero3Y + tileWidth3 * 10, tileWidth3, tileWidth3, "top,left",
			this);

			top3Left4 = new Path(tilezero3X + tileWidth3 * 21, tilezero3Y + tileWidth3 * 8, tileWidth3, tileWidth3, "top,left",
				this);

			top3Right = new Path(tilezero3X + tileWidth3 * 4, tilezero3Y + tileWidth3 * 10, tileWidth3, tileWidth3, "top,right",
			this);
		
			top3Right2 = new Path(tilezero3X + tileWidth3 * 18, tilezero3Y + tileWidth3 * 5, tileWidth3, tileWidth3, "top,right",
			this);
				
			top3Right3 = new Path(tilezero3X + tileWidth3 * 0, tilezero3Y + tileWidth3 * 8, tileWidth3, tileWidth3, "top,right",
			this);
			
			// GAME PLAY 4

			// Set change paths
											
			// Left Bottom
												
			left4Bottom = new Path(tilezero4X + tileWidth4 * 12, tilezero4Y + tileWidth4 * 0, tileWidth4, tileWidth4,
			"left,bottom", this);

			left4Bottom2 = new Path(tilezero4X + tileWidth4 * 21, tilezero4Y + tileWidth4 * 2, tileWidth4, tileWidth4,
			"left,bottom", this);

			left4Bottom3 = new Path(tilezero4X + tileWidth4 * 17, tilezero4Y + tileWidth4 * 7, tileWidth4, tileWidth4,
			"left,bottom", this);

			// Top Left Right
												
			topLeft4Right = new Path(tilezero4X + tileWidth4 * 12, tilezero4Y + tileWidth4 * 10, tileWidth4, tileWidth4,
			"top,left,right", this);
									
			topLeft4Right2 = new Path(tilezero4X + tileWidth4 * 7, tilezero4Y + tileWidth4 * 8, tileWidth4, tileWidth4,
			"top,left,right", this);
									
			// Right Bottom
			right4Bottom = new Path(tilezero4X + tileWidth4 * 6, tilezero4Y + tileWidth4 * 0, tileWidth4, tileWidth4,
			"right,bottom", this);

			right4Bottom2 = new Path(tilezero4X + tileWidth4 * 3, tilezero4Y + tileWidth4 * 1, tileWidth4, tileWidth4,
			"right,bottom", this);

			right4Bottom3 = new Path(tilezero4X + tileWidth4 * 0, tilezero4Y + tileWidth4 * 4, tileWidth4, tileWidth4,
			"right,bottom", this);

			right4Bottom4 = new Path(tilezero4X + tileWidth4 * 7, tilezero4Y + tileWidth4 * 5, tileWidth4, tileWidth4,
			"right,bottom", this);

			// Top Bottom Right
			topBottom4Right = new Path(tilezero4X + tileWidth4 * 12, tilezero4Y + tileWidth4 * 2, tileWidth4, tileWidth4,
			"top,bottom,right", this);

			topBottom4Right2 = new Path(tilezero4X + tileWidth4 * 12, tilezero4Y + tileWidth4 * 7, tileWidth4, tileWidth4,
			"top,bottom,right", this);

			topBottom4Right3 = new Path(tilezero4X + tileWidth4 * 17, tilezero4Y + tileWidth4 * 8, tileWidth4, tileWidth4,
			"top,bottom,right", this);

			// Bottom Left Right
			bottom4LeftRight = new Path(tilezero4X + tileWidth4 * 4, tilezero4Y + tileWidth4 * 8, tileWidth4, tileWidth4,
			"bottom,left,right", this);

			bottom4LeftRight2 = new Path(tilezero4X + tileWidth4 * 18, tilezero4Y + tileWidth4 * 2, tileWidth4, tileWidth4,
			"bottom,left,right", this);

			// Top Left Bottom
			topLeft4Bottom = new Path(tilezero4X + tileWidth4 * 12, tilezero4Y + tileWidth4 * 5, tileWidth4, tileWidth4,
			"top,left,bottom", this);

			topLeft4Bottom2 = new Path(tilezero4X + tileWidth4 * 12, tilezero4Y + tileWidth4 * 8, tileWidth4, tileWidth4,
			"top,left,bottom", this);

			topLeft4Bottom3 = new Path(tilezero4X + tileWidth4 * 21, tilezero4Y + tileWidth4 * 5, tileWidth4, tileWidth4,
			"top,left,bottom", this);

			// Top Left
			top4Left = new Path(tilezero4X + tileWidth4 * 6, tilezero4Y + tileWidth4 * 1, tileWidth4, tileWidth4, "top,left",
			this);

			top4Left2 = new Path(tilezero4X + tileWidth4 * 3, tilezero4Y + tileWidth4 * 4, tileWidth4, tileWidth4, "top,left",
			this);

			top4Left3 = new Path(tilezero4X + tileWidth4 * 17, tilezero4Y + tileWidth4 * 10, tileWidth4, tileWidth4, "top,left",
			this);

			top4Left4 = new Path(tilezero4X + tileWidth4 * 21, tilezero4Y + tileWidth4 * 8, tileWidth4, tileWidth4, "top,left",
			this);

			top4Right = new Path(tilezero4X + tileWidth4 * 4, tilezero4Y + tileWidth4 * 10, tileWidth4, tileWidth4, "top,right",
			this);
					
			top4Right2 = new Path(tilezero4X + tileWidth4 * 18, tilezero4Y + tileWidth4 * 5, tileWidth4, tileWidth4, "top,right",
			this);
							
			top4Right3 = new Path(tilezero4X + tileWidth4 * 0, tilezero4Y + tileWidth4 * 8, tileWidth4, tileWidth4, "top,right",
			this);
						
	
			}
	
	


	public void draw() {
		

		switch (screen) {
		case 0:
			image(this.firstImage, 0, 0, 1200, 700);
			if (mouseX > 507 && mouseX < 507 + 186 && mouseY > 479 && mouseY < 479 + 52) {
				cursor(HAND);
			} else {
				cursor(ARROW);
			}
			break;

		case 1:
			image(this.secondImage, 0, 0, 1200, 700);
			if ((mouseX > 907 && mouseX < 907 + 222 && mouseY > 571 && mouseY < 571 + 52)
				|| (mouseX > 39 && mouseX < 39 + 26 && mouseY > 50 && mouseY < 50 + 47)) {
				cursor(HAND);
			} else {
				cursor(ARROW);
			}
			break;

		case 2:
			image(this.thirdImage, 0, 0, 1200, 700);
			if ((mouseX > 907 && mouseX < 907 + 222 && mouseY > 571 && mouseY < 571 + 52)
					|| (mouseX > 39 && mouseX < 39 + 26 && mouseY > 50 && mouseY < 50 + 47)) {
				cursor(HAND);
			} else {
				cursor(ARROW);
			}
			break;

		case 3:
			image(this.fourthImage, 0, 0, 1200, 700);
			if ((mouseX > 907 && mouseX < 907 + 222 && mouseY > 571 && mouseY < 571 + 52)
					|| (mouseX > 39 && mouseX < 39 + 26 && mouseY > 50 && mouseY < 50 + 47)) {
				cursor(HAND);
			} else {
				cursor(ARROW);
			}
			break;
		
		case 4:
			image(this.fifthImage, 0, 0, 1200, 700);
			if ((mouseX > 907 && mouseX < 907 + 222 && mouseY > 571 && mouseY < 571 + 52)
					|| (mouseX > 39 && mouseX < 39 + 26 && mouseY > 50 && mouseY < 50 + 47)) {
				cursor(HAND);
			} else {
				cursor(ARROW);
			}
			break;
			
		case 5:
			image(this.sixthImage, 0, 0, 1200, 700);
			if ((mouseX > 907 && mouseX < 907 + 222 && mouseY > 571 && mouseY < 571 + 52)
					|| (mouseX > 39 && mouseX < 39 + 26 && mouseY > 50 && mouseY < 50 + 47)) {
				cursor(HAND);
			} else {
				cursor(ARROW);
			}
			break;

		case 6:
			image(this.seventhImage, 0, 0, 1200, 700);
			if ((mouseX > 907 && mouseX < 907 + 222 && mouseY > 571 && mouseY < 571 + 52)
					|| (mouseX > 39 && mouseX < 39 + 26 && mouseY > 50 && mouseY < 50 + 47)) {
				cursor(HAND);
			} else {
				cursor(ARROW);
			}
			break;
			
		case 7:
			cursor(ARROW);

			for (int i = 0; i < this.rows; i++) {
				for (int j = 0; j < this.colums; j++) {
					this.tileArray[i][j].paint();
				}
			}

			image(this.gameplayImage, 0, 0, 1200, 700);
			fill(255);
			textSize(20);
			text(treasureCount  + " /5", 800, 45);

			// Paint lives
			for (int i = 0; i < this.player.getLives(); i++) {
				image(this.heart, 965 + (i * 20), 31, 16, 16);
			}

			// Paint player
			this.player.paint();

			// Generate vitamin
			if (frameCount % 120 == 0) {

				int random = (int) Math.floor(random(spawnTiles.size()));

				Tile randomTile = spawnTiles.get(random);
				if (!randomTile.isOccupied()) {
					treasureList.add(new Treasure(randomTile.getPosX() + 9, randomTile.getPosY() + 9, random, 21, 34,
							this.treasureImage, this));
					randomTile.setOccupied(true);
				}
			}


			// Paint vitamin
			for (int i = 0; i < treasureList.size(); i++) {
				treasureList.get(i).paint();
			}


			float playerX = this.player.getPosX();
			float playerY = this.player.getPosY();
			float playerWidth = this.player.getWidth();
			float playerHeight = this.player.getHeight();

			// Get vitamin
			for (int i = 0; i < this.treasureList.size(); i++) {
				Treasure treasure = this.treasureList.get(i);
				float treasureX = treasure.getPosX();
				float treasureY = treasure.getPosY();

				if (treasureX > playerX && treasureX < playerX + playerWidth && treasureY > playerY
						&& treasureY < playerY + playerHeight) {

					spawnTiles.get(i).setOccupied(false);
					treasureList.remove(i);
					treasureCount++;
					
					if( treasureCount == 5) {
						screen = 9;
					}	
				}
			}
		
			

			// Paint enemies
			for (int i = 0; i < this.enemyList.size(); i++) {
				Enemy enemy = this.enemyList.get(i);
				enemy.paint();
				enemy.moveX();
				enemy.moveY();
			}

			// Change enemies direction
			for (int i = 0; i < this.enemyList.size(); i++) {
				Enemy enemy = this.enemyList.get(i);

				if (enemy.getPosX() == leftBottom.getPosX() && enemy.getPosY() == leftBottom.getPosY()
						&& !enemy.isChanged()) {
					String newDirection = leftBottom.randomDirection();
					enemy.changeDirection(newDirection);
				}

				if (enemy.getPosX() == leftBottom2.getPosX() && enemy.getPosY() == leftBottom2.getPosY()
						&& !enemy.isChanged()) {
					String newDirection = leftBottom2.randomDirection();
					enemy.changeDirection(newDirection);
				}

				if (enemy.getPosX() == leftBottom3.getPosX() && enemy.getPosY() == leftBottom3.getPosY()
						&& !enemy.isChanged()) {
					String newDirection = leftBottom3.randomDirection();
					enemy.changeDirection(newDirection);
				}

				if (enemy.getPosX() == topLeftRight.getPosX() && enemy.getPosY() == topLeftRight.getPosY()
						&& !enemy.isChanged()) {
					String newDirection = topLeftRight.randomDirection();
					enemy.changeDirection(newDirection);
				}

				if (enemy.getPosX() == topLeftRight2.getPosX() && enemy.getPosY() == topLeftRight2.getPosY()
						&& !enemy.isChanged()) {
					String newDirection = topLeftRight2.randomDirection();
					enemy.changeDirection(newDirection);
				}

				if (enemy.getPosX() == rightBottom.getPosX() && enemy.getPosY() == rightBottom.getPosY()
						&& !enemy.isChanged()) {
					String newDirection = rightBottom.randomDirection();
					enemy.changeDirection(newDirection);
				}

				if (enemy.getPosX() == rightBottom2.getPosX() && enemy.getPosY() == rightBottom2.getPosY()
						&& !enemy.isChanged()) {
					String newDirection = rightBottom2.randomDirection();
					enemy.changeDirection(newDirection);
				}

				if (enemy.getPosX() == rightBottom3.getPosX() && enemy.getPosY() == rightBottom3.getPosY()
						&& !enemy.isChanged()) {
					String newDirection = rightBottom3.randomDirection();
					enemy.changeDirection(newDirection);
				}

				if (enemy.getPosX() == rightBottom4.getPosX() && enemy.getPosY() == rightBottom4.getPosY()
						&& !enemy.isChanged()) {
					String newDirection = rightBottom4.randomDirection();
					enemy.changeDirection(newDirection);
				}

				if (enemy.getPosX() == topBottomRight.getPosX() && enemy.getPosY() == topBottomRight.getPosY()
						&& !enemy.isChanged()) {
					String newDirection = topBottomRight.randomDirection();
					enemy.changeDirection(newDirection);
				}

				if (enemy.getPosX() == topLeft.getPosX() && enemy.getPosY() == topLeft.getPosY()
						&& !enemy.isChanged()) {
					String newDirection = topLeft.randomDirection();
					enemy.changeDirection(newDirection);
				}

				if (enemy.getPosX() == topLeft2.getPosX() && enemy.getPosY() == topLeft2.getPosY()
						&& !enemy.isChanged()) {
					String newDirection = topLeft2.randomDirection();
					enemy.changeDirection(newDirection);
				}

				if (enemy.getPosX() == topLeft3.getPosX() && enemy.getPosY() == topLeft3.getPosY()
						&& !enemy.isChanged()) {
					String newDirection = topLeft3.randomDirection();
					enemy.changeDirection(newDirection);
				}

				if (enemy.getPosX() == topLeft4.getPosX() && enemy.getPosY() == topLeft4.getPosY()
						&& !enemy.isChanged()) {
					String newDirection = topLeft4.randomDirection();
					enemy.changeDirection(newDirection);
				}

				if (enemy.getPosX() == topRight.getPosX() && enemy.getPosY() == topRight.getPosY()
						&& !enemy.isChanged()) {
					String newDirection = topRight.randomDirection();
					enemy.changeDirection(newDirection);
				}

				if (enemy.getPosX() == topRight2.getPosX() && enemy.getPosY() == topRight2.getPosY()
						&& !enemy.isChanged()) {
					String newDirection = topRight2.randomDirection();
					enemy.changeDirection(newDirection);
				}

				if (enemy.getPosX() == topRight3.getPosX() && enemy.getPosY() == topRight3.getPosY()
						&& !enemy.isChanged()) {
					String newDirection = topRight3.randomDirection();
					enemy.changeDirection(newDirection);
				}

				if (enemy.getPosX() == topBottomRight.getPosX() && enemy.getPosY() == topBottomRight.getPosY()
						&& !enemy.isChanged()) {
					String newDirection = topBottomRight.randomDirection();
					enemy.changeDirection(newDirection);
				}

				if (enemy.getPosX() == topBottomRight2.getPosX() && enemy.getPosY() == topBottomRight2.getPosY()
						&& !enemy.isChanged()) {
					String newDirection = topBottomRight2.randomDirection();
					enemy.changeDirection(newDirection);
				}

				if (enemy.getPosX() == topBottomRight3.getPosX() && enemy.getPosY() == topBottomRight3.getPosY()
						&& !enemy.isChanged()) {
					String newDirection = topBottomRight3.randomDirection();
					enemy.changeDirection(newDirection);
				}

				if (enemy.getPosX() == bottomLeftRight.getPosX() && enemy.getPosY() == bottomLeftRight.getPosY()
						&& !enemy.isChanged()) {
					String newDirection = bottomLeftRight.randomDirection();
					enemy.changeDirection(newDirection);
				}

				if (enemy.getPosX() == bottomLeftRight2.getPosX() && enemy.getPosY() == bottomLeftRight2.getPosY()
						&& !enemy.isChanged()) {
					String newDirection = bottomLeftRight2.randomDirection();
					enemy.changeDirection(newDirection);
				}

				if (enemy.getPosX() == topLeftBottom.getPosX() && enemy.getPosY() == topLeftBottom.getPosY()
						&& !enemy.isChanged()) {
					String newDirection = topLeftBottom.randomDirection();
					enemy.changeDirection(newDirection);
				}

				if (enemy.getPosX() == topLeftBottom2.getPosX() && enemy.getPosY() == topLeftBottom2.getPosY()
						&& !enemy.isChanged()) {
					String newDirection = topLeftBottom2.randomDirection();
					enemy.changeDirection(newDirection);
				}

				if (enemy.getPosX() == topLeftBottom3.getPosX() && enemy.getPosY() == topLeftBottom3.getPosY()
						&& !enemy.isChanged()) {
					String newDirection = topLeftBottom3.randomDirection();
					enemy.changeDirection(newDirection);
				}
			}

			// Collision enemies
			for (int i = 0; i < this.enemyList.size(); i++) {
				Enemy enemy = this.enemyList.get(i);
				float enemyX = enemy.getPosX();
				float enemyY = enemy.getPosY();
				float enemyWidth = enemy.getWidth();
				float enemyHeight = enemy.getHeight();

				if (playerX >= enemyX && playerX < enemyX + enemyWidth && playerY > enemyY
						&& playerY < enemyY + enemyHeight) {
					player.getDamage(enemy.getDamage());
				}

			}

			// Defeat
			if (this.player.getLives() <= 0) {
				this.screen = 8;
				
		     }
			
			break;

		case 8:
			image(this.deathScreen, 0, 0, 1200, 700);
			if (mouseX > 507 && mouseX < 507 + 186 && mouseY > 571 && mouseY < 571 + 52) {
				cursor(HAND);
			} else {
				cursor(ARROW);
			}
			
			break;
			
		case 9:
			
			image(this.introlevel2, 0, 0, 1200, 700);
			if ((mouseX > 907 && mouseX < 907 + 222 && mouseY > 571 && mouseY < 571 + 52)
					|| (mouseX > 39 && mouseX < 39 + 26 && mouseY > 50 && mouseY < 50 + 47)) {
				cursor(HAND);
			} else {
				cursor(ARROW);
			}
			break;
			
		case 10:
			
			cursor(ARROW);
			
			for (int i = 0; i < this.rows2; i++) {
				for (int j = 0; j < this.colums2; j++) {
					this.tileArray2[i][j].paint();
				}
			}

			image(this.gameplay2Image, 0, 0, 1200, 700);
			fill(255);
			textSize(20);
			text(treasureCount2  + " /5", 800, 45);
			
			// Paint lives
			
				for (int i = 0; i < this.player2.getLives(); i++) {
				image(this.heart, 965 + (i * 20), 31, 16, 16);
				}

				// Paint player
				this.player2.paint();

			    // Generate keys 
				
				if (frameCount % 120 == 0) {
		
				int random = (int) Math.floor(random(spawnTiles2.size()));
		
				Tile randomTile = spawnTiles2.get(random);
				if (!randomTile.isOccupied()) {
				treasureList2.add(new Treasure(randomTile.getPosX() + 9, randomTile.getPosY() + 9, random, 21, 21,
			    this.treasureImage2, this));
				randomTile.setOccupied(true);
					}
				}	
				
				// Paint keys
				for (int i = 0; i < treasureList2.size(); i++) {
					treasureList2.get(i).paint();
				}


				float player2X = this.player2.getPosX();
				float player2Y = this.player2.getPosY();
				float playerWidth2 = this.player2.getWidth();
				float playerHeight2 = this.player2.getHeight();

				// Get keys
				for (int i = 0; i < this.treasureList2.size(); i++) {
					Treasure treasure2 = this.treasureList2.get(i);
					float treasure2X = treasure2.getPosX();
					float treasure2Y = treasure2.getPosY();

					if (treasure2X > player2X && treasure2X < player2X + playerWidth2 && treasure2Y > player2Y
							&& treasure2Y < player2Y + playerHeight2) {

						spawnTiles2.get(i).setOccupied(false);
						treasureList2.remove(i);
						treasureCount2++;
						
						if( treasureCount2 == 5) {
							screen = 11;
						}	
					}
				}	
				
			
				// Paint enemies (Cash & money)
				
				for (int i = 0; i < this.enemyList2.size(); i++) {
					Enemy enemy2 = this.enemyList2.get(i);
					enemy2.paint();
					enemy2.moveX();
					enemy2.moveY();
				}

				// Change enemies direction
				for (int i = 0; i < this.enemyList2.size(); i++) {
					Enemy enemy2 = this.enemyList2.get(i);

					if (enemy2.getPosX() == left2Bottom.getPosX() && enemy2.getPosY() == left2Bottom.getPosY()
							&& !enemy2.isChanged()) {
						String newDirection = left2Bottom.randomDirection();
						enemy2.changeDirection(newDirection);
					}

					if (enemy2.getPosX() == left2Bottom2.getPosX() && enemy2.getPosY() == left2Bottom2.getPosY()
							&& !enemy2.isChanged()) {
						String newDirection = left2Bottom2.randomDirection();
						enemy2.changeDirection(newDirection);
					}

					if (enemy2.getPosX() == left2Bottom3.getPosX() && enemy2.getPosY() == left2Bottom3.getPosY()
							&& !enemy2.isChanged()) {
						String newDirection = left2Bottom3.randomDirection();
						enemy2.changeDirection(newDirection);
					}

					if (enemy2.getPosX() == topLeft2Right.getPosX() && enemy2.getPosY() == topLeft2Right.getPosY()
							&& !enemy2.isChanged()) {
						String newDirection = topLeft2Right.randomDirection();
						enemy2.changeDirection(newDirection);
					}

					if (enemy2.getPosX() == topLeft2Right2.getPosX() && enemy2.getPosY() == topLeft2Right2.getPosY()
							&& !enemy2.isChanged()) {
						String newDirection = topLeft2Right2.randomDirection();
						enemy2.changeDirection(newDirection);
					}

					if (enemy2.getPosX() == right2Bottom.getPosX() && enemy2.getPosY() == right2Bottom.getPosY()
							&& !enemy2.isChanged()) {
						String newDirection = right2Bottom.randomDirection();
						enemy2.changeDirection(newDirection);
					}

					if (enemy2.getPosX() == right2Bottom2.getPosX() && enemy2.getPosY() == right2Bottom2.getPosY()
							&& !enemy2.isChanged()) {
						String newDirection = right2Bottom2.randomDirection();
						enemy2.changeDirection(newDirection);
					}

					if (enemy2.getPosX() == right2Bottom3.getPosX() && enemy2.getPosY() == right2Bottom3.getPosY()
							&& !enemy2.isChanged()) {
						String newDirection = right2Bottom3.randomDirection();
						enemy2.changeDirection(newDirection);
					}

					if (enemy2.getPosX() == right2Bottom4.getPosX() && enemy2.getPosY() == right2Bottom4.getPosY()
							&& !enemy2.isChanged()) {
						String newDirection = right2Bottom4.randomDirection();
						enemy2.changeDirection(newDirection);
					}

					if (enemy2.getPosX() == topBottom2Right.getPosX() && enemy2.getPosY() == topBottom2Right.getPosY()
							&& !enemy2.isChanged()) {
						String newDirection = topBottom2Right.randomDirection();
						enemy2.changeDirection(newDirection);
					}

					if (enemy2.getPosX() == top2Left.getPosX() && enemy2.getPosY() == top2Left.getPosY()
							&& !enemy2.isChanged()) {
						String newDirection = top2Left.randomDirection();
						enemy2.changeDirection(newDirection);
					}

					if (enemy2.getPosX() == top2Left2.getPosX() && enemy2.getPosY() == top2Left2.getPosY()
							&& !enemy2.isChanged()) {
						String newDirection = top2Left2.randomDirection();
						enemy2.changeDirection(newDirection);
					}

					if (enemy2.getPosX() == top2Left3.getPosX() && enemy2.getPosY() == top2Left3.getPosY()
							&& !enemy2.isChanged()) {
						String newDirection = top2Left3.randomDirection();
						enemy2.changeDirection(newDirection);
					}

					if (enemy2.getPosX() == top2Left4.getPosX() && enemy2.getPosY() == top2Left4.getPosY()
							&& !enemy2.isChanged()) {
						String newDirection = top2Left4.randomDirection();
						enemy2.changeDirection(newDirection);
					}

					if (enemy2.getPosX() == top2Right.getPosX() && enemy2.getPosY() == top2Right.getPosY()
							&& !enemy2.isChanged()) {
						String newDirection = top2Right.randomDirection();
						enemy2.changeDirection(newDirection);
					}

					if (enemy2.getPosX() == top2Right2.getPosX() && enemy2.getPosY() == top2Right2.getPosY()
							&& !enemy2.isChanged()) {
						String newDirection = top2Right2.randomDirection();
						enemy2.changeDirection(newDirection);
					}

					if (enemy2.getPosX() == top2Right3.getPosX() && enemy2.getPosY() == top2Right3.getPosY()
							&& !enemy2.isChanged()) {
						String newDirection = top2Right3.randomDirection();
						enemy2.changeDirection(newDirection);
					}

					if (enemy2.getPosX() == topBottom2Right.getPosX() && enemy2.getPosY() == topBottom2Right.getPosY()
							&& !enemy2.isChanged()) {
						String newDirection = topBottom2Right.randomDirection();
						enemy2.changeDirection(newDirection);
					}

					if (enemy2.getPosX() == topBottom2Right2.getPosX() && enemy2.getPosY() == topBottom2Right2.getPosY()
							&& !enemy2.isChanged()) {
						String newDirection = topBottom2Right2.randomDirection();
						enemy2.changeDirection(newDirection);
					}

					if (enemy2.getPosX() == topBottom2Right3.getPosX() && enemy2.getPosY() == topBottom2Right3.getPosY()
							&& !enemy2.isChanged()) {
						String newDirection = topBottom2Right3.randomDirection();
						enemy2.changeDirection(newDirection);
					}

					if (enemy2.getPosX() == bottom2LeftRight.getPosX() && enemy2.getPosY() == bottom2LeftRight.getPosY()
							&& !enemy2.isChanged()) {
						String newDirection = bottom2LeftRight.randomDirection();
						enemy2.changeDirection(newDirection);
					}

					if (enemy2.getPosX() == bottom2LeftRight2.getPosX() && enemy2.getPosY() == bottom2LeftRight2.getPosY()
							&& !enemy2.isChanged()) {
						String newDirection = bottom2LeftRight2.randomDirection();
						enemy2.changeDirection(newDirection);
					}

					if (enemy2.getPosX() == topLeft2Bottom.getPosX() && enemy2.getPosY() == topLeft2Bottom.getPosY()
							&& !enemy2.isChanged()) {
						String newDirection = topLeft2Bottom.randomDirection();
						enemy2.changeDirection(newDirection);
					}

					if (enemy2.getPosX() == topLeft2Bottom2.getPosX() && enemy2.getPosY() == topLeft2Bottom2.getPosY()
							&& !enemy2.isChanged()) {
						String newDirection = topLeft2Bottom2.randomDirection();
						enemy2.changeDirection(newDirection);
					}

					if (enemy2.getPosX() == topLeft2Bottom3.getPosX() && enemy2.getPosY() == topLeft2Bottom3.getPosY()
							&& !enemy2.isChanged()) {
						String newDirection = topLeft2Bottom3.randomDirection();
						enemy2.changeDirection(newDirection);
					}
				}

				// Collision enemies
				for (int i = 0; i < this.enemyList2.size(); i++) {
					Enemy enemy2 = this.enemyList2.get(i);
					float enemy2X = enemy2.getPosX();
					float enemy2Y = enemy2.getPosY();
					float enemyWidth2 = enemy2.getWidth();
					float enemyHeight2 = enemy2.getHeight();

					if (player2X >= enemy2X && player2X < enemy2X + enemyWidth2 && player2Y > enemy2Y
							&& player2Y < enemy2Y + enemyHeight2) {
						player2.getDamage(enemy2.getDamage());
					}

				}

				// Defeat
				if (this.player2.getLives() <= 0) {
					this.screen = 8;
				}
				
				break;	
				
		 case 11:
			 
				image(this.introlevel3, 0, 0, 1200, 700);
				if ((mouseX > 907 && mouseX < 907 + 222 && mouseY > 571 && mouseY < 571 + 52)
						|| (mouseX > 39 && mouseX < 39 + 26 && mouseY > 50 && mouseY < 50 + 47)) {
					cursor(HAND);
				} else {
					cursor(ARROW);
				}
				break;
				
		 case 12:
			 
			 cursor(ARROW);
				
				for (int i = 0; i < this.rows3; i++) {
					for (int j = 0; j < this.colums3; j++) {
						this.tileArray3[i][j].paint();
					}
				}
			 
				image(this.gameplay3Image, 0, 0, 1200, 700);
				fill(255);
				textSize(20);
				text(treasureCount3  + " /5", 800, 45);
				
				// Paint lives
				
					for (int i = 0; i < this.player3.getLives(); i++) {
					image(this.heart, 965 + (i * 20), 31, 16, 16);
					}

					// Paint player
					this.player3.paint();

				    // Generate camomile 
					
					if (frameCount % 120 == 0) {
			
					int random = (int) Math.floor(random(spawnTiles3.size()));
			
					Tile randomTile = spawnTiles3.get(random);
					if (!randomTile.isOccupied()) {
					treasureList3.add(new Treasure(randomTile.getPosX() + 9, randomTile.getPosY() + 9, random, 21, 28,
				    this.treasureImage3, this));
					randomTile.setOccupied(true);
						}
					}	
					
					// Paint camomile
					
					for (int i = 0; i < treasureList3.size(); i++) {
						treasureList3.get(i).paint();
					}


					float player3X = this.player3.getPosX();
					float player3Y = this.player3.getPosY();
					float playerWidth3 = this.player3.getWidth();
					float playerHeight3 = this.player3.getHeight();

					// Get keys
					for (int i = 0; i < this.treasureList3.size(); i++) {
						Treasure treasure3 = this.treasureList3.get(i);
						float treasure3X = treasure3.getPosX();
						float treasure3Y = treasure3.getPosY();

						if (treasure3X > player3X && treasure3X < player3X + playerWidth3 && treasure3Y > player3Y
								&& treasure3Y < player3Y + playerHeight3) {

							spawnTiles3.get(i).setOccupied(false);
							treasureList3.remove(i);
							treasureCount3++;
							
							if( treasureCount3 == 5) {
								screen = 13;
							}	
						}
					}	
					
					// Paint enemies (Roya)
					
					for (int i = 0; i < this.enemyList3.size(); i++) {
						Enemy enemy3 = this.enemyList3.get(i);
						enemy3.paint();
						enemy3.moveX();
						enemy3.moveY();
					}

					// Change enemies direction
					for (int i = 0; i < this.enemyList3.size(); i++) {
						Enemy enemy3 = this.enemyList3.get(i);

						if (enemy3.getPosX() == left3Bottom.getPosX() && enemy3.getPosY() == left3Bottom.getPosY()
								&& !enemy3.isChanged()) {
							String newDirection = left3Bottom.randomDirection();
							enemy3.changeDirection(newDirection);
						}

						if (enemy3.getPosX() == left3Bottom2.getPosX() && enemy3.getPosY() == left3Bottom2.getPosY()
								&& !enemy3.isChanged()) {
							String newDirection = left3Bottom2.randomDirection();
							enemy3.changeDirection(newDirection);
						}

						if (enemy3.getPosX() == left3Bottom3.getPosX() && enemy3.getPosY() == left3Bottom3.getPosY()
								&& !enemy3.isChanged()) {
							String newDirection = left3Bottom3.randomDirection();
							enemy3.changeDirection(newDirection);
						}

						if (enemy3.getPosX() == topLeft3Right.getPosX() && enemy3.getPosY() == topLeft3Right.getPosY()
								&& !enemy3.isChanged()) {
							String newDirection = topLeft3Right.randomDirection();
							enemy3.changeDirection(newDirection);
						}

						if (enemy3.getPosX() == topLeft3Right2.getPosX() && enemy3.getPosY() == topLeft3Right2.getPosY()
								&& !enemy3.isChanged()) {
							String newDirection = topLeft3Right2.randomDirection();
							enemy3.changeDirection(newDirection);
						}

						if (enemy3.getPosX() == right3Bottom.getPosX() && enemy3.getPosY() == right3Bottom.getPosY()
								&& !enemy3.isChanged()) {
							String newDirection = right3Bottom.randomDirection();
							enemy3.changeDirection(newDirection);
						}

						if (enemy3.getPosX() == right3Bottom2.getPosX() && enemy3.getPosY() == right3Bottom2.getPosY()
								&& !enemy3.isChanged()) {
							String newDirection = right3Bottom2.randomDirection();
							enemy3.changeDirection(newDirection);
						}

						if (enemy3.getPosX() == right3Bottom3.getPosX() && enemy3.getPosY() == right3Bottom3.getPosY()
								&& !enemy3.isChanged()) {
							String newDirection = right3Bottom3.randomDirection();
							enemy3.changeDirection(newDirection);
						}

						if (enemy3.getPosX() == right3Bottom4.getPosX() && enemy3.getPosY() == right3Bottom4.getPosY()
								&& !enemy3.isChanged()) {
							String newDirection = right3Bottom4.randomDirection();
							enemy3.changeDirection(newDirection);
						}

						if (enemy3.getPosX() == topBottom3Right.getPosX() && enemy3.getPosY() == topBottom3Right.getPosY()
								&& !enemy3.isChanged()) {
							String newDirection = topBottom3Right.randomDirection();
							enemy3.changeDirection(newDirection);
						}

						if (enemy3.getPosX() == top3Left.getPosX() && enemy3.getPosY() == top3Left.getPosY()
								&& !enemy3.isChanged()) {
							String newDirection = top3Left.randomDirection();
							enemy3.changeDirection(newDirection);
						}

						if (enemy3.getPosX() == top3Left2.getPosX() && enemy3.getPosY() == top3Left2.getPosY()
								&& !enemy3.isChanged()) {
							String newDirection = top3Left2.randomDirection();
							enemy3.changeDirection(newDirection);
						}

						if (enemy3.getPosX() == top3Left3.getPosX() && enemy3.getPosY() == top3Left3.getPosY()
								&& !enemy3.isChanged()) {
							String newDirection = top3Left3.randomDirection();
							enemy3.changeDirection(newDirection);
						}

						if (enemy3.getPosX() == top3Left4.getPosX() && enemy3.getPosY() == top3Left4.getPosY()
								&& !enemy3.isChanged()) {
							String newDirection = top3Left4.randomDirection();
							enemy3.changeDirection(newDirection);
						}

						if (enemy3.getPosX() == top3Right.getPosX() && enemy3.getPosY() == top3Right.getPosY()
								&& !enemy3.isChanged()) {
							String newDirection = top3Right.randomDirection();
							enemy3.changeDirection(newDirection);
						}

						if (enemy3.getPosX() == top3Right2.getPosX() && enemy3.getPosY() == top3Right2.getPosY()
								&& !enemy3.isChanged()) {
							String newDirection = top3Right2.randomDirection();
							enemy3.changeDirection(newDirection);
						}

						if (enemy3.getPosX() == top3Right3.getPosX() && enemy3.getPosY() == top3Right3.getPosY()
								&& !enemy3.isChanged()) {
							String newDirection = top3Right3.randomDirection();
							enemy3.changeDirection(newDirection);
						}

						if (enemy3.getPosX() == topBottom3Right.getPosX() && enemy3.getPosY() == topBottom3Right.getPosY()
								&& !enemy3.isChanged()) {
							String newDirection = topBottom3Right.randomDirection();
							enemy3.changeDirection(newDirection);
						}

						if (enemy3.getPosX() == topBottom3Right2.getPosX() && enemy3.getPosY() == topBottom3Right2.getPosY()
								&& !enemy3.isChanged()) {
							String newDirection = topBottom3Right2.randomDirection();
							enemy3.changeDirection(newDirection);
						}

						if (enemy3.getPosX() == topBottom3Right3.getPosX() && enemy3.getPosY() == topBottom3Right3.getPosY()
								&& !enemy3.isChanged()) {
							String newDirection = topBottom3Right3.randomDirection();
							enemy3.changeDirection(newDirection);
						}

						if (enemy3.getPosX() == bottom3LeftRight.getPosX() && enemy3.getPosY() == bottom3LeftRight.getPosY()
								&& !enemy3.isChanged()) {
							String newDirection = bottom3LeftRight.randomDirection();
							enemy3.changeDirection(newDirection);
						}

						if (enemy3.getPosX() == bottom3LeftRight2.getPosX() && enemy3.getPosY() == bottom3LeftRight2.getPosY()
								&& !enemy3.isChanged()) {
							String newDirection = bottom3LeftRight2.randomDirection();
							enemy3.changeDirection(newDirection);
						}

						if (enemy3.getPosX() == topLeft3Bottom.getPosX() && enemy3.getPosY() == topLeft3Bottom.getPosY()
								&& !enemy3.isChanged()) {
							String newDirection = topLeft3Bottom.randomDirection();
							enemy3.changeDirection(newDirection);
						}

						if (enemy3.getPosX() == topLeft3Bottom2.getPosX() && enemy3.getPosY() == topLeft3Bottom2.getPosY()
								&& !enemy3.isChanged()) {
							String newDirection = topLeft3Bottom2.randomDirection();
							enemy3.changeDirection(newDirection);
						}

						if (enemy3.getPosX() == topLeft3Bottom3.getPosX() && enemy3.getPosY() == topLeft3Bottom3.getPosY()
								&& !enemy3.isChanged()) {
							String newDirection = topLeft3Bottom3.randomDirection();
							enemy3.changeDirection(newDirection);
						}
					}
					
					// Collision enemies
					for (int i = 0; i < this.enemyList3.size(); i++) {
						Enemy enemy3 = this.enemyList3.get(i);
						float enemy3X = enemy3.getPosX();
						float enemy3Y = enemy3.getPosY();
						float enemyWidth3 = enemy3.getWidth();
						float enemyHeight3 = enemy3.getHeight();
						
						if (player3X >= enemy3X && player3X < enemy3X + enemyWidth3 && player3Y > enemy3Y
								&& player3Y < enemy3Y + enemyHeight3) {
							player3.getDamage(enemy3.getDamage());
						}

					}

					// Defeat
					if (this.player3.getLives() <= 0) {
						this.screen = 8;
					}
					
					break;
					
		 case 13:
			 
				image(this.introlevel4, 0, 0, 1200, 700);
				if ((mouseX > 907 && mouseX < 907 + 222 && mouseY > 571 && mouseY < 571 + 52)
						|| (mouseX > 39 && mouseX < 39 + 26 && mouseY > 50 && mouseY < 50 + 47)) {
					cursor(HAND);
				} else {
					cursor(ARROW);
				}
				break;
				
		 case 14:
			 
				image(this.weapon, 0, 0, 1200, 700);
				if ((mouseX > 907 && mouseX < 907 + 222 && mouseY > 571 && mouseY < 571 + 52)
						|| (mouseX > 39 && mouseX < 39 + 26 && mouseY > 50 && mouseY < 50 + 47)) {
					cursor(HAND);
				} else {
					cursor(ARROW);
				}
				break;
				
		 case 15:
			 
				image(this.goodluck, 0, 0, 1200, 700);
				if ((mouseX > 907 && mouseX < 907 + 222 && mouseY > 571 && mouseY < 571 + 52)
						|| (mouseX > 39 && mouseX < 39 + 26 && mouseY > 50 && mouseY < 50 + 47)) {
					cursor(HAND);
				} else {
					cursor(ARROW);
				}
				break;
					
		 case 16:
			 
			 cursor(ARROW);
				
				for (int i = 0; i < this.rows4; i++) {
					for (int j = 0; j < this.colums4; j++) {
						this.tileArray4[i][j].paint();
					}
				}
			 
				image(this.gameplay4Image, 0, 0, 1200, 700);
				fill(255);
				textSize(20);
				text(treasureCount4  + " /10", 790, 45);
				
				// Paint lives
				
					for (int i = 0; i < this.player4.getLives(); i++) {
					image(this.heart, 965 + (i * 20), 31, 16, 16);
					}

					// Paint player
					this.player4.paint();

				    // Generate safelives 
					
					if (frameCount % 120 == 0) {
			
					int random = (int) Math.floor(random(spawnTiles4.size()));
			
					Tile randomTile = spawnTiles4.get(random);
					if (!randomTile.isOccupied()) {
					treasureList4.add(new Treasure(randomTile.getPosX() + 9, randomTile.getPosY() + 9, random, 20, 20,
				    this.treasureImage4, this));
					randomTile.setOccupied(true);
						}
					}	
			
				
                   // Paint safelives
					
					for (int i = 0; i < treasureList4.size(); i++) {
						treasureList4.get(i).paint();
					}


					float player4X = this.player4.getPosX();
					float player4Y = this.player4.getPosY();
					float playerWidth4 = this.player4.getWidth();
					float playerHeight4 = this.player4.getHeight();

					// Get keys
					for (int i = 0; i < this.treasureList4.size(); i++) {
						Treasure treasure4 = this.treasureList4.get(i);
						float treasure4X = treasure4.getPosX();
						float treasure4Y = treasure4.getPosY();
						if (treasure4X > player4X && treasure4X < player4X + playerWidth4 && treasure4Y > player4Y
								&& treasure4Y < player4Y + playerHeight4) {

							spawnTiles4.get(i).setOccupied(false);
							treasureList4.remove(i);
							treasureCount4++;
							
							if( treasureCount4 == 10) {
								screen = 17;
							}	
						}
					}	
					
                   // Generate bombs
					
					if (frameCount % 120 == 0) {
			
					int random = (int) Math.floor(random(spawnTiles4.size()));
			
					Tile randomTile = spawnTiles4.get(random);
					if (!randomTile.isOccupied()) {
					bombList4.add(new Bomb(randomTile.getPosX() + 9, randomTile.getPosY() + 9, random, 20, 20,
				    this.bombImage, this));
					randomTile.setOccupied(true);
						}
					}	
					
					
					
                  // Paint bombs
					
					for (int i = 0; i < bombList4.size(); i++) {
						bombList4.get(i).paint();
					}


					float player4XB = this.player4.getPosX();
					float player4YB = this.player4.getPosY();
					float playerWidth4B = this.player4.getWidth();
					float playerHeight4B = this.player4.getHeight();

					// Get BOMBS
					for (int i = 0; i < this.bombList4.size(); i++) {
						Bomb bomb4 = this.bombList4.get(i);
						float bomb4X = bomb4.getPosX();
						float bomb4Y = bomb4.getPosY();
						if (bomb4X > player4XB && bomb4X < player4XB + playerWidth4B && bomb4Y > player4YB
								&& bomb4Y < player4YB + playerHeight4B) {

							//spawnTiles4.get(i).setOccupied(false);
							
							enemyList4.remove(2);
						//	siga igual
							
							//if (enemyList4 == null || enemyList4.size() == 0) {
								//screen = 17;
							//}	
							
						}
						
					}	
					
					
					
					
                   // Paint enemies (Starbucks)
					
					for (int i = 0; i < this.enemyList4.size(); i++) {
						Enemy enemy4 = this.enemyList4.get(i);
						enemy4.paint();
						enemy4.moveX();
						enemy4.moveY();
					}

					// Change enemies direction
					for (int i = 0; i < this.enemyList4.size(); i++) {
						Enemy enemy4 = this.enemyList4.get(i);

						if (enemy4.getPosX() == left4Bottom.getPosX() && enemy4.getPosY() == left4Bottom.getPosY()
								&& !enemy4.isChanged()) {
							String newDirection = left4Bottom.randomDirection();
							enemy4.changeDirection(newDirection);
						}

						if (enemy4.getPosX() == left4Bottom2.getPosX() && enemy4.getPosY() == left4Bottom2.getPosY()
								&& !enemy4.isChanged()) {
							String newDirection = left4Bottom2.randomDirection();
							enemy4.changeDirection(newDirection);
						}

						if (enemy4.getPosX() == left4Bottom3.getPosX() && enemy4.getPosY() == left4Bottom3.getPosY()
								&& !enemy4.isChanged()) {
							String newDirection = left4Bottom3.randomDirection();
							enemy4.changeDirection(newDirection);
						}

						if (enemy4.getPosX() == topLeft4Right.getPosX() && enemy4.getPosY() == topLeft4Right.getPosY()
								&& !enemy4.isChanged()) {
							String newDirection = topLeft4Right.randomDirection();
							enemy4.changeDirection(newDirection);
						}

						if (enemy4.getPosX() == topLeft4Right2.getPosX() && enemy4.getPosY() == topLeft4Right2.getPosY()
								&& !enemy4.isChanged()) {
							String newDirection = topLeft4Right2.randomDirection();
							enemy4.changeDirection(newDirection);
						}

						if (enemy4.getPosX() == right4Bottom.getPosX() && enemy4.getPosY() == right4Bottom.getPosY()
								&& !enemy4.isChanged()) {
							String newDirection = right4Bottom.randomDirection();
							enemy4.changeDirection(newDirection);
						}

						if (enemy4.getPosX() == right4Bottom2.getPosX() && enemy4.getPosY() == right4Bottom2.getPosY()
								&& !enemy4.isChanged()) {
							String newDirection = right4Bottom2.randomDirection();
							enemy4.changeDirection(newDirection);
						}

						if (enemy4.getPosX() == right4Bottom3.getPosX() && enemy4.getPosY() == right4Bottom3.getPosY()
								&& !enemy4.isChanged()) {
							String newDirection = right4Bottom3.randomDirection();
							enemy4.changeDirection(newDirection);
						}

						if (enemy4.getPosX() == right4Bottom4.getPosX() && enemy4.getPosY() == right4Bottom4.getPosY()
								&& !enemy4.isChanged()) {
							String newDirection = right4Bottom4.randomDirection();
							enemy4.changeDirection(newDirection);
						}

						if (enemy4.getPosX() == topBottom4Right.getPosX() && enemy4.getPosY() == topBottom4Right.getPosY()
								&& !enemy4.isChanged()) {
							String newDirection = topBottom4Right.randomDirection();
							enemy4.changeDirection(newDirection);
						}

						if (enemy4.getPosX() == top4Left.getPosX() && enemy4.getPosY() == top4Left.getPosY()
								&& !enemy4.isChanged()) {
							String newDirection = top4Left.randomDirection();
							enemy4.changeDirection(newDirection);
						}

						if (enemy4.getPosX() == top4Left2.getPosX() && enemy4.getPosY() == top4Left2.getPosY()
								&& !enemy4.isChanged()) {
							String newDirection = top4Left2.randomDirection();
							enemy4.changeDirection(newDirection);
						}

						if (enemy4.getPosX() == top4Left3.getPosX() && enemy4.getPosY() == top4Left3.getPosY()
								&& !enemy4.isChanged()) {
							String newDirection = top4Left3.randomDirection();
							enemy4.changeDirection(newDirection);
						}

						if (enemy4.getPosX() == top4Left4.getPosX() && enemy4.getPosY() == top4Left4.getPosY()
								&& !enemy4.isChanged()) {
							String newDirection = top4Left4.randomDirection();
							enemy4.changeDirection(newDirection);
						}

						if (enemy4.getPosX() == top4Right.getPosX() && enemy4.getPosY() == top4Right.getPosY()
								&& !enemy4.isChanged()) {
							String newDirection = top4Right.randomDirection();
							enemy4.changeDirection(newDirection);
						}

						if (enemy4.getPosX() == top4Right2.getPosX() && enemy4.getPosY() == top4Right2.getPosY()
								&& !enemy4.isChanged()) {
							String newDirection = top4Right2.randomDirection();
							enemy4.changeDirection(newDirection);
						}

						if (enemy4.getPosX() == top4Right3.getPosX() && enemy4.getPosY() == top4Right3.getPosY()
								&& !enemy4.isChanged()) {
							String newDirection = top4Right3.randomDirection();
							enemy4.changeDirection(newDirection);
						}

						if (enemy4.getPosX() == topBottom4Right.getPosX() && enemy4.getPosY() == topBottom4Right.getPosY()
								&& !enemy4.isChanged()) {
							String newDirection = topBottom4Right.randomDirection();
							enemy4.changeDirection(newDirection);
						}

						if (enemy4.getPosX() == topBottom4Right2.getPosX() && enemy4.getPosY() == topBottom4Right2.getPosY()
								&& !enemy4.isChanged()) {
							String newDirection = topBottom4Right2.randomDirection();
							enemy4.changeDirection(newDirection);
						}

						if (enemy4.getPosX() == topBottom4Right3.getPosX() && enemy4.getPosY() == topBottom4Right3.getPosY()
								&& !enemy4.isChanged()) {
							String newDirection = topBottom4Right3.randomDirection();
							enemy4.changeDirection(newDirection);
						}

						if (enemy4.getPosX() == bottom4LeftRight.getPosX() && enemy4.getPosY() == bottom4LeftRight.getPosY()
								&& !enemy4.isChanged()) {
							String newDirection = bottom4LeftRight.randomDirection();
							enemy4.changeDirection(newDirection);
						}

						if (enemy4.getPosX() == bottom4LeftRight2.getPosX() && enemy4.getPosY() == bottom4LeftRight2.getPosY()
								&& !enemy4.isChanged()) {
							String newDirection = bottom4LeftRight2.randomDirection();
							enemy4.changeDirection(newDirection);
						}

						if (enemy4.getPosX() == topLeft4Bottom.getPosX() && enemy4.getPosY() == topLeft4Bottom.getPosY()
								&& !enemy4.isChanged()) {
							String newDirection = topLeft4Bottom.randomDirection();
							enemy4.changeDirection(newDirection);
						}

						if (enemy4.getPosX() == topLeft4Bottom2.getPosX() && enemy4.getPosY() == topLeft4Bottom2.getPosY()
								&& !enemy4.isChanged()) {
							String newDirection = topLeft4Bottom2.randomDirection();
							enemy4.changeDirection(newDirection);
						}

						if (enemy4.getPosX() == topLeft4Bottom3.getPosX() && enemy4.getPosY() == topLeft4Bottom3.getPosY()
								&& !enemy4.isChanged()) {
							String newDirection = topLeft4Bottom3.randomDirection();
							enemy4.changeDirection(newDirection);
						}
					}
				
					// Collision enemies
					for (int i = 0; i < this.enemyList4.size(); i++) {
						Enemy enemy4 = this.enemyList4.get(i);
						float enemy4X = enemy4.getPosX();
						float enemy4Y = enemy4.getPosY();
						float enemyWidth4 = enemy4.getWidth();
						float enemyHeight4 = enemy4.getHeight();
						
						if (player4X >= enemy4X && player4X < enemy4X + enemyWidth4 && player4Y > enemy4Y
								&& player4Y < enemy4Y + enemyHeight4) {
							player4.getDamage(enemy4.getDamage());
						}

					}

					// Defeat
					if (this.player4.getLives() <= 0) {
					this.screen = 8;
						
						
					}
					
					break;
				
		 case 17:
			 
				image(this.victory, 0, 0, 1200, 700);
				if (mouseX > 507 && mouseX < 507 + 186 && mouseY > 479 && mouseY < 479 + 52) {
					
					cursor(HAND);
				} else {
					cursor(ARROW);
				}
				break;
				
		 case 18:
			 
				image(this.equipment, 0, 0, 1200, 700);
				if (mouseX > 507 && mouseX < 507 + 186 && mouseY > 479 && mouseY < 479 + 52) {
					
					cursor(HAND);
				} else {
					cursor(ARROW);
				}
				break;

		default:
			break;
		}

	}

	public void mousePressed() {

		switch (screen) {
		case 0:
			if (mouseX > 507 && mouseX < 507 + 186 && mouseY > 479 && mouseY < 479 + 52) {
				screen = 1;
			}
			break;

		case 1:
			
			if (mouseX > 39 && mouseX < 39 + 26 && mouseY > 50 && mouseY < 50 + 47) {
				screen = 0;
			}
			
			if (mouseX > 907 && mouseX < 907 + 222 && mouseY > 571 && mouseY < 571 + 52) {
				screen = 2;
			}
			break;

		case 2:
			if (mouseX > 39 && mouseX < 39 + 26 && mouseY > 50 && mouseY < 50 + 47) {
				screen = 1;
			}
			
			if (mouseX > 907 && mouseX < 907 + 222 && mouseY > 571 && mouseY < 571 + 52) {
				screen = 3;
			}
			break;

		case 3:
			if (mouseX > 39 && mouseX < 39 + 26 && mouseY > 50 && mouseY < 50 + 47) {
				screen = 2;
			}
			
			if (mouseX > 907 && mouseX < 907 + 222 && mouseY > 571 && mouseY < 571 + 52) {
				screen = 4;
			}
			break;
			
		case 4:
			if (mouseX > 39 && mouseX < 39 + 26 && mouseY > 50 && mouseY < 50 + 47) {
				screen = 3;
			}
			
			if (mouseX > 907 && mouseX < 907 + 222 && mouseY > 571 && mouseY < 571 + 52) {
				screen = 5;
			}
			break;
			
		case 5:
			if (mouseX > 39 && mouseX < 39 + 26 && mouseY > 50 && mouseY < 50 + 47) {
				screen = 4;
			}
			
			if (mouseX > 907 && mouseX < 907 + 222 && mouseY > 571 && mouseY < 571 + 52) {
				screen = 6;
			}
			break;

		case 6:
			if (mouseX > 39 && mouseX < 39 + 26 && mouseY > 50 && mouseY < 50 + 47) {
				screen = 5;
			}
			
			if (mouseX > 907 && mouseX < 907 + 222 && mouseY > 571 && mouseY < 571 + 52) {
				screen = 7;
			}
			
			break;
			
		case 8:
			
			if (mouseX > 507 && mouseX < 507 + 186 && mouseY > 571 && mouseY < 571 + 52){
				
				reset();
			}
			
		
		case 9:
			
			if (mouseX > 907 && mouseX < 907 + 222 && mouseY > 571 && mouseY < 571 + 52) {
				screen = 10;
			}
			break;
			
        case 11:
			
			if (mouseX > 907 && mouseX < 907 + 222 && mouseY > 571 && mouseY < 571 + 52) {
				screen = 12;
			}
			break;
		
        case 13:
			
			if (mouseX > 907 && mouseX < 907 + 222 && mouseY > 571 && mouseY < 571 + 52) {
				screen = 14;
			}
			break;
		
         case 14:
			
			if (mouseX > 907 && mouseX < 907 + 222 && mouseY > 571 && mouseY < 571 + 52) {
				screen = 15;
			}
			break;
			
         case 15:
 			
 			if (mouseX > 907 && mouseX < 907 + 222 && mouseY > 571 && mouseY < 571 + 52) {
 				screen = 16;
 			}
 			break;
		
         case 17:
      
 			
 			if (mouseX > 507 && mouseX < 507 + 186 && mouseY > 479 && mouseY < 479 + 52){
 				screen = 18;
 			}
 			
 			break;
 			
         case 18:
             
  			
  			if (mouseX > 507 && mouseX < 507 + 186 && mouseY > 479 && mouseY < 479 + 52){
  				
  				reset ();
  				
  				
  			}
  			
  			break;
	
			
		default:
			break;
		}
	}

	public void keyPressed() {

		switch (screen) {
		case 7:
			// logic.keyEvents();
			if (keyCode == UP) {
				// if we aren't in the top row and the cell above us doesn't contain an obstacle
				// then we can move up
				if (player.getPosY() > 115 + 3 && tileArray[playerMatY - 1][playerMatX].getType() != 0) {
					this.player.moveUp();
					playerMatY--;
				}
			} else if (keyCode == DOWN) {
				// if we aren't in the bottom row and the cell below us doesn't contain an
				// obstacle
				// then we can move down
				if (player.getPosY() < 115 + (490) && tileArray[playerMatY + 1][playerMatX].getType() != 0) {
					this.player.moveDown();
					playerMatY++;
				}
			} else if (keyCode == LEFT) {
				// if we aren't in the left-most column and the cell to our left doesn't contain
				// an obstacle
				// then we can move left
				if (player.getPosX() > 59 + 7 && tileArray[playerMatY][playerMatX - 1].getType() != 0) {
					this.player.moveLeft();
					playerMatX--;
				}
			} else if (keyCode == RIGHT) {
				// if we aren't in the right-most column and the cell to our right doesn't
				// contain an obstacle
				// then we can move right
				if (player.getPosX() < 59 + 1029 && tileArray[playerMatY][playerMatX + 1].getType() != 0) {
					this.player.moveRight();
					playerMatX++;
				}
			}
			break;
			
		case 10:
			// logic.keyEvents();
			if (keyCode == UP) {
				// if we aren't in the top row and the cell above us doesn't contain an obstacle
				// then we can move up
				if (player2.getPosY() > 115 + 3 && tileArray2[playerMat2Y - 1][playerMat2X].getType() != 0) {
					this.player2.moveUp();
					playerMat2Y--;
				}
			} else if (keyCode == DOWN) {
				// if we aren't in the bottom row and the cell below us doesn't contain an
				// obstacle
				// then we can move down
				if (player2.getPosY() < 115 + (490) && tileArray2[playerMat2Y + 1][playerMat2X].getType() != 0) {
					this.player2.moveDown();
					playerMat2Y++;
				}
			} else if (keyCode == LEFT) {
				// if we aren't in the left-most column and the cell to our left doesn't contain
				// an obstacle
				// then we can move left
				if (player2.getPosX() > 59 + 7 && tileArray2[playerMat2Y][playerMat2X - 1].getType() != 0) {
					this.player2.moveLeft();
					playerMat2X--;
				}
			} else if (keyCode == RIGHT) {
				// if we aren't in the right-most column and the cell to our right doesn't
				// contain an obstacle
				// then we can move right
				if (player2.getPosX() < 59 + 1029 && tileArray2[playerMat2Y][playerMat2X + 1].getType() != 0) {
					this.player2.moveRight();
					playerMat2X++;
				}
			}
			break;
			
		case 12:
			// logic.keyEvents();
			if (keyCode == UP) {
				// if we aren't in the top row and the cell above us doesn't contain an obstacle
				// then we can move up
				if (player3.getPosY() > 115 + 3 && tileArray3[playerMat3Y - 1][playerMat3X].getType() != 0) {
					this.player3.moveUp();
					playerMat3Y--;
				}
			} else if (keyCode == DOWN) {
				// if we aren't in the bottom row and the cell below us doesn't contain an
				// obstacle
				// then we can move down
				if (player3.getPosY() < 115 + (490) && tileArray3[playerMat3Y + 1][playerMat3X].getType() != 0) {
					this.player3.moveDown();
					playerMat3Y++;
				}
			} else if (keyCode == LEFT) {
				// if we aren't in the left-most column and the cell to our left doesn't contain
				// an obstacle
				// then we can move left
				if (player3.getPosX() > 59 + 7 && tileArray3[playerMat3Y][playerMat3X - 1].getType() != 0) {
					this.player3.moveLeft();
					playerMat3X--;
				}
			} else if (keyCode == RIGHT) {
				// if we aren't in the right-most column and the cell to our right doesn't
				// contain an obstacle
				// then we can move right
				if (player3.getPosX() < 59 + 1029 && tileArray3[playerMat3Y][playerMat3X + 1].getType() != 0) {
					this.player3.moveRight();
					playerMat3X++;
				}
			}
			break;
		
		case 16:
			// logic.keyEvents();
			if (keyCode == UP) {
				// if we aren't in the top row and the cell above us doesn't contain an obstacle
				// then we can move up
				if (player4.getPosY() > 115 + 3 && tileArray4[playerMat4Y - 1][playerMat4X].getType() != 0) {
					this.player4.moveUp();
					playerMat4Y--;
				}
			} else if (keyCode == DOWN) {
				// if we aren't in the bottom row and the cell below us doesn't contain an
				// obstacle
				// then we can move down
				if (player4.getPosY() < 115 + (490) && tileArray4[playerMat4Y + 1][playerMat4X].getType() != 0) {
					this.player4.moveDown();
					playerMat4Y++;
				}
			} else if (keyCode == LEFT) {
				// if we aren't in the left-most column and the cell to our left doesn't contain
				// an obstacle
				// then we can move left
				if (player4.getPosX() > 59 + 7 && tileArray4[playerMat4Y][playerMat4X - 1].getType() != 0) {
					this.player4.moveLeft();
					playerMat4X--;
				}
			} else if (keyCode == RIGHT) {
				// if we aren't in the right-most column and the cell to our right doesn't
				// contain an obstacle
				// then we can move right
				if (player4.getPosX() < 59 + 1029 && tileArray4[playerMat4Y][playerMat4X + 1].getType() != 0) {
					this.player4.moveRight();
					playerMat4X++;
				}
			}
			break;
			
			
			
		}

	}


}
