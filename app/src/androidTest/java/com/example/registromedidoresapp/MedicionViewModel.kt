package com.example.registro_medidores.ui.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.registro_medidores.data.Medicion
import com.example.registro_medidores.data.MedicionDao
import kotlinx.coroutines.launch

class MedicionViewModel(private val dao: MedicionDao) : ViewModel() {

    val mediciones = dao.getAllMediciones()

    fun addMedicion(tipoGasto: String, valor: Double, fecha: Date) {
        viewModelScope.launch {
            val newMedicion = Medicion(tipoGasto = tipoGasto, valor = valor, fecha = fecha)
            dao.insertMedicion(newMedicion)
        }
    }
}
