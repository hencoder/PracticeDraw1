package com.hencoder.hencoderpracticedraw1.practice;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

public class Practice8DrawArcView extends View {

    private Paint mPaint;

    private float mWidth = 350, mHeight = 250;

    private float mX, mY;

    private RectF mRectF;

    public Practice8DrawArcView(Context context) {
        this(context, null);
    }

    public Practice8DrawArcView(Context context, @Nullable AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public Practice8DrawArcView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
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

        //        练习内容：使用 canvas.drawArc() 方法画弧形和扇形

        mRectF.set(mX, mY, mX + mWidth, mY + mHeight);

        canvas.drawArc(mRectF, -10, -100, true, mPaint);
        canvas.drawArc(mRectF, 20, 140, false, mPaint);
        mPaint.setStyle(Paint.Style.STROKE);
        canvas.drawArc(mRectF, -120, -60, false, mPaint);

    }

}
