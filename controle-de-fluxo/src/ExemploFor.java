public class ExemploFor {
    public static void main(String[] args) {
        String alunos [] = {"MARIA", "FERNANDA", "INACIO", "ROMEU"};

        for (int x = 0; x < alunos.length; x++){
            System.out.println("Aluno da posição x=" + x + " é " + alunos[x]);
        }

        for (String aluno : alunos){
            System.out.println("Nome: " + aluno);
        }

    }
}
