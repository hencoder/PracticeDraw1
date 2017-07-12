package com.hencoder.hencoderpracticedraw1.practice;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

import com.hencoder.hencoderpracticedraw1.PxDpUtil;

public class Practice10HistogramView extends View {

    public Practice10HistogramView(Context context) {
        super(context);
    }

    public Practice10HistogramView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public Practice10HistogramView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    Paint mPaint = new Paint(Paint.ANTI_ALIAS_FLAG);

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

//        综合练习
//        练习内容：使用各种 Canvas.drawXXX() 方法画直方图
        float width = 70;

        mPaint.setColor(Color.WHITE);
        mPaint.setStrokeWidth(PxDpUtil.dip2px(getContext(),1));
        canvas.drawLine(50,50,50,600,mPaint); // 纵坐标

        canvas.drawLine(50,600,600,600,mPaint); // 横坐标

        mPaint.setTextSize(18);
        canvas.drawText("Froyo",85,650,mPaint);
        canvas.drawText("GB",85+width*1,650,mPaint);
        canvas.drawText("ICS",85+width*2,650,mPaint);
        canvas.drawText("JB",85+width*3,650,mPaint);
        canvas.drawText("KitKat",85+width*4,650,mPaint);
        canvas.drawText("L",85+width*5,650,mPaint);
        canvas.drawText("M",85+width*6,650,mPaint);

        mPaint.setColor(Color.GREEN);
        mPaint.setStrokeWidth(PxDpUtil.dip2px(getContext(),20));
        canvas.drawLine(110,600,110,580,mPaint);
        canvas.drawLine(110+width,600,110+width,550,mPaint);
        canvas.drawLine(110+width*2,600,110+width*2,550,mPaint);
        canvas.drawLine(110+width*3,600,110+width*3,450,mPaint);
        canvas.drawLine(110+width*4,600,110+width*4,300,mPaint);
        canvas.drawLine(110+width*5,600,110+width*5,250,mPaint);
        canvas.drawLine(110+width*6,600,110+width*6,480,mPaint);
    }
}
