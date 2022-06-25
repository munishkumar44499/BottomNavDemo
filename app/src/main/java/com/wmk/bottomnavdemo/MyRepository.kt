package com.wmk.bottomnavdemo

import kotlinx.coroutines.delay

class MyRepository {

    suspend fun getStudentList(): MutableList<Student> {

        val student1: Student = Student("Munish",1)
        val student2: Student = Student("Kumar",3)
        val student3: Student = Student("Jindal",5)
        delay(2000)
        return mutableListOf<Student>(student1,student2,student3)
    }

    suspend fun getMoviesList(): MutableList<Movies> {

        val m1: Movies = Movies("Hum App k hai kon","Movie desc 1")
        val m2: Movies = Movies("dil to pagal hai","Dil to pagal hai desc")
        val m3: Movies = Movies("zindgi","Zindgi desc")
        delay(20000)
        return mutableListOf<Movies>(m1,m2,m3)
    }

}