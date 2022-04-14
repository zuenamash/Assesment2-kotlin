fun main(){
    var thisAccount=CurrentAccount("3456789","mwaize",500000.0)
    thisAccount.deposit(1500.0)
    thisAccount.withdraw(500.0)
    thisAccount.details()

    var account=SavingsAccount("4567890","mash",560000.00,2)
        account.deposit(3000.5)
        account.withdraw(1000.5)
    println( account.withdrawals)
        account.details()

    var w=Product("bottle",10.0,400.0,"hygiene")
    var x=Product("laptop",30.0,1000.5,"groceries")
    var y=Product("pens",10.5,100.5,"other")
    var z=Product("juices",2.0,450.0,"groceries")
    assignPrdt(w)
    assignPrdt(x)
    assignPrdt(y)
    assignPrdt(z)



}
open class CurrentAccount(var accountNumber:String,var accountName:String,var balance:Double){
    fun deposit(amount:Double){
        balance+=amount
        println(balance)
    }
    open fun withdraw(amount: Double){
        balance-=amount
        println(balance)
    }
    fun details(){
        println("Account number $accountNumber with balance $balance is operated by $accountName")
    }

}
class SavingsAccount(accountNumber: String,accountName: String,balance: Double, var withdrawals:Int):CurrentAccount(accountNumber,accountName,balance){
    override fun withdraw(amount: Double) {
        if (withdrawals<4){
            balance-=amount
        }
        println(balance)
        withdrawals++
    }
}
data class Product(var name:String, var weight:Double,var price:Double,var category:String)
fun assignPrdt(product:Product){

    var groceries= mutableListOf<Product>()
    var hygiene= mutableListOf<Product>()
    var other= mutableListOf<Product>()
    when(product.category){
        "groceriess"-> groceries.add(product)
        "hygienes"->hygiene.add(product)
        "others"->other.add(product)
    }
    println( listOf(product))

}
fun even(banana:String):String{
    var banana{
        for (txt in banana)
    }
}
