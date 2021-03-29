package com.example.nucaction.objectdetection

import android.os.CountDownTimer
import com.example.nucaction.camera.GraphicOverlay
import com.example.nucaction.utils.PreferenceUtils

internal class ObjectConfirmationController
/**
 * @param graphicOverlay Used to refresh NucAction.camera overlay when the confirmation progress updates.
 */
    (graphicOverlay: GraphicOverlay) {

    private val countDownTimer: CountDownTimer

    private var objectId: Int? = null

    /** Returns the confirmation progress described as a float value in the range of [0, 1].  */
    var progress = 0f
        private set

    val isConfirmed: Boolean
        get() = progress.compareTo(1f) == 0

    init {
        val confirmationTimeMs = PreferenceUtils.getConfirmationTimeMs(graphicOverlay.context).toLong()
        countDownTimer = object : CountDownTimer(confirmationTimeMs, /* countDownInterval= */ 20) {
            override fun onTick(millisUntilFinished: Long) {
                progress = (confirmationTimeMs - millisUntilFinished).toFloat() / confirmationTimeMs
                graphicOverlay.invalidate()
            }

            override fun onFinish() {
                progress = 1f
            }
        }
    }

    fun confirming(objectId: Int?) {
        if (objectId == this.objectId) {
            // Do nothing if it's already in confirming.
            return
        }

        reset()
        this.objectId = objectId
        countDownTimer.start()
    }

    fun reset() {
        countDownTimer.cancel()
        objectId = null
        progress = 0f
    }
}
