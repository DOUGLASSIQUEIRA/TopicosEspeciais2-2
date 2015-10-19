package com.edvaldotsi.flappybird.util;

import com.badlogic.gdx.physics.box2d.Body;
import com.badlogic.gdx.physics.box2d.BodyDef;
import com.badlogic.gdx.physics.box2d.Fixture;
import com.badlogic.gdx.physics.box2d.FixtureDef;
import com.badlogic.gdx.physics.box2d.Shape;
import com.badlogic.gdx.physics.box2d.World;

/**
 * Created by Edvaldo on 05/10/2015.
 */
public class Helper {

    public static final float SCALE = 2;
    public static final float PIXEL_METER = 32;
    public static final float BORDER_HEIGHT = 80 / PIXEL_METER;

    /**
     * Create a body into the world
     *
     * @param world Our world
     * @param type Body type
     * @param x Horizontal axis
     * @param y Vertical axis
     * @return Our body
     */
    public static Body createBody(World world, BodyDef.BodyType type, float x, float y) {
        BodyDef def = new BodyDef();
        def.type = type;
        def.position.set(x, y);
        def.fixedRotation = true;
        return world.createBody(def);
    }

    /**
     * Create a shape to the body
     *
     * @param body Out body
     * @param shape Geometric shape
     * @param name Identification name
     * @return Our fixture
     */
    public static Fixture createShape(Body body, Shape shape, String name) {
        FixtureDef def = new FixtureDef();
        def.density = 1; // Body density - Starts with 1
        def.friction = 0.06f; // Friction between two bodies - Starts with 0.06f
        def.restitution = 0.3f; // Restitution of bodies collisions - Starts with 0.3f
        def.shape = shape;

        Fixture fixture = body.createFixture(def);
        fixture.setUserData(name); // Shape identification
        return fixture;
    }
}
