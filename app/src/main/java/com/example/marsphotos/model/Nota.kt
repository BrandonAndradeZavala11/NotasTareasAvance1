package com.example.marsphotos.model

import kotlinx.serialization.Serializable

@Serializable

data class Nota(
    val id: Int,
    val titulo: String,
    val contenido: String,
    val estatus: String,
    val tipo: String,
    val fecha: String,
    val fechaModi: String,
    val fechaCum: String
)