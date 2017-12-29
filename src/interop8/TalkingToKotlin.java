package interop8;

import classes3.CustomerKotlin;
import classes3.Status;

import java.io.IOException;

public class TalkingToKotlin {


    public static void main(String[] args) {

        CustomerKotlin customerKotlin = new CustomerKotlin(10, "String", "hello", null);

        customerKotlin.setEmail("vinoth@gmail.com");

        customerKotlin.someField = "Some field";

        // In Kotlin, there is default value, so I don't have to pass in the value for argument
        //compulsory. We can solve this problem with JVMOverloads annotation
        customerKotlin.changeStatus(Status.CURRENT);
        customerKotlin.changeStatus();

        customerKotlin.preferential();

        /**
         Invoking top level functions
         */

        String prefix =  UtilityClass.prefix("hello", "vinoth");
        //You can rename it

        int copyRight = UtilityClass.copyRight;

        /**
         * Accessing extension functions
         */
        // CustomerKotlinKt.extension(customerKotlin);

    }

    public static void loadStatistics(CustomerKotlin customerKotlin) {
        try {
            customerKotlin.loadStatistics("file");
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}

/*
//ToString, hascode , equals
data class CustomerKotlin(var id: Int, var name: String, var email: String, val phone : String?) {

    @JvmField
    var someField = "Value"

    @JvmOverloads
    fun changeStatus(status : Status = Status.CURRENT) {

    }

    @JvmName("preferential")
    fun makePreferred() {

    }

   @Throws(IOException::class)
    fun loadStatistics(filename: String) {
        if (filename == "") {
            throw IOException("No blank")
        }
    }

    // You can override
    override fun toString(): String {
        return "{\"id\" : \"$id\", \"name\":\"$name\" , \"email\": \"$email\"}"
    }
}

fun CustomerKotlin.extension() {

}

 */