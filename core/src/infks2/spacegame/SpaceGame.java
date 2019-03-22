package infks2.spacegame;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import infks2.spacegame.SpaceShip.Blocks;

public class SpaceGame extends ApplicationAdapter {

	SpriteBatch batch;
	Texture img;
	Blocks block;
	
	@Override
	public void create () {
		batch = new SpriteBatch();
		img = new Texture("image/IMG_0021.PNG");
		block = new Blocks();
	}

	@Override
	public void render () {
		Gdx.gl.glClearColor(1, 0, 0, 1);
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
		batch.begin();
		batch.draw(img, 0, 0);
		batch.draw(block.texture, block.XCoor, block.YCoor);
		batch.end();
		block.Moving();
		//ja brudiiiii
	}
	
	@Override
	public void dispose () {
		batch.dispose();
		img.dispose();
	}
}
