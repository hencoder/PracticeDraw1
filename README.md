![](images/icon.png)

HenCoder 绘制 1 练习项目
===

### 这是什么？

这不是一个独立使用的项目，它是 [HenCoder Android 开发进阶：UI 1-1 绘制基础](http://hencoder.com/ui-1-1) 的配套练习项目。

### 怎么用？

项目是一个可以直接运行的 Android App 项目，项目运行后，在手机上打开是这样的：

![](images/preview.png)

工程下有一个 `/practice` 目录：

![](images/project_practice.png)

你要做的是就是，在 `/practice` 下的每一个 `PracticeXxxView.java` 文件中写代码，绘制出和页面上半部分相同的效果。例如写 `PracticeDrawColorView.java` 以绘制出 "drawColor()" 标签下的黄色涂色效果。就像这样：

![](images/preview_after.png)

> 当然，没必要做得和示例一毛一样。这是一个练习，而不是一个超级模仿秀，关键是把技能掌握。

练习做完，绘制第一期分享的内容也就掌握得差不多了。

### 关于有些方法无效

现在的 Android 默认是开启了硬件加速的，而 Canvas 和 Paint 有一些方法是不支持硬件加速的，你需要把它手动关闭才行。硬件加速的支持情况和手动关闭硬件加速的方法你可以看一下这个 Android 的[官方文档](https://developer.android.com/guide/topics/graphics/hardware-accel.html)。

以后我会专门用一节来讲硬件加速和图像的离屏缓冲（off-screen buffer），现在先不多说了。