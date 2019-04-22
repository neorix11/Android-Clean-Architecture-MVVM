package com.bluelampcreative.data.mapper

interface Mapper<E, D> {
    fun mapFromEntity(type: E): D
    fun mapTpEntity(type: D): E
}