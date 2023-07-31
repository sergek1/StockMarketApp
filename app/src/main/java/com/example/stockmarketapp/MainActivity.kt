package com.example.stockmarketapp

//import com.ramcosta.composedestinations.spec.NavGraphSpec
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.ui.Modifier
import com.example.stockmarketapp.presentation.company_listings.NavGraphs
import com.example.stockmarketapp.ui.theme.StockMarketAppTheme
import com.ramcosta.composedestinations.*
import com.ramcosta.composedestinations.annotation.NavGraph
import com.ramcosta.composedestinations.spec.NavGraphSpec
import dagger.hilt.android.AndroidEntryPoint

//import com.example.stockmarketapp.presentation.company_listings.*

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            StockMarketAppTheme {
                 Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                     DestinationsNavHost(navGraph = NavGraphs.root)
//                     DestinationsNavHost(navGraph = .root)
                }
            }
        }
    }
}

