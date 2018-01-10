package com.mygdx.game;

import com.badlogic.gdx.assets.AssetDescriptor;
import com.badlogic.gdx.assets.AssetManager;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.scenes.scene2d.ui.Skin;

public class Assets {
    public final AssetManager assetManager = new AssetManager();

    public static final AssetDescriptor<Skin> jsonik = new AssetDescriptor<Skin>("uiskin.json", Skin.class);

    public static final AssetDescriptor<Texture> windowBack = new AssetDescriptor<Texture>("assets/frame_output.png", Texture.class);


    public void load() {
        assetManager.load(windowBack);

        assetManager.finishLoading();
    }

    public void dispose() {
        assetManager.dispose();
    }



    }
