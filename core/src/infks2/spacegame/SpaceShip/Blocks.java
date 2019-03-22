package infks2.spacegame.SpaceShip;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;
import com.badlogic.gdx.graphics.Texture;

public class Blocks {

    public Texture texture;
    public int XCoor = 0;
    public int YCoor = 0;

    public Blocks() {
        this.texture = new Texture("image/Block.png");
    }

    public void Moving() {
        boolean Left = Gdx.input.isKeyPressed(Input.Keys.A);
        boolean Right = Gdx.input.isKeyPressed(Input.Keys.D);
        boolean Forward = Gdx.input.isKeyPressed(Input.Keys.W);
        boolean Backwards = Gdx.input.isKeyPressed(Input.Keys.S);
        if(Left == true) {
            XCoor = XCoor - 5;
        }
        if(Right == true) {
            XCoor = XCoor + 5;
        }
        if(Forward == true) {
            YCoor = YCoor + 5;
        }
        if(Backwards == true) {
            YCoor = YCoor - 5;
        }
    }

}