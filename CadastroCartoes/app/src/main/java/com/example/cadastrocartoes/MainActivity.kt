                        package com.example.cadastrocartoes

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.cadastrocartoes.model.CartaoModel
import com.example.cadastrocartoes.repository.AppDatabase

                        class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val cartaoDatabase = AppDatabase.getDataBase(this).cartaoDAO()

        val retornoInsert = cartaoDatabase.insertCartao(CartaoModel().apply {
            this.numero_cartao = "123456789"
            this.titular = "João Vitor"
            this.cvv = "412"
            this.data_vencimento = "31/02/2032"
        })

        val retornoSelectMultiplo = cartaoDatabase.getAll()

        for (item in retornoSelectMultiplo) {
            Log.d(
                "Retorno",
                "id_cartao: ${item.id_cartao}, n°${item.numero_cartao}," +
                        "titular: ${item.titular}, cvv: ${item.cvv}, data_vencimento: ${item.data_vencimento}"
            )
        }
    }
}