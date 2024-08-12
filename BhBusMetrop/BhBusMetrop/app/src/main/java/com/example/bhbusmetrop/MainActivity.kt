package com.example.bhbusmetrop

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.bhbusmetrop.model.BhModel
import com.example.bhbusmetrop.repository.AppDatabase


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val onibusDatabase = AppDatabase.getDataBase(this).onibusDao()

        val retornoInsert = onibusDatabase.insertOnibus(BhModel().apply {
            this.id_onibus = 1
            this.nome_onibus = "Estação Venda Nova"
            this.numero = "62"
            this.cor = "Verde"
            this.tipo = "Ônibus"
            this.peso_onibus = "16T"
        })


        val retornoSelectMultiplo = onibusDatabase.getAll()

        for(item in retornoSelectMultiplo){
                Log.d(
                    "Retorno",
                    "id_onibus: ${item.id_onibus}, nome: ${item.nome_onibus}, n°: ${item.numero}, cor: ${item.cor}, tipo: ${item.tipo}, peso: ${item.peso_onibus}"
                )
            }
    }
}