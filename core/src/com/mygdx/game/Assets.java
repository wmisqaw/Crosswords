package com.mygdx.game;

import com.badlogic.gdx.assets.AssetDescriptor;
import com.badlogic.gdx.assets.AssetManager;
import com.badlogic.gdx.graphics.Texture;

public class Assets {
    public final AssetManager assetManager = new AssetManager();

    public static final AssetDescriptor<Texture> windowBack = new AssetDescriptor<Texture>("assets/frame_output.png", Texture.class);


    public void load() {

    }

    }
