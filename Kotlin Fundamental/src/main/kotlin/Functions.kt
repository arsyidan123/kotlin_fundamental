fun main () {
    val user = setUser("Arsyidan", hobby = "Gaming" , age =  16)
    println(user)

    printUser("Arsyidan")
}

    fun setUser(name: String, hobby: String, age: Int) = "My Name is $name, i like gaming, And i $age years old"

    fun printUser(name: String) {

    }