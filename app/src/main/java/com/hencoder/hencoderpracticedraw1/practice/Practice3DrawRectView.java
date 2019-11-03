package com.hencoder.hencoderpracticedraw1.practice;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;

import com.hencoder.hencoderpracticedraw1.Utils;

public class Practice3DrawRectView extends View {
    private static final String TAG = "Practice3DrawRectView";
    RectF mRectF = new RectF();
    Paint mPaint = new Paint(Paint.ANTI_ALIAS_FLAG);

    public Practice3DrawRectView(Context context) {
        super(context);
    }

    public Practice3DrawRectView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public Practice3DrawRectView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    {
        int screenWidth = Utils.getScreenWidth();
        Log.d(TAG, "instance initializer: screenWidth=" + screenWidth);
        float side = Utils.dp2px(70);
        mRectF.set((screenWidth >> 1) - side, 100, (screenWidth >> 1) + side, 100 + 2 * side);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

//        练习内容：使用 canvas.drawRect() 方法画矩形
        canvas.drawRect(mRectF, mPaint);
    }
}
