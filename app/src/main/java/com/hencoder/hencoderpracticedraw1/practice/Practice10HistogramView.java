package com.hencoder.hencoderpracticedraw1.practice;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

public class Practice10HistogramView extends View {

    private Paint mPaint;
    private Path mPath;
    private RectF mRectF;

    private float mLeftMargin, mTopMargin = 20;
    private float mWidth, mHeight = 500;

    private float mTabMargin = 20;
    private float mTabWidth = 100;


    private int mTitleTextSize = 48;

    private String mTitleText = "直方图";

    private String[] mTabTexts = {"Froyo", "CB", "ICS", "JB", "KitKat", "L", "M"};
    private float[] mTabHeights = {4, 22, 20, 220, 350, 420, 200};
    private float mTabCount = mTabTexts.length;

    private float mTabTextSize = 28;

    private String mTabColor = "#72B916";

    public Practice10HistogramView(Context context) {
        this(context, null);
    }

    public Practice10HistogramView(Context context, @Nullable AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public Practice10HistogramView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init();
    }

    public void init() {
        mPaint = new Paint(Paint.ANTI_ALIAS_FLAG);
        mPaint.setColor(Color.WHITE);
        mRectF = new RectF();
        mPath = new Path();
    }

    @Override
    protected void onSizeChanged(int w, int h, int oldw, int oldh) {
        super.onSizeChanged(w, h, oldw, oldh);

        mWidth = (mTabCount + 1) * mTabMargin + mTabCount * mTabWidth;

        mLeftMargin = (w - mWidth) / 2;

    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

        //        综合练习
        //        练习内容：使用各种 Canvas.drawXXX() 方法画直方图

        // 画底部 Title 文字
        mPaint.setTextSize(mTitleTextSize);
        float textWidth = mPaint.measureText(mTitleText);
        canvas.drawText(mTitleText, (getWidth() - textWidth) / 2, getHeight() - mTabMargin, mPaint);

        mPaint.setStrokeWidth(2);
        // 画竖线
        canvas.drawLine(mLeftMargin, mTopMargin, mLeftMargin, mTabMargin + mHeight, mPaint);
        // 画横线
        canvas.drawLine(mLeftMargin, mTopMargin + mHeight, mLeftMargin + mWidth, mTopMargin + mHeight, mPaint);

        // 画 Tab 文字
        mPaint.setTextSize(mTabTextSize);
        for (int i = 0; i < mTabTexts.length; i++) {
            float mTabTextWidth = mPaint.measureText(mTabTexts[i]);
            float mTabTextLeftMargin = (mTabWidth - mTabTextWidth) / 2;
            float mTextLeft = (i + 1) * mTabMargin + i * mTabWidth + mTabTextLeftMargin + mLeftMargin;
            canvas.drawText(mTabTexts[i], mTextLeft, mTopMargin + mHeight + mTabTextSize, mPaint);
        }
        // 画 Tab 矩形
        mPaint.setColor(Color.parseColor(mTabColor));
        for (int i = 0; i < mTabTexts.length; i++) {
            float mTabLeftMargin = (i + 1) * mTabMargin + i * mTabWidth + mLeftMargin;
            mRectF.set(mTabLeftMargin, mTopMargin + mHeight - mTabHeights[i], mTabLeftMargin + mTabWidth, mTopMargin + mHeight - 2);
            canvas.drawRect(mRectF, mPaint);
        }

    }

}
