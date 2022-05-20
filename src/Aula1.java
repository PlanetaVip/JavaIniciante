public class Aula1 {

    public static void main(String[] args) {

        int i;
        // int i; não pode 2 variaveis com mesmo nome
        int I; // pode case sensitive
        //int 1a;  não pode começar com numeros
        int _1a; // pode usar underline mas não é boa prática
        int $1a; //pode usar cifrão mas não é boa prática

        i = 5;
        I = 10; // cada uma afotou uma posição de memória pq ão variaveis diferentes
        _1a = 20;  //mesmo não sendo boa prática funciona
        $1a = 7;

        final int j = 10;
        //j = 25; //não permite pq j é variavel constante
        int asrn24678md = 30; //permitido mas não usual
        //int asrn246 78md; //espaço não é aceito
        int asrn2$4678_md = 18; //pode usar mas nã usual o underline
        //int asrn2$46%78_md; percent, chaves, colchetes e outros não são aceitos pela linguagem


        //boas práticas
        int quantideProduto = 1;
        //int QuantidadeProduto;   pode ser aceita mas não se usa letra maiuscula no inicio de variável
        final int NUMERO_TENTATIVAS = 5; // feito corretamente
        //int final numeroTentativas = 5;  // não da erro de compilação, mas não boa prática
        int QUANTIDADE_OPCOES = 25; // NÃO DA ERRO, MAS SÓ SE USA ASSIM PARA FINAL(CONSTANTE)
        int qtdProd;
        //int i;

        System.out.println(i);
        System.out.println(I);
        System.out.println(_1a);
        System.out.println($1a);

        System.out.println(j);
        System.out.println(asrn24678md);
        System.out.println(asrn2$4678_md);

        System.out.println(quantideProduto);
        System.out.println(NUMERO_TENTATIVAS);
        System.out.println(QUANTIDADE_OPCOES);

    }
}
