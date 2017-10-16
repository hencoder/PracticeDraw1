package com.hencoder.hencoderpracticedraw1.practice

import android.content.Context
import android.graphics.Canvas
import android.graphics.Color
import android.graphics.Paint
import android.util.AttributeSet
import android.view.View

/**
 * Created by xh on 2017/9/15.
 */
class Practice2DrawCircleView : View {

    private var mPaint = Paint(Paint.ANTI_ALIAS_FLAG)

    private val mRadius = 150f

    private val mMargins = 70f

    private var mLeftMargin = 0f

    constructor(context: Context?) : super(context)
    constructor(context: Context?, attrs: AttributeSet?) : super(context, attrs)
    constructor(context: Context?, attrs: AttributeSet?, defStyleAttr: Int) : super(context, attrs, defStyleAttr)

    init {
        mPaint.strokeWidth = 3f
    }

    override fun onSizeChanged(w: Int, h: Int, oldW: Int, oldH: Int) {
        super.onSizeChanged(w, h, oldW, oldH)
        mLeftMargin = (w - 2 * mRadius - mMargins) / 2
    }

    override fun onDraw(canvas: Canvas) {
        super.onDraw(canvas)

        mPaint.color = Color.BLACK
        canvas.drawCircle(mLeftMargin, mRadius, mRadius, mPaint)

        mPaint.style = Paint.Style.STROKE
        canvas.drawCircle(mLeftMargin + 2 * mRadius + mMargins, mRadius, mRadius, mPaint)


        mPaint.color = Color.parseColor("#FF4A90E2")
        mPaint.style = Paint.Style.FILL
        canvas.drawCircle(mLeftMargin, mRadius * 3 + mMargins, mRadius, mPaint)

        mPaint.color = Color.BLACK
        mPaint.style = Paint.Style.STROKE
        mPaint.strokeWidth = 60F
        canvas.drawCircle(mLeftMargin + 2 * mRadius + mMargins, mRadius * 3 + mMargins, mRadius, mPaint)

    }

}