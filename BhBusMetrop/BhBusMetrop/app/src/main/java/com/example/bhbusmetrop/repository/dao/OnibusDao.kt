package com.example.bhbusmetrop.repository.dao

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Update
import com.example.bhbusmetrop.model.BhModel

@Dao
interface OnibusDao {

    @Insert
    fun insertOnibus(onibus: BhModel) : Long

    @Update
    fun updateOnibus(onibus: BhModel) : Int

    @Delete
    fun deleteCartao(onibus: BhModel) : Int

    @Query("SELECT * FROM Onibus WHERE id_onibus = :id")
    fun get(id: Int) : BhModel

    @Query("SELECT * FROM Onibus")
    fun getAll(): List<BhModel>

}