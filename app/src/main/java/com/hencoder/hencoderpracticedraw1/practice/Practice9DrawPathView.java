package com.hencoder.hencoderpracticedraw1.practice;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.graphics.Path;
import android.graphics.RectF;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

public class Practice9DrawPathView extends View {

    Path mPath = new Path();
    Paint mPaint = new Paint(Paint.ANTI_ALIAS_FLAG);
    RectF leftCircleRect = new RectF();
    RectF rightCircleRect = new RectF();

    public Practice9DrawPathView(Context context) {
        super(context);
    }

    public Practice9DrawPathView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public Practice9DrawPathView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

//        练习内容：使用 canvas.drawPath() 方法画心形
        leftCircleRect.set(200, 200, 400, 400);
        mPath.addArc(leftCircleRect, -225, 225);
        rightCircleRect.set(400, 200, 600, 400);
        mPath.arcTo(rightCircleRect, -180, 225, false);
        mPath.lineTo(400, 524);
        mPaint.setStyle(Style.STROKE);
        canvas.drawPath(mPath, mPaint);
    }
}
