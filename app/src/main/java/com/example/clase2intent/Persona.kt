package com.example.clase2intent

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class Persona(
    val nombre: String,
    val apellido: String,
    val edad: Int,
    val sexo: Sexo
): Parcelable

enum class Sexo {
    MASCULINO, FEMENINO, NO_ME_IDENTIFICO_CON_NINGUNO
}