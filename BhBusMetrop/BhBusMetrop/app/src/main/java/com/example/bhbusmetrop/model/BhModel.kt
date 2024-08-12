package com.example.bhbusmetrop.model

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "Onibus")
class BhModel {

    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "id_onibus")
    var id_onibus : Int = 0

    @ColumnInfo(name = "nome_onibus")
    var nome_onibus : String  = ""

    @ColumnInfo(name = "numero")
    var numero : String = ""

    @ColumnInfo(name = "cor")
    var cor : String = ""

    @ColumnInfo(name = "tipo")
    var tipo : String = ""

    @ColumnInfo(name = "peso_onibus")
    var peso_onibus : String = ""
}