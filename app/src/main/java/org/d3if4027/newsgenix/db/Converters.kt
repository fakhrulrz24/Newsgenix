package org.d3if4027.newsgenix.db

import androidx.room.TypeConverter
import org.d3if4027.newsgenix.models.Source

class Converters {

    @TypeConverter
    fun fromSource(source: Source): String {
        return  source.name
    }

    @TypeConverter
    fun toSource(name: String): Source {
        return Source(name, name)
    }
}