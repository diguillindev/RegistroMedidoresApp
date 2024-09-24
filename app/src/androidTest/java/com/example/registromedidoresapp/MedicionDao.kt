package com.example.registro_medidores.data

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import kotlinx.coroutines.flow.Flow

@Dao
interface MedicionDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertMedicion(medicion: Medicion)

    @Query("SELECT * FROM mediciones")
    fun getAllMediciones(): Flow<List<Medicion>>
}
