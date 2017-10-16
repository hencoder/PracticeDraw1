package com.hencoder.hencoderpracticedraw1.practice

import android.content.Context
import android.graphics.Canvas
import android.graphics.Paint
import android.graphics.Rect
import android.util.AttributeSet
import android.view.View

/**
 * Created by xh on 2017/10/16.
 */
class Practice3DrawRectView : View {

    private var mPaint = Paint(Paint.ANTI_ALIAS_FLAG)

    private var mRect = Rect()

    private val mLength = 400

    private var mLeft = 0

    private var mTop = 0

    constructor(context : Context?) : super(context)
    constructor(context: Context?, attrs: AttributeSet?) : super(context, attrs)
    constructor(context: Context?, attrs: AttributeSet?, defStyleAttr: Int) : super(context, attrs, defStyleAttr)

    override fun onSizeChanged(w: Int, h: Int, oldw: Int, oldh: Int) {
        super.onSizeChanged(w, h, oldw, oldh)

        mLeft = (w - mLength) / 2
        mTop = (h - mLength) / 2

        mRect.set(mLeft, mTop, mLeft + mLength, mTop + mLength)

    }

    override fun draw(canvas: Canvas?) {
        super.draw(canvas)

        canvas!!.drawRect(mRect, mPaint)

    }

}