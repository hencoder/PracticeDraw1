package com.hencoder.hencoderpracticedraw1.practice;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.View;

import com.hencoder.hencoderpracticedraw1.Utils;

public class Practice2DrawCircleView extends View {

    Paint mPaint = new Paint(Paint.ANTI_ALIAS_FLAG);

    public Practice2DrawCircleView(Context context) {
        super(context);
    }

    public Practice2DrawCircleView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public Practice2DrawCircleView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

//        练习内容：使用 canvas.drawCircle() 方法画圆
//        一共四个圆：1.实心圆 2.空心圆 3.蓝色实心圆 4.线宽为 20 的空心圆
        //1
        canvas.drawCircle(300,300,100,mPaint);
        //2
        mPaint.setStyle(Style.STROKE);
        canvas.drawCircle(500,300,100,mPaint);
        //3
        mPaint.setStyle(Style.FILL);
        mPaint.setColor(Color.BLUE);
        canvas.drawCircle(300, 500, 100, mPaint);
        //4
        mPaint.setStrokeWidth(Utils.dp2px(20));
        mPaint.setStyle(Style.STROKE);
        mPaint.setColor(Color.BLACK);
        canvas.drawCircle(600, 600, 100, mPaint);
    }
}
