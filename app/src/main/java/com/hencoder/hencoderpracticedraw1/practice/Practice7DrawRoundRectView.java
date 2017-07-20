package com.hencoder.hencoderpracticedraw1.practice;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

public class Practice7DrawRoundRectView extends View {

    private Paint mPaint;

    private float mWidth = 400, mHeight = 200;

    private float mX, mY;

    private float mRound = 50;

    private RectF mRectF;

    public Practice7DrawRoundRectView(Context context) {
        this(context, null);
    }

    public Practice7DrawRoundRectView(Context context, @Nullable AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public Practice7DrawRoundRectView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init();
    }

    private void init() {
        mPaint = new Paint(Paint.ANTI_ALIAS_FLAG);
        mRectF = new RectF();
    }

    @Override
    protected void onSizeChanged(int w, int h, int oldw, int oldh) {

        mX = (w - mWidth) / 2;
        mY = (h - mHeight) / 2;

    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

        //        练习内容：使用 canvas.drawRoundRect() 方法画圆角矩形

        mRectF.set(mX, mY, mX + mWidth, mY + mHeight);
        canvas.drawRoundRect(mRectF,  mRound, mRound, mPaint);

    }

}
