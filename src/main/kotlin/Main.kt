fun main(){
    val likes = 2341
    val people = if (likes%10 == 1) "человеку" else "людям"
    println("Понравилось $likes $people")
}