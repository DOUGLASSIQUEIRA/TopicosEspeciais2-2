package com.edvaldotsi.flappybird.body;

import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.physics.box2d.Body;
import com.badlogic.gdx.physics.box2d.BodyDef;
import com.badlogic.gdx.physics.box2d.CircleShape;
import com.badlogic.gdx.physics.box2d.Fixture;
import com.badlogic.gdx.physics.box2d.World;
import com.edvaldotsi.flappybird.util.Helper;

/**
 * Created by Edvaldo on 05/10/2015.
 */
public class Bird {

    private final World world;
    private final OrthographicCamera camera;
    private final Texture[] textures;

    private Body body;

    public Bird(World world, OrthographicCamera camera, Texture[] textures) {
        this.world = world;
        this.camera = camera;
        this.textures = textures;

        initBody();
    }

    private void initBody() {
        float x = (camera.viewportWidth / 2) / Helper.PIXEL_METER;
        float y = (camera.viewportHeight / 2) / Helper.PIXEL_METER;

        body = Helper.createBody(world, BodyDef.BodyType.DynamicBody, x, y);

        CircleShape shape = new CircleShape();
        shape.setRadius(22 / Helper.PIXEL_METER);

        Fixture fixture = Helper.createShape(body, shape, "bird");
        shape.dispose();
    }
}
