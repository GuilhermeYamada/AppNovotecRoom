package com.example.appnovotecroom.controller

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Update
import androidx.room.Upsert
import com.example.appnovotecroom.model.Contato

@Dao
interface ContatoDao {

    @Upsert
    suspend fun upsertContato(contato: Contato)

    //@Update
    //fun updateContato(contato: Contato)

    @Delete
    suspend fun deleteContato(contato: Contato)

    @Query("SELECT * FROM contatos ORDER BY nome ASC")
    fun getContatoOrdenadoPeloNome()

    @Query("SELECT * FROM contatos ORDER BY sobrenome ASC")
    fun getContatoOrdenadoPeloSobrenome()

    @Query("SELECT * FROM contatos ORDER BY telefone ASC")
    fun getContatoOrdenadoPeloTelefone()
}