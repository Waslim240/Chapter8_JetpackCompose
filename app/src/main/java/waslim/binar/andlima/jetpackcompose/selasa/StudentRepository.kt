package waslim.binar.andlima.jetpackcompose.selasa

class StudentRepository {
    fun getAllData() : List<Student>{
        return listOf(
            Student(
                id = 0,
                name = "catatan 1",
                age = 12122022
            ),

            Student(
                id = 2,
                name = "catatan 2",
                age = 12122022
            ),

            Student(
                id = 3,
                name = "catatan 3",
                age = 12122022
            )
        )
    }
}