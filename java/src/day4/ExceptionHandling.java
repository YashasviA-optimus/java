package day4;

public class ExceptionHandling {
    public static void main(String[] args) {
        // try catch block syntax

        try {
            // Protected code
         } catch (ExceptionName e1) {
            // Catch block
         }

        //  try with multiple catch block


        try {
            // Protected code
         } catch (ExceptionType1 e1) {
            // Catch block
         } catch (ExceptionType2 e2) {
            // Catch block
         } catch (ExceptionType3 e3) {
            // Catch block
         }



        //  finally block

        try {
            // Protected code
         } catch (ExceptionType1 e1) {
            // Catch block
         } catch (ExceptionType2 e2) {
            // Catch block
         } catch (ExceptionType3 e3) {
            // Catch block
         }finally {
            // The finally block always executes.
         }


        //  throw -> is used to throw an exception explicitly
        throw new Exception("Something went wrong");

     














    }
}
