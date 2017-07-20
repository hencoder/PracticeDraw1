package com.hencoder.hencoderpracticedraw1.practice;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

public class Practice9DrawPathView extends View {

    private Paint mPaint;
    private Path mPath;

    private float mWidth = 270, mHeight = 300;

    private float mX, mY;

    private float mRadius = mWidth / 4;

    private RectF mRectF;

    public Practice9DrawPathView(Context context) {
        this(context, null);
    }

    public Practice9DrawPathView(Context context, @Nullable AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public Practice9DrawPathView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init();
    }

    public void init() {
        mPaint = new Paint(Paint.ANTI_ALIAS_FLAG);
        mRectF = new RectF();
        mPath = new Path();
    }

    @Override
    protected void onSizeChanged(int w, int h, int oldw, int oldh) {
        super.onSizeChanged(w, h, oldw, oldh);
        mX = (w - mWidth) / 2;
        mY = (h - mHeight) / 2;
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

        //        练习内容：使用 canvas.drawPath() 方法画心形

        mRectF.set(mX, mY, mRadius * 2 + mX, mRadius * 2 + mY);
        mPath.addArc(mRectF, -225, 225);

        mRectF.set(getWidth() / 2, mY, mRadius * 2 + getWidth() / 2, mRadius * 2 + mY);
        mPath.arcTo(mRectF, -180, 225);

        mPath.lineTo(getWidth() / 2, mY + mHeight - mRadius);

        canvas.drawPath(mPath, mPaint);


    }

}
