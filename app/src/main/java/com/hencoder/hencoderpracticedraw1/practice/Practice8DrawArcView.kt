package com.hencoder.hencoderpracticedraw1.practice

import android.content.Context
import android.graphics.Canvas
import android.graphics.Paint
import android.graphics.RectF
import android.util.AttributeSet
import android.view.View

/**
 * Created by xh on 2017/10/16.
 */
class Practice8DrawArcView : View {

    private val mPaint = Paint(Paint.ANTI_ALIAS_FLAG)
    private val mRectF = RectF()

    private val mWidth = 350f
    private val mHeight = 250f

    private var mX = 0f
    private var mY = 0f

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

        //        练习内容：使用 canvas.drawArc() 方法画弧形和扇形

        mRectF.set(mX, mY, mX + mWidth, mY + mHeight)

        canvas!!.drawArc(mRectF, -10f, -100f, true, mPaint)
        canvas.drawArc(mRectF, 20f, 140f, false, mPaint)

        mPaint.style = Paint.Style.STROKE
        canvas.drawArc(mRectF, -120f, -60f, false, mPaint)

    }

}