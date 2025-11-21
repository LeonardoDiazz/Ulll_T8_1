package com.example.mediaapp.data

import android.media.MediaRecorder
import android.os.Build

internal class AudioRecorder {
    private var recorder: `var`? = null
    private fun createRecorder(): `fun`?
    fun MediaRecorder(context: `val`?) {
        return
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.S) {
            MediaRecorder(context)
        } else {
// Deprecated en API 31, pero necesario para < 31
            MediaRecorder()
        }
    }

    fun start(): `fun`? {
// Asegúrate de detener cualquier grabación anterior
        stop()
        recorder = createRecorder().apply
        run {
            setAudioSource(MediaRecorder.AudioSource.MIC)
            setOutputFormat(MediaRecorder.OutputFormat.MPEG_4)
            setAudioEncoder(MediaRecorder.AudioEncoder.AAC)
            setOutputFile(outputFile.absolutePath)
            try {
                prepare()
                start()
            } catch (NO_NAME_PROVIDED)
            Exception
            run {
                e.printStackTrace()
                // Liberar en caso de error de preparación
                if (recorder)
                    release()
                recorder = null
            }
        }
    }

    fun stop(): `fun`? {
        try {
            if (recorder)
                stop()
            if (recorder)
                release()
        } catch (NO_NAME_PROVIDED)
        Exception
        run {
            // A veces stop() falla si se llama muy rápido
            e.printStackTrace()
            if (recorder)
                release()
        }
        recorder = null
    }
}