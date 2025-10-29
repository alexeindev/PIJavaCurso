public class VariablesUse {
    public static void main(String[] args) {

        // Explicit typing
        byte edad = 17;
        // Type inference (Since Java10)
        var edad2 = 17;
        // var edad3; [X] Should be initialized in the same line
        // because the compiler goes line by line
        System.out.println(edad);

        //Multiple declaration
        int operador1, operador2, operador3;

        //Multiple declarations + initializations
        int operador4=4, operador5=5;
    }
}
