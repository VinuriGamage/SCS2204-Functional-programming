object Q3 extends App{

    class Account(id:String, n:Int, b:Double){
        val NIC:String = id
        val accountNo:Int = n
        var balance: Double = b

        def withdraw(x:Double)= if(x<=balance)this.balance = this.balance - x else println("Unable to withdraw money")

        def deposit(x:Double) = this.balance = this.balance + x

        def transfer(a:Account,amount:Double):Unit={
            this.withdraw(amount)
            a.deposit(amount)
        }

        override def toString(): String = "NIC- " + this.NIC + " Acc No- "+this.accountNo+" Balance- "+this.balance
    }

    var account1 = new Account("199984256978", 45612,50000)
    var account2 = new Account("199978495269", 67590,10000)

    printf("Amount to transfer: ")
    var amount = scala.io.StdIn.readDouble()

    println("Accounts before transfering: ")
    println(account1)
    println(account2)
    println("\n")

    account1.transfer(account2,amount)

    println("Accounts after transfering: ")
    println(account1)
    println(account2)
    println("\n")

}