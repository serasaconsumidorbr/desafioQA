package tests;

import org.junit.Test;
import pages.MyTaskPage;

public class MyTaskTest extends MyTaskPage {

    @Test
    public void adicionarTask(){
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
        gerarScreenshot();
        fecharNavegador();

    }

    @Test
    public void deletarTask(){
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
        deletarTaks();
        validarTaskDeletada();
        gerarScreenshot();
        fecharNavegador();

    }

}
