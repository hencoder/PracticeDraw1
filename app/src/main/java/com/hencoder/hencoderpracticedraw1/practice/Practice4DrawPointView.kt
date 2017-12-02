package com.hencoder.hencoderpracticedraw1.practice

import android.content.Context
import android.graphics.Canvas
import android.graphics.Paint
import android.util.AttributeSet
import android.view.View

/**
 * Created by xh on 2017/10/16.
 */
class Practice4DrawPointView : View {

    private val mPaint = Paint(Paint.ANTI_ALIAS_FLAG)

    private val mRadius = 80.toFloat()

    private var mLeftMargin = 0f
    private var mTopMargin = 0f

    constructor(context: Context?) : super(context)
    constructor(context: Context?, attrs: AttributeSet?) : super(context, attrs)
    constructor(context: Context?, attrs: AttributeSet?, defStyleAttr: Int) : super(context, attrs, defStyleAttr)

    init {
        mPaint.strokeWidth = mRadius
    }

    override fun onSizeChanged(w: Int, h: Int, oldw: Int, oldh: Int) {
        super.onSizeChanged(w, h, oldw, oldh)

        mLeftMargin = (w - 4 * mRadius) / 3
        mTopMargin = (h - 2 * mRadius) / 2

    }

    override fun onDraw(canvas: Canvas?) {
        super.onDraw(canvas)

        mPaint.strokeCap = Paint.Cap.ROUND
        canvas!!.drawPoint(mLeftMargin + mRadius, mTopMargin, mPaint)

        mPaint.strokeCap = Paint.Cap.SQUARE
        canvas.drawPoint((mLeftMargin + mRadius) * 2 + mRadius, mTopMargin, mPaint)

    }

}