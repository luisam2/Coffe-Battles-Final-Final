package model;

import processing.core.PApplet;
import processing.core.PImage;

public class Treasure {
	private float posX;
	private float posY;
	private int tile;
	private float width;
	private float height;
	private PApplet app;
	private PImage treasureImage;
	
	public Treasure(float posX, float posY, int tile, float width, float height,  PImage treasureImage, PApplet app) {
		this.posX = posX;
		this.posY = posY;
		this.tile = tile;
		this.width = width;
		this.height = height;
		this.treasureImage = treasureImage;
		this.app = app;
	}
	
	public void paint() {
		this.app.image(this.treasureImage, this.posX, this.posY, this.width, this.height);
	}

	public float getPosX() {
		return posX;
	}

	public void setPosX(float posX) {
		this.posX = posX;
	}

	public float getPosY() {
		return posY;
	}

	public void setPosY(float posY) {
		this.posY = posY;
	}

	public int getTile() {
		return tile;
	}

	public void setTile(int tile) {
		this.tile = tile;
	}

	public float getWidth() {
		return width;
	}

	public void setWidth(float width) {
		this.width = width;
	}

	public float getHeight() {
		return height;
	}

	public void setHeight(float height) {
		this.height = height;
	}

	public PImage getTreasureImage() {
		return treasureImage;
	}

	public void setTreasureImage(PImage playerImage) {
		this.treasureImage = playerImage;
	}
	
}
