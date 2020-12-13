package model;

import processing.core.PApplet;
import processing.core.PImage;

public class Bomb {

	private float posX;
	private float posY;
	private int tile;
	private float width;
	private float height;
	private PApplet app;
	private PImage bombImage;
	
	public Bomb(float posX, float posY, int tile, float width, float height,  PImage bombImage, PApplet app) {
		this.posX = posX;
		this.posY = posY;
		this.tile = tile;
		this.width = width;
		this.height = height;
		this.bombImage = bombImage;
		this.app = app;
	}
	
	public void paint() {
		this.app.image(this.bombImage, this.posX, this.posY, this.width, this.height);
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

	public PImage getBombImage() {
		return bombImage;
	}

	public void setBombImage(PImage playerImage) {
		this.bombImage = playerImage;
	}
	
}
