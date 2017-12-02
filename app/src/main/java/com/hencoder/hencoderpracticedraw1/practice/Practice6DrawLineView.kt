package com.hencoder.hencoderpracticedraw1.practice

import android.content.Context
import android.graphics.Canvas
import android.graphics.Paint
import android.os.Parcelable
import android.util.AttributeSet
import android.view.View

/**
 * Created by xh on 2017/10/16.
 */
class Practice6DrawLineView : View {

    private val mPaint = Paint(Paint.ANTI_ALIAS_FLAG)

    private var mStartX = 0f
    private var mStartY = 0f
    private var mEndX = 0f
    private var mEndY = 0f

    private var mLineLength = 0f

    constructor(context: Context?) : super(context)
    constructor(context: Context?, attrs: AttributeSet?) : super(context, attrs)
    constructor(context: Context?, attrs: AttributeSet?, defStyleAttr: Int) : super(context, attrs, defStyleAttr)

    init {
        mPaint.strokeWidth = 10f
    }

    override fun onSizeChanged(w: Int, h: Int, oldw: Int, oldh: Int) {
        super.onSizeChanged(w, h, oldw, oldh)
        val length = Math.sqrt((w * w + h * h).toDouble()).toFloat()
        mLineLength = length / 3

        val angle = Math.atan2(h.toDouble(), w.toDouble())

        mStartX = (Math.cos(angle) * mLineLength).toFloat()
        mStartY = (Math.sin(angle) * mLineLength).toFloat()

        mEndX = (Math.cos(angle) * mLineLength.toDouble() * 2.0).toFloat()
        mEndY = (Math.sin(angle) * mLineLength.toDouble() * 2.0).toFloat()
    }

    override fun onDraw(canvas: Canvas?) {
        super.onDraw(canvas)

        canvas!!.drawLine(mStartX, mStartY, mEndX, mEndY, mPaint)

    }

}