package com.ulfben.spaceshooter.canusingpkg;
//Created by Ulf Benjaminsson (ulfben) on 2018-01-20.

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;

import com.ulfben.spaceshooter.Entity;
import com.ulfben.spaceshooter.Game;

public class StarV2 extends EntityV2{
    protected static final float STAR_SIZE = 5;
    protected float mPlayerSpeed = 0.0f;
    public StarV2(){
        super( mDice.nextInt(Game.STAGE_WIDTH),
                mDice.nextInt(Game.STAGE_HEIGHT));
        mWidth = STAR_SIZE;
        mHeight = STAR_SIZE;
        mVelocityX = -mDice.nextFloat();
    }

    @Override
    public void input(GameV2 game){
        mPlayerSpeed = game.getPlayerSpeed() * -1;
    }

    @Override
    public void update(){
        super.update();
        mX += mPlayerSpeed;
    }


    @Override
    public void render(final Canvas canvas, final Paint paint){
        paint.setColor(Color.WHITE);
        canvas.drawCircle(mX, mY, mWidth, paint);
    }
}
