package com.hencoder.hencoderpracticedraw1.practice;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

public class Practice5DrawOvalView extends View {

    private Paint mPaint;
    private int mLeftMargin, mTopMargin;
    private int mWidth = 400, mHeight = 200;
    private RectF mRectF;

    public Practice5DrawOvalView(Context context) {
        this(context, null);
    }

    public Practice5DrawOvalView(Context context, @Nullable AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public Practice5DrawOvalView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init();
    }

    private void init() {
        mPaint = new Paint(Paint.ANTI_ALIAS_FLAG);
        mRectF = new RectF();
    }

    @Override
    protected void onSizeChanged(int w, int h, int oldw, int oldh) {
        mLeftMargin = (w - mWidth) / 2;
        mTopMargin = (h - mHeight) / 2;
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

        //        练习内容：使用 canvas.drawOval() 方法画椭圆

        mRectF.set(mLeftMargin, mTopMargin, mLeftMargin + mWidth, mTopMargin + mHeight);

        canvas.drawOval(mRectF, mPaint);

        //        canvas.drawArc(mLeftMargin, mTopMargin, mLeftMargin + mWidth, mTopMargin + mHeight, 0, 360, true, mPaint);

    }

}
