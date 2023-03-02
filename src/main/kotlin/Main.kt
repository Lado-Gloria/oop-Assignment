fun main() {
    var human = Human("gloria",20,68)
     human.eat(3)
    human.weight
    println(human.weight)
    human.speak("beatiful")
    human.birthday()
    println(human.age)
    var list= User("Gloria","Lado","glo@gmail",+256774897,"la2glo")
    println(list.firstName)
    println(list.email)

}
class Human(var name:String,var age:Int,var weight:Int) {


    fun eat(foodWeight: Int) {
        println("Iam eating $foodWeight kgs of food")
        weight += foodWeight


    }
    fun speak( speech:String){
        println(speech)
    }
    fun birthday(){
        age++
    }
}
data class User(var firstName:String,var lastName:String,var email:String,var phoneNumber:Int,var passWord:String)