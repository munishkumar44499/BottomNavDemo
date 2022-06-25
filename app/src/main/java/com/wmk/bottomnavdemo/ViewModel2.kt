package com.wmk.bottomnavdemo

import android.util.Log
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.async
import kotlinx.coroutines.launch

class ViewModel2: ViewModel() {
    val  repository=MyRepository()
    init {
        hitParallerApi()
    }

    private fun hitParallerApi() {
        viewModelScope.launch {
            Log.e("=======","=====enter in hitApi fun")
           val studentList= async {
                repository.getStudentList()
            }
           val movieList= async {
                repository.getMoviesList()
            }
            Log.e("=======","=====both calling done")
            studentList.await()
            Log.e("=======","====="+studentList.await().toString())
            movieList.await()
            Log.e("=======","====="+movieList.await().toString()+"  "+studentList.await().toString())
        }


    }
}