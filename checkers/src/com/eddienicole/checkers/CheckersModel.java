package com.eddienicole.checkers;

public class CheckersModel {

	private final PlayableSpaceInterface[][] playableSpaces;

	public CheckersModel() {
		this.playableSpaces = new PlayableSpace[8][4];
		for (int i = 0; i < playableSpaces.length; i++) {
			for (int j = 0; j < playableSpaces[i].length; j++) {
				playableSpaces[i][j] = new PlayableSpace();
				if (i < 3) {
					this.playableSpaces[i][j].setOccupied(true);
					this.playableSpaces[i][j].setRed(true);
				} else if (i > 4) {
					this.playableSpaces[i][j].setOccupied(true);
					this.playableSpaces[i][j].setRed(false);
				}
			}
		}
	}

	public CheckersModel(PlayableSpaceInterface[][] playableSpaces) {
		this.playableSpaces = playableSpaces;
	}

	public PlayableSpaceInterface[][] getPlayableSpaces() {
		return this.playableSpaces;
	}

}
