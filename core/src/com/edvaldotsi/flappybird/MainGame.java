package com.edvaldotsi.flappybird;

import com.badlogic.gdx.Game;
import com.edvaldotsi.flappybird.screen.GameScreen;

public class MainGame extends Game {

	@Override
	public void create() {
        setScreen(new GameScreen(this));
	}
}
