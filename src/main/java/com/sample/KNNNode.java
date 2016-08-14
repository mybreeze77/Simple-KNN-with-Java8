package com.sample;

public class KNNNode {

	private double[] characters;
	private int label;
	
	public KNNNode() {
		super();
	}

	public KNNNode(double[] characters, int label) {
		super();
		this.characters = characters;
		this.label = label;
	}

	public double[] getCharacters() {
		return characters;
	}

	public void setCharacters(double[] characters) {
		this.characters = characters;
	}

	public int getLabel() {
		return label;
	}

	public void setLabel(int label) {
		this.label = label;
	}
	
}
