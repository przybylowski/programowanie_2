package day1;

public class FizzBuzz {
    private int value;
    public FizzBuzz (int value) {
        this.value = value;
    }




    public String CheckFizzBuzzv1 () {
        StringBuilder sb = new StringBuilder();
        String result = "" + value;

            if (value % 3 == 0) {
                result = "Fizz";
            }
            if (value % 5 == 0) {
                result = "Buzz";
            }
            if (value % 5 == 0 && value % 3 == 0) {
                result = "FizzBuzz";
            }
        return result;
    }
    public String CheckFizzBuzzv3 () {
        StringBuilder sb = new StringBuilder();
        String result = "" + value;

//        if (value % 15 == 0) {
//            (if value % 15 == )
//        }
        return result;
    }

    private boolean check_if_contains_3(String searchingValue, int value ) {

        return ("" + value).contains(searchingValue);

//        return false;
    }

    @Override
    public String toString() {
        return CheckFizzBuzzv3();
    }
}
