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
class Practice5DrawOvalView : View {

    private val mPaint = Paint(Paint.ANTI_ALIAS_FLAG)
    private val mRect = RectF()

    private var mLeftMargin = 0f
    private var mTopMargin = 0f

    private var mWidth = 400
    private var mHeight = 200

    constructor(context: Context?) : super(context)
    constructor(context: Context?, attrs: AttributeSet?) : super(context, attrs)
    constructor(context: Context?, attrs: AttributeSet?, defStyleAttr: Int) : super(context, attrs, defStyleAttr)

    override fun onSizeChanged(w: Int, h: Int, oldw: Int, oldh: Int) {
        super.onSizeChanged(w, h, oldw, oldh)

        mLeftMargin = (w - mWidth) / 2f
        mTopMargin = (h - mHeight) / 2f

        mRect.set(mLeftMargin, mTopMargin, mLeftMargin + mWidth, mTopMargin + mHeight)

    }

    override fun onDraw(canvas: Canvas?) {
        super.onDraw(canvas)

        canvas!!.drawOval(mRect, mPaint)
    }

}