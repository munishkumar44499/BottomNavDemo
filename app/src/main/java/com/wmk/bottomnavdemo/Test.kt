package com.wmk.bottomnavdemo

class Student1(var name: String) {


}

fun main() {
    val student1: Student1 = Student1("Munish")
    val student2: Student1 = Student1("Kumar")
    val student3: Student1 = Student1("Jindal")

    val mutableList = mutableListOf<Student1>(student1, student2, student3)
    val list = mutableList.map {
        it.name.plus(" kumar")
    }
    print(list)
}