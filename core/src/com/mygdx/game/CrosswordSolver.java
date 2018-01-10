package com.mygdx.game;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.assets.AssetDescriptor;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.NinePatch;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.g3d.utils.TextureProvider;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.scenes.scene2d.ui.List;
import com.badlogic.gdx.scenes.scene2d.ui.SelectBox;
import com.badlogic.gdx.scenes.scene2d.ui.Skin;
import com.badlogic.gdx.scenes.scene2d.ui.Window;
import com.badlogic.gdx.scenes.scene2d.utils.NinePatchDrawable;
import com.badlogic.gdx.scenes.scene2d.utils.SpriteDrawable;
import com.badlogic.gdx.utils.Align;
import javafx.scene.control.Button;
import javafx.scene.control.RadioButton;

public class CrosswordSolver extends ApplicationAdapter {
	SpriteBatch batch;
	Texture img;
	ShapeRenderer shapeRenderer;
	SelectBox selectBox;
	Skin skin;
	SelectBox.SelectBoxStyle style;
	private Window description;
	private Stage stage;
	private Assets assets;
	//RadioButton button;

    public CrosswordSolver(Assets assets) {
        this.assets = assets;
    }

	
	@Override
	public void create () {
		batch = new SpriteBatch();
		//img = new Texture("badlogic.jpg");
		shapeRenderer = new ShapeRenderer();
		shapeRenderer.setAutoShapeType(true);
		img = new Texture("background.jpg");
		/*//skin = new Skin(Gdx.files.internal("C:\\Users\\Michaela\\Desktop\\Crosswords\\core\\assets\\skins\\uiskin.json"));
		skin = new Skin(Gdx.files.external("C:/Users/Michaela/Desktop/Crosswords/core/assets/skins/uiskin.json"));
		skin = new Skin();
		skin
		selectBox = new SelectBox(skin);
		style = new SelectBox.SelectBoxStyle();
		style.font = skin.getFont("default");
		style.listStyle = new List.ListStyle();
		style.listStyle.font = skin.getFont("default");*/
		stage = new Stage();
		TextureProvider.AssetTextureProvider assets;
		NinePatch menuWindowBgNinePatch = new NinePatch(assets.assetManager.get(Assets.windowBackground), 10, 10, 250, 0);
		Window.WindowStyle menuWindowStyle = new Window.WindowStyle(assets.assetManager.get(Assets.infoFont), Color.BLACK, new NinePatchDrawable(menuWindowBgNinePatch));
		Window menuWindow = new Window("", menuWindowStyle);
		description.setKeepWithinStage(true);
		description.setModal(false);
		description.setMovable(true);
		description.setResizable(false);
		description.setSize(200, 1000);
		description.getTitleLabel().setAlignment(Align.center);
		description.getTitleTable().padTop(menuWindow.getTitleLabel().getHeight()/2);
		stage.addActor(menuWindow);


	}

	@Override
	public void render () {
		Gdx.gl.glClearColor(1, 1, 0, 1);
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
		batch.begin();
		batch.draw(img, 0 , 0, Gdx.graphics.getWidth(), Gdx.graphics.getHeight());
		batch.end();
		//selectBox.draw(batch, 20.0f);
		shapeRenderer.begin(ShapeRenderer.ShapeType.Filled);
		shapeRenderer.setColor(0, 1, 1, 1);
		for (int x = 0; x < 11; x++)
		{
			for (int y = 0; y < 8; y++)
			{
				shapeRenderer.rect(((Gdx.graphics.getWidth() / 2.0f) + ((5 * 30) / 2.0f)) - (x * 30.0f) , ((Gdx.graphics.getHeight() / 2.0f) + ((2 * 30) / 2.0f)) - (y * 30.0f), 25.0f, 25.0f);
			}
		}
		shapeRenderer.setColor(1, 0, 0, 1);
		for (int x = 0; x < 11; x++) {
			for (int y = 0; y < 8; y++) {
				//shapeRenderer.rect(Gdx.graphics.getWidth() - (float) (x * 30 + 5), Gdx.graphics.getHeight() - (float) (y * 30 + 5), 20.0f, 20.0f);
				shapeRenderer.rect(((Gdx.graphics.getWidth() / 2.0f) + ((10 * 30) / 2.0f)) + (x * 28.0f) , ((Gdx.graphics.getHeight() / 2.0f) + ((7 * 30) / 2.0f)) + (y * 28.0f), 20.0f, 20.0f);
			}
		}
		shapeRenderer.end();
	}
	
	@Override
	public void dispose () {
		batch.dispose();
		img.dispose();
	}
}
