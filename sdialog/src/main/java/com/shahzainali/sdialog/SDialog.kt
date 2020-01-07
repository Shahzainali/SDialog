package com.shahzainali.sdialog

import android.animation.Animator
import android.animation.ValueAnimator
import android.app.Dialog
import android.content.Context
import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import android.os.Handler
import android.view.Gravity
import android.view.View
import android.view.Window
import android.view.animation.LinearInterpolator
import android.widget.RelativeLayout
import kotlinx.android.synthetic.main.message_dialog.*


class SDialog(
    context: Context,
    title: String,
    message: String,
    duration: Long,
    speed: Long,
    type: Int,
    isCancellable: Boolean
) {

    companion object {

        val SUCCESS = 1
        val FAIL = 0
    }

    data class Builder(
        var context: Context,
        private var title: String = "Title",
        private var message: String = "Message",
        private var duration: Long = 3000,
        private var speed: Long = 700,
        private var type: Int = 1,
        private var isCancellable: Boolean = true
    ) {
        fun setTitle(title: String) = apply { this.title = title }
        fun setMessage(message: String) = apply { this.message = message }
        fun setDuration(duration: Long) = apply { this.duration = duration }
        fun setSpeed(speed: Long) = apply { this.speed = speed }
        fun setType(type: Int) = apply { this.type = type }
        fun setCancellable(isCancellable: Boolean) = apply { this.isCancellable = isCancellable }
        fun build() = SDialog(context, title, message, duration, speed, type, isCancellable)

    }

    init {
        val dialog = Dialog(context)
        dialog.requestWindowFeature(Window.FEATURE_NO_TITLE)

        dialog.setContentView(R.layout.message_dialog)
        dialog.window!!.setBackgroundDrawable(ColorDrawable(Color.TRANSPARENT))

        val window = dialog.window
        window!!.setGravity(Gravity.TOP)

        dialog.title.text = title
        dialog.desc.text = message

        dialog.setCancelable(isCancellable)


        val ddd = dialog.findViewById<RelativeLayout>(R.id.root)
        if (type == 1) {
            ddd.setBackgroundResource(R.drawable.dialogbackgroundsuccess)
            dialog.image.visibility = View.GONE
        }
        dialog.show()


        animator(dialog, ddd, speed, false)


        Handler().postDelayed({
            animator(dialog, ddd, speed, true)
        }, duration)

    }

    private fun animator(
        dialog: Dialog,
        dialogLayout: RelativeLayout,
        speed: Long,
        isReverse: Boolean
    ) {
        var valueAnimator: ValueAnimator = if (!isReverse)
            ValueAnimator.ofFloat(-360f, 0f)
        else
            ValueAnimator.ofFloat(0f, -360f)

        valueAnimator.addUpdateListener {
            val value = it.animatedValue as Float
            dialogLayout.translationY = value
        }

        valueAnimator.interpolator = LinearInterpolator()
        valueAnimator.duration = speed

        valueAnimator.start()

        valueAnimator.addListener(object : Animator.AnimatorListener {
            override fun onAnimationRepeat(p0: Animator?) {
            }

            override fun onAnimationEnd(p0: Animator?) {
                if (isReverse)
                    dialog.dismiss()
            }

            override fun onAnimationCancel(p0: Animator?) {
            }

            override fun onAnimationStart(p0: Animator?) {
            }

        })
    }

}