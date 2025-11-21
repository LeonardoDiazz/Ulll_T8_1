package com.example.mediaapp.data;

@Dao
interface MediaDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertMedia(item: MediaItem)
    @Query("SELECT * FROM media_items WHERE type = :type ORDER BY date DESC")
    fun getMediaByType(type: MediaType): Flow<List<MediaItem>>
}