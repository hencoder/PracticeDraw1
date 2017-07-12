package com.hencoder.hencoderpracticedraw1.practice;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

import com.hencoder.hencoderpracticedraw1.PxDpUtil;

public class Practice2DrawCircleView extends View {

    public Practice2DrawCircleView(Context context) {
        super(context);
    }

    public Practice2DrawCircleView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public Practice2DrawCircleView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    Paint mPaint = new Paint(Paint.ANTI_ALIAS_FLAG);

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

//        练习内容：使用 canvas.drawCircle() 方法画圆
//        一共四个圆：1.实心圆 2.空心圆 3.蓝色实心圆 4.线宽为 20 的空心圆

        // 1.实心圆
        mPaint.setColor(Color.BLACK);
        mPaint.setStyle(Style.FILL);
        canvas.drawCircle(250,180,150,mPaint);

        // 2.空心圆
        mPaint.setStyle(Style.STROKE);
        mPaint.setStrokeWidth(PxDpUtil.dip2px(getContext(),2));
        canvas.drawCircle(600,180,150,mPaint);

        // 3. 蓝色实心圆
        mPaint.setColor(Color.BLUE);
        mPaint.setStyle(Style.FILL);
        canvas.drawCircle(250,530,150,mPaint);

        // 4.线宽为20的空心圆
        mPaint.setStyle(Style.STROKE);
        mPaint.setStrokeWidth(PxDpUtil.dip2px(getContext(),20));
        mPaint.setColor(Color.BLACK);
        canvas.drawCircle(600,530,150,mPaint);
    }
}
