package tests;

import org.junit.Test;
import pages.MyTaskPage;

public class MyTaskTest extends MyTaskPage {

    @Test
    public void adicionarTaskValida(){
        realizarLoginValido();
        clicarMyTasks();
        clicarAddATask();
        adicionarTituloDaTask("Karol Task");
        adicionarDateLimit();
        adicionarTimeLimit();
        adicionarInformacoesDaTask("Karol teste");
        selecionarEstadoDaTask();
        clicarEmSave();
        validarTaskAdicionada();

    }

}
