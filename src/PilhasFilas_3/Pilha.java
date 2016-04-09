package PilhasFilas_3;

public class Pilha {
    private final static int TOPO = -1;
    private int tamanhoPilha; // Tamanho do Array da Pilha
    private long[] pilha;
    private int topo; // Topo da pilha
    
//--------------------------------------------------------------
    public Pilha(int tamanho) // Construtor
    {
        tamanhoPilha = tamanho; // Atribui tamanho do array
        pilha = new long[tamanhoPilha]; // Cria o array
        topo = TOPO; // Sem itens na pilha ainda
    }
    
//--------------------------------------------------------------
    public void push(long item) // Coloca um item no topo da pilha
    {
        pilha[++topo] = item; // Incrementa o topo, insere o item
    }

//--------------------------------------------------------------
    public long pop() // Pega o item do topo da pilha
    {
        return pilha[topo--]; // Acessa o item, Decrementa o topo
    }
    
//--------------------------------------------------------------
    public long peek() // Espia/Pega o item do topo da pilha
    {
        return pilha[topo]; // Acessa o item
    }
    
//--------------------------------------------------------------
    public boolean estaVazia() // Pilha esta vazia?
    {
        return (topo == TOPO);
    }
    
//--------------------------------------------------------------
    public boolean estaCheia() // Pilha esta cheia?
    {
        return (topo == tamanhoPilha - 1);
    }

	public void push(long ...numeros) {
		for (long numero: numeros) {
			this.push(numero);
		}	
	}

	public static boolean ehIgual(Pilha pilha1, Pilha pilha2) throws CloneNotSupportedException{
		boolean ehIgual = true;
		int tamanho1 = pilha1.tamanhoPilha,
				tamanho2 = pilha2.tamanhoPilha;
		
		if ( tamanho1 != tamanho2 )
			return false;
		
		Pilha pilha1Clone = (Pilha) pilha1.clone();
		Pilha pilha2Clone = (Pilha) pilha2.clone();
		
		while (ehIgual && tamanho1-- > 0){
			ehIgual = pilha1Clone.pop() == pilha2Clone.pop();
		}
		
		return ehIgual;
	}
} 

////////////////////////////////////////////////////////////////
class PilhaApp {
    public static void main(String[] args) {
        Pilha pilha = new Pilha(10); // Cria uma pilha
        pilha.push(3); // Coloca itens na Pilha
        pilha.push(7);
        pilha.push(11);
        pilha.push(13);
        
        // Enquanto pilha não estiver vazia
        // Remove um item da pilha
        while (!pilha.estaVazia()){ 
            long item = pilha.pop();
            System.out.print(item); // Mostra o Item
            System.out.print(" ");
        } 
        
        System.out.println("");
    } 
} 