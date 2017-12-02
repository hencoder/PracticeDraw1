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
class Practice7DrawRoundRectView : View {

    private val mPaint = Paint(Paint.ANTI_ALIAS_FLAG)
    private var mRectF = RectF()

    private val mWidth = 400f
    private val mHeight = 200f

    private var mX = 0f
    private var mY = 0f

    private val mRound = 50f

    constructor(context: Context?) : super(context)
    constructor(context: Context?, attrs: AttributeSet?) : super(context, attrs)
    constructor(context: Context?, attrs: AttributeSet?, defStyleAttr: Int) : super(context, attrs, defStyleAttr)

    override fun onSizeChanged(w: Int, h: Int, oldw: Int, oldh: Int) {
        super.onSizeChanged(w, h, oldw, oldh)

        mX = (w - mWidth) / 2
        mY = (h - mHeight) / 2

        mRectF.set(mX, mY, mX + mWidth, mY + mHeight)

    }

    override fun onDraw(canvas: Canvas?) {
        super.onDraw(canvas)

        canvas!!.drawRoundRect(mRectF, mRound, mRound, mPaint)

    }

}