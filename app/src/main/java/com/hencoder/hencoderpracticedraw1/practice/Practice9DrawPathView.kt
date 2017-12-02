package com.hencoder.hencoderpracticedraw1.practice

import android.content.Context
import android.graphics.Canvas
import android.graphics.Paint
import android.graphics.Path
import android.graphics.RectF
import android.util.AttributeSet
import android.view.View

/**
 * Created by xh on 2017/10/16.
 */
class Practice9DrawPathView : View {

    private val mPaint = Paint(Paint.ANTI_ALIAS_FLAG)
    private val mPath = Path()
    private val mRectF = RectF()

    private val mWidth = 270f
    private val mHeight = 300f

    private var mX = 0f
    private var mY = 0f

    private val mRadius = mWidth / 4

    constructor(context: Context?) : super(context)
    constructor(context: Context?, attrs: AttributeSet?) : super(context, attrs)
    constructor(context: Context?, attrs: AttributeSet?, defStyleAttr: Int) : super(context, attrs, defStyleAttr)

    override fun onSizeChanged(w: Int, h: Int, oldw: Int, oldh: Int) {
        super.onSizeChanged(w, h, oldw, oldh)

        mX = (w - mWidth) / 2
        mY = (h - mHeight) / 2

    }

    override fun onDraw(canvas: Canvas?) {
        super.onDraw(canvas)

        //        练习内容：使用 canvas.drawPath() 方法画心形

        mRectF.set(mX, mY, mRadius * 2 + mX, mRadius * 2 + mY)
        mPath.addArc(mRectF, -225f, 225f)

        mRectF.set((width / 2).toFloat(), mY, mRadius * 2 + width / 2, mRadius * 2 + mY)
        mPath.arcTo(mRectF, -180f, 225f)

        mPath.lineTo((width / 2).toFloat(), mY + mHeight - mRadius)

        canvas!!.drawPath(mPath, mPaint)

    }

}