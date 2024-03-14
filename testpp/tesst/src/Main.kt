import java.time.LocalDateTime
import java.time.format.DateTimeFormatter


fun main() {

know()
    value()
validate()



    val current = LocalDateTime.now()
    val formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss.SSS")
    val formatted = current.format(formatter)
    println("Current Date and Time is: $formatted")





}

fun know() {

    var t: Int = 90

    var x: Int = 45

    var dL: Int = 56

    if (t > x) {
        println("$t is the largest")
    } else if (x > dL) {
        println("$x is the largest")
    } else if (dL > t) {
        println("$dL is the largest")
    } else {
        print("t,x and dL are simillar ")
    }

}

fun value(){

    var check=44

    while (check < 45){
        println(check)
        check++
    }


}

fun validate(){
    var number=-7
 if(number <10)  {
     println("one digit")

}

else if(number <100){
    println("two digit")
}

else if(number <1000){
    println("three digits")

 }
    else if (number<0){
        println("error")
 }

    else{
        println("more than three digits")
 }
}

