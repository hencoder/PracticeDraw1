package com.hencoder.hencoderpracticedraw1.practice;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

public class Practice6DrawLineView extends View {

    private Paint mPaint;

    private float mStartX, mStartY, mEndX, mEndY;

    private float mLineLength;

    public Practice6DrawLineView(Context context) {
        this(context, null);
    }

    public Practice6DrawLineView(Context context, @Nullable AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public Practice6DrawLineView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init();
    }

    private void init() {
        mPaint = new Paint(Paint.ANTI_ALIAS_FLAG);
        mPaint.setStrokeWidth(10);
    }

    @Override
    protected void onSizeChanged(int w, int h, int oldw, int oldh) {

        float length = (float) Math.sqrt(w * w + h * h);
        mLineLength = length / 3;

        double angle = Math.atan2(h, w);

        mStartX = (float) (Math.cos(angle) * mLineLength);
        mStartY = (float) (Math.sin(angle) * mLineLength);

        mEndX = (float) (Math.cos(angle) * mLineLength * 2);
        mEndY = (float) (Math.sin(angle) * mLineLength * 2);

    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

        //        练习内容：使用 canvas.drawLine() 方法画直线

        canvas.drawLine(mStartX, mStartY, mEndX, mEndY, mPaint);

    }

}
