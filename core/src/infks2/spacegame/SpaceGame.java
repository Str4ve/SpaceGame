package infks2.spacegame;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import infks2.spacegame.SpaceShip.Blocks;
import jdk.nashorn.internal.ir.Block;
import sun.java2d.windows.GDIBlitLoops;

import java.util.ArrayList;
import java.util.List;

public class SpaceGame extends ApplicationAdapter {

	public SpriteBatch batch;
	Texture img;
	Blocks block;
	Texture Rahmen;
	List<Blocks> BlockSpawn = new ArrayList<Blocks>();

	@Override
	public void create() {
		batch = new SpriteBatch();
		img = new Texture("image/IMG_0021.PNG");
		block = new Blocks();
		Rahmen = new Texture("image/Rahmen.png");
	}

	@Override
	public void render() {
		Gdx.gl.glClearColor(1, 0, 0, 1);
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
		batch.begin();
		batch.draw(img, 0, 0);
		batch.draw(Rahmen, 500, 410);
		batch.draw(block.texture, block.XCoor, block.YCoor);
		for(int i = 0; i < BlockSpawn.size(); i++) {
			batch.draw(block.texture, BlockSpawn.get(i).XCoorDrag, BlockSpawn.get(i).YCoorDrag);
		}
		for(int i = 0; i < BlockSpawn.size(); i++) {
			BlockSpawn.get(i).Moving();
		}
		batch.end();
		block.Moving();
		block.DragDrop();
		Spawn();

		/*int Findx = Gdx.input.getX();
		System.out.println(Findx);*/
	}

	@Override
	public void dispose() {
		batch.dispose();
		img.dispose();
	}

	public void Spawn() {
		if(Gdx.input.isKeyJustPressed(Input.Keys.SPACE)) {
			BlockSpawn.add(new Blocks());
		}
	}

}

