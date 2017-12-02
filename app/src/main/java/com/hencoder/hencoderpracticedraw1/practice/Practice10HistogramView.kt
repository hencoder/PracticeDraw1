package com.hencoder.hencoderpracticedraw1.practice

import android.content.Context
import android.graphics.*
import android.util.AttributeSet
import android.view.View

/**
 * Created by xh on 2017/10/16.
 */
class Practice10HistogramView : View {

    private val mPaint = Paint(Paint.ANTI_ALIAS_FLAG)
    private val mPath = Path()
    private val mRectF = RectF()

    private var mLeftMargin = 0f
    private val mTopMargin = 20f
    private var mWidth = 0f
    private val mHeight = 500f

    private val mTabMargin = 20f
    private val mTabWidth = 100f

    private val mTitleTextSize = 46

    private val mTitleText = "直方图"

    private val mTabTexts = arrayOf("Froyo", "CB", "ICS", "JB", "KitKat", "L", "M")
    private val mTabHeights = floatArrayOf(4f, 22f, 20f, 220f, 350f, 420f, 200f)
    private val mTabCount = mTabTexts.size.toFloat()

    private val mTabTextSize = 28f

    private val mTabColor = "#72B916"

    constructor(context: Context?) : super(context)
    constructor(context: Context?, attrs: AttributeSet?) : super(context, attrs)
    constructor(context: Context?, attrs: AttributeSet?, defStyleAttr: Int) : super(context, attrs, defStyleAttr)

    init {
        mPaint.color = Color.WHITE
    }

    override fun onSizeChanged(w: Int, h: Int, oldw: Int, oldh: Int) {
        super.onSizeChanged(w, h, oldw, oldh)

        mWidth = (mTabCount + 1) * mTabMargin + mTabCount * mTabWidth

        mLeftMargin = (w - mWidth) / 2

    }

    override fun onDraw(canvas: Canvas?) {
        super.onDraw(canvas)

        //        综合练习
        //        练习内容：使用各种 Canvas.drawXXX() 方法画直方图

        // 画底部 Title 文字
        mPaint.textSize = mTitleTextSize.toFloat()
        val textWidth = mPaint.measureText(mTitleText)
        canvas!!.drawText(mTitleText, (width - textWidth) / 2, height - mTabMargin, mPaint)

        mPaint.strokeWidth = 2f
        // 画竖线
        canvas.drawLine(mLeftMargin, mTopMargin, mLeftMargin, mTabMargin + mHeight, mPaint)
        // 画横线
        canvas.drawLine(mLeftMargin, mTopMargin + mHeight, mLeftMargin + mWidth, mTopMargin + mHeight, mPaint)

        // 画 Tab 文字
        mPaint.textSize = mTabTextSize
        for (i in mTabTexts.indices) {
            val mTabTextWidth = mPaint.measureText(mTabTexts[i])
            val mTabTextLeftMargin = (mTabWidth - mTabTextWidth) / 2
            val mTextLeft = (i + 1) * mTabMargin + i * mTabWidth + mTabTextLeftMargin + mLeftMargin
            canvas.drawText(mTabTexts[i], mTextLeft, mTopMargin + mHeight + mTabTextSize, mPaint)
        }
        // 画 Tab 矩形
        mPaint.color = Color.parseColor(mTabColor)
        for (i in mTabTexts.indices) {
            val mTabLeftMargin = (i + 1) * mTabMargin + i * mTabWidth + mLeftMargin
            mRectF.set(mTabLeftMargin, mTopMargin + mHeight - mTabHeights[i], mTabLeftMargin + mTabWidth, mTopMargin + mHeight - 2)
            canvas.drawRect(mRectF, mPaint)
        }

    }

}