package advanced.functions1

fun containingFunction() {
    val nums =  1..100
    /**
     * This is a Lambda and when you return , it will
     * return from the containing function
     *
     *
     */
    nums.forEach {
        if (it % 5 ==0  ) myLabel@  { //Custom label{
//            return
            return@forEach //Local return - return out of forEach and continue executing  containingFunction

            /**
             * We can define our own labels as well
             * Note that non-local returns are only allowed in the case where they are invoked from inline function
             */
        }
    }
    println("Hello")


    /**
     * The behaviour is somewhat different from anon functions
     *
     * Anonymous function does return a local return even when you don't put a label
     */

    nums.forEach( fun (element) {
        if (element %5 == 0)
            return
    })

    println("Hello")
}

fun main(args: Array<String>) {

    containingFunction()
}