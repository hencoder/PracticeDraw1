package com.hencoder.hencoderpracticedraw1.practice;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

public class Practice4DrawPointView extends View {

    private Paint mPaint;

    private int mRadius = 80;

    private int leftMargin, topMargin;

    public Practice4DrawPointView(Context context) {
        this(context, null);
    }

    public Practice4DrawPointView(Context context, @Nullable AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public Practice4DrawPointView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init();
    }

    private void init() {
        mPaint = new Paint(Paint.ANTI_ALIAS_FLAG);
        mPaint.setStrokeWidth(mRadius);
    }

    @Override
    protected void onSizeChanged(int w, int h, int oldw, int oldh) {
        leftMargin = (w - 4 * mRadius) / 3;
        topMargin = (h - 2 * mRadius) / 2;
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

        //        练习内容：使用 canvas.drawPoint() 方法画点
        //        一个圆点，一个方点
        //        圆点和方点的切换使用 paint.setStrokeCap(cap)：`ROUND` 是圆点，`BUTT` 或 `SQUARE` 是方点

        mPaint.setStrokeCap(Paint.Cap.ROUND);
        canvas.drawPoint(leftMargin + mRadius, topMargin + mRadius, mPaint);

        mPaint.setStrokeCap(Paint.Cap.SQUARE);
        canvas.drawPoint((leftMargin + mRadius) * 2 + mRadius, topMargin + mRadius, mPaint);

    }

}
