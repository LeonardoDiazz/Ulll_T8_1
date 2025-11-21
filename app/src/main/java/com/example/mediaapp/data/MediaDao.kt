package com.example.mediaapp.data

@Dao
internal interface MediaDao {
    fun insertMedia()

    @get:Query("SELECT * FROM media_items WHERE type = :type ORDER BY date DESC")
    val mediaByType: `fun`?

    companion object {
        val `fun`: suspend ? = null
    }
}