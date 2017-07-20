package com.hencoder.hencoderpracticedraw1.practice;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

public class Practice2DrawCircleView extends View {

    private Paint mPaint;

    private int mRadius = 150;

    private int mMargins = 70;

    private int mLeftMargin;


    public Practice2DrawCircleView(Context context) {
        this(context, null);
    }

    public Practice2DrawCircleView(Context context, @Nullable AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public Practice2DrawCircleView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init();
    }

    public void init() {
        mPaint = new Paint(Paint.ANTI_ALIAS_FLAG);
        mPaint.setStrokeWidth(3);
    }

    @Override
    protected void onSizeChanged(int w, int h, int oldw, int oldh) {
        super.onSizeChanged(w, h, oldw, oldh);
        mLeftMargin = (w - 2 * mRadius - mMargins) / 2;
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

        //        练习内容：使用 canvas.drawCircle() 方法画圆
        //        一共四个圆：1.实心圆 2.空心圆 3.蓝色实心圆 4.线宽为 20 的空心圆


        mPaint.setColor(Color.BLACK);
        canvas.drawCircle(mLeftMargin, mRadius, mRadius, mPaint);

        mPaint.setStyle(Paint.Style.STROKE);
        canvas.drawCircle(mLeftMargin + 2 * mRadius + mMargins, mRadius, mRadius, mPaint);

        mPaint.setColor(Color.parseColor("#FF4A90E2"));
        mPaint.setStyle(Paint.Style.FILL);
        canvas.drawCircle(mLeftMargin, mRadius * 3 + mMargins, mRadius, mPaint);

        mPaint.setColor(Color.BLACK);
        mPaint.setStyle(Paint.Style.STROKE);
        mPaint.setStrokeWidth(60);
        canvas.drawCircle(mLeftMargin + 2 * mRadius + mMargins, mRadius * 3 + mMargins, mRadius, mPaint);

    }


}
