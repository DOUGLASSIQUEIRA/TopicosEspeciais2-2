package com.edvaldotsi.flappybird.screen;

import com.badlogic.gdx.Screen;
import com.edvaldotsi.flappybird.MainGame;

/**
 * Created by Edvaldo on 28/09/2015.
 */
public abstract class BaseScreen implements Screen {

    protected MainGame game;

    public BaseScreen(MainGame game) {
        this.game = game;
    }

    @Override
    public void hide() {
        dispose();
    }
}
