package com.example.stockmarketapp.data.csv

import java.io.InputStream

interface CSVParser<T> {
    suspend fun parse(streamReader: InputStream):List<T>
}