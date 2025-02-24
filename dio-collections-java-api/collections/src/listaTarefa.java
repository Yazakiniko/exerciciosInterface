
import java.util.ArrayList;
import java.util.List;

public class listaTarefa {

    private List<Tarefa> tarefaList;

    public listaTarefa() {
        this.tarefaList = new ArrayList<>();
    }


    public void adicionarTarefa(String descricao){
        tarefaList.add(new Tarefa(descricao));
    }

    public void removerTarefa(String descricao){
        List<Tarefa> tarefasParaRemover = new ArrayList<>();
        for(Tarefa t : tarefaList){
            if(t.getDescricao().equalsIgnoreCase(descricao)){
                tarefasParaRemover.add(t);
            }
        }
        tarefaList.removeAll(tarefasParaRemover);
    }

    public int obterNumeroTotalTarefas(String descricao){
        return tarefaList.size();
    }

    public void obterDescricoesTarefas(){
        System.out.println(tarefaList);
    }
    
    public class main {
        public static void main(String[] args) throws Exception {
        listaTarefa listaTarefa = new listaTarefa();
        
        System.out.println("O numero total de elementos da lista é : " + listaTarefa.obterNumeroTotalTarefas(null));
        listaTarefa.adicionarTarefa("Tarefa 1");
        listaTarefa.adicionarTarefa("Tarefa 2");
        listaTarefa.adicionarTarefa("Tarefa 3");
        System.out.println("O numero total de elementos da lista é : " + listaTarefa.obterNumeroTotalTarefas(null));   


        listaTarefa.removerTarefa("Tarefa 1");
        System.out.println("O numero total de elementos da lista é : " + listaTarefa.obterNumeroTotalTarefas(null));

        listaTarefa.obterDescricoesTarefas();
    }
    }
    
}
