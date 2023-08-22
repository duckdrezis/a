public class nota {
    public static void main(String[] args) {
        char notaAluno = 'B';
        System.out.println("A nota do aluno é: " + notaAluno);

        switch (notaAluno) {
            case 'O':
                System.out.println("Otimo");
                break;
            case 'B':
                System.out.println("Bom");
                break;
            case 'S':
                System.out.println("Satisfatório.");
                break;
            case 'I':
                System.out.println("Insatisfatório.");
                break;
            default:
                System.out.println("Nota inválida.");
                break;
        }
    }
}
